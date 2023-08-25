package com.daaw;
/* loaded from: classes2.dex */
public class f31 extends e31 {
    public static final int a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final long b(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static final int c(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final long d(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final ng0 e(int i, int i2) {
        return ng0.s.a(i, i2, -1);
    }

    public static final pg0 f(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? pg0.t.a() : new pg0(i, i2 - 1);
    }
}
