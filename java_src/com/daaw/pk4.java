package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class pk4 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;

    public pk4(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new kk4(((eo4) this.a).zzb(), ((ok4) this.b).a(), ((nk4) this.c).a(), (Executor) this.d.zzb());
    }
}
