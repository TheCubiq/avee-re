package com.daaw;

import com.daaw.da1;
import com.daaw.tq0;
/* loaded from: classes.dex */
public final class as1 implements tq0.InterfaceC3111b {

    /* renamed from: a */
    public final long[] f3515a;

    /* renamed from: b */
    public final long[] f3516b;

    /* renamed from: c */
    public final long f3517c;

    public as1(long[] jArr, long[] jArr2, long j) {
        this.f3515a = jArr;
        this.f3516b = jArr2;
        this.f3517c = j;
    }

    /* renamed from: a */
    public static as1 m27101a(long j, long j2, yq0 yq0Var, rv0 rv0Var) {
        int m10896x;
        rv0Var.m10920K(10);
        int m10911i = rv0Var.m10911i();
        if (m10911i <= 0) {
            return null;
        }
        int i = yq0Var.f33948d;
        long m10025T = sq1.m10025T(m10911i, 1000000 * (i >= 32000 ? 1152 : 576), i);
        int m10927D = rv0Var.m10927D();
        int m10927D2 = rv0Var.m10927D();
        int m10927D3 = rv0Var.m10927D();
        rv0Var.m10920K(2);
        long j3 = j2 + yq0Var.f33947c;
        long[] jArr = new long[m10927D];
        long[] jArr2 = new long[m10927D];
        long j4 = j2;
        int i2 = 0;
        while (i2 < m10927D) {
            long j5 = j3;
            long j6 = m10025T;
            jArr[i2] = (i2 * m10025T) / m10927D;
            jArr2[i2] = Math.max(j4, j5);
            if (m10927D3 == 1) {
                m10896x = rv0Var.m10896x();
            } else if (m10927D3 == 2) {
                m10896x = rv0Var.m10927D();
            } else if (m10927D3 == 3) {
                m10896x = rv0Var.m10930A();
            } else if (m10927D3 != 4) {
                return null;
            } else {
                m10896x = rv0Var.m10929B();
            }
            j4 += m10896x * m10927D2;
            i2++;
            j3 = j5;
            m10025T = j6;
        }
        long j7 = m10025T;
        if (j != -1 && j != j4) {
            StringBuilder sb = new StringBuilder();
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(j4);
        }
        return new as1(jArr, jArr2, j7);
    }

    @Override // com.daaw.tq0.InterfaceC3111b
    /* renamed from: b */
    public long mo8871b(long j) {
        return this.f3515a[sq1.m10011e(this.f3516b, j, true, true)];
    }

    @Override // com.daaw.da1
    /* renamed from: e */
    public boolean mo6932e() {
        return true;
    }

    @Override // com.daaw.da1
    /* renamed from: g */
    public da1.C1068a mo6931g(long j) {
        int m10011e = sq1.m10011e(this.f3515a, j, true, true);
        fa1 fa1Var = new fa1(this.f3515a[m10011e], this.f3516b[m10011e]);
        if (fa1Var.f9302a >= j || m10011e == this.f3515a.length - 1) {
            return new da1.C1068a(fa1Var);
        }
        int i = m10011e + 1;
        return new da1.C1068a(fa1Var, new fa1(this.f3515a[i], this.f3516b[i]));
    }

    @Override // com.daaw.da1
    /* renamed from: h */
    public long mo6930h() {
        return this.f3517c;
    }
}
