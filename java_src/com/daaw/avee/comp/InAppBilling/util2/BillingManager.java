package com.daaw.avee.comp.InAppBilling.util2;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.daaw.avee.Common.Events.WeakDelegateR1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class BillingManager implements PurchasesUpdatedListener {
    private static final String BASE_64_ENCODED_PUBLIC_KEY = "M";
    public static final int BILLING_MANAGER_NOT_INITIALIZED = -1;
    private static final String TAG = "BillingManager";
    public static final WeakDelegateR1<String, String> onRequestBase64PublicKey = new WeakDelegateR1<>();
    private final Activity mActivity;
    private BillingClient mBillingClient;
    private final BillingUpdatesListener mBillingUpdatesListener;
    private boolean mIsServiceConnected;
    private Set<String> mTokensToBeConsumed;
    private final List<Purchase> mPurchases = new ArrayList();
    private int mBillingClientResponseCode = -1;

    /* loaded from: classes.dex */
    public interface BillingUpdatesListener {
        void onBillingClientSetupFinished();

        void onConsumeFinished(String str, int i);

        void onPurchasesUpdated(List<Purchase> list);
    }

    /* loaded from: classes.dex */
    public interface ServiceConnectedListener {
        void onServiceConnected(int i);
    }

    public BillingManager(Activity activity, BillingUpdatesListener billingUpdatesListener) {
        Log.d(TAG, "Creating Billing client.");
        this.mActivity = activity;
        this.mBillingUpdatesListener = billingUpdatesListener;
        this.mBillingClient = BillingClient.newBuilder(activity).setListener(this).build();
        Log.d(TAG, "Starting setup.");
        startServiceConnection(new Runnable() { // from class: com.daaw.avee.comp.InAppBilling.util2.BillingManager.1
            @Override // java.lang.Runnable
            public void run() {
                BillingManager.this.mBillingUpdatesListener.onBillingClientSetupFinished();
                Log.d(BillingManager.TAG, "Setup successful. Querying inventory.");
                BillingManager.this.queryPurchases();
            }
        });
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(int i, List<Purchase> list) {
        if (i == 0) {
            for (Purchase purchase : list) {
                handlePurchase(purchase);
            }
            this.mBillingUpdatesListener.onPurchasesUpdated(this.mPurchases);
        } else if (i == 1) {
            Log.i(TAG, "onPurchasesUpdated() - user cancelled the purchase flow - skipping");
        } else {
            Log.w(TAG, "onPurchasesUpdated() got unknown resultCode: " + i);
        }
    }

    public void initiatePurchaseFlow(String str, String str2) {
        initiatePurchaseFlow(str, null, str2);
    }

    public void initiatePurchaseFlow(final String str, final ArrayList<String> arrayList, final String str2) {
        executeServiceRequest(new Runnable() { // from class: com.daaw.avee.comp.InAppBilling.util2.BillingManager.2
            @Override // java.lang.Runnable
            public void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("Launching in-app purchase flow. Replace old SKU? ");
                sb.append(arrayList != null);
                Log.d(BillingManager.TAG, sb.toString());
                BillingManager.this.mBillingClient.launchBillingFlow(BillingManager.this.mActivity, BillingFlowParams.newBuilder().setSku(str).setType(str2).setOldSkus(arrayList).build());
            }
        });
    }

    public Context getContext() {
        return this.mActivity;
    }

    public void destroy() {
        Log.d(TAG, "Destroying the manager.");
        BillingClient billingClient = this.mBillingClient;
        if (billingClient == null || !billingClient.isReady()) {
            return;
        }
        this.mBillingClient.endConnection();
        this.mBillingClient = null;
    }

    public void querySkuDetailsAsync(final String str, final List<String> list, final SkuDetailsResponseListener skuDetailsResponseListener) {
        executeServiceRequest(new Runnable() { // from class: com.daaw.avee.comp.InAppBilling.util2.BillingManager.3
            @Override // java.lang.Runnable
            public void run() {
                SkuDetailsParams.Builder newBuilder = SkuDetailsParams.newBuilder();
                newBuilder.setSkusList(list).setType(str);
                BillingManager.this.mBillingClient.querySkuDetailsAsync(newBuilder.build(), new SkuDetailsResponseListener() { // from class: com.daaw.avee.comp.InAppBilling.util2.BillingManager.3.1
                    @Override // com.android.billingclient.api.SkuDetailsResponseListener
                    public void onSkuDetailsResponse(int i, List<SkuDetails> list2) {
                        skuDetailsResponseListener.onSkuDetailsResponse(i, list2);
                    }
                });
            }
        });
    }

    public void consumeAsync(final String str) {
        Set<String> set = this.mTokensToBeConsumed;
        if (set == null) {
            this.mTokensToBeConsumed = new HashSet();
        } else if (set.contains(str)) {
            Log.i(TAG, "Token was already scheduled to be consumed - skipping...");
            return;
        }
        this.mTokensToBeConsumed.add(str);
        final ConsumeResponseListener consumeResponseListener = new ConsumeResponseListener() { // from class: com.daaw.avee.comp.InAppBilling.util2.BillingManager.4
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public void onConsumeResponse(int i, String str2) {
                BillingManager.this.mBillingUpdatesListener.onConsumeFinished(str2, i);
            }
        };
        executeServiceRequest(new Runnable() { // from class: com.daaw.avee.comp.InAppBilling.util2.BillingManager.5
            @Override // java.lang.Runnable
            public void run() {
                BillingManager.this.mBillingClient.consumeAsync(str, consumeResponseListener);
            }
        });
    }

    public int getBillingClientResponseCode() {
        return this.mBillingClientResponseCode;
    }

    private void handlePurchase(Purchase purchase) {
        if (!verifyValidSignature(purchase.getOriginalJson(), purchase.getSignature())) {
            Log.i(TAG, "Got a purchase: " + purchase + "; but signature is bad. Skipping...");
            return;
        }
        Log.d(TAG, "Got a verified purchase: " + purchase);
        this.mPurchases.add(purchase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onQueryPurchasesFinished(Purchase.PurchasesResult purchasesResult) {
        if (this.mBillingClient == null || purchasesResult.getResponseCode() != 0) {
            Log.w(TAG, "Billing client was null or result code (" + purchasesResult.getResponseCode() + ") was bad - quitting");
            return;
        }
        Log.d(TAG, "Query inventory was successful.");
        this.mPurchases.clear();
        onPurchasesUpdated(0, purchasesResult.getPurchasesList());
    }

    public boolean areSubscriptionsSupported() {
        int isFeatureSupported = this.mBillingClient.isFeatureSupported(BillingClient.FeatureType.SUBSCRIPTIONS);
        if (isFeatureSupported != 0) {
            Log.w(TAG, "areSubscriptionsSupported() got an error response: " + isFeatureSupported);
        }
        return isFeatureSupported == 0;
    }

    public void queryPurchases() {
        executeServiceRequest(new Runnable() { // from class: com.daaw.avee.comp.InAppBilling.util2.BillingManager.6
            @Override // java.lang.Runnable
            public void run() {
                if (BillingManager.this.mBillingClient == null) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                Purchase.PurchasesResult queryPurchases = BillingManager.this.mBillingClient.queryPurchases("inapp");
                Log.i(BillingManager.TAG, "Querying purchases elapsed time: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                if (BillingManager.this.areSubscriptionsSupported()) {
                    Purchase.PurchasesResult queryPurchases2 = BillingManager.this.mBillingClient.queryPurchases("subs");
                    Log.i(BillingManager.TAG, "Querying purchases and subscriptions elapsed time: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Querying subscriptions result code: ");
                    sb.append(queryPurchases2.getResponseCode());
                    sb.append(" res: ");
                    sb.append(queryPurchases2.getPurchasesList() != null ? queryPurchases2.getPurchasesList().size() : 0);
                    Log.i(BillingManager.TAG, sb.toString());
                    if (queryPurchases2.getResponseCode() == 0) {
                        queryPurchases.getPurchasesList().addAll(queryPurchases2.getPurchasesList());
                    } else {
                        Log.e(BillingManager.TAG, "Got an error response trying to query subscription purchases");
                    }
                } else if (queryPurchases.getResponseCode() == 0) {
                    Log.i(BillingManager.TAG, "Skipped subscription purchases query since they are not supported");
                } else {
                    Log.w(BillingManager.TAG, "queryPurchases() got an error response code: " + queryPurchases.getResponseCode());
                }
                BillingManager.this.onQueryPurchasesFinished(queryPurchases);
            }
        });
    }

    public void startServiceConnection(final Runnable runnable) {
        this.mBillingClient.startConnection(new BillingClientStateListener() { // from class: com.daaw.avee.comp.InAppBilling.util2.BillingManager.7
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(int i) {
                Log.d(BillingManager.TAG, "Setup finished. Response code: " + i);
                if (i == 0) {
                    BillingManager.this.mIsServiceConnected = true;
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
                BillingManager.this.mBillingClientResponseCode = i;
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
                BillingManager.this.mIsServiceConnected = false;
            }
        });
    }

    private void executeServiceRequest(Runnable runnable) {
        if (this.mIsServiceConnected) {
            runnable.run();
        } else {
            startServiceConnection(runnable);
        }
    }

    private boolean verifyValidSignature(String str, String str2) {
        try {
            return Security.verifyPurchase(onRequestBase64PublicKey.invoke(BASE_64_ENCODED_PUBLIC_KEY, ""), str, str2);
        } catch (IOException e) {
            Log.e(TAG, "Got an exception trying to validate a purchase: " + e);
            return false;
        }
    }
}
