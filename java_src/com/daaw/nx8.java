package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class nx8 {

    /* renamed from: a */
    public long f20837a;

    /* renamed from: b */
    public long f20838b;

    /* renamed from: c */
    public long f20839c;

    /* renamed from: d */
    public long f20840d;

    /* renamed from: e */
    public long f20841e;

    /* renamed from: f */
    public long f20842f;

    /* renamed from: g */
    public final boolean[] f20843g = new boolean[15];

    /* renamed from: h */
    public int f20844h;

    /* renamed from: a */
    public final long m14743a() {
        long j = this.f20841e;
        if (j == 0) {
            return 0L;
        }
        return this.f20842f / j;
    }

    /* renamed from: b */
    public final long m14742b() {
        return this.f20842f;
    }

    /* renamed from: c */
    public final void m14741c(long j) {
        int i;
        long j2 = this.f20840d;
        if (j2 == 0) {
            this.f20837a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f20837a;
            this.f20838b = j3;
            this.f20842f = j3;
            this.f20841e = 1L;
        } else {
            long j4 = j - this.f20839c;
            int i2 = (int) (j2 % 15);
            if (Math.abs(j4 - this.f20838b) <= 1000000) {
                this.f20841e++;
                this.f20842f += j4;
                boolean[] zArr = this.f20843g;
                if (zArr[i2]) {
                    zArr[i2] = false;
                    i = this.f20844h - 1;
                    this.f20844h = i;
                }
            } else {
                boolean[] zArr2 = this.f20843g;
                if (!zArr2[i2]) {
                    zArr2[i2] = true;
                    i = this.f20844h + 1;
                    this.f20844h = i;
                }
            }
        }
        this.f20840d++;
        this.f20839c = j;
    }

    /* renamed from: d */
    public final void m14740d() {
        this.f20840d = 0L;
        this.f20841e = 0L;
        this.f20842f = 0L;
        this.f20844h = 0;
        Arrays.fill(this.f20843g, false);
    }

    /* renamed from: e */
    public final boolean m14739e() {
        long j = this.f20840d;
        if (j == 0) {
            return false;
        }
        return this.f20843g[(int) ((j - 1) % 15)];
    }

    /* renamed from: f */
    public final boolean m14738f() {
        return this.f20840d > 15 && this.f20844h == 0;
    }
}
