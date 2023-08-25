package com.daaw;
/* loaded from: classes.dex */
public final class gt2 {

    /* renamed from: a */
    public final iz2 f11724a = new iz2(8);

    /* renamed from: b */
    public int f11725b;

    /* renamed from: a */
    public final boolean m21238a(ms2 ms2Var) {
        long m15802c = ms2Var.m15802c();
        long j = 1024;
        if (m15802c != -1 && m15802c <= 1024) {
            j = m15802c;
        }
        int i = (int) j;
        ms2Var.m15798g(this.f11724a.f14125a, 0, 4, false);
        long m19234m = this.f11724a.m19234m();
        this.f11725b = 4;
        while (m19234m != 440786851) {
            int i2 = this.f11725b + 1;
            this.f11725b = i2;
            if (i2 == i) {
                return false;
            }
            ms2Var.m15798g(this.f11724a.f14125a, 0, 1, false);
            m19234m = ((m19234m << 8) & (-256)) | (this.f11724a.f14125a[0] & 255);
        }
        long m21237b = m21237b(ms2Var);
        long j2 = this.f11725b;
        if (m21237b != Long.MIN_VALUE && (m15802c == -1 || j2 + m21237b < m15802c)) {
            while (true) {
                long j3 = this.f11725b;
                long j4 = j2 + m21237b;
                if (j3 < j4) {
                    if (m21237b(ms2Var) == Long.MIN_VALUE) {
                        return false;
                    }
                    long m21237b2 = m21237b(ms2Var);
                    if (m21237b2 < 0) {
                        return false;
                    }
                    if (m21237b2 != 0) {
                        ms2Var.m15799f((int) m21237b2, false);
                        this.f11725b = (int) (this.f11725b + m21237b2);
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final long m21237b(ms2 ms2Var) {
        int i = 0;
        ms2Var.m15798g(this.f11724a.f14125a, 0, 1, false);
        int i2 = this.f11724a.f14125a[0] & 255;
        if (i2 != 0) {
            int i3 = 128;
            int i4 = 0;
            while ((i2 & i3) == 0) {
                i3 >>= 1;
                i4++;
            }
            int i5 = i2 & (i3 ^ (-1));
            ms2Var.m15798g(this.f11724a.f14125a, 1, i4, false);
            while (i < i4) {
                i++;
                i5 = (this.f11724a.f14125a[i] & 255) + (i5 << 8);
            }
            this.f11725b += i4 + 1;
            return i5;
        }
        return Long.MIN_VALUE;
    }
}
