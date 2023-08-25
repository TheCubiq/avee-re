package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;
@Deprecated
/* loaded from: classes.dex */
public class SkuDetails {

    /* renamed from: a */
    public final String f2588a;

    /* renamed from: b */
    public final JSONObject f2589b;

    /* renamed from: a */
    public String m27858a() {
        return this.f2589b.optString("productId");
    }

    /* renamed from: b */
    public String m27857b() {
        return this.f2589b.optString("type");
    }

    /* renamed from: c */
    public int m27856c() {
        return this.f2589b.optInt("offer_type");
    }

    /* renamed from: d */
    public String m27855d() {
        return this.f2589b.optString("offer_id");
    }

    /* renamed from: e */
    public String m27854e() {
        String optString = this.f2589b.optString("offerIdToken");
        return optString.isEmpty() ? this.f2589b.optString("offer_id_token") : optString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f2588a, ((SkuDetails) obj).f2588a);
        }
        return false;
    }

    /* renamed from: f */
    public final String m27853f() {
        return this.f2589b.optString("packageName");
    }

    /* renamed from: g */
    public String m27852g() {
        return this.f2589b.optString("serializedDocid");
    }

    /* renamed from: h */
    public final String m27851h() {
        return this.f2589b.optString("skuDetailsToken");
    }

    public int hashCode() {
        return this.f2588a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f2588a));
    }
}
