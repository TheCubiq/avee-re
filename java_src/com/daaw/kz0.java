package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class kz0 {

    /* renamed from: a */
    public final String f16868a;

    /* renamed from: b */
    public final JSONObject f16869b;

    /* renamed from: c */
    public final String f16870c;

    /* renamed from: d */
    public final String f16871d;

    /* renamed from: e */
    public final String f16872e;

    /* renamed from: f */
    public final String f16873f;

    /* renamed from: g */
    public final String f16874g;

    /* renamed from: h */
    public final String f16875h;

    /* renamed from: i */
    public final List f16876i;

    /* renamed from: com.daaw.kz0$a */
    /* loaded from: classes.dex */
    public static final class C1998a {

        /* renamed from: a */
        public final String f16877a;

        /* renamed from: b */
        public final long f16878b;

        /* renamed from: c */
        public final String f16879c;

        /* renamed from: d */
        public final String f16880d;

        /* renamed from: e */
        public final String f16881e;

        public C1998a(JSONObject jSONObject) {
            this.f16877a = jSONObject.optString("formattedPrice");
            this.f16878b = jSONObject.optLong("priceAmountMicros");
            this.f16879c = jSONObject.optString("priceCurrencyCode");
            this.f16880d = jSONObject.optString("offerIdToken");
            this.f16881e = jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
        }

        /* renamed from: a */
        public final String m17306a() {
            return this.f16880d;
        }
    }

    /* renamed from: com.daaw.kz0$b */
    /* loaded from: classes.dex */
    public static final class C1999b {

        /* renamed from: a */
        public final String f16882a;

        /* renamed from: b */
        public final long f16883b;

        /* renamed from: c */
        public final String f16884c;

        /* renamed from: d */
        public final String f16885d;

        /* renamed from: e */
        public final int f16886e;

        /* renamed from: f */
        public final int f16887f;

        public C1999b(JSONObject jSONObject) {
            this.f16885d = jSONObject.optString("billingPeriod");
            this.f16884c = jSONObject.optString("priceCurrencyCode");
            this.f16882a = jSONObject.optString("formattedPrice");
            this.f16883b = jSONObject.optLong("priceAmountMicros");
            this.f16887f = jSONObject.optInt("recurrenceMode");
            this.f16886e = jSONObject.optInt("billingCycleCount");
        }

        /* renamed from: a */
        public String m17305a() {
            return this.f16885d;
        }

        /* renamed from: b */
        public String m17304b() {
            return this.f16882a;
        }

        /* renamed from: c */
        public long m17303c() {
            return this.f16883b;
        }
    }

    /* renamed from: com.daaw.kz0$c */
    /* loaded from: classes.dex */
    public static class C2000c {

        /* renamed from: a */
        public final List<C1999b> f16888a;

        public C2000c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(new C1999b(optJSONObject));
                    }
                }
            }
            this.f16888a = arrayList;
        }

        /* renamed from: a */
        public List<C1999b> m17302a() {
            return this.f16888a;
        }
    }

    /* renamed from: com.daaw.kz0$d */
    /* loaded from: classes.dex */
    public static final class C2001d {

        /* renamed from: a */
        public final String f16889a;

        /* renamed from: b */
        public final C2000c f16890b;

        /* renamed from: c */
        public final List<String> f16891c;

        /* renamed from: d */
        public final i53 f16892d;

        public C2001d(JSONObject jSONObject) {
            this.f16889a = jSONObject.getString("offerIdToken");
            this.f16890b = new C2000c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f16892d = optJSONObject == null ? null : new i53(optJSONObject);
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.f16891c = arrayList;
        }

        /* renamed from: a */
        public String m17301a() {
            return this.f16889a;
        }

        /* renamed from: b */
        public C2000c m17300b() {
            return this.f16890b;
        }
    }

    public kz0(String str) {
        this.f16868a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f16869b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f16870c = optString;
        String optString2 = jSONObject.optString("type");
        this.f16871d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f16872e = jSONObject.optString("title");
        this.f16873f = jSONObject.optString("name");
        this.f16874g = jSONObject.optString("description");
        this.f16875h = jSONObject.optString("skuDetailsToken");
        if (optString2.equals("inapp")) {
            this.f16876i = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new C2001d(optJSONArray.getJSONObject(i)));
            }
        }
        this.f16876i = arrayList;
    }

    /* renamed from: a */
    public C1998a m17312a() {
        JSONObject optJSONObject = this.f16869b.optJSONObject("oneTimePurchaseOfferDetails");
        if (optJSONObject != null) {
            return new C1998a(optJSONObject);
        }
        return null;
    }

    /* renamed from: b */
    public String m17311b() {
        return this.f16870c;
    }

    /* renamed from: c */
    public String m17310c() {
        return this.f16871d;
    }

    /* renamed from: d */
    public List<C2001d> m17309d() {
        return this.f16876i;
    }

    /* renamed from: e */
    public final String m17308e() {
        return this.f16869b.optString("packageName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kz0) {
            return TextUtils.equals(this.f16868a, ((kz0) obj).f16868a);
        }
        return false;
    }

    /* renamed from: f */
    public final String m17307f() {
        return this.f16875h;
    }

    public final int hashCode() {
        return this.f16868a.hashCode();
    }

    public final String toString() {
        String str = this.f16868a;
        String obj = this.f16869b.toString();
        String str2 = this.f16870c;
        String str3 = this.f16871d;
        String str4 = this.f16872e;
        String str5 = this.f16875h;
        String valueOf = String.valueOf(this.f16876i);
        return "ProductDetails{jsonString='" + str + "', parsedJson=" + obj + ", productId='" + str2 + "', productType='" + str3 + "', title='" + str4 + "', productDetailsToken='" + str5 + "', subscriptionOfferDetails=" + valueOf + "}";
    }
}
