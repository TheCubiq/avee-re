package com.daaw;
/* loaded from: classes.dex */
public class qz8 implements i42 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;

    public qz8(long j, long j2, int i, int i2, boolean z) {
        long c;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            c = -9223372036854775807L;
        } else {
            this.d = j - j2;
            c = c(j, j2, i);
        }
        this.f = c;
    }

    public static long c(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    public final long a(long j) {
        return c(j, this.b, this.e);
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        long j2 = this.d;
        if (j2 == -1) {
            j42 j42Var = new j42(0L, this.b);
            return new g42(j42Var, j42Var);
        }
        int i = this.e;
        long j3 = this.c;
        long j4 = (((i * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            j4 = Math.min(j4, j2 - j3);
        }
        long max = this.b + Math.max(j4, 0L);
        long a = a(max);
        j42 j42Var2 = new j42(a, max);
        if (this.d != -1 && a < j) {
            long j5 = max + this.c;
            if (j5 < this.a) {
                return new g42(j42Var2, new j42(a(j5), j5));
            }
        }
        return new g42(j42Var2, j42Var2);
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return this.d != -1;
    }
}
