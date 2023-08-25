package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class ef6 {
    /* renamed from: a */
    public static cf6 m23503a(Context context, bk6 bk6Var, vk6 vk6Var) {
        return m23501c(context, bk6Var, vk6Var);
    }

    /* renamed from: b */
    public static cf6 m23502b(Context context, bk6 bk6Var, vk6 vk6Var) {
        return m23501c(context, bk6Var, vk6Var);
    }

    /* renamed from: c */
    public static cf6 m23501c(Context context, bk6 bk6Var, vk6 vk6Var) {
        kz3 zzh = ((Boolean) zzba.zzc().m23658b(g93.f10487M5)).booleanValue() ? zzt.zzo().m11915h().zzh() : zzt.zzo().m11915h().zzi();
        boolean z = false;
        if (zzh != null && zzh.m17289h()) {
            z = true;
        }
        if (((Integer) zzba.zzc().m23658b(g93.f10650c6)).intValue() > 0) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10477L5)).booleanValue() || z) {
                uk6 m7076a = vk6Var.m7076a(jk6.AppOpen, context, bk6Var, new de6(new ae6()));
                pe6 pe6Var = new pe6(new oe6());
                fk6 fk6Var = m7076a.f29149a;
                g77 g77Var = z04.f34305a;
                return new fe6(pe6Var, new le6(fk6Var, g77Var), m7076a.f29150b, m7076a.f29149a.zza().f37007w, g77Var);
            }
        }
        return new oe6();
    }
}
