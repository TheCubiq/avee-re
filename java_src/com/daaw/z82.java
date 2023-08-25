package com.daaw;
/* loaded from: classes.dex */
public final class z82 implements x82 {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public z82(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    public static z82 a(long j, long j2, y32 y32Var, ik5 ik5Var) {
        int v;
        int i = y32Var.g;
        int i2 = y32Var.d;
        int m = ik5Var.m();
        if ((m & 1) != 1 || (v = ik5Var.v()) == 0) {
            return null;
        }
        long g0 = it5.g0(v, i * 1000000, i2);
        if ((m & 6) != 6) {
            return new z82(j2, y32Var.c, g0, -1L, null);
        }
        long A = ik5Var.A();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = ik5Var.s();
        }
        if (j != -1) {
            long j3 = j2 + A;
            if (j != j3) {
                s95.e("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new z82(j2, y32Var.c, g0, A, jArr);
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        long[] jArr;
        if (!zzh()) {
            j42 j42Var = new j42(0L, this.a + this.b);
            return new g42(j42Var, j42Var);
        }
        long b0 = it5.b0(j, 0L, this.c);
        double d = b0;
        Double.isNaN(d);
        double d2 = this.c;
        Double.isNaN(d2);
        double d3 = (d * 100.0d) / d2;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d4 = 256.0d;
            } else {
                int i = (int) d3;
                double d5 = ((long[]) uo4.b(this.f))[i];
                double d6 = i == 99 ? 256.0d : jArr[i + 1];
                double d7 = i;
                Double.isNaN(d7);
                Double.isNaN(d5);
                Double.isNaN(d5);
                d4 = d5 + ((d3 - d7) * (d6 - d5));
            }
        }
        double d8 = this.d;
        Double.isNaN(d8);
        j42 j42Var2 = new j42(b0, this.a + it5.b0(Math.round((d4 / 256.0d) * d8), this.b, this.d - 1));
        return new g42(j42Var2, j42Var2);
    }

    public final long c(int i) {
        return (this.c * i) / 100;
    }

    @Override // com.daaw.x82
    public final long e(long j) {
        double d;
        long j2 = j - this.a;
        if (!zzh() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = (long[]) uo4.b(this.f);
        double d2 = j2;
        Double.isNaN(d2);
        double d3 = this.d;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int N = it5.N(jArr, (long) d4, true, true);
        long c = c(N);
        long j3 = jArr[N];
        int i = N + 1;
        long c2 = c(i);
        long j4 = N == 99 ? 256L : jArr[i];
        if (j3 == j4) {
            d = 0.0d;
        } else {
            double d5 = j3;
            Double.isNaN(d5);
            double d6 = j4 - j3;
            Double.isNaN(d6);
            d = (d4 - d5) / d6;
        }
        double d7 = c2 - c;
        Double.isNaN(d7);
        return c + Math.round(d * d7);
    }

    @Override // com.daaw.x82
    public final long zzb() {
        return this.e;
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.c;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return this.f != null;
    }
}
