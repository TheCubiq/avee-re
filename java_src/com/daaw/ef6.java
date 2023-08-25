package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class ef6 {
    public static cf6 a(Context context, bk6 bk6Var, vk6 vk6Var) {
        return c(context, bk6Var, vk6Var);
    }

    public static cf6 b(Context context, bk6 bk6Var, vk6 vk6Var) {
        return c(context, bk6Var, vk6Var);
    }

    public static cf6 c(Context context, bk6 bk6Var, vk6 vk6Var) {
        kz3 zzh = ((Boolean) zzba.zzc().b(g93.M5)).booleanValue() ? zzt.zzo().h().zzh() : zzt.zzo().h().zzi();
        boolean z = false;
        if (zzh != null && zzh.h()) {
            z = true;
        }
        if (((Integer) zzba.zzc().b(g93.c6)).intValue() > 0) {
            if (!((Boolean) zzba.zzc().b(g93.L5)).booleanValue() || z) {
                uk6 a = vk6Var.a(jk6.AppOpen, context, bk6Var, new de6(new ae6()));
                pe6 pe6Var = new pe6(new oe6());
                fk6 fk6Var = a.a;
                g77 g77Var = z04.a;
                return new fe6(pe6Var, new le6(fk6Var, g77Var), a.b, a.a.zza().w, g77Var);
            }
        }
        return new oe6();
    }
}
