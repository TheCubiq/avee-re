package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class ol4 implements fs4, q03 {
    public final th6 p;
    public final gr4 q;
    public final os4 r;
    public final AtomicBoolean s = new AtomicBoolean();
    public final AtomicBoolean t = new AtomicBoolean();

    public ol4(th6 th6Var, gr4 gr4Var, os4 os4Var) {
        this.p = th6Var;
        this.q = gr4Var;
        this.r = os4Var;
    }

    public final void b() {
        if (this.s.compareAndSet(false, true)) {
            this.q.zza();
        }
    }

    @Override // com.daaw.q03
    public final void e0(p03 p03Var) {
        if (this.p.f == 1 && p03Var.j) {
            b();
        }
        if (p03Var.j && this.t.compareAndSet(false, true)) {
            this.r.zza();
        }
    }

    @Override // com.daaw.fs4
    public final synchronized void zzn() {
        if (this.p.f != 1) {
            b();
        }
    }
}
