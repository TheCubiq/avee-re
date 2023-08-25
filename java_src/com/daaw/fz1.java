package com.daaw;

import com.daaw.da1;
import com.daaw.tq0;
/* loaded from: classes.dex */
public final class fz1 implements tq0.b {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long[] e;

    public fz1(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public fz1(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }

    public static fz1 a(long j, long j2, yq0 yq0Var, rv0 rv0Var) {
        int B;
        int i = yq0Var.g;
        int i2 = yq0Var.d;
        int i3 = rv0Var.i();
        if ((i3 & 1) != 1 || (B = rv0Var.B()) == 0) {
            return null;
        }
        long T = sq1.T(B, i * 1000000, i2);
        if ((i3 & 6) != 6) {
            return new fz1(j2, yq0Var.c, T);
        }
        long B2 = rv0Var.B();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = rv0Var.x();
        }
        if (j != -1) {
            long j3 = j2 + B2;
            if (j != j3) {
                StringBuilder sb = new StringBuilder();
                sb.append("XING data size mismatch: ");
                sb.append(j);
                sb.append(", ");
                sb.append(j3);
            }
        }
        return new fz1(j2, yq0Var.c, T, B2, jArr);
    }

    @Override // com.daaw.tq0.b
    public long b(long j) {
        double d;
        long j2 = j - this.a;
        if (!e() || j2 <= this.b) {
            return 0L;
        }
        double d2 = j2;
        Double.isNaN(d2);
        double d3 = this.d;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int e = sq1.e(this.e, (long) d4, true, true);
        long c = c(e);
        long j3 = this.e[e];
        int i = e + 1;
        long c2 = c(i);
        long j4 = e == 99 ? 256L : this.e[i];
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

    public final long c(int i) {
        return (this.c * i) / 100;
    }

    @Override // com.daaw.da1
    public boolean e() {
        return this.e != null;
    }

    @Override // com.daaw.da1
    public da1.a g(long j) {
        long[] jArr;
        if (e()) {
            long m = sq1.m(j, 0L, this.c);
            double d = m;
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
                    double d5 = this.e[i];
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
            return new da1.a(new fa1(m, this.a + sq1.m(Math.round((d4 / 256.0d) * d8), this.b, this.d - 1)));
        }
        return new da1.a(new fa1(0L, this.a + this.b));
    }

    @Override // com.daaw.da1
    public long h() {
        return this.c;
    }
}
