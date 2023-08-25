package com.daaw;
/* loaded from: classes.dex */
public final class ce1 {

    /* renamed from: a */
    public final rv0 f5751a = new rv0(8);

    /* renamed from: b */
    public int f5752b;

    /* renamed from: a */
    public final long m25409a(a00 a00Var) {
        int i = 0;
        a00Var.mo5856k(this.f5751a.f25637a, 0, 1);
        int i2 = this.f5751a.f25637a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (i3 ^ (-1));
        a00Var.mo5856k(this.f5751a.f25637a, 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f5751a.f25637a[i] & 255) + (i5 << 8);
        }
        this.f5752b += i4 + 1;
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
        return false;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m25408b(a00 a00Var) {
        long mo5859h = a00Var.mo5859h();
        long j = 1024;
        if (mo5859h != -1 && mo5859h <= 1024) {
            j = mo5859h;
        }
        int i = (int) j;
        a00Var.mo5856k(this.f5751a.f25637a, 0, 4);
        long m10894z = this.f5751a.m10894z();
        this.f5752b = 4;
        while (m10894z != 440786851) {
            int i2 = this.f5752b + 1;
            this.f5752b = i2;
            if (i2 == i) {
                return false;
            }
            a00Var.mo5856k(this.f5751a.f25637a, 0, 1);
            m10894z = ((m10894z << 8) & (-256)) | (this.f5751a.f25637a[0] & 255);
        }
        long m25409a = m25409a(a00Var);
        long j2 = this.f5752b;
        if (m25409a == Long.MIN_VALUE) {
            return false;
        }
        if (mo5859h != -1 && j2 + m25409a >= mo5859h) {
            return false;
        }
        while (true) {
            int i3 = this.f5752b;
            long j3 = j2 + m25409a;
            if (i3 >= j3) {
                return ((long) i3) == j3;
            } else if (m25409a(a00Var) == Long.MIN_VALUE) {
                return false;
            } else {
                long m25409a2 = m25409a(a00Var);
                if (m25409a2 < 0 || m25409a2 > 2147483647L) {
                    break;
                } else if (m25409a2 != 0) {
                    int i4 = (int) m25409a2;
                    a00Var.mo5860g(i4);
                    this.f5752b += i4;
                }
            }
        }
    }
}
