package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@Deprecated
/* loaded from: classes.dex */
public final class fd5 {
    public final ConcurrentHashMap a;
    public final xz3 b;
    public final ri6 c;
    public final String d;
    public final String e;

    public fd5(pd5 pd5Var, xz3 xz3Var, ri6 ri6Var, String str, String str2) {
        ConcurrentHashMap c = pd5Var.c();
        this.a = c;
        this.b = xz3Var;
        this.c = ri6Var;
        this.d = str;
        this.e = str2;
        if (((Boolean) zzba.zzc().b(g93.v6)).booleanValue()) {
            int zze = zzf.zze(ri6Var);
            int i = zze - 1;
            if (i == 0) {
                c.put("scar", "false");
                return;
            }
            c.put("se", i != 1 ? i != 2 ? i != 3 ? "r_both" : "r_adstring" : "r_adinfo" : "query_g");
            c.put("scar", "true");
            if (((Boolean) zzba.zzc().b(g93.U6)).booleanValue()) {
                c.put("ad_format", str2);
            }
            if (zze == 2) {
                c.put("rid", str);
            }
            d("ragent", ri6Var.d.zzp);
            d("rtype", zzf.zza(zzf.zzb(ri6Var.d)));
        }
    }

    public final Map a() {
        return this.a;
    }

    public final void b(fi6 fi6Var) {
        ConcurrentHashMap concurrentHashMap;
        String str;
        if (fi6Var.b.a.size() > 0) {
            switch (((th6) fi6Var.b.a.get(0)).b) {
                case 1:
                    concurrentHashMap = this.a;
                    str = "banner";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 2:
                    concurrentHashMap = this.a;
                    str = "interstitial";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 3:
                    concurrentHashMap = this.a;
                    str = "native_express";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 4:
                    concurrentHashMap = this.a;
                    str = "native_advanced";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 5:
                    concurrentHashMap = this.a;
                    str = "rewarded";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 6:
                    this.a.put("ad_format", "app_open_ad");
                    this.a.put("as", true != this.b.i() ? "0" : "1");
                    break;
                default:
                    concurrentHashMap = this.a;
                    str = "unknown";
                    concurrentHashMap.put("ad_format", str);
                    break;
            }
        }
        d("gqi", fi6Var.b.b.b);
    }

    public final void c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.a.put(str, str2);
    }
}
