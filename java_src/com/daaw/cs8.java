package com.daaw;
/* loaded from: classes.dex */
public final class cs8 implements mt8 {
    public final mt8 a;
    public final long b;

    public cs8(mt8 mt8Var, long j) {
        this.a = mt8Var;
        this.b = j;
    }

    @Override // com.daaw.mt8
    public final int a(long j) {
        return this.a.a(j - this.b);
    }

    @Override // com.daaw.mt8
    public final int b(a78 a78Var, ma7 ma7Var, int i) {
        int b = this.a.b(a78Var, ma7Var, i);
        if (b == -4) {
            ma7Var.e = Math.max(0L, ma7Var.e + this.b);
            return -4;
        }
        return b;
    }

    public final mt8 c() {
        return this.a;
    }

    @Override // com.daaw.mt8
    public final void zzd() {
        this.a.zzd();
    }

    @Override // com.daaw.mt8
    public final boolean zze() {
        return this.a.zze();
    }
}
