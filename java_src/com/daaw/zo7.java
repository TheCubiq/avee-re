package com.daaw;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class zo7 {

    /* renamed from: a */
    public final long f35316a;

    /* renamed from: b */
    public final long f35317b;

    /* renamed from: c */
    public long f35318c = -9223372036854775807L;

    /* renamed from: d */
    public long f35319d = -9223372036854775807L;

    /* renamed from: f */
    public long f35321f = -9223372036854775807L;

    /* renamed from: g */
    public long f35322g = -9223372036854775807L;

    /* renamed from: j */
    public float f35325j = 0.97f;

    /* renamed from: i */
    public float f35324i = 1.03f;

    /* renamed from: k */
    public float f35326k = 1.0f;

    /* renamed from: l */
    public long f35327l = -9223372036854775807L;

    /* renamed from: e */
    public long f35320e = -9223372036854775807L;

    /* renamed from: h */
    public long f35323h = -9223372036854775807L;

    /* renamed from: m */
    public long f35328m = -9223372036854775807L;

    /* renamed from: n */
    public long f35329n = -9223372036854775807L;

    public /* synthetic */ zo7(float f, float f2, long j, float f3, long j2, long j3, float f4, wn7 wn7Var) {
        this.f35316a = j2;
        this.f35317b = j3;
    }

    /* renamed from: f */
    public static long m2024f(long j, long j2, float f) {
        return (((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f);
    }

    /* renamed from: a */
    public final float m2029a(long j, long j2) {
        long m2024f;
        long m19402b0;
        if (this.f35318c != -9223372036854775807L) {
            long j3 = j - j2;
            long j4 = this.f35328m;
            if (j4 == -9223372036854775807L) {
                this.f35328m = j3;
                m2024f = 0;
            } else {
                long max = Math.max(j3, m2024f(j4, j3, 0.999f));
                this.f35328m = max;
                m2024f = m2024f(this.f35329n, Math.abs(j3 - max), 0.999f);
            }
            this.f35329n = m2024f;
            if (this.f35327l == -9223372036854775807L || SystemClock.elapsedRealtime() - this.f35327l >= 1000) {
                this.f35327l = SystemClock.elapsedRealtime();
                long j5 = this.f35328m + (this.f35329n * 3);
                if (this.f35323h > j5) {
                    float m19394f0 = (float) it5.m19394f0(1000L);
                    long[] jArr = {j5, this.f35320e, this.f35323h - (((this.f35326k - 1.0f) * m19394f0) + ((this.f35324i - 1.0f) * m19394f0))};
                    m19402b0 = jArr[0];
                    for (int i = 1; i < 3; i++) {
                        long j6 = jArr[i];
                        if (j6 > m19402b0) {
                            m19402b0 = j6;
                        }
                    }
                    this.f35323h = m19402b0;
                } else {
                    m19402b0 = it5.m19402b0(j - (Math.max(0.0f, this.f35326k - 1.0f) / 1.0E-7f), this.f35323h, j5);
                    this.f35323h = m19402b0;
                    long j7 = this.f35322g;
                    if (j7 != -9223372036854775807L && m19402b0 > j7) {
                        this.f35323h = j7;
                        m19402b0 = j7;
                    }
                }
                long j8 = j - m19402b0;
                float m19431A = Math.abs(j8) >= this.f35316a ? it5.m19431A((((float) j8) * 1.0E-7f) + 1.0f, this.f35325j, this.f35324i) : 1.0f;
                this.f35326k = m19431A;
                return m19431A;
            }
            return this.f35326k;
        }
        return 1.0f;
    }

    /* renamed from: b */
    public final long m2028b() {
        return this.f35323h;
    }

    /* renamed from: c */
    public final void m2027c() {
        long j = this.f35323h;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f35317b;
        this.f35323h = j2;
        long j3 = this.f35322g;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f35323h = j3;
        }
        this.f35327l = -9223372036854775807L;
    }

    /* renamed from: d */
    public final void m2026d(ht2 ht2Var) {
        long j = ht2Var.f12919a;
        this.f35318c = it5.m19394f0(-9223372036854775807L);
        this.f35321f = it5.m19394f0(-9223372036854775807L);
        this.f35322g = it5.m19394f0(-9223372036854775807L);
        this.f35325j = 0.97f;
        this.f35324i = 1.03f;
        m2023g();
    }

    /* renamed from: e */
    public final void m2025e(long j) {
        this.f35319d = j;
        m2023g();
    }

    /* renamed from: g */
    public final void m2023g() {
        long j = this.f35318c;
        if (j != -9223372036854775807L) {
            long j2 = this.f35319d;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f35321f;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f35322g;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f35320e == j) {
            return;
        }
        this.f35320e = j;
        this.f35323h = j;
        this.f35328m = -9223372036854775807L;
        this.f35329n = -9223372036854775807L;
        this.f35327l = -9223372036854775807L;
    }
}
