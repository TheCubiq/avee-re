package com.daaw;
/* loaded from: classes.dex */
public final class vs8 implements mt8 {
    public final int a;
    public final /* synthetic */ ys8 b;

    public vs8(ys8 ys8Var, int i) {
        this.b = ys8Var;
        this.a = i;
    }

    @Override // com.daaw.mt8
    public final int a(long j) {
        return this.b.I(this.a, j);
    }

    @Override // com.daaw.mt8
    public final int b(a78 a78Var, ma7 ma7Var, int i) {
        return this.b.H(this.a, a78Var, ma7Var, i);
    }

    @Override // com.daaw.mt8
    public final void zzd() {
        this.b.u(this.a);
    }

    @Override // com.daaw.mt8
    public final boolean zze() {
        return this.b.w(this.a);
    }
}
