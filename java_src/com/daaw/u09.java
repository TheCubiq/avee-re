package com.daaw;
/* loaded from: classes.dex */
public final class u09 implements i42 {
    public final w09 a;
    public final long b;

    public u09(w09 w09Var, long j) {
        this.a = w09Var;
        this.b = j;
    }

    public final j42 a(long j, long j2) {
        return new j42((j * 1000000) / this.a.e, this.b + j2);
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        uo4.b(this.a.k);
        w09 w09Var = this.a;
        v09 v09Var = w09Var.k;
        long[] jArr = v09Var.a;
        long[] jArr2 = v09Var.b;
        int N = it5.N(jArr, w09Var.b(j), true, false);
        j42 a = a(N == -1 ? 0L : jArr[N], N != -1 ? jArr2[N] : 0L);
        if (a.a == j || N == jArr.length - 1) {
            return new g42(a, a);
        }
        int i = N + 1;
        return new g42(a, a(jArr[i], jArr2[i]));
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.a.a();
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
