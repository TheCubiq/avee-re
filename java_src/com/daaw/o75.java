package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class o75 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public o75(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new j75((Executor) this.a.zzb(), (nh4) this.b.zzb(), (ny4) this.c.zzb());
    }
}
