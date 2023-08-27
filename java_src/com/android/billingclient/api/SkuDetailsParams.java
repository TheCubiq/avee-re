package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class SkuDetailsParams {
    private String mSkuType;
    private List<String> mSkusList;

    public String getSkuType() {
        return this.mSkuType;
    }

    public List<String> getSkusList() {
        return this.mSkusList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private String mSkuType;
        private List<String> mSkusList;

        private Builder() {
        }

        public Builder setSkusList(List<String> list) {
            this.mSkusList = list;
            return this;
        }

        public Builder setType(String str) {
            this.mSkuType = str;
            return this;
        }

        public SkuDetailsParams build() {
            SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
            skuDetailsParams.mSkuType = this.mSkuType;
            skuDetailsParams.mSkusList = new ArrayList(this.mSkusList);
            return skuDetailsParams;
        }
    }
}
