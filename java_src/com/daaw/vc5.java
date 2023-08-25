package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class vc5 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public vc5(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        rc5 rc5Var = (rc5) this.a.zzb();
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return ((Boolean) zzba.zzc().b(g93.K7)).booleanValue() ? new ly4((co5) this.c.zzb(), g77Var) : new ly4(rc5Var, g77Var);
    }
}
