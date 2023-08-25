package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;
@Deprecated
/* loaded from: classes.dex */
public class SkuDetails {
    public final String a;
    public final JSONObject b;

    public String a() {
        return this.b.optString("productId");
    }

    public String b() {
        return this.b.optString("type");
    }

    public int c() {
        return this.b.optInt("offer_type");
    }

    public String d() {
        return this.b.optString("offer_id");
    }

    public String e() {
        String optString = this.b.optString("offerIdToken");
        return optString.isEmpty() ? this.b.optString("offer_id_token") : optString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.a, ((SkuDetails) obj).a);
        }
        return false;
    }

    public final String f() {
        return this.b.optString("packageName");
    }

    public String g() {
        return this.b.optString("serializedDocid");
    }

    public final String h() {
        return this.b.optString("skuDetailsToken");
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.a));
    }
}
