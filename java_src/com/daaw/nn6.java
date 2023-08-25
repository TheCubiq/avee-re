package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class nn6 {

    /* renamed from: a */
    public final HashMap f20334a;

    /* renamed from: b */
    public final tn6 f20335b;

    public nn6() {
        HashMap hashMap = new HashMap();
        this.f20334a = hashMap;
        this.f20335b = new tn6(zzt.zzB());
        hashMap.put("new_csi", "1");
    }

    /* renamed from: b */
    public static nn6 m14953b(String str) {
        nn6 nn6Var = new nn6();
        nn6Var.f20334a.put("action", str);
        return nn6Var;
    }

    /* renamed from: c */
    public static nn6 m14952c(String str) {
        nn6 nn6Var = new nn6();
        nn6Var.f20334a.put("request_id", str);
        return nn6Var;
    }

    /* renamed from: a */
    public final nn6 m14954a(String str, String str2) {
        this.f20334a.put(str, str2);
        return this;
    }

    /* renamed from: d */
    public final nn6 m14951d(String str) {
        this.f20335b.m8954b(str);
        return this;
    }

    /* renamed from: e */
    public final nn6 m14950e(String str, String str2) {
        this.f20335b.m8953c(str, str2);
        return this;
    }

    /* renamed from: f */
    public final nn6 m14949f(th6 th6Var) {
        this.f20334a.put("aai", th6Var.f27719x);
        return this;
    }

    /* renamed from: g */
    public final nn6 m14948g(wh6 wh6Var) {
        if (!TextUtils.isEmpty(wh6Var.f31252b)) {
            this.f20334a.put("gqi", wh6Var.f31252b);
        }
        return this;
    }

    /* renamed from: h */
    public final nn6 m14947h(fi6 fi6Var, xz3 xz3Var) {
        HashMap hashMap;
        String str;
        ei6 ei6Var = fi6Var.f9624b;
        m14948g(ei6Var.f8508b);
        if (!ei6Var.f8507a.isEmpty()) {
            String str2 = "ad_format";
            switch (((th6) ei6Var.f8507a.get(0)).f27682b) {
                case 1:
                    hashMap = this.f20334a;
                    str = "banner";
                    hashMap.put(str2, str);
                    break;
                case 2:
                    hashMap = this.f20334a;
                    str = "interstitial";
                    hashMap.put(str2, str);
                    break;
                case 3:
                    hashMap = this.f20334a;
                    str = "native_express";
                    hashMap.put(str2, str);
                    break;
                case 4:
                    hashMap = this.f20334a;
                    str = "native_advanced";
                    hashMap.put(str2, str);
                    break;
                case 5:
                    hashMap = this.f20334a;
                    str = "rewarded";
                    hashMap.put(str2, str);
                    break;
                case 6:
                    this.f20334a.put("ad_format", "app_open_ad");
                    if (xz3Var != null) {
                        hashMap = this.f20334a;
                        str = true != xz3Var.m4387i() ? "0" : "1";
                        str2 = "as";
                        hashMap.put(str2, str);
                        break;
                    }
                    break;
                default:
                    hashMap = this.f20334a;
                    str = "unknown";
                    hashMap.put(str2, str);
                    break;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final nn6 m14946i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f20334a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f20334a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    /* renamed from: j */
    public final Map m14945j() {
        HashMap hashMap = new HashMap(this.f20334a);
        for (sn6 sn6Var : this.f20335b.m8955a()) {
            hashMap.put(sn6Var.f26434a, sn6Var.f26435b);
        }
        return hashMap;
    }
}
