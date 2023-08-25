package com.daaw;
/* loaded from: classes.dex */
public final class rv2 implements iw2 {
    public final int a;
    public final /* synthetic */ sv2 b;

    public rv2(sv2 sv2Var, int i) {
        this.b = sv2Var;
        this.a = i;
    }

    @Override // com.daaw.iw2
    public final void a(long j) {
        this.b.B(this.a, j);
    }

    @Override // com.daaw.iw2
    public final int b(cq2 cq2Var, bs2 bs2Var, boolean z) {
        return this.b.r(this.a, cq2Var, bs2Var, z);
    }

    @Override // com.daaw.iw2
    public final void zzc() {
        this.b.z();
    }

    @Override // com.daaw.iw2
    public final boolean zze() {
        return this.b.l(this.a);
    }
}
