package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class Purchase {

    /* renamed from: a */
    public final String f2585a;

    /* renamed from: b */
    public final String f2586b;

    /* renamed from: c */
    public final JSONObject f2587c;

    public Purchase(String str, String str2) {
        this.f2585a = str;
        this.f2586b = str2;
        this.f2587c = new JSONObject(str);
    }

    /* renamed from: a */
    public String m27866a() {
        return this.f2585a;
    }

    /* renamed from: b */
    public List<String> m27865b() {
        return m27859h();
    }

    /* renamed from: c */
    public int m27864c() {
        return this.f2587c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    /* renamed from: d */
    public String m27863d() {
        JSONObject jSONObject = this.f2587c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    /* renamed from: e */
    public String m27862e() {
        return this.f2586b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Purchase) {
            Purchase purchase = (Purchase) obj;
            return TextUtils.equals(this.f2585a, purchase.m27866a()) && TextUtils.equals(this.f2586b, purchase.m27862e());
        }
        return false;
    }

    /* renamed from: f */
    public boolean m27861f() {
        return this.f2587c.optBoolean("acknowledged", true);
    }

    /* renamed from: g */
    public boolean m27860g() {
        this.f2587c.optBoolean("autoRenewing");
        return true;
    }

    /* renamed from: h */
    public final ArrayList m27859h() {
        ArrayList arrayList = new ArrayList();
        if (this.f2587c.has("productIds")) {
            JSONArray optJSONArray = this.f2587c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (this.f2587c.has("productId")) {
            arrayList.add(this.f2587c.optString("productId"));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f2585a.hashCode();
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f2585a));
    }
}
