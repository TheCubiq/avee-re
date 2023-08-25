package com.daaw;

import com.daaw.da1;
import com.daaw.tq0;
/* loaded from: classes.dex */
public final class as1 implements tq0.b {
    public final long[] a;
    public final long[] b;
    public final long c;

    public as1(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
    }

    public static as1 a(long j, long j2, yq0 yq0Var, rv0 rv0Var) {
        int x;
        rv0Var.K(10);
        int i = rv0Var.i();
        if (i <= 0) {
            return null;
        }
        int i2 = yq0Var.d;
        long T = sq1.T(i, 1000000 * (i2 >= 32000 ? 1152 : 576), i2);
        int D = rv0Var.D();
        int D2 = rv0Var.D();
        int D3 = rv0Var.D();
        rv0Var.K(2);
        long j3 = j2 + yq0Var.c;
        long[] jArr = new long[D];
        long[] jArr2 = new long[D];
        long j4 = j2;
        int i3 = 0;
        while (i3 < D) {
            long j5 = j3;
            long j6 = T;
            jArr[i3] = (i3 * T) / D;
            jArr2[i3] = Math.max(j4, j5);
            if (D3 == 1) {
                x = rv0Var.x();
            } else if (D3 == 2) {
                x = rv0Var.D();
            } else if (D3 == 3) {
                x = rv0Var.A();
            } else if (D3 != 4) {
                return null;
            } else {
                x = rv0Var.B();
            }
            j4 += x * D2;
            i3++;
            j3 = j5;
            T = j6;
        }
        long j7 = T;
        if (j != -1 && j != j4) {
            StringBuilder sb = new StringBuilder();
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(j4);
        }
        return new as1(jArr, jArr2, j7);
    }

    @Override // com.daaw.tq0.b
    public long b(long j) {
        return this.a[sq1.e(this.b, j, true, true)];
    }

    @Override // com.daaw.da1
    public boolean e() {
        return true;
    }

    @Override // com.daaw.da1
    public da1.a g(long j) {
        int e = sq1.e(this.a, j, true, true);
        fa1 fa1Var = new fa1(this.a[e], this.b[e]);
        if (fa1Var.a >= j || e == this.a.length - 1) {
            return new da1.a(fa1Var);
        }
        int i = e + 1;
        return new da1.a(fa1Var, new fa1(this.a[i], this.b[i]));
    }

    @Override // com.daaw.da1
    public long h() {
        return this.c;
    }
}
