package com.daaw;
/* loaded from: classes.dex */
public final class u09 implements i42 {

    /* renamed from: a */
    public final w09 f28312a;

    /* renamed from: b */
    public final long f28313b;

    public u09(w09 w09Var, long j) {
        this.f28312a = w09Var;
        this.f28313b = j;
    }

    /* renamed from: a */
    public final j42 m8643a(long j, long j2) {
        return new j42((j * 1000000) / this.f28312a.f30776e, this.f28313b + j2);
    }

    @Override // com.daaw.i42
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        uo4.m7876b(this.f28312a.f30782k);
        w09 w09Var = this.f28312a;
        v09 v09Var = w09Var.f30782k;
        long[] jArr = v09Var.f29708a;
        long[] jArr2 = v09Var.f29709b;
        int m19418N = it5.m19418N(jArr, w09Var.m6600b(j), true, false);
        j42 m8643a = m8643a(m19418N == -1 ? 0L : jArr[m19418N], m19418N != -1 ? jArr2[m19418N] : 0L);
        if (m8643a.f14256a == j || m19418N == jArr.length - 1) {
            return new g42(m8643a, m8643a);
        }
        int i = m19418N + 1;
        return new g42(m8643a, m8643a(jArr[i], jArr2[i]));
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f28312a.m6601a();
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
