package com.daaw;
/* loaded from: classes.dex */
public final class va2 implements bb2 {

    /* renamed from: a */
    public final w09 f30073a;

    /* renamed from: b */
    public final v09 f30074b;

    /* renamed from: c */
    public long f30075c = -1;

    /* renamed from: d */
    public long f30076d = -1;

    public va2(w09 w09Var, v09 v09Var) {
        this.f30073a = w09Var;
        this.f30074b = v09Var;
    }

    @Override // com.daaw.bb2
    /* renamed from: a */
    public final long mo7303a(k09 k09Var) {
        long j = this.f30076d;
        if (j >= 0) {
            this.f30076d = -1L;
            return -(j + 2);
        }
        return -1L;
    }

    @Override // com.daaw.bb2
    /* renamed from: b */
    public final void mo7302b(long j) {
        long[] jArr = this.f30074b.f29708a;
        this.f30076d = jArr[it5.m19418N(jArr, j, true, true)];
    }

    /* renamed from: c */
    public final void m7301c(long j) {
        this.f30075c = j;
    }

    @Override // com.daaw.bb2
    public final i42 zze() {
        uo4.m7872f(this.f30075c != -1);
        return new u09(this.f30073a, this.f30075c);
    }
}
