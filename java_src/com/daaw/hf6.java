package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class hf6 implements wz7 {

    /* renamed from: a */
    public final m08 f12504a;

    /* renamed from: b */
    public final m08 f12505b;

    /* renamed from: c */
    public final m08 f12506c;

    public hf6(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.f12504a = m08Var;
        this.f12505b = m08Var2;
        this.f12506c = m08Var3;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final cf6 zzb() {
        Context context = (Context) this.f12504a.zzb();
        bk6 bk6Var = (bk6) this.f12505b.zzb();
        vk6 vk6Var = (vk6) this.f12506c.zzb();
        kz3 zzh = ((Boolean) zzba.zzc().m23658b(g93.f10487M5)).booleanValue() ? zzt.zzo().m11915h().zzh() : zzt.zzo().m11915h().zzi();
        boolean z = false;
        if (zzh != null && zzh.m17289h()) {
            z = true;
        }
        if (((Integer) zzba.zzc().m23658b(g93.f10507O5)).intValue() > 0) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10477L5)).booleanValue() || z) {
                uk6 m7076a = vk6Var.m7076a(jk6.Rewarded, context, bk6Var, new de6(new ae6()));
                pe6 pe6Var = new pe6(new oe6());
                fk6 fk6Var = m7076a.f29149a;
                g77 g77Var = z04.f34305a;
                return new fe6(pe6Var, new le6(fk6Var, g77Var), m7076a.f29150b, m7076a.f29149a.zza().f37007w, g77Var);
            }
        }
        return new oe6();
    }
}
