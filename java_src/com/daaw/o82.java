package com.daaw;
/* loaded from: classes.dex */
public final class o82 {
    public final ik5 a = new ik5(8);
    public int b;

    public final boolean a(k09 k09Var) {
        long zzd = k09Var.zzd();
        long j = 1024;
        if (zzd != -1 && zzd <= 1024) {
            j = zzd;
        }
        int i = (int) j;
        rz8 rz8Var = (rz8) k09Var;
        rz8Var.h(this.a.h(), 0, 4, false);
        long A = this.a.A();
        this.b = 4;
        while (A != 440786851) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == i) {
                return false;
            }
            rz8Var.h(this.a.h(), 0, 1, false);
            A = ((A << 8) & (-256)) | (this.a.h()[0] & 255);
        }
        long b = b(k09Var);
        long j2 = this.b;
        if (b != Long.MIN_VALUE && (zzd == -1 || j2 + b < zzd)) {
            while (true) {
                long j3 = this.b;
                long j4 = j2 + b;
                if (j3 < j4) {
                    if (b(k09Var) == Long.MIN_VALUE) {
                        return false;
                    }
                    long b2 = b(k09Var);
                    if (b2 < 0) {
                        return false;
                    }
                    if (b2 != 0) {
                        int i3 = (int) b2;
                        rz8Var.k(i3, false);
                        this.b += i3;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final long b(k09 k09Var) {
        rz8 rz8Var = (rz8) k09Var;
        int i = 0;
        rz8Var.h(this.a.h(), 0, 1, false);
        int i2 = this.a.h()[0] & 255;
        if (i2 != 0) {
            int i3 = 128;
            int i4 = 0;
            while ((i2 & i3) == 0) {
                i3 >>= 1;
                i4++;
            }
            int i5 = i2 & (i3 ^ (-1));
            rz8Var.h(this.a.h(), 1, i4, false);
            while (i < i4) {
                i++;
                i5 = (this.a.h()[i] & 255) + (i5 << 8);
            }
            this.b += i4 + 1;
            return i5;
        }
        return Long.MIN_VALUE;
    }
}
