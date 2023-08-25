package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class nn6 {
    public final HashMap a;
    public final tn6 b;

    public nn6() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        this.b = new tn6(zzt.zzB());
        hashMap.put("new_csi", "1");
    }

    public static nn6 b(String str) {
        nn6 nn6Var = new nn6();
        nn6Var.a.put("action", str);
        return nn6Var;
    }

    public static nn6 c(String str) {
        nn6 nn6Var = new nn6();
        nn6Var.a.put("request_id", str);
        return nn6Var;
    }

    public final nn6 a(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public final nn6 d(String str) {
        this.b.b(str);
        return this;
    }

    public final nn6 e(String str, String str2) {
        this.b.c(str, str2);
        return this;
    }

    public final nn6 f(th6 th6Var) {
        this.a.put("aai", th6Var.x);
        return this;
    }

    public final nn6 g(wh6 wh6Var) {
        if (!TextUtils.isEmpty(wh6Var.b)) {
            this.a.put("gqi", wh6Var.b);
        }
        return this;
    }

    public final nn6 h(fi6 fi6Var, xz3 xz3Var) {
        HashMap hashMap;
        String str;
        ei6 ei6Var = fi6Var.b;
        g(ei6Var.b);
        if (!ei6Var.a.isEmpty()) {
            String str2 = "ad_format";
            switch (((th6) ei6Var.a.get(0)).b) {
                case 1:
                    hashMap = this.a;
                    str = "banner";
                    hashMap.put(str2, str);
                    break;
                case 2:
                    hashMap = this.a;
                    str = "interstitial";
                    hashMap.put(str2, str);
                    break;
                case 3:
                    hashMap = this.a;
                    str = "native_express";
                    hashMap.put(str2, str);
                    break;
                case 4:
                    hashMap = this.a;
                    str = "native_advanced";
                    hashMap.put(str2, str);
                    break;
                case 5:
                    hashMap = this.a;
                    str = "rewarded";
                    hashMap.put(str2, str);
                    break;
                case 6:
                    this.a.put("ad_format", "app_open_ad");
                    if (xz3Var != null) {
                        hashMap = this.a;
                        str = true != xz3Var.i() ? "0" : "1";
                        str2 = "as";
                        hashMap.put(str2, str);
                        break;
                    }
                    break;
                default:
                    hashMap = this.a;
                    str = "unknown";
                    hashMap.put(str2, str);
                    break;
            }
        }
        return this;
    }

    public final nn6 i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map j() {
        HashMap hashMap = new HashMap(this.a);
        for (sn6 sn6Var : this.b.a()) {
            hashMap.put(sn6Var.a, sn6Var.b);
        }
        return hashMap;
    }
}
