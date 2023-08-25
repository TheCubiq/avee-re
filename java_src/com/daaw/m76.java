package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class m76 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;

    public m76(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
        this.e = m08Var5;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final l76 zzb() {
        Context a = ((h94) this.a).a();
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new l76(a, g77Var, ((k08) this.c).zzb(), (to6) this.d.zzb(), (kd5) this.e.zzb());
    }
}
