package com.daaw;

import com.daaw.da1;
import com.daaw.tq0;
/* loaded from: classes.dex */
public final class fz1 implements tq0.InterfaceC3111b {

    /* renamed from: a */
    public final long f10106a;

    /* renamed from: b */
    public final int f10107b;

    /* renamed from: c */
    public final long f10108c;

    /* renamed from: d */
    public final long f10109d;

    /* renamed from: e */
    public final long[] f10110e;

    public fz1(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public fz1(long j, int i, long j2, long j3, long[] jArr) {
        this.f10106a = j;
        this.f10107b = i;
        this.f10108c = j2;
        this.f10109d = j3;
        this.f10110e = jArr;
    }

    /* renamed from: a */
    public static fz1 m22130a(long j, long j2, yq0 yq0Var, rv0 rv0Var) {
        int m10929B;
        int i = yq0Var.f33951g;
        int i2 = yq0Var.f33948d;
        int m10911i = rv0Var.m10911i();
        if ((m10911i & 1) != 1 || (m10929B = rv0Var.m10929B()) == 0) {
            return null;
        }
        long m10025T = sq1.m10025T(m10929B, i * 1000000, i2);
        if ((m10911i & 6) != 6) {
            return new fz1(j2, yq0Var.f33947c, m10025T);
        }
        long m10929B2 = rv0Var.m10929B();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = rv0Var.m10896x();
        }
        if (j != -1) {
            long j3 = j2 + m10929B2;
            if (j != j3) {
                StringBuilder sb = new StringBuilder();
                sb.append("XING data size mismatch: ");
                sb.append(j);
                sb.append(", ");
                sb.append(j3);
            }
        }
        return new fz1(j2, yq0Var.f33947c, m10025T, m10929B2, jArr);
    }

    @Override // com.daaw.tq0.InterfaceC3111b
    /* renamed from: b */
    public long mo8871b(long j) {
        double d;
        long j2 = j - this.f10106a;
        if (!mo6932e() || j2 <= this.f10107b) {
            return 0L;
        }
        double d2 = j2;
        Double.isNaN(d2);
        double d3 = this.f10109d;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int m10011e = sq1.m10011e(this.f10110e, (long) d4, true, true);
        long m22129c = m22129c(m10011e);
        long j3 = this.f10110e[m10011e];
        int i = m10011e + 1;
        long m22129c2 = m22129c(i);
        long j4 = m10011e == 99 ? 256L : this.f10110e[i];
        if (j3 == j4) {
            d = 0.0d;
        } else {
            double d5 = j3;
            Double.isNaN(d5);
            double d6 = j4 - j3;
            Double.isNaN(d6);
            d = (d4 - d5) / d6;
        }
        double d7 = m22129c2 - m22129c;
        Double.isNaN(d7);
        return m22129c + Math.round(d * d7);
    }

    /* renamed from: c */
    public final long m22129c(int i) {
        return (this.f10108c * i) / 100;
    }

    @Override // com.daaw.da1
    /* renamed from: e */
    public boolean mo6932e() {
        return this.f10110e != null;
    }

    @Override // com.daaw.da1
    /* renamed from: g */
    public da1.C1068a mo6931g(long j) {
        long[] jArr;
        if (mo6932e()) {
            long m10003m = sq1.m10003m(j, 0L, this.f10108c);
            double d = m10003m;
            Double.isNaN(d);
            double d2 = this.f10108c;
            Double.isNaN(d2);
            double d3 = (d * 100.0d) / d2;
            double d4 = 0.0d;
            if (d3 > 0.0d) {
                if (d3 >= 100.0d) {
                    d4 = 256.0d;
                } else {
                    int i = (int) d3;
                    double d5 = this.f10110e[i];
                    double d6 = i == 99 ? 256.0d : jArr[i + 1];
                    double d7 = i;
                    Double.isNaN(d7);
                    Double.isNaN(d5);
                    Double.isNaN(d5);
                    d4 = d5 + ((d3 - d7) * (d6 - d5));
                }
            }
            double d8 = this.f10109d;
            Double.isNaN(d8);
            return new da1.C1068a(new fa1(m10003m, this.f10106a + sq1.m10003m(Math.round((d4 / 256.0d) * d8), this.f10107b, this.f10109d - 1)));
        }
        return new da1.C1068a(new fa1(0L, this.f10106a + this.f10107b));
    }

    @Override // com.daaw.da1
    /* renamed from: h */
    public long mo6930h() {
        return this.f10108c;
    }
}
