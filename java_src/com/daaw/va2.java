package com.daaw;
/* loaded from: classes.dex */
public final class va2 implements bb2 {
    public final w09 a;
    public final v09 b;
    public long c = -1;
    public long d = -1;

    public va2(w09 w09Var, v09 v09Var) {
        this.a = w09Var;
        this.b = v09Var;
    }

    @Override // com.daaw.bb2
    public final long a(k09 k09Var) {
        long j = this.d;
        if (j >= 0) {
            this.d = -1L;
            return -(j + 2);
        }
        return -1L;
    }

    @Override // com.daaw.bb2
    public final void b(long j) {
        long[] jArr = this.b.a;
        this.d = jArr[it5.N(jArr, j, true, true)];
    }

    public final void c(long j) {
        this.c = j;
    }

    @Override // com.daaw.bb2
    public final i42 zze() {
        uo4.f(this.c != -1);
        return new u09(this.a, this.c);
    }
}
