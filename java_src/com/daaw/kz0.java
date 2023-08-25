package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class kz0 {
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;

    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final long b;
        public final String c;
        public final String d;
        public final String e;

        public a(JSONObject jSONObject) {
            this.a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.c = jSONObject.optString("priceCurrencyCode");
            this.d = jSONObject.optString("offerIdToken");
            this.e = jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
        }

        public final String a() {
            return this.d;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final long b;
        public final String c;
        public final String d;
        public final int e;
        public final int f;

        public b(JSONObject jSONObject) {
            this.d = jSONObject.optString("billingPeriod");
            this.c = jSONObject.optString("priceCurrencyCode");
            this.a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f = jSONObject.optInt("recurrenceMode");
            this.e = jSONObject.optInt("billingCycleCount");
        }

        public String a() {
            return this.d;
        }

        public String b() {
            return this.a;
        }

        public long c() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final List<b> a;

        public c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(new b(optJSONObject));
                    }
                }
            }
            this.a = arrayList;
        }

        public List<b> a() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final String a;
        public final c b;
        public final List<String> c;
        public final i53 d;

        public d(JSONObject jSONObject) {
            this.a = jSONObject.getString("offerIdToken");
            this.b = new c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.d = optJSONObject == null ? null : new i53(optJSONObject);
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.c = arrayList;
        }

        public String a() {
            return this.a;
        }

        public c b() {
            return this.b;
        }
    }

    public kz0(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.e = jSONObject.optString("title");
        this.f = jSONObject.optString("name");
        this.g = jSONObject.optString("description");
        this.h = jSONObject.optString("skuDetailsToken");
        if (optString2.equals("inapp")) {
            this.i = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new d(optJSONArray.getJSONObject(i)));
            }
        }
        this.i = arrayList;
    }

    public a a() {
        JSONObject optJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        if (optJSONObject != null) {
            return new a(optJSONObject);
        }
        return null;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public List<d> d() {
        return this.i;
    }

    public final String e() {
        return this.b.optString("packageName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kz0) {
            return TextUtils.equals(this.a, ((kz0) obj).a);
        }
        return false;
    }

    public final String f() {
        return this.h;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String obj = this.b.toString();
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.h;
        String valueOf = String.valueOf(this.i);
        return "ProductDetails{jsonString='" + str + "', parsedJson=" + obj + ", productId='" + str2 + "', productType='" + str3 + "', title='" + str4 + "', productDetailsToken='" + str5 + "', subscriptionOfferDetails=" + valueOf + "}";
    }
}
