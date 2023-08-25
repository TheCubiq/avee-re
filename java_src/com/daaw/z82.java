package com.daaw;
/* loaded from: classes.dex */
public final class z82 implements x82 {

    /* renamed from: a */
    public final long f34588a;

    /* renamed from: b */
    public final int f34589b;

    /* renamed from: c */
    public final long f34590c;

    /* renamed from: d */
    public final long f34591d;

    /* renamed from: e */
    public final long f34592e;

    /* renamed from: f */
    public final long[] f34593f;

    public z82(long j, int i, long j2, long j3, long[] jArr) {
        this.f34588a = j;
        this.f34589b = i;
        this.f34590c = j2;
        this.f34593f = jArr;
        this.f34591d = j3;
        this.f34592e = j3 != -1 ? j + j3 : -1L;
    }

    /* renamed from: a */
    public static z82 m2632a(long j, long j2, y32 y32Var, ik5 ik5Var) {
        int m19700v;
        int i = y32Var.f33317g;
        int i2 = y32Var.f33314d;
        int m19709m = ik5Var.m19709m();
        if ((m19709m & 1) != 1 || (m19700v = ik5Var.m19700v()) == 0) {
            return null;
        }
        long m19392g0 = it5.m19392g0(m19700v, i * 1000000, i2);
        if ((m19709m & 6) != 6) {
            return new z82(j2, y32Var.f33313c, m19392g0, -1L, null);
        }
        long m19729A = ik5Var.m19729A();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = ik5Var.m19703s();
        }
        if (j != -1) {
            long j3 = j2 + m19729A;
            if (j != j3) {
                s95.m10493e("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new z82(j2, y32Var.f33313c, m19392g0, m19729A, jArr);
    }

    @Override // com.daaw.i42
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        long[] jArr;
        if (!zzh()) {
            j42 j42Var = new j42(0L, this.f34588a + this.f34589b);
            return new g42(j42Var, j42Var);
        }
        long m19402b0 = it5.m19402b0(j, 0L, this.f34590c);
        double d = m19402b0;
        Double.isNaN(d);
        double d2 = this.f34590c;
        Double.isNaN(d2);
        double d3 = (d * 100.0d) / d2;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d4 = 256.0d;
            } else {
                int i = (int) d3;
                double d5 = ((long[]) uo4.m7876b(this.f34593f))[i];
                double d6 = i == 99 ? 256.0d : jArr[i + 1];
                double d7 = i;
                Double.isNaN(d7);
                Double.isNaN(d5);
                Double.isNaN(d5);
                d4 = d5 + ((d3 - d7) * (d6 - d5));
            }
        }
        double d8 = this.f34591d;
        Double.isNaN(d8);
        j42 j42Var2 = new j42(m19402b0, this.f34588a + it5.m19402b0(Math.round((d4 / 256.0d) * d8), this.f34589b, this.f34591d - 1));
        return new g42(j42Var2, j42Var2);
    }

    /* renamed from: c */
    public final long m2630c(int i) {
        return (this.f34590c * i) / 100;
    }

    @Override // com.daaw.x82
    /* renamed from: e */
    public final long mo2629e(long j) {
        double d;
        long j2 = j - this.f34588a;
        if (!zzh() || j2 <= this.f34589b) {
            return 0L;
        }
        long[] jArr = (long[]) uo4.m7876b(this.f34593f);
        double d2 = j2;
        Double.isNaN(d2);
        double d3 = this.f34591d;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int m19418N = it5.m19418N(jArr, (long) d4, true, true);
        long m2630c = m2630c(m19418N);
        long j3 = jArr[m19418N];
        int i = m19418N + 1;
        long m2630c2 = m2630c(i);
        long j4 = m19418N == 99 ? 256L : jArr[i];
        if (j3 == j4) {
            d = 0.0d;
        } else {
            double d5 = j3;
            Double.isNaN(d5);
            double d6 = j4 - j3;
            Double.isNaN(d6);
            d = (d4 - d5) / d6;
        }
        double d7 = m2630c2 - m2630c;
        Double.isNaN(d7);
        return m2630c + Math.round(d * d7);
    }

    @Override // com.daaw.x82
    public final long zzb() {
        return this.f34592e;
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f34590c;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return this.f34593f != null;
    }
}
