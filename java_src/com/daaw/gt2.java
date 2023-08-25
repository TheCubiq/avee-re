package com.daaw;
/* loaded from: classes.dex */
public final class gt2 {
    public final iz2 a = new iz2(8);
    public int b;

    public final boolean a(ms2 ms2Var) {
        long c = ms2Var.c();
        long j = 1024;
        if (c != -1 && c <= 1024) {
            j = c;
        }
        int i = (int) j;
        ms2Var.g(this.a.a, 0, 4, false);
        long m = this.a.m();
        this.b = 4;
        while (m != 440786851) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == i) {
                return false;
            }
            ms2Var.g(this.a.a, 0, 1, false);
            m = ((m << 8) & (-256)) | (this.a.a[0] & 255);
        }
        long b = b(ms2Var);
        long j2 = this.b;
        if (b != Long.MIN_VALUE && (c == -1 || j2 + b < c)) {
            while (true) {
                long j3 = this.b;
                long j4 = j2 + b;
                if (j3 < j4) {
                    if (b(ms2Var) == Long.MIN_VALUE) {
                        return false;
                    }
                    long b2 = b(ms2Var);
                    if (b2 < 0) {
                        return false;
                    }
                    if (b2 != 0) {
                        ms2Var.f((int) b2, false);
                        this.b = (int) (this.b + b2);
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final long b(ms2 ms2Var) {
        int i = 0;
        ms2Var.g(this.a.a, 0, 1, false);
        int i2 = this.a.a[0] & 255;
        if (i2 != 0) {
            int i3 = 128;
            int i4 = 0;
            while ((i2 & i3) == 0) {
                i3 >>= 1;
                i4++;
            }
            int i5 = i2 & (i3 ^ (-1));
            ms2Var.g(this.a.a, 1, i4, false);
            while (i < i4) {
                i++;
                i5 = (this.a.a[i] & 255) + (i5 << 8);
            }
            this.b += i4 + 1;
            return i5;
        }
        return Long.MIN_VALUE;
    }
}
