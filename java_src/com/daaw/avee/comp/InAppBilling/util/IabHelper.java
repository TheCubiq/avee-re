package com.daaw.avee.comp.InAppBilling.util;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.vending.billing.IInAppBillingService;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.tlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
/* loaded from: classes.dex */
public class IabHelper {
    public static final int BILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE = 3;
    public static final int BILLING_RESPONSE_RESULT_DEVELOPER_ERROR = 5;
    public static final int BILLING_RESPONSE_RESULT_ERROR = 6;
    public static final int BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED = 7;
    public static final int BILLING_RESPONSE_RESULT_ITEM_NOT_OWNED = 8;
    public static final int BILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE = 4;
    public static final int BILLING_RESPONSE_RESULT_OK = 0;
    public static final int BILLING_RESPONSE_RESULT_USER_CANCELED = 1;
    public static final String GET_SKU_DETAILS_ITEM_LIST = "ITEM_ID_LIST";
    public static final String GET_SKU_DETAILS_ITEM_TYPE_LIST = "ITEM_TYPE_LIST";
    public static final int IABHELPER_BAD_RESPONSE = -1002;
    public static final int IABHELPER_ERROR_BASE = -1000;
    public static final int IABHELPER_INVALID_CONSUMPTION = -1010;
    public static final int IABHELPER_MISSING_TOKEN = -1007;
    public static final int IABHELPER_REMOTE_EXCEPTION = -1001;
    public static final int IABHELPER_SEND_INTENT_FAILED = -1004;
    public static final int IABHELPER_SUBSCRIPTIONS_NOT_AVAILABLE = -1009;
    public static final int IABHELPER_UNKNOWN_ERROR = -1008;
    public static final int IABHELPER_UNKNOWN_PURCHASE_RESPONSE = -1006;
    public static final int IABHELPER_USER_CANCELLED = -1005;
    public static final int IABHELPER_VERIFICATION_FAILED = -1003;
    public static final String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
    public static final String ITEM_TYPE_INAPP = "inapp";
    public static final String ITEM_TYPE_SUBS = "subs";
    public static final String RESPONSE_BUY_INTENT = "BUY_INTENT";
    public static final String RESPONSE_CODE = "RESPONSE_CODE";
    public static final String RESPONSE_GET_SKU_DETAILS_LIST = "DETAILS_LIST";
    public static final String RESPONSE_INAPP_ITEM_LIST = "INAPP_PURCHASE_ITEM_LIST";
    public static final String RESPONSE_INAPP_PURCHASE_DATA = "INAPP_PURCHASE_DATA";
    public static final String RESPONSE_INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
    public static final String RESPONSE_INAPP_SIGNATURE = "INAPP_DATA_SIGNATURE";
    public static final String RESPONSE_INAPP_SIGNATURE_LIST = "INAPP_DATA_SIGNATURE_LIST";
    public static WeakEventR1<String[], String> requestSignatureBase64 = new WeakEventR1<>();
    Context mContext;
    OnIabPurchaseFinishedListener mPurchaseListener;
    String mPurchasingItemType;
    int mRequestCode;
    IInAppBillingService mService;
    ServiceConnection mServiceConn;
    String mSignatureBase64;
    boolean mDebugLog = false;
    boolean mSetupDone = false;
    boolean mDisposed = false;
    boolean mSubscriptionsSupported = false;
    boolean mAsyncInProgress = false;
    String mAsyncOperation = "";

    /* loaded from: classes.dex */
    public interface OnConsumeFinishedListener {
        void onConsumeFinished(Purchase purchase, IabResult iabResult);
    }

    /* loaded from: classes.dex */
    public interface OnConsumeMultiFinishedListener {
        void onConsumeMultiFinished(List<Purchase> list, List<IabResult> list2);
    }

    /* loaded from: classes.dex */
    public interface OnIabPurchaseFinishedListener {
        void onIabPurchaseFinished(IabResult iabResult, Purchase purchase);
    }

    /* loaded from: classes.dex */
    public interface OnIabSetupFinishedListener {
        void onIabSetupFinished(IabResult iabResult);
    }

    /* loaded from: classes.dex */
    public interface QueryInventoryFinishedListener {
        void onQueryInventoryFinished(IabResult iabResult, Inventory inventory);
    }

    public IabHelper(Context context, String str) {
        this.mSignatureBase64 = null;
        this.mContext = context.getApplicationContext();
        this.mSignatureBase64 = str;
        logDebug("IAB helper created.");
    }

    public void enableDebugLogging(boolean z, String str) {
        checkNotDisposed();
        this.mDebugLog = z;
    }

    public void enableDebugLogging(boolean z) {
        checkNotDisposed();
        this.mDebugLog = z;
    }

    public void startSetup(final OnIabSetupFinishedListener onIabSetupFinishedListener) {
        checkNotDisposed();
        if (this.mSetupDone) {
            throw new IllegalStateException("IAB helper is already set up.");
        }
        logDebug("Starting in-app billing setup.");
        this.mServiceConn = new ServiceConnection() { // from class: com.daaw.avee.comp.InAppBilling.util.IabHelper.1
            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                IabHelper.this.logDebug("Billing service disconnected.");
                IabHelper.this.mService = null;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                if (IabHelper.this.mDisposed) {
                    return;
                }
                IabHelper.this.logDebug("Billing service connected.");
                IabHelper.this.mService = IInAppBillingService.Stub.asInterface(iBinder);
                String packageName = IabHelper.this.mContext.getPackageName();
                try {
                    IabHelper.this.logDebug("Checking for in-app billing 3 support.");
                    int isBillingSupported = IabHelper.this.mService.isBillingSupported(3, packageName, "inapp");
                    if (isBillingSupported != 0) {
                        if (onIabSetupFinishedListener != null) {
                            onIabSetupFinishedListener.onIabSetupFinished(new IabResult(isBillingSupported, "Error checking for billing v3 support."));
                        }
                        IabHelper.this.mSubscriptionsSupported = false;
                        return;
                    }
                    IabHelper iabHelper = IabHelper.this;
                    iabHelper.logDebug("In-app billing version 3 supported for " + packageName);
                    int isBillingSupported2 = IabHelper.this.mService.isBillingSupported(3, packageName, "subs");
                    if (isBillingSupported2 == 0) {
                        IabHelper.this.logDebug("Subscriptions AVAILABLE.");
                        IabHelper.this.mSubscriptionsSupported = true;
                    } else {
                        IabHelper iabHelper2 = IabHelper.this;
                        iabHelper2.logDebug("Subscriptions NOT AVAILABLE. Response: " + isBillingSupported2);
                    }
                    IabHelper.this.mSetupDone = true;
                    OnIabSetupFinishedListener onIabSetupFinishedListener2 = onIabSetupFinishedListener;
                    if (onIabSetupFinishedListener2 != null) {
                        onIabSetupFinishedListener2.onIabSetupFinished(new IabResult(0, "Setup successful."));
                    }
                } catch (RemoteException unused) {
                    OnIabSetupFinishedListener onIabSetupFinishedListener3 = onIabSetupFinishedListener;
                    if (onIabSetupFinishedListener3 != null) {
                        onIabSetupFinishedListener3.onIabSetupFinished(new IabResult(IabHelper.IABHELPER_REMOTE_EXCEPTION, "RemoteException while setting up in-app billing."));
                    }
                }
            }
        };
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> queryIntentServices = this.mContext.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            this.mContext.bindService(intent, this.mServiceConn, 1);
            return;
        }
        this.mServiceConn = null;
        if (onIabSetupFinishedListener != null) {
            onIabSetupFinishedListener.onIabSetupFinished(new IabResult(3, "Billing service unavailable on device."));
        }
    }

    public void dispose() {
        logDebug("Disposing.");
        this.mSetupDone = false;
        if (this.mServiceConn != null) {
            logDebug("Unbinding from service.");
            Context context = this.mContext;
            if (context != null) {
                context.unbindService(this.mServiceConn);
            }
        }
        this.mDisposed = true;
        this.mContext = null;
        this.mServiceConn = null;
        this.mService = null;
        this.mPurchaseListener = null;
    }

    private void checkNotDisposed() {
        if (this.mDisposed) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }

    public boolean subscriptionsSupported() {
        checkNotDisposed();
        return this.mSubscriptionsSupported;
    }

    public void launchPurchaseFlow(Activity activity, String str, int i, OnIabPurchaseFinishedListener onIabPurchaseFinishedListener) {
        launchPurchaseFlow(activity, str, i, onIabPurchaseFinishedListener, "");
    }

    public void launchPurchaseFlow(Activity activity, String str, int i, OnIabPurchaseFinishedListener onIabPurchaseFinishedListener, String str2) {
        launchPurchaseFlow(activity, str, "inapp", i, onIabPurchaseFinishedListener, str2);
    }

    public void launchSubscriptionPurchaseFlow(Activity activity, String str, int i, OnIabPurchaseFinishedListener onIabPurchaseFinishedListener) {
        launchSubscriptionPurchaseFlow(activity, str, i, onIabPurchaseFinishedListener, "");
    }

    public void launchSubscriptionPurchaseFlow(Activity activity, String str, int i, OnIabPurchaseFinishedListener onIabPurchaseFinishedListener, String str2) {
        launchPurchaseFlow(activity, str, "subs", i, onIabPurchaseFinishedListener, str2);
    }

    public void launchPurchaseFlow(Activity activity, String str, String str2, int i, OnIabPurchaseFinishedListener onIabPurchaseFinishedListener, String str3) {
        checkNotDisposed();
        checkSetupDone("launchPurchaseFlow");
        flagStartAsync("launchPurchaseFlow");
        if (str2.equals("subs") && !this.mSubscriptionsSupported) {
            IabResult iabResult = new IabResult(IABHELPER_SUBSCRIPTIONS_NOT_AVAILABLE, "Subscriptions are not available.");
            flagEndAsync();
            if (onIabPurchaseFinishedListener != null) {
                onIabPurchaseFinishedListener.onIabPurchaseFinished(iabResult, null);
                return;
            }
            return;
        }
        try {
            logDebug("Constructing buy intent for " + str + ", item type: " + str2);
            Bundle buyIntent = this.mService.getBuyIntent(3, this.mContext.getPackageName(), str, str2, str3);
            int responseCodeFromBundle = getResponseCodeFromBundle(buyIntent);
            if (responseCodeFromBundle != 0) {
                logError("Unable to buy item, Error response: " + getResponseDesc(responseCodeFromBundle));
                flagEndAsync();
                IabResult iabResult2 = new IabResult(responseCodeFromBundle, "Unable to buy item");
                if (onIabPurchaseFinishedListener != null) {
                    onIabPurchaseFinishedListener.onIabPurchaseFinished(iabResult2, null);
                    return;
                }
                return;
            }
            logDebug("Launching buy intent for " + str + ". Request code: " + i);
            this.mRequestCode = i;
            this.mPurchaseListener = onIabPurchaseFinishedListener;
            this.mPurchasingItemType = str2;
            IntentSender intentSender = ((PendingIntent) buyIntent.getParcelable("BUY_INTENT")).getIntentSender();
            Intent intent = new Intent();
            Integer num = 0;
            int intValue = num.intValue();
            Integer num2 = 0;
            Integer num3 = 0;
            activity.startIntentSenderForResult(intentSender, i, intent, intValue, num2.intValue(), num3.intValue());
        } catch (IntentSender.SendIntentException unused) {
            logError("SendIntentException while launching purchase flow for sku " + str);
            flagEndAsync();
            IabResult iabResult3 = new IabResult(IABHELPER_SEND_INTENT_FAILED, "Failed to send intent.");
            if (onIabPurchaseFinishedListener != null) {
                onIabPurchaseFinishedListener.onIabPurchaseFinished(iabResult3, null);
            }
        } catch (RemoteException unused2) {
            logError("RemoteException while launching purchase flow for sku " + str);
            flagEndAsync();
            IabResult iabResult4 = new IabResult(IABHELPER_REMOTE_EXCEPTION, "Remote exception while starting purchase flow");
            if (onIabPurchaseFinishedListener != null) {
                onIabPurchaseFinishedListener.onIabPurchaseFinished(iabResult4, null);
            }
        }
    }

    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (i != this.mRequestCode) {
            return false;
        }
        checkNotDisposed();
        checkSetupDone("handleActivityResult");
        flagEndAsync();
        if (intent == null) {
            logError("Null data in IAB activity result.");
            IabResult iabResult = new IabResult(IABHELPER_BAD_RESPONSE, "Null data in IAB result");
            OnIabPurchaseFinishedListener onIabPurchaseFinishedListener = this.mPurchaseListener;
            if (onIabPurchaseFinishedListener != null) {
                onIabPurchaseFinishedListener.onIabPurchaseFinished(iabResult, null);
            }
            return true;
        }
        int responseCodeFromIntent = getResponseCodeFromIntent(intent);
        String stringExtra = intent.getStringExtra(RESPONSE_INAPP_PURCHASE_DATA);
        String stringExtra2 = intent.getStringExtra(RESPONSE_INAPP_SIGNATURE);
        if (i2 == -1 && responseCodeFromIntent == 0) {
            logDebug("Successful resultcode from purchase activity.");
            logDebug("Purchase data: " + stringExtra);
            logDebug("Data signature: " + stringExtra2);
            logDebug("Extras: " + intent.getExtras());
            logDebug("Expected item type: " + this.mPurchasingItemType);
            if (stringExtra == null || stringExtra2 == null) {
                logError("BUG: either purchaseData or dataSignature is null.");
                logDebug("Extras: " + intent.getExtras().toString());
                IabResult iabResult2 = new IabResult(IABHELPER_UNKNOWN_ERROR, "IAB returned null purchaseData or dataSignature");
                OnIabPurchaseFinishedListener onIabPurchaseFinishedListener2 = this.mPurchaseListener;
                if (onIabPurchaseFinishedListener2 != null) {
                    onIabPurchaseFinishedListener2.onIabPurchaseFinished(iabResult2, null);
                }
                return true;
            }
            try {
                Purchase purchase = new Purchase(this.mPurchasingItemType, stringExtra, stringExtra2);
                String sku = purchase.getSku();
                if (!Security.verifyPurchase(requestSignatureBase64.invoke(new String[]{this.mSignatureBase64}, this.mSignatureBase64), stringExtra, stringExtra2)) {
                    logError("Purchase signature verification FAILED for sku " + sku);
                    IabResult iabResult3 = new IabResult(IABHELPER_VERIFICATION_FAILED, "Signature verification failed for sku " + sku);
                    if (this.mPurchaseListener != null) {
                        this.mPurchaseListener.onIabPurchaseFinished(iabResult3, purchase);
                    }
                    return true;
                }
                logDebug("Purchase signature successfully verified.");
                OnIabPurchaseFinishedListener onIabPurchaseFinishedListener3 = this.mPurchaseListener;
                if (onIabPurchaseFinishedListener3 != null) {
                    onIabPurchaseFinishedListener3.onIabPurchaseFinished(new IabResult(0, "Success"), purchase);
                }
            } catch (JSONException unused) {
                logError("Failed to parse purchase data.");
                IabResult iabResult4 = new IabResult(IABHELPER_BAD_RESPONSE, "Failed to parse purchase data.");
                OnIabPurchaseFinishedListener onIabPurchaseFinishedListener4 = this.mPurchaseListener;
                if (onIabPurchaseFinishedListener4 != null) {
                    onIabPurchaseFinishedListener4.onIabPurchaseFinished(iabResult4, null);
                }
                return true;
            }
        } else if (i2 == -1) {
            logDebug("Result code was OK but in-app billing response was not OK: " + getResponseDesc(responseCodeFromIntent));
            if (this.mPurchaseListener != null) {
                this.mPurchaseListener.onIabPurchaseFinished(new IabResult(responseCodeFromIntent, "Problem purchashing item."), null);
            }
        } else if (i2 == 0) {
            logDebug("Purchase canceled - Response: " + getResponseDesc(responseCodeFromIntent));
            IabResult iabResult5 = new IabResult(IABHELPER_USER_CANCELLED, "User canceled.");
            OnIabPurchaseFinishedListener onIabPurchaseFinishedListener5 = this.mPurchaseListener;
            if (onIabPurchaseFinishedListener5 != null) {
                onIabPurchaseFinishedListener5.onIabPurchaseFinished(iabResult5, null);
            }
        } else {
            logError("Purchase failed. Result code: " + Integer.toString(i2) + ". Response: " + getResponseDesc(responseCodeFromIntent));
            IabResult iabResult6 = new IabResult(IABHELPER_UNKNOWN_PURCHASE_RESPONSE, "Unknown purchase response.");
            OnIabPurchaseFinishedListener onIabPurchaseFinishedListener6 = this.mPurchaseListener;
            if (onIabPurchaseFinishedListener6 != null) {
                onIabPurchaseFinishedListener6.onIabPurchaseFinished(iabResult6, null);
            }
        }
        return true;
    }

    public Inventory queryInventory(boolean z, List<String> list) throws IabException {
        return queryInventory(z, list, null);
    }

    public Inventory queryInventory(boolean z, List<String> list, List<String> list2) throws IabException {
        int querySkuDetails;
        int querySkuDetails2;
        checkNotDisposed();
        checkSetupDone("queryInventory");
        try {
            Inventory inventory = new Inventory();
            int queryPurchases = queryPurchases(inventory, "inapp");
            if (queryPurchases != 0) {
                throw new IabException(queryPurchases, "Error refreshing inventory (querying owned items).");
            }
            if (z && (querySkuDetails2 = querySkuDetails("inapp", inventory, list)) != 0) {
                throw new IabException(querySkuDetails2, "Error refreshing inventory (querying prices of items).");
            }
            if (this.mSubscriptionsSupported) {
                int queryPurchases2 = queryPurchases(inventory, "subs");
                if (queryPurchases2 != 0) {
                    throw new IabException(queryPurchases2, "Error refreshing inventory (querying owned subscriptions).");
                }
                if (z && (querySkuDetails = querySkuDetails("subs", inventory, list)) != 0) {
                    throw new IabException(querySkuDetails, "Error refreshing inventory (querying prices of subscriptions).");
                }
            }
            return inventory;
        } catch (RemoteException e) {
            throw new IabException(IABHELPER_REMOTE_EXCEPTION, "Remote exception while refreshing inventory.", e);
        } catch (JSONException e2) {
            throw new IabException(IABHELPER_BAD_RESPONSE, "Error parsing JSON response while refreshing inventory.", e2);
        }
    }

    public void queryInventoryAsync(final boolean z, final List<String> list, final QueryInventoryFinishedListener queryInventoryFinishedListener) {
        final Handler handler = new Handler();
        checkNotDisposed();
        checkSetupDone("queryInventory");
        flagStartAsync("refresh inventory");
        new Thread(new Runnable() { // from class: com.daaw.avee.comp.InAppBilling.util.IabHelper.2
            @Override // java.lang.Runnable
            public void run() {
                final IabResult iabResult = new IabResult(0, "Inventory refresh successful.");
                final Inventory inventory = null;
                try {
                    if (!IabHelper.this.mDisposed) {
                        inventory = IabHelper.this.queryInventory(z, list);
                    }
                } catch (IabException e) {
                    iabResult = e.getResult();
                } catch (Exception unused) {
                    iabResult = new IabResult(6, "Error type #ME");
                }
                IabHelper.this.flagEndAsync();
                if (IabHelper.this.mDisposed || queryInventoryFinishedListener == null) {
                    return;
                }
                handler.post(new Runnable() { // from class: com.daaw.avee.comp.InAppBilling.util.IabHelper.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        queryInventoryFinishedListener.onQueryInventoryFinished(iabResult, inventory);
                    }
                });
            }
        }).start();
    }

    public void queryInventoryAsync(QueryInventoryFinishedListener queryInventoryFinishedListener) {
        queryInventoryAsync(true, null, queryInventoryFinishedListener);
    }

    public void queryInventoryAsync(boolean z, QueryInventoryFinishedListener queryInventoryFinishedListener) {
        queryInventoryAsync(z, null, queryInventoryFinishedListener);
    }

    void consume(Purchase purchase) throws IabException {
        checkNotDisposed();
        checkSetupDone("consume");
        if (!purchase.mItemType.equals("inapp")) {
            throw new IabException((int) IABHELPER_INVALID_CONSUMPTION, "Items of type '" + purchase.mItemType + "' can't be consumed.");
        }
        try {
            String token = purchase.getToken();
            String sku = purchase.getSku();
            if (token == null || token.equals("")) {
                logError("Can't consume " + sku + ". No token.");
                throw new IabException((int) IABHELPER_MISSING_TOKEN, "PurchaseInfo is missing token for sku: " + sku + " " + purchase);
            }
            logDebug("Consuming sku: " + sku + ", token: " + token);
            int consumePurchase = this.mService.consumePurchase(3, this.mContext.getPackageName(), token);
            if (consumePurchase == 0) {
                logDebug("Successfully consumed sku: " + sku);
                return;
            }
            logDebug("Error consuming consuming sku " + sku + ". " + getResponseDesc(consumePurchase));
            throw new IabException(consumePurchase, "Error consuming sku " + sku);
        } catch (RemoteException e) {
            throw new IabException(IABHELPER_REMOTE_EXCEPTION, "Remote exception while consuming. PurchaseInfo: " + purchase, e);
        }
    }

    public void consumeAsync(Purchase purchase, OnConsumeFinishedListener onConsumeFinishedListener) {
        checkNotDisposed();
        checkSetupDone("consume");
        ArrayList arrayList = new ArrayList();
        arrayList.add(purchase);
        consumeAsyncInternal(arrayList, onConsumeFinishedListener, null);
    }

    public void consumeAsync(List<Purchase> list, OnConsumeMultiFinishedListener onConsumeMultiFinishedListener) {
        checkNotDisposed();
        checkSetupDone("consume");
        consumeAsyncInternal(list, null, onConsumeMultiFinishedListener);
    }

    public static String getResponseDesc(int i) {
        String[] strArr = {"OK", "User Canceled", "Unknown", "Billing Unavailable", "Item unavailable", "Developer Error", "Error", "Item Already Owned", "Item not owned"};
        String[] strArr2 = {"OK", "Remote exception during initialization", "Bad response received", "Purchase signature verification failed", "Send intent failed", "User cancelled", "Unknown purchase response", "Missing token", "Unknown error", "Subscriptions not available", "Invalid consumption attempt"};
        if (i > -1000) {
            if (i < 0 || i >= 9) {
                return String.valueOf(i) + ":Unknown";
            }
            return strArr[i];
        }
        int i2 = (-1000) - i;
        if (i2 >= 0 && i2 < 11) {
            return strArr2[i2];
        }
        return String.valueOf(i) + ":Unknown IAB Helper Error";
    }

    void checkSetupDone(String str) {
        if (this.mSetupDone) {
            return;
        }
        logError("Illegal state for operation (" + str + "): IAB helper is not set up.");
        throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + str);
    }

    int getResponseCodeFromBundle(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            logDebug("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            logError("Unexpected type for bundle response code.");
            logError(obj.getClass().getName());
            throw new RuntimeException("Unexpected type for bundle response code: " + obj.getClass().getName());
        }
    }

    int getResponseCodeFromIntent(Intent intent) {
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            logError("Intent with no response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            logError("Unexpected type for intent response code.");
            logError(obj.getClass().getName());
            throw new RuntimeException("Unexpected type for intent response code: " + obj.getClass().getName());
        }
    }

    void flagStartAsync(String str) {
        if (this.mAsyncInProgress) {
            throw new IllegalStateException("Can't start async operation (" + str + ") because another async operation(" + this.mAsyncOperation + ") is in progress.");
        }
        this.mAsyncOperation = str;
        this.mAsyncInProgress = true;
        logDebug("Starting async operation: " + str);
    }

    void flagEndAsync() {
        logDebug("Ending async operation: " + this.mAsyncOperation);
        this.mAsyncOperation = "";
        this.mAsyncInProgress = false;
    }

    int queryPurchases(Inventory inventory, String str) throws JSONException, RemoteException {
        logDebug("Querying owned items, item type: " + str);
        logDebug("Package name: " + this.mContext.getPackageName());
        String str2 = null;
        boolean z = false;
        do {
            logDebug("Calling getPurchases with continuation token: " + str2);
            Bundle purchases = this.mService.getPurchases(3, this.mContext.getPackageName(), str, str2);
            int responseCodeFromBundle = getResponseCodeFromBundle(purchases);
            logDebug("Owned items response: " + String.valueOf(responseCodeFromBundle));
            if (responseCodeFromBundle != 0) {
                logDebug("getPurchases() failed: " + getResponseDesc(responseCodeFromBundle));
                return responseCodeFromBundle;
            } else if (!purchases.containsKey("INAPP_PURCHASE_ITEM_LIST") || !purchases.containsKey("INAPP_PURCHASE_DATA_LIST") || !purchases.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                logError("Bundle returned from getPurchases() doesn't contain required fields.");
                return IABHELPER_BAD_RESPONSE;
            } else {
                ArrayList<String> stringArrayList = purchases.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = purchases.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = purchases.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    String str5 = stringArrayList.get(i);
                    WeakEventR1<String[], String> weakEventR1 = requestSignatureBase64;
                    String str6 = this.mSignatureBase64;
                    if (Security.verifyPurchase(weakEventR1.invoke(new String[]{str6}, str6), str3, str4)) {
                        logDebug("Sku is owned: " + str5);
                        Purchase purchase = new Purchase(str, str3, str4);
                        if (TextUtils.isEmpty(purchase.getToken())) {
                            logWarn("BUG: empty/null token!");
                            logDebug("Purchase data: " + str3);
                        }
                        inventory.addPurchase(purchase);
                    } else {
                        logWarn("Purchase signature verification **FAILED**. Not adding item.");
                        logDebug("   Purchase data: " + str3);
                        logDebug("   Signature: " + str4);
                        z = true;
                    }
                }
                str2 = purchases.getString("INAPP_CONTINUATION_TOKEN");
                logDebug("Continuation token: " + str2);
            }
        } while (!TextUtils.isEmpty(str2));
        if (z) {
            return IABHELPER_VERIFICATION_FAILED;
        }
        return 0;
    }

    int querySkuDetails(String str, Inventory inventory, List<String> list) throws RemoteException, JSONException {
        logDebug("Querying SKU details.");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(inventory.getAllOwnedSkus(str));
        if (list != null) {
            for (String str2 : list) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            logDebug("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(GET_SKU_DETAILS_ITEM_LIST, arrayList);
        Bundle skuDetails = this.mService.getSkuDetails(3, this.mContext.getPackageName(), str, bundle);
        if (!skuDetails.containsKey("DETAILS_LIST")) {
            int responseCodeFromBundle = getResponseCodeFromBundle(skuDetails);
            if (responseCodeFromBundle != 0) {
                logDebug("getSkuDetails() failed: " + getResponseDesc(responseCodeFromBundle));
                return responseCodeFromBundle;
            }
            logError("getSkuDetails() returned a bundle with neither an error nor a detail list.");
            return IABHELPER_BAD_RESPONSE;
        }
        Iterator<String> it = skuDetails.getStringArrayList("DETAILS_LIST").iterator();
        while (it.hasNext()) {
            SkuDetails skuDetails2 = new SkuDetails(str, it.next());
            logDebug("Got sku details: " + skuDetails2);
            inventory.addSkuDetails(skuDetails2);
        }
        return 0;
    }

    void consumeAsyncInternal(final List<Purchase> list, final OnConsumeFinishedListener onConsumeFinishedListener, final OnConsumeMultiFinishedListener onConsumeMultiFinishedListener) {
        final Handler handler = new Handler();
        flagStartAsync("consume");
        new Thread(new Runnable() { // from class: com.daaw.avee.comp.InAppBilling.util.IabHelper.3
            @Override // java.lang.Runnable
            public void run() {
                final ArrayList arrayList = new ArrayList();
                for (Purchase purchase : list) {
                    try {
                        IabHelper.this.consume(purchase);
                        arrayList.add(new IabResult(0, "Successful consume of sku " + purchase.getSku()));
                    } catch (IabException e) {
                        arrayList.add(e.getResult());
                    }
                }
                IabHelper.this.flagEndAsync();
                if (!IabHelper.this.mDisposed && onConsumeFinishedListener != null) {
                    handler.post(new Runnable() { // from class: com.daaw.avee.comp.InAppBilling.util.IabHelper.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            onConsumeFinishedListener.onConsumeFinished((Purchase) list.get(0), (IabResult) arrayList.get(0));
                        }
                    });
                }
                if (IabHelper.this.mDisposed || onConsumeMultiFinishedListener == null) {
                    return;
                }
                handler.post(new Runnable() { // from class: com.daaw.avee.comp.InAppBilling.util.IabHelper.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        onConsumeMultiFinishedListener.onConsumeMultiFinished(list, arrayList);
                    }
                });
            }
        }).start();
    }

    void logDebug(String str) {
        if (this.mDebugLog) {
            tlog.d(str);
        }
    }

    void logError(String str) {
        tlog.e(null, "In-app billing error: " + str);
    }

    void logWarn(String str) {
        tlog.w("In-app billing warning: " + str);
    }
}
