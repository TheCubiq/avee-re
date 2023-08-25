package com.daaw;
/* loaded from: classes.dex */
public final class lz8 {
    public static final lz8 d = new lz8(-3, -9223372036854775807L, -1);
    public final int a;
    public final long b;
    public final long c;

    public lz8(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public static lz8 d(long j, long j2) {
        return new lz8(-1, j, j2);
    }

    public static lz8 e(long j) {
        return new lz8(0, -9223372036854775807L, j);
    }

    public static lz8 f(long j, long j2) {
        return new lz8(-2, j, j2);
    }
}
