package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public class BillingFlowParams {
    static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";
    static final String EXTRA_PARAM_KEY_OLD_SKUS = "skusToReplace";
    static final String EXTRA_PARAM_KEY_REPLACE_SKUS_PRORATION_MODE = "prorationMode";
    static final String EXTRA_PARAM_KEY_VR = "vr";
    private String mAccountId;
    private String mOldSku;
    private int mReplaceSkusProrationMode = 0;
    private String mSku;
    private String mSkuType;
    private boolean mVrPurchaseFlow;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ProrationMode {
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
    }

    public String getSku() {
        return this.mSku;
    }

    public String getSkuType() {
        return this.mSkuType;
    }

    @Deprecated
    public ArrayList<String> getOldSkus() {
        return new ArrayList<>(Arrays.asList(this.mOldSku));
    }

    public String getOldSku() {
        return this.mOldSku;
    }

    public String getAccountId() {
        return this.mAccountId;
    }

    public boolean getVrPurchaseFlow() {
        return this.mVrPurchaseFlow;
    }

    public int getReplaceSkusProrationMode() {
        return this.mReplaceSkusProrationMode;
    }

    public boolean hasExtraParams() {
        return (!this.mVrPurchaseFlow && this.mAccountId == null && this.mReplaceSkusProrationMode == 0) ? false : true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private String mAccountId;
        private String mOldSku;
        private int mReplaceSkusProrationMode;
        private String mSku;
        private String mSkuType;
        private boolean mVrPurchaseFlow;

        private Builder() {
            this.mReplaceSkusProrationMode = 0;
        }

        public Builder setSku(String str) {
            this.mSku = str;
            return this;
        }

        public Builder setType(String str) {
            this.mSkuType = str;
            return this;
        }

        @Deprecated
        public Builder setOldSkus(ArrayList<String> arrayList) {
            if (arrayList != null && arrayList.size() > 0) {
                this.mOldSku = arrayList.get(0);
            }
            return this;
        }

        public Builder setOldSku(String str) {
            this.mOldSku = str;
            return this;
        }

        @Deprecated
        public Builder addOldSku(String str) {
            this.mOldSku = str;
            return this;
        }

        public Builder setReplaceSkusProrationMode(int i) {
            this.mReplaceSkusProrationMode = i;
            return this;
        }

        public Builder setAccountId(String str) {
            this.mAccountId = str;
            return this;
        }

        public Builder setVrPurchaseFlow(boolean z) {
            this.mVrPurchaseFlow = z;
            return this;
        }

        public BillingFlowParams build() {
            BillingFlowParams billingFlowParams = new BillingFlowParams();
            billingFlowParams.mSku = this.mSku;
            billingFlowParams.mSkuType = this.mSkuType;
            billingFlowParams.mOldSku = this.mOldSku;
            billingFlowParams.mAccountId = this.mAccountId;
            billingFlowParams.mVrPurchaseFlow = this.mVrPurchaseFlow;
            billingFlowParams.mReplaceSkusProrationMode = this.mReplaceSkusProrationMode;
            return billingFlowParams;
        }
    }
}
