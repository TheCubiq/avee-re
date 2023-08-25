package com.daaw;
/* loaded from: classes.dex */
public final class y82 implements x82 {

    /* renamed from: a */
    public final long[] f33419a;

    /* renamed from: b */
    public final long[] f33420b;

    /* renamed from: c */
    public final long f33421c;

    /* renamed from: d */
    public final long f33422d;

    public y82(long[] jArr, long[] jArr2, long j, long j2) {
        this.f33419a = jArr;
        this.f33420b = jArr2;
        this.f33421c = j;
        this.f33422d = j2;
    }

    /* renamed from: a */
    public static y82 m4016a(long j, long j2, y32 y32Var, ik5 ik5Var) {
        int m19703s;
        ik5Var.m19715g(10);
        int m19709m = ik5Var.m19709m();
        if (m19709m <= 0) {
            return null;
        }
        int i = y32Var.f33314d;
        long m19392g0 = it5.m19392g0(m19709m, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int m19699w = ik5Var.m19699w();
        int m19699w2 = ik5Var.m19699w();
        int m19699w3 = ik5Var.m19699w();
        ik5Var.m19715g(2);
        long j3 = j2 + y32Var.f33313c;
        long[] jArr = new long[m19699w];
        long[] jArr2 = new long[m19699w];
        int i2 = 0;
        long j4 = j2;
        while (i2 < m19699w) {
            int i3 = m19699w2;
            long j5 = j3;
            jArr[i2] = (i2 * m19392g0) / m19699w;
            jArr2[i2] = Math.max(j4, j5);
            if (m19699w3 == 1) {
                m19703s = ik5Var.m19703s();
            } else if (m19699w3 == 2) {
                m19703s = ik5Var.m19699w();
            } else if (m19699w3 == 3) {
                m19703s = ik5Var.m19701u();
            } else if (m19699w3 != 4) {
                return null;
            } else {
                m19703s = ik5Var.m19700v();
            }
            j4 += m19703s * i3;
            i2++;
            jArr = jArr;
            m19699w2 = i3;
            j3 = j5;
        }
        long[] jArr3 = jArr;
        if (j != -1 && j != j4) {
            s95.m10493e("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new y82(jArr3, jArr2, m19392g0, j4);
    }

    @Override // com.daaw.i42
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        int m19418N = it5.m19418N(this.f33419a, j, true, true);
        j42 j42Var = new j42(this.f33419a[m19418N], this.f33420b[m19418N]);
        if (j42Var.f14256a < j) {
            long[] jArr = this.f33419a;
            if (m19418N != jArr.length - 1) {
                int i = m19418N + 1;
                return new g42(j42Var, new j42(jArr[i], this.f33420b[i]));
            }
        }
        return new g42(j42Var, j42Var);
    }

    @Override // com.daaw.x82
    /* renamed from: e */
    public final long mo2629e(long j) {
        return this.f33419a[it5.m19418N(this.f33420b, j, true, true)];
    }

    @Override // com.daaw.x82
    public final long zzb() {
        return this.f33422d;
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f33421c;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
