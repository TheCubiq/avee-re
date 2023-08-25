package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class ol4 implements fs4, q03 {

    /* renamed from: p */
    public final th6 f21639p;

    /* renamed from: q */
    public final gr4 f21640q;

    /* renamed from: r */
    public final os4 f21641r;

    /* renamed from: s */
    public final AtomicBoolean f21642s = new AtomicBoolean();

    /* renamed from: t */
    public final AtomicBoolean f21643t = new AtomicBoolean();

    public ol4(th6 th6Var, gr4 gr4Var, os4 os4Var) {
        this.f21639p = th6Var;
        this.f21640q = gr4Var;
        this.f21641r = os4Var;
    }

    /* renamed from: b */
    public final void m14175b() {
        if (this.f21642s.compareAndSet(false, true)) {
            this.f21640q.zza();
        }
    }

    @Override // com.daaw.q03
    /* renamed from: e0 */
    public final void mo6420e0(p03 p03Var) {
        if (this.f21639p.f27690f == 1 && p03Var.f22185j) {
            m14175b();
        }
        if (p03Var.f22185j && this.f21643t.compareAndSet(false, true)) {
            this.f21641r.zza();
        }
    }

    @Override // com.daaw.fs4
    public final synchronized void zzn() {
        if (this.f21639p.f27690f != 1) {
            m14175b();
        }
    }
}
