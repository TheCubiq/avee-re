package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class cr5 {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public cr5(long j) {
        f(0L);
    }

    public final synchronized long a(long j) {
        if (this.b == -9223372036854775807L) {
            long j2 = this.a;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.d.get();
                Objects.requireNonNull(l);
                j2 = l.longValue();
            }
            this.b = j2 - j;
            notifyAll();
        }
        this.c = j;
        return j + this.b;
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = (((-1) + j4) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return a((j * 1000000) / 90000);
    }

    public final synchronized long c() {
        long j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long d() {
        long j;
        j = this.c;
        return j != -9223372036854775807L ? j + this.b : c();
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized void f(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }
}
