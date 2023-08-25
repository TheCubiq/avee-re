package com.daaw;
/* loaded from: classes.dex */
public final class je2 implements i42 {

    /* renamed from: a */
    public final ce2 f15049a;

    /* renamed from: b */
    public final int f15050b;

    /* renamed from: c */
    public final long f15051c;

    /* renamed from: d */
    public final long f15052d;

    /* renamed from: e */
    public final long f15053e;

    public je2(ce2 ce2Var, int i, long j, long j2) {
        this.f15049a = ce2Var;
        this.f15050b = i;
        this.f15051c = j;
        long j3 = (j2 - j) / ce2Var.f5756d;
        this.f15052d = j3;
        this.f15053e = m18544a(j3);
    }

    /* renamed from: a */
    public final long m18544a(long j) {
        return it5.m19392g0(j * this.f15050b, 1000000L, this.f15049a.f5755c);
    }

    @Override // com.daaw.i42
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        long m19402b0 = it5.m19402b0((this.f15049a.f5755c * j) / (this.f15050b * 1000000), 0L, this.f15052d - 1);
        long j2 = this.f15051c;
        int i = this.f15049a.f5756d;
        long m18544a = m18544a(m19402b0);
        j42 j42Var = new j42(m18544a, j2 + (i * m19402b0));
        if (m18544a >= j || m19402b0 == this.f15052d - 1) {
            return new g42(j42Var, j42Var);
        }
        long j3 = m19402b0 + 1;
        return new g42(j42Var, new j42(m18544a(j3), this.f15051c + (j3 * this.f15049a.f5756d)));
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f15053e;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
