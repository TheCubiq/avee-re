package com.daaw;
/* loaded from: classes.dex */
public final class ol1 {

    /* renamed from: a */
    public long f21632a;

    /* renamed from: b */
    public long f21633b;

    /* renamed from: c */
    public volatile long f21634c = -9223372036854775807L;

    public ol1(long j) {
        m14181h(j);
    }

    /* renamed from: f */
    public static long m14183f(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: i */
    public static long m14180i(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: a */
    public long m14188a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f21634c != -9223372036854775807L) {
            this.f21634c = j;
        } else {
            long j2 = this.f21632a;
            if (j2 != Long.MAX_VALUE) {
                this.f21633b = j2 - j;
            }
            synchronized (this) {
                this.f21634c = j;
                notifyAll();
            }
        }
        return j + this.f21633b;
    }

    /* renamed from: b */
    public long m14187b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f21634c != -9223372036854775807L) {
            long m14180i = m14180i(this.f21634c);
            long j2 = (4294967296L + m14180i) / 8589934592L;
            long j3 = ((j2 - 1) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - m14180i) < Math.abs(j - m14180i)) {
                j = j3;
            }
        }
        return m14188a(m14183f(j));
    }

    /* renamed from: c */
    public long m14186c() {
        return this.f21632a;
    }

    /* renamed from: d */
    public long m14185d() {
        if (this.f21634c != -9223372036854775807L) {
            return this.f21634c;
        }
        long j = this.f21632a;
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public long m14184e() {
        if (this.f21632a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.f21634c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f21633b;
    }

    /* renamed from: g */
    public void m14182g() {
        this.f21634c = -9223372036854775807L;
    }

    /* renamed from: h */
    public synchronized void m14181h(long j) {
        C2914s6.m10685f(this.f21634c == -9223372036854775807L);
        this.f21632a = j;
    }

    /* renamed from: j */
    public synchronized void m14179j() {
        while (this.f21634c == -9223372036854775807L) {
            wait();
        }
    }
}
