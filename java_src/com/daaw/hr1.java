package com.daaw;
/* loaded from: classes.dex */
public class hr1 {
    /* renamed from: a */
    public static long m20469a(long j, int i, int i2) {
        int i3 = (i2 / 8) * i;
        if (i3 == 0) {
            return 0L;
        }
        return j / i3;
    }

    /* renamed from: b */
    public static int m20468b(long j, int i, int i2, long j2) {
        return m20466d(m20467c(j, j2), i, i2);
    }

    /* renamed from: c */
    public static int m20467c(long j, long j2) {
        double d = j2;
        Double.isNaN(d);
        double d2 = j;
        Double.isNaN(d2);
        return (int) ((d / 1000000.0d) * d2);
    }

    /* renamed from: d */
    public static int m20466d(long j, int i, int i2) {
        return (int) (j * (i2 / 8) * i);
    }

    /* renamed from: e */
    public static long m20465e(long j, long j2) {
        return (j * 1000000) / j2;
    }
}
