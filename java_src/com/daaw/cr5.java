package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class cr5 {

    /* renamed from: a */
    public long f6111a;

    /* renamed from: b */
    public long f6112b;

    /* renamed from: c */
    public long f6113c;

    /* renamed from: d */
    public final ThreadLocal f6114d = new ThreadLocal();

    public cr5(long j) {
        m25052f(0L);
    }

    /* renamed from: a */
    public final synchronized long m25057a(long j) {
        if (this.f6112b == -9223372036854775807L) {
            long j2 = this.f6111a;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.f6114d.get();
                Objects.requireNonNull(l);
                j2 = l.longValue();
            }
            this.f6112b = j2 - j;
            notifyAll();
        }
        this.f6113c = j;
        return j + this.f6112b;
    }

    /* renamed from: b */
    public final synchronized long m25056b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f6113c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = (((-1) + j4) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return m25057a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public final synchronized long m25055c() {
        long j = this.f6111a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: d */
    public final synchronized long m25054d() {
        long j;
        j = this.f6113c;
        return j != -9223372036854775807L ? j + this.f6112b : m25055c();
    }

    /* renamed from: e */
    public final synchronized long m25053e() {
        return this.f6112b;
    }

    /* renamed from: f */
    public final synchronized void m25052f(long j) {
        this.f6111a = j;
        this.f6112b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f6113c = -9223372036854775807L;
    }
}
