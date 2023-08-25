package com.daaw;
/* loaded from: classes.dex */
public final class o82 {

    /* renamed from: a */
    public final ik5 f21162a = new ik5(8);

    /* renamed from: b */
    public int f21163b;

    /* renamed from: a */
    public final boolean m14450a(k09 k09Var) {
        long zzd = k09Var.zzd();
        long j = 1024;
        if (zzd != -1 && zzd <= 1024) {
            j = zzd;
        }
        int i = (int) j;
        rz8 rz8Var = (rz8) k09Var;
        rz8Var.mo5661h(this.f21162a.m19714h(), 0, 4, false);
        long m19729A = this.f21162a.m19729A();
        this.f21163b = 4;
        while (m19729A != 440786851) {
            int i2 = this.f21163b + 1;
            this.f21163b = i2;
            if (i2 == i) {
                return false;
            }
            rz8Var.mo5661h(this.f21162a.m19714h(), 0, 1, false);
            m19729A = ((m19729A << 8) & (-256)) | (this.f21162a.m19714h()[0] & 255);
        }
        long m14449b = m14449b(k09Var);
        long j2 = this.f21163b;
        if (m14449b != Long.MIN_VALUE && (zzd == -1 || j2 + m14449b < zzd)) {
            while (true) {
                long j3 = this.f21163b;
                long j4 = j2 + m14449b;
                if (j3 < j4) {
                    if (m14449b(k09Var) == Long.MIN_VALUE) {
                        return false;
                    }
                    long m14449b2 = m14449b(k09Var);
                    if (m14449b2 < 0) {
                        return false;
                    }
                    if (m14449b2 != 0) {
                        int i3 = (int) m14449b2;
                        rz8Var.m10812k(i3, false);
                        this.f21163b += i3;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final long m14449b(k09 k09Var) {
        rz8 rz8Var = (rz8) k09Var;
        int i = 0;
        rz8Var.mo5661h(this.f21162a.m19714h(), 0, 1, false);
        int i2 = this.f21162a.m19714h()[0] & 255;
        if (i2 != 0) {
            int i3 = 128;
            int i4 = 0;
            while ((i2 & i3) == 0) {
                i3 >>= 1;
                i4++;
            }
            int i5 = i2 & (i3 ^ (-1));
            rz8Var.mo5661h(this.f21162a.m19714h(), 1, i4, false);
            while (i < i4) {
                i++;
                i5 = (this.f21162a.m19714h()[i] & 255) + (i5 << 8);
            }
            this.f21163b += i4 + 1;
            return i5;
        }
        return Long.MIN_VALUE;
    }
}
