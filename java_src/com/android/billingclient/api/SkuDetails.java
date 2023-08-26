package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SkuDetails {
    private final String mOriginalJson;
    private final JSONObject mParsedJson;

    public SkuDetails(String str) throws JSONException {
        this.mOriginalJson = str;
        this.mParsedJson = new JSONObject(this.mOriginalJson);
    }

    public String getSku() {
        return this.mParsedJson.optString("productId");
    }

    public String getType() {
        return this.mParsedJson.optString("type");
    }

    public String getPrice() {
        return this.mParsedJson.optString(FirebaseAnalytics.Param.PRICE);
    }

    public long getPriceAmountMicros() {
        return this.mParsedJson.optLong("price_amount_micros");
    }

    public String getPriceCurrencyCode() {
        return this.mParsedJson.optString("price_currency_code");
    }

    public String getTitle() {
        return this.mParsedJson.optString("title");
    }

    public String getDescription() {
        return this.mParsedJson.optString("description");
    }

    public String getSubscriptionPeriod() {
        return this.mParsedJson.optString("subscriptionPeriod");
    }

    public String getFreeTrialPeriod() {
        return this.mParsedJson.optString("freeTrialPeriod");
    }

    public String getIntroductoryPrice() {
        return this.mParsedJson.optString("introductoryPrice");
    }

    public String getIntroductoryPriceAmountMicros() {
        return this.mParsedJson.optString("introductoryPriceAmountMicros");
    }

    public String getIntroductoryPricePeriod() {
        return this.mParsedJson.optString("introductoryPricePeriod");
    }

    public String getIntroductoryPriceCycles() {
        return this.mParsedJson.optString("introductoryPriceCycles");
    }

    public String toString() {
        return "SkuDetails: " + this.mOriginalJson;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.mOriginalJson, ((SkuDetails) obj).mOriginalJson);
    }

    public int hashCode() {
        return this.mOriginalJson.hashCode();
    }

    /* loaded from: classes.dex */
    static class SkuDetailsResult {
        private int mResponseCode;
        private List<SkuDetails> mSkuDetailsList;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SkuDetailsResult(int i, List<SkuDetails> list) {
            this.mSkuDetailsList = list;
            this.mResponseCode = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public List<SkuDetails> getSkuDetailsList() {
            return this.mSkuDetailsList;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getResponseCode() {
            return this.mResponseCode;
        }
    }
}
