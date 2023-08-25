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

    /* renamed from: a */
    public final ConcurrentHashMap f9482a;

    /* renamed from: b */
    public final xz3 f9483b;

    /* renamed from: c */
    public final ri6 f9484c;

    /* renamed from: d */
    public final String f9485d;

    /* renamed from: e */
    public final String f9486e;

    public fd5(pd5 pd5Var, xz3 xz3Var, ri6 ri6Var, String str, String str2) {
        ConcurrentHashMap m11392c = pd5Var.m11392c();
        this.f9482a = m11392c;
        this.f9483b = xz3Var;
        this.f9484c = ri6Var;
        this.f9485d = str;
        this.f9486e = str2;
        if (((Boolean) zzba.zzc().m23658b(g93.f10859v6)).booleanValue()) {
            int zze = zzf.zze(ri6Var);
            int i = zze - 1;
            if (i == 0) {
                m11392c.put("scar", "false");
                return;
            }
            m11392c.put("se", i != 1 ? i != 2 ? i != 3 ? "r_both" : "r_adstring" : "r_adinfo" : "query_g");
            m11392c.put("scar", "true");
            if (((Boolean) zzba.zzc().m23658b(g93.f10568U6)).booleanValue()) {
                m11392c.put("ad_format", str2);
            }
            if (zze == 2) {
                m11392c.put("rid", str);
            }
            m22770d("ragent", ri6Var.f25344d.zzp);
            m22770d("rtype", zzf.zza(zzf.zzb(ri6Var.f25344d)));
        }
    }

    /* renamed from: a */
    public final Map m22773a() {
        return this.f9482a;
    }

    /* renamed from: b */
    public final void m22772b(fi6 fi6Var) {
        ConcurrentHashMap concurrentHashMap;
        String str;
        if (fi6Var.f9624b.f8507a.size() > 0) {
            switch (((th6) fi6Var.f9624b.f8507a.get(0)).f27682b) {
                case 1:
                    concurrentHashMap = this.f9482a;
                    str = "banner";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 2:
                    concurrentHashMap = this.f9482a;
                    str = "interstitial";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 3:
                    concurrentHashMap = this.f9482a;
                    str = "native_express";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 4:
                    concurrentHashMap = this.f9482a;
                    str = "native_advanced";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 5:
                    concurrentHashMap = this.f9482a;
                    str = "rewarded";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 6:
                    this.f9482a.put("ad_format", "app_open_ad");
                    this.f9482a.put("as", true != this.f9483b.m4387i() ? "0" : "1");
                    break;
                default:
                    concurrentHashMap = this.f9482a;
                    str = "unknown";
                    concurrentHashMap.put("ad_format", str);
                    break;
            }
        }
        m22770d("gqi", fi6Var.f9624b.f8508b.f31252b);
    }

    /* renamed from: c */
    public final void m22771c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f9482a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f9482a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    /* renamed from: d */
    public final void m22770d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f9482a.put(str, str2);
    }
}
