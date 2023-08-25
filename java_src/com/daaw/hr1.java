package com.daaw;
/* loaded from: classes.dex */
public class hr1 {
    public static long a(long j, int i, int i2) {
        int i3 = (i2 / 8) * i;
        if (i3 == 0) {
            return 0L;
        }
        return j / i3;
    }

    public static int b(long j, int i, int i2, long j2) {
        return d(c(j, j2), i, i2);
    }

    public static int c(long j, long j2) {
        double d = j2;
        Double.isNaN(d);
        double d2 = j;
        Double.isNaN(d2);
        return (int) ((d / 1000000.0d) * d2);
    }

    public static int d(long j, int i, int i2) {
        return (int) (j * (i2 / 8) * i);
    }

    public static long e(long j, long j2) {
        return (j * 1000000) / j2;
    }
}
