package com.daaw;
/* loaded from: classes.dex */
public final class i47 extends m47 {
    /* renamed from: a */
    public static int m20126a(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new IllegalArgumentException(hz6.m20317b("Out of range: %s", Long.valueOf(j)));
    }

    /* renamed from: b */
    public static int m20125b(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), 1073741823);
    }

    /* renamed from: c */
    public static int m20124c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
