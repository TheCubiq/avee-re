package com.daaw;
/* loaded from: classes.dex */
public final class y82 implements x82 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public y82(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public static y82 a(long j, long j2, y32 y32Var, ik5 ik5Var) {
        int s;
        ik5Var.g(10);
        int m = ik5Var.m();
        if (m <= 0) {
            return null;
        }
        int i = y32Var.d;
        long g0 = it5.g0(m, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int w = ik5Var.w();
        int w2 = ik5Var.w();
        int w3 = ik5Var.w();
        ik5Var.g(2);
        long j3 = j2 + y32Var.c;
        long[] jArr = new long[w];
        long[] jArr2 = new long[w];
        int i2 = 0;
        long j4 = j2;
        while (i2 < w) {
            int i3 = w2;
            long j5 = j3;
            jArr[i2] = (i2 * g0) / w;
            jArr2[i2] = Math.max(j4, j5);
            if (w3 == 1) {
                s = ik5Var.s();
            } else if (w3 == 2) {
                s = ik5Var.w();
            } else if (w3 == 3) {
                s = ik5Var.u();
            } else if (w3 != 4) {
                return null;
            } else {
                s = ik5Var.v();
            }
            j4 += s * i3;
            i2++;
            jArr = jArr;
            w2 = i3;
            j3 = j5;
        }
        long[] jArr3 = jArr;
        if (j != -1 && j != j4) {
            s95.e("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new y82(jArr3, jArr2, g0, j4);
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        int N = it5.N(this.a, j, true, true);
        j42 j42Var = new j42(this.a[N], this.b[N]);
        if (j42Var.a < j) {
            long[] jArr = this.a;
            if (N != jArr.length - 1) {
                int i = N + 1;
                return new g42(j42Var, new j42(jArr[i], this.b[i]));
            }
        }
        return new g42(j42Var, j42Var);
    }

    @Override // com.daaw.x82
    public final long e(long j) {
        return this.a[it5.N(this.b, j, true, true)];
    }

    @Override // com.daaw.x82
    public final long zzb() {
        return this.d;
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.c;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
