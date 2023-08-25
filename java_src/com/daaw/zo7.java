package com.daaw;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class zo7 {
    public final long a;
    public final long b;
    public long c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public float j = 0.97f;
    public float i = 1.03f;
    public float k = 1.0f;
    public long l = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long m = -9223372036854775807L;
    public long n = -9223372036854775807L;

    public /* synthetic */ zo7(float f, float f2, long j, float f3, long j2, long j3, float f4, wn7 wn7Var) {
        this.a = j2;
        this.b = j3;
    }

    public static long f(long j, long j2, float f) {
        return (((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f);
    }

    public final float a(long j, long j2) {
        long f;
        long b0;
        if (this.c != -9223372036854775807L) {
            long j3 = j - j2;
            long j4 = this.m;
            if (j4 == -9223372036854775807L) {
                this.m = j3;
                f = 0;
            } else {
                long max = Math.max(j3, f(j4, j3, 0.999f));
                this.m = max;
                f = f(this.n, Math.abs(j3 - max), 0.999f);
            }
            this.n = f;
            if (this.l == -9223372036854775807L || SystemClock.elapsedRealtime() - this.l >= 1000) {
                this.l = SystemClock.elapsedRealtime();
                long j5 = this.m + (this.n * 3);
                if (this.h > j5) {
                    float f0 = (float) it5.f0(1000L);
                    long[] jArr = {j5, this.e, this.h - (((this.k - 1.0f) * f0) + ((this.i - 1.0f) * f0))};
                    b0 = jArr[0];
                    for (int i = 1; i < 3; i++) {
                        long j6 = jArr[i];
                        if (j6 > b0) {
                            b0 = j6;
                        }
                    }
                    this.h = b0;
                } else {
                    b0 = it5.b0(j - (Math.max(0.0f, this.k - 1.0f) / 1.0E-7f), this.h, j5);
                    this.h = b0;
                    long j7 = this.g;
                    if (j7 != -9223372036854775807L && b0 > j7) {
                        this.h = j7;
                        b0 = j7;
                    }
                }
                long j8 = j - b0;
                float A = Math.abs(j8) >= this.a ? it5.A((((float) j8) * 1.0E-7f) + 1.0f, this.j, this.i) : 1.0f;
                this.k = A;
                return A;
            }
            return this.k;
        }
        return 1.0f;
    }

    public final long b() {
        return this.h;
    }

    public final void c() {
        long j = this.h;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.b;
        this.h = j2;
        long j3 = this.g;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.h = j3;
        }
        this.l = -9223372036854775807L;
    }

    public final void d(ht2 ht2Var) {
        long j = ht2Var.a;
        this.c = it5.f0(-9223372036854775807L);
        this.f = it5.f0(-9223372036854775807L);
        this.g = it5.f0(-9223372036854775807L);
        this.j = 0.97f;
        this.i = 1.03f;
        g();
    }

    public final void e(long j) {
        this.d = j;
        g();
    }

    public final void g() {
        long j = this.c;
        if (j != -9223372036854775807L) {
            long j2 = this.d;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.g;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.e == j) {
            return;
        }
        this.e = j;
        this.h = j;
        this.m = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.l = -9223372036854775807L;
    }
}
