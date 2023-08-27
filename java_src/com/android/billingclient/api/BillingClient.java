package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface BillingResponse {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface FeatureType {
        public static final String IN_APP_ITEMS_ON_VR = "inAppItemsOnVr";
        public static final String SUBSCRIPTIONS = "subscriptions";
        public static final String SUBSCRIPTIONS_ON_VR = "subscriptionsOnVr";
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface SkuType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    public abstract void consumeAsync(String str, ConsumeResponseListener consumeResponseListener);

    public abstract void endConnection();

    public abstract int isFeatureSupported(String str);

    public abstract boolean isReady();

    public abstract int launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams);

    public abstract void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    public abstract Purchase.PurchasesResult queryPurchases(String str);

    public abstract void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener);

    public abstract void startConnection(BillingClientStateListener billingClientStateListener);

    /* loaded from: classes.dex */
    public static final class Builder {
        private final Context mContext;
        private PurchasesUpdatedListener mListener;

        private Builder(Context context) {
            this.mContext = context;
        }

        public Builder setListener(PurchasesUpdatedListener purchasesUpdatedListener) {
            this.mListener = purchasesUpdatedListener;
            return this;
        }

        public BillingClient build() {
            Context context = this.mContext;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            PurchasesUpdatedListener purchasesUpdatedListener = this.mListener;
            if (purchasesUpdatedListener == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            return new BillingClientImpl(context, purchasesUpdatedListener);
        }
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context);
    }
}
