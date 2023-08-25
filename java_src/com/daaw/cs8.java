package com.daaw;
/* loaded from: classes.dex */
public final class cs8 implements mt8 {

    /* renamed from: a */
    public final mt8 f6170a;

    /* renamed from: b */
    public final long f6171b;

    public cs8(mt8 mt8Var, long j) {
        this.f6170a = mt8Var;
        this.f6171b = j;
    }

    @Override // com.daaw.mt8
    /* renamed from: a */
    public final int mo6812a(long j) {
        return this.f6170a.mo6812a(j - this.f6171b);
    }

    @Override // com.daaw.mt8
    /* renamed from: b */
    public final int mo6811b(a78 a78Var, ma7 ma7Var, int i) {
        int mo6811b = this.f6170a.mo6811b(a78Var, ma7Var, i);
        if (mo6811b == -4) {
            ma7Var.f18730e = Math.max(0L, ma7Var.f18730e + this.f6171b);
            return -4;
        }
        return mo6811b;
    }

    /* renamed from: c */
    public final mt8 m24985c() {
        return this.f6170a;
    }

    @Override // com.daaw.mt8
    public final void zzd() {
        this.f6170a.zzd();
    }

    @Override // com.daaw.mt8
    public final boolean zze() {
        return this.f6170a.zze();
    }
}
