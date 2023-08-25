package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class hf6 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public hf6(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final cf6 zzb() {
        Context context = (Context) this.a.zzb();
        bk6 bk6Var = (bk6) this.b.zzb();
        vk6 vk6Var = (vk6) this.c.zzb();
        kz3 zzh = ((Boolean) zzba.zzc().b(g93.M5)).booleanValue() ? zzt.zzo().h().zzh() : zzt.zzo().h().zzi();
        boolean z = false;
        if (zzh != null && zzh.h()) {
            z = true;
        }
        if (((Integer) zzba.zzc().b(g93.O5)).intValue() > 0) {
            if (!((Boolean) zzba.zzc().b(g93.L5)).booleanValue() || z) {
                uk6 a = vk6Var.a(jk6.Rewarded, context, bk6Var, new de6(new ae6()));
                pe6 pe6Var = new pe6(new oe6());
                fk6 fk6Var = a.a;
                g77 g77Var = z04.a;
                return new fe6(pe6Var, new le6(fk6Var, g77Var), a.b, a.a.zza().w, g77Var);
            }
        }
        return new oe6();
    }
}
