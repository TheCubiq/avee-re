package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class u26 implements i76 {
    public final AtomicReference a = new AtomicReference();
    public final ag b;
    public final i76 c;
    public final long d;

    public u26(i76 i76Var, long j, ag agVar) {
        this.b = agVar;
        this.c = i76Var;
        this.d = j;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 16;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        t26 t26Var = (t26) this.a.get();
        if (t26Var == null || t26Var.a()) {
            t26Var = new t26(this.c.zzb(), this.d, this.b);
            this.a.set(t26Var);
        }
        return t26Var.a;
    }
}
