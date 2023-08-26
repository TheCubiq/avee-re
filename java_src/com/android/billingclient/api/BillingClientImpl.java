package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.util.BillingHelper;
import com.android.vending.billing.IInAppBillingService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class BillingClientImpl extends BillingClient {
    private static final String GET_SKU_DETAILS_ITEM_LIST = "ITEM_ID_LIST";
    private static final String LIBRARY_VERSION = "1.1";
    private static final String LIBRARY_VERSION_KEY = "libraryVersion";
    private static final int MAX_SKU_DETAILS_ITEMS_PER_REQUEST = 20;
    private static final String TAG = "BillingClient";
    private final Context mApplicationContext;
    private final BillingBroadcastManager mBroadcastManager;
    private ExecutorService mExecutorService;
    private boolean mIABv6Supported;
    private IInAppBillingService mService;
    private ServiceConnection mServiceConnection;
    private boolean mSubscriptionUpdateSupported;
    private boolean mSubscriptionsSupported;
    private int mClientState = 0;
    private final Handler mUiThreadHandler = new Handler();
    private final BroadcastReceiver onPurchaseFinishedReceiver = new BroadcastReceiver() { // from class: com.android.billingclient.api.BillingClientImpl.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PurchasesUpdatedListener listener = BillingClientImpl.this.mBroadcastManager.getListener();
            if (listener == null) {
                BillingHelper.logWarn(BillingClientImpl.TAG, "PurchasesUpdatedListener is null - no way to return the response.");
            } else {
                listener.onPurchasesUpdated(intent.getIntExtra("response_code_key", 6), BillingHelper.extractPurchases(intent.getBundleExtra("response_bundle_key")));
            }
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BillingClientImpl(Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        Context applicationContext = context.getApplicationContext();
        this.mApplicationContext = applicationContext;
        this.mBroadcastManager = new BillingBroadcastManager(applicationContext, purchasesUpdatedListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public int isFeatureSupported(String str) {
        char c = 65535;
        if (isReady()) {
            switch (str.hashCode()) {
                case -422092961:
                    if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                        c = 1;
                        break;
                    }
                    break;
                case 292218239:
                    if (str.equals(BillingClient.FeatureType.IN_APP_ITEMS_ON_VR)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1219490065:
                    if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_ON_VR)) {
                        c = 3;
                        break;
                    }
                    break;
                case 1987365622:
                    if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                return this.mSubscriptionsSupported ? 0 : -2;
            } else if (c == 1) {
                return this.mSubscriptionUpdateSupported ? 0 : -2;
            } else if (c != 2) {
                if (c == 3) {
                    return isBillingSupportedOnVr("subs");
                }
                BillingHelper.logWarn(TAG, "Unsupported feature: " + str);
                return 5;
            } else {
                return isBillingSupportedOnVr("inapp");
            }
        }
        return -1;
    }

    @Override // com.android.billingclient.api.BillingClient
    public boolean isReady() {
        return (this.mClientState != 2 || this.mService == null || this.mServiceConnection == null) ? false : true;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            BillingHelper.logVerbose(TAG, "Service connection is valid. No need to re-initialize.");
            billingClientStateListener.onBillingSetupFinished(0);
            return;
        }
        int i = this.mClientState;
        if (i == 1) {
            BillingHelper.logWarn(TAG, "Client is already in the process of connecting to billing service.");
            billingClientStateListener.onBillingSetupFinished(5);
        } else if (i == 3) {
            BillingHelper.logWarn(TAG, "Client was already closed and can't be reused. Please create another instance.");
            billingClientStateListener.onBillingSetupFinished(5);
        } else {
            this.mClientState = 1;
            this.mBroadcastManager.registerReceiver();
            LocalBroadcastManager.getInstance(this.mApplicationContext).registerReceiver(this.onPurchaseFinishedReceiver, new IntentFilter("proxy_activity_response_intent_action"));
            BillingHelper.logVerbose(TAG, "Starting in-app billing setup.");
            this.mServiceConnection = new BillingServiceConnection(billingClientStateListener);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.mApplicationContext.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if ("com.android.vending".equals(str) && str2 != null) {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra(LIBRARY_VERSION_KEY, "1.1");
                        if (this.mApplicationContext.bindService(intent2, this.mServiceConnection, 1)) {
                            BillingHelper.logVerbose(TAG, "Service was bonded successfully.");
                            return;
                        }
                        BillingHelper.logWarn(TAG, "Connection to Billing service is blocked.");
                    } else {
                        BillingHelper.logWarn(TAG, "The device doesn't have valid Play Store.");
                    }
                }
            }
            this.mClientState = 0;
            BillingHelper.logVerbose(TAG, "Billing service unavailable on device.");
            billingClientStateListener.onBillingSetupFinished(3);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void endConnection() {
        try {
            try {
                LocalBroadcastManager.getInstance(this.mApplicationContext).unregisterReceiver(this.onPurchaseFinishedReceiver);
                this.mBroadcastManager.destroy();
                if (this.mServiceConnection != null && this.mService != null) {
                    BillingHelper.logVerbose(TAG, "Unbinding from service.");
                    this.mApplicationContext.unbindService(this.mServiceConnection);
                    this.mServiceConnection = null;
                }
                this.mService = null;
                if (this.mExecutorService != null) {
                    this.mExecutorService.shutdownNow();
                    this.mExecutorService = null;
                }
            } catch (Exception e) {
                BillingHelper.logWarn(TAG, "There was an exception while ending connection: " + e);
            }
        } finally {
            this.mClientState = 3;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public int launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams) {
        String str;
        Bundle buyIntent;
        if (!isReady()) {
            return broadcastFailureAndReturnBillingResponse(-1);
        }
        String skuType = billingFlowParams.getSkuType();
        String sku = billingFlowParams.getSku();
        if (sku == null) {
            BillingHelper.logWarn(TAG, "Please fix the input params. SKU can't be null.");
            return broadcastFailureAndReturnBillingResponse(5);
        } else if (skuType == null) {
            BillingHelper.logWarn(TAG, "Please fix the input params. SkuType can't be null.");
            return broadcastFailureAndReturnBillingResponse(5);
        } else if (skuType.equals("subs") && !this.mSubscriptionsSupported) {
            BillingHelper.logWarn(TAG, "Current client doesn't support subscriptions.");
            return broadcastFailureAndReturnBillingResponse(-2);
        } else {
            boolean z = billingFlowParams.getOldSku() != null;
            if (z && !this.mSubscriptionUpdateSupported) {
                BillingHelper.logWarn(TAG, "Current client doesn't support subscriptions update.");
                return broadcastFailureAndReturnBillingResponse(-2);
            } else if (billingFlowParams.hasExtraParams() && !this.mIABv6Supported) {
                BillingHelper.logWarn(TAG, "Current client doesn't support extra params for buy intent.");
                return broadcastFailureAndReturnBillingResponse(-2);
            } else {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Constructing buy intent for ");
                    sb.append(sku);
                    String str2 = ", item type: ";
                    sb.append(", item type: ");
                    sb.append(skuType);
                    BillingHelper.logVerbose(TAG, sb.toString());
                    if (this.mIABv6Supported) {
                        Bundle constructExtraParams = constructExtraParams(billingFlowParams);
                        constructExtraParams.putString(LIBRARY_VERSION_KEY, "1.1");
                        buyIntent = this.mService.getBuyIntentExtraParams(billingFlowParams.getVrPurchaseFlow() ? 7 : 6, this.mApplicationContext.getPackageName(), sku, skuType, null, constructExtraParams);
                        str = TAG;
                    } else {
                        try {
                            if (z) {
                                IInAppBillingService iInAppBillingService = this.mService;
                                String packageName = this.mApplicationContext.getPackageName();
                                List<String> asList = Arrays.asList(billingFlowParams.getOldSku());
                                str2 = TAG;
                                buyIntent = iInAppBillingService.getBuyIntentToReplaceSkus(5, packageName, asList, sku, "subs", null);
                                str = str2;
                            } else {
                                IInAppBillingService iInAppBillingService2 = this.mService;
                                String packageName2 = this.mApplicationContext.getPackageName();
                                str = TAG;
                                str2 = sku;
                                try {
                                    buyIntent = iInAppBillingService2.getBuyIntent(3, packageName2, str2, skuType, null);
                                } catch (RemoteException unused) {
                                    BillingHelper.logWarn(str, "RemoteException while launching launching replace subscriptions flow: ; for sku: " + sku + "; try to reconnect");
                                    return broadcastFailureAndReturnBillingResponse(-1);
                                }
                            }
                        } catch (RemoteException unused2) {
                            str = str2;
                        }
                    }
                    int responseCodeFromBundle = BillingHelper.getResponseCodeFromBundle(buyIntent, str);
                    if (responseCodeFromBundle != 0) {
                        BillingHelper.logWarn(str, "Unable to buy item, Error response code: " + responseCodeFromBundle);
                        return broadcastFailureAndReturnBillingResponse(responseCodeFromBundle);
                    }
                    Intent intent = new Intent(activity, ProxyBillingActivity.class);
                    intent.putExtra("BUY_INTENT", (PendingIntent) buyIntent.getParcelable("BUY_INTENT"));
                    activity.startActivity(intent);
                    return 0;
                } catch (RemoteException unused3) {
                    str = TAG;
                }
            }
        }
    }

    private int broadcastFailureAndReturnBillingResponse(int i) {
        this.mBroadcastManager.getListener().onPurchasesUpdated(i, null);
        return i;
    }

    @Override // com.android.billingclient.api.BillingClient
    public Purchase.PurchasesResult queryPurchases(String str) {
        if (!isReady()) {
            return new Purchase.PurchasesResult(-1, null);
        }
        if (TextUtils.isEmpty(str)) {
            BillingHelper.logWarn(TAG, "Please provide a valid SKU type.");
            return new Purchase.PurchasesResult(5, null);
        }
        return queryPurchasesInternal(str, false);
    }

    @Override // com.android.billingclient.api.BillingClient
    public void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            skuDetailsResponseListener.onSkuDetailsResponse(-1, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        final List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            BillingHelper.logWarn(TAG, "Please fix the input params. SKU type can't be empty.");
            skuDetailsResponseListener.onSkuDetailsResponse(5, null);
        } else if (skusList == null) {
            BillingHelper.logWarn(TAG, "Please fix the input params. The list of SKUs can't be empty.");
            skuDetailsResponseListener.onSkuDetailsResponse(5, null);
        } else {
            executeAsync(new Runnable() { // from class: com.android.billingclient.api.BillingClientImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    final SkuDetails.SkuDetailsResult querySkuDetailsInternal = BillingClientImpl.this.querySkuDetailsInternal(skuType, skusList);
                    BillingClientImpl.this.postToUiThread(new Runnable() { // from class: com.android.billingclient.api.BillingClientImpl.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            skuDetailsResponseListener.onSkuDetailsResponse(querySkuDetailsInternal.getResponseCode(), querySkuDetailsInternal.getSkuDetailsList());
                        }
                    });
                }
            });
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void consumeAsync(final String str, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            consumeResponseListener.onConsumeResponse(-1, null);
        } else if (TextUtils.isEmpty(str)) {
            BillingHelper.logWarn(TAG, "Please provide a valid purchase token got from queryPurchases result.");
            consumeResponseListener.onConsumeResponse(5, str);
        } else {
            executeAsync(new Runnable() { // from class: com.android.billingclient.api.BillingClientImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    BillingClientImpl.this.consumeInternal(str, consumeResponseListener);
                }
            });
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void queryPurchaseHistoryAsync(final String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(-1, null);
        } else {
            executeAsync(new Runnable() { // from class: com.android.billingclient.api.BillingClientImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    final Purchase.PurchasesResult queryPurchasesInternal = BillingClientImpl.this.queryPurchasesInternal(str, true);
                    BillingClientImpl.this.postToUiThread(new Runnable() { // from class: com.android.billingclient.api.BillingClientImpl.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            purchaseHistoryResponseListener.onPurchaseHistoryResponse(queryPurchasesInternal.getResponseCode(), queryPurchasesInternal.getPurchasesList());
                        }
                    });
                }
            });
        }
    }

    private Bundle constructExtraParams(BillingFlowParams billingFlowParams) {
        Bundle bundle = new Bundle();
        if (billingFlowParams.getReplaceSkusProrationMode() != 0) {
            bundle.putInt("prorationMode", billingFlowParams.getReplaceSkusProrationMode());
        }
        if (billingFlowParams.getAccountId() != null) {
            bundle.putString("accountId", billingFlowParams.getAccountId());
        }
        if (billingFlowParams.getVrPurchaseFlow()) {
            bundle.putBoolean("vr", true);
        }
        if (billingFlowParams.getOldSku() != null) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(billingFlowParams.getOldSku())));
        }
        return bundle;
    }

    private void executeAsync(Runnable runnable) {
        if (this.mExecutorService == null) {
            this.mExecutorService = Executors.newFixedThreadPool(BillingHelper.NUMBER_OF_CORES);
        }
        this.mExecutorService.submit(runnable);
    }

    private int isBillingSupportedOnVr(String str) {
        try {
            return this.mService.isBillingSupportedExtraParams(7, this.mApplicationContext.getPackageName(), str, generateVrBundle()) == 0 ? 0 : -2;
        } catch (RemoteException unused) {
            BillingHelper.logWarn(TAG, "RemoteException while checking if billing is supported; try to reconnect");
            return -1;
        }
    }

    private Bundle generateVrBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("vr", true);
        return bundle;
    }

    SkuDetails.SkuDetailsResult querySkuDetailsInternal(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i, i2 > size ? size : i2));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString(LIBRARY_VERSION_KEY, "1.1");
            try {
                Bundle skuDetails = this.mService.getSkuDetails(3, this.mApplicationContext.getPackageName(), str, bundle);
                if (skuDetails == null) {
                    BillingHelper.logWarn(TAG, "querySkuDetailsAsync got null sku details list");
                    return new SkuDetails.SkuDetailsResult(4, null);
                } else if (!skuDetails.containsKey("DETAILS_LIST")) {
                    int responseCodeFromBundle = BillingHelper.getResponseCodeFromBundle(skuDetails, TAG);
                    if (responseCodeFromBundle != 0) {
                        BillingHelper.logWarn(TAG, "getSkuDetails() failed. Response code: " + responseCodeFromBundle);
                        return new SkuDetails.SkuDetailsResult(responseCodeFromBundle, arrayList);
                    }
                    BillingHelper.logWarn(TAG, "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    return new SkuDetails.SkuDetailsResult(6, arrayList);
                } else {
                    ArrayList<String> stringArrayList = skuDetails.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        BillingHelper.logWarn(TAG, "querySkuDetailsAsync got null response list");
                        return new SkuDetails.SkuDetailsResult(4, null);
                    }
                    for (int i3 = 0; i3 < stringArrayList.size(); i3++) {
                        try {
                            SkuDetails skuDetails2 = new SkuDetails(stringArrayList.get(i3));
                            BillingHelper.logVerbose(TAG, "Got sku details: " + skuDetails2);
                            arrayList.add(skuDetails2);
                        } catch (JSONException unused) {
                            BillingHelper.logWarn(TAG, "Got a JSON exception trying to decode SkuDetails");
                            return new SkuDetails.SkuDetailsResult(6, null);
                        }
                    }
                    i = i2;
                }
            } catch (RemoteException e) {
                BillingHelper.logWarn(TAG, "querySkuDetailsAsync got a remote exception (try to reconnect): " + e);
                return new SkuDetails.SkuDetailsResult(-1, null);
            }
        }
        return new SkuDetails.SkuDetailsResult(0, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Purchase.PurchasesResult queryPurchasesInternal(String str, boolean z) {
        Bundle purchaseHistory;
        BillingHelper.logVerbose(TAG, "Querying owned items, item type: " + str + "; history: " + z);
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        do {
            if (z) {
                try {
                    if (!this.mIABv6Supported) {
                        BillingHelper.logWarn(TAG, "getPurchaseHistory is not supported on current device");
                        return new Purchase.PurchasesResult(-2, null);
                    }
                    purchaseHistory = this.mService.getPurchaseHistory(6, this.mApplicationContext.getPackageName(), str, str2, null);
                } catch (RemoteException e) {
                    BillingHelper.logWarn(TAG, "Got exception trying to get purchases: " + e + "; try to reconnect");
                    return new Purchase.PurchasesResult(-1, null);
                }
            } else {
                purchaseHistory = this.mService.getPurchases(3, this.mApplicationContext.getPackageName(), str, str2);
            }
            if (purchaseHistory == null) {
                BillingHelper.logWarn(TAG, "queryPurchases got null owned items list");
                return new Purchase.PurchasesResult(6, null);
            }
            int responseCodeFromBundle = BillingHelper.getResponseCodeFromBundle(purchaseHistory, TAG);
            if (responseCodeFromBundle != 0) {
                BillingHelper.logWarn(TAG, "getPurchases() failed. Response code: " + responseCodeFromBundle);
                return new Purchase.PurchasesResult(responseCodeFromBundle, null);
            } else if (!purchaseHistory.containsKey("INAPP_PURCHASE_ITEM_LIST") || !purchaseHistory.containsKey("INAPP_PURCHASE_DATA_LIST") || !purchaseHistory.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                BillingHelper.logWarn(TAG, "Bundle returned from getPurchases() doesn't contain required fields.");
                return new Purchase.PurchasesResult(6, null);
            } else {
                ArrayList<String> stringArrayList = purchaseHistory.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = purchaseHistory.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = purchaseHistory.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    BillingHelper.logWarn(TAG, "Bundle returned from getPurchases() contains null SKUs list.");
                    return new Purchase.PurchasesResult(6, null);
                } else if (stringArrayList2 == null) {
                    BillingHelper.logWarn(TAG, "Bundle returned from getPurchases() contains null purchases list.");
                    return new Purchase.PurchasesResult(6, null);
                } else if (stringArrayList3 == null) {
                    BillingHelper.logWarn(TAG, "Bundle returned from getPurchases() contains null signatures list.");
                    return new Purchase.PurchasesResult(6, null);
                } else {
                    for (int i = 0; i < stringArrayList2.size(); i++) {
                        String str3 = stringArrayList2.get(i);
                        String str4 = stringArrayList3.get(i);
                        BillingHelper.logVerbose(TAG, "Sku is owned: " + stringArrayList.get(i));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                                BillingHelper.logWarn(TAG, "BUG: empty/null token!");
                            }
                            arrayList.add(purchase);
                        } catch (JSONException e2) {
                            BillingHelper.logWarn(TAG, "Got an exception trying to decode the purchase: " + e2);
                            return new Purchase.PurchasesResult(6, null);
                        }
                    }
                    str2 = purchaseHistory.getString("INAPP_CONTINUATION_TOKEN");
                    BillingHelper.logVerbose(TAG, "Continuation token: " + str2);
                }
            }
        } while (!TextUtils.isEmpty(str2));
        return new Purchase.PurchasesResult(0, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postToUiThread(Runnable runnable) {
        this.mUiThreadHandler.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void consumeInternal(final String str, final ConsumeResponseListener consumeResponseListener) {
        try {
            BillingHelper.logVerbose(TAG, "Consuming purchase with token: " + str);
            final int consumePurchase = this.mService.consumePurchase(3, this.mApplicationContext.getPackageName(), str);
            if (consumePurchase == 0) {
                BillingHelper.logVerbose(TAG, "Successfully consumed purchase.");
                if (consumeResponseListener != null) {
                    postToUiThread(new Runnable() { // from class: com.android.billingclient.api.BillingClientImpl.5
                        @Override // java.lang.Runnable
                        public void run() {
                            consumeResponseListener.onConsumeResponse(consumePurchase, str);
                        }
                    });
                }
            } else {
                BillingHelper.logWarn(TAG, "Error consuming purchase with token. Response code: " + consumePurchase);
                postToUiThread(new Runnable() { // from class: com.android.billingclient.api.BillingClientImpl.6
                    @Override // java.lang.Runnable
                    public void run() {
                        BillingHelper.logWarn(BillingClientImpl.TAG, "Error consuming purchase.");
                        consumeResponseListener.onConsumeResponse(consumePurchase, str);
                    }
                });
            }
        } catch (RemoteException e) {
            postToUiThread(new Runnable() { // from class: com.android.billingclient.api.BillingClientImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    BillingHelper.logWarn(BillingClientImpl.TAG, "Error consuming purchase; ex: " + e);
                    consumeResponseListener.onConsumeResponse(-1, str);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    private final class BillingServiceConnection implements ServiceConnection {
        private final BillingClientStateListener mListener;

        private BillingServiceConnection(BillingClientStateListener billingClientStateListener) {
            if (billingClientStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when init is done.");
            }
            this.mListener = billingClientStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            BillingHelper.logWarn(BillingClientImpl.TAG, "Billing service disconnected.");
            BillingClientImpl.this.mService = null;
            BillingClientImpl.this.mClientState = 0;
            this.mListener.onBillingServiceDisconnected();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            BillingHelper.logVerbose(BillingClientImpl.TAG, "Billing service connected.");
            BillingClientImpl.this.mService = IInAppBillingService.Stub.asInterface(iBinder);
            String packageName = BillingClientImpl.this.mApplicationContext.getPackageName();
            BillingClientImpl.this.mSubscriptionsSupported = false;
            BillingClientImpl.this.mSubscriptionUpdateSupported = false;
            BillingClientImpl.this.mIABv6Supported = false;
            try {
                int isBillingSupported = BillingClientImpl.this.mService.isBillingSupported(6, packageName, "subs");
                if (isBillingSupported != 0) {
                    if (BillingClientImpl.this.mService.isBillingSupported(6, packageName, "inapp") == 0) {
                        BillingHelper.logVerbose(BillingClientImpl.TAG, "In-app billing API without subs version 6 supported.");
                        BillingClientImpl.this.mIABv6Supported = true;
                    }
                    isBillingSupported = BillingClientImpl.this.mService.isBillingSupported(5, packageName, "subs");
                    if (isBillingSupported != 0) {
                        isBillingSupported = BillingClientImpl.this.mService.isBillingSupported(3, packageName, "subs");
                        if (isBillingSupported != 0) {
                            if (BillingClientImpl.this.mIABv6Supported) {
                                isBillingSupported = 0;
                            } else {
                                isBillingSupported = BillingClientImpl.this.mService.isBillingSupported(3, packageName, "inapp");
                                if (isBillingSupported == 0) {
                                    BillingHelper.logVerbose(BillingClientImpl.TAG, "In-app billing API version 3 with in-app items is supported.");
                                } else {
                                    BillingHelper.logWarn(BillingClientImpl.TAG, "Even billing API version 3 is not supported on this device.");
                                }
                            }
                        } else {
                            BillingHelper.logVerbose(BillingClientImpl.TAG, "In-app billing API version 3 with subscriptions is supported.");
                            BillingClientImpl.this.mSubscriptionsSupported = true;
                        }
                    } else {
                        BillingHelper.logVerbose(BillingClientImpl.TAG, "In-app billing API version 5 supported.");
                        BillingClientImpl.this.mSubscriptionUpdateSupported = true;
                        BillingClientImpl.this.mSubscriptionsSupported = true;
                    }
                } else {
                    BillingHelper.logVerbose(BillingClientImpl.TAG, "In-app billing API version 6 with subs is supported.");
                    BillingClientImpl.this.mIABv6Supported = true;
                    BillingClientImpl.this.mSubscriptionsSupported = true;
                    BillingClientImpl.this.mSubscriptionUpdateSupported = true;
                }
                if (isBillingSupported == 0) {
                    BillingClientImpl.this.mClientState = 2;
                } else {
                    BillingClientImpl.this.mClientState = 0;
                    BillingClientImpl.this.mService = null;
                }
                this.mListener.onBillingSetupFinished(isBillingSupported);
            } catch (RemoteException e) {
                BillingHelper.logWarn(BillingClientImpl.TAG, "RemoteException while setting up in-app billing" + e);
                BillingClientImpl.this.mClientState = 0;
                BillingClientImpl.this.mService = null;
                this.mListener.onBillingSetupFinished(-1);
            }
        }
    }
}
