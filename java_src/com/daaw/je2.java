package com.daaw;
/* loaded from: classes.dex */
public final class je2 implements i42 {
    public final ce2 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public je2(ce2 ce2Var, int i, long j, long j2) {
        this.a = ce2Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ce2Var.d;
        this.d = j3;
        this.e = a(j3);
    }

    public final long a(long j) {
        return it5.g0(j * this.b, 1000000L, this.a.c);
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        long b0 = it5.b0((this.a.c * j) / (this.b * 1000000), 0L, this.d - 1);
        long j2 = this.c;
        int i = this.a.d;
        long a = a(b0);
        j42 j42Var = new j42(a, j2 + (i * b0));
        if (a >= j || b0 == this.d - 1) {
            return new g42(j42Var, j42Var);
        }
        long j3 = b0 + 1;
        return new g42(j42Var, new j42(a(j3), this.c + (j3 * this.a.d)));
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.e;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
