package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class nx8 {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final boolean[] g = new boolean[15];
    public int h;

    public final long a() {
        long j = this.e;
        if (j == 0) {
            return 0L;
        }
        return this.f / j;
    }

    public final long b() {
        return this.f;
    }

    public final void c(long j) {
        int i;
        long j2 = this.d;
        if (j2 == 0) {
            this.a = j;
        } else if (j2 == 1) {
            long j3 = j - this.a;
            this.b = j3;
            this.f = j3;
            this.e = 1L;
        } else {
            long j4 = j - this.c;
            int i2 = (int) (j2 % 15);
            if (Math.abs(j4 - this.b) <= 1000000) {
                this.e++;
                this.f += j4;
                boolean[] zArr = this.g;
                if (zArr[i2]) {
                    zArr[i2] = false;
                    i = this.h - 1;
                    this.h = i;
                }
            } else {
                boolean[] zArr2 = this.g;
                if (!zArr2[i2]) {
                    zArr2[i2] = true;
                    i = this.h + 1;
                    this.h = i;
                }
            }
        }
        this.d++;
        this.c = j;
    }

    public final void d() {
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.h = 0;
        Arrays.fill(this.g, false);
    }

    public final boolean e() {
        long j = this.d;
        if (j == 0) {
            return false;
        }
        return this.g[(int) ((j - 1) % 15)];
    }

    public final boolean f() {
        return this.d > 15 && this.h == 0;
    }
}
