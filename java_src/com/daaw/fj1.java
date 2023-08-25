package com.daaw;
/* loaded from: classes2.dex */
public final /* synthetic */ class fj1 {
    public static final int a(String str, int i, int i2, int i3) {
        return (int) dj1.c(str, i, i2, i3);
    }

    public static final long b(String str, long j, long j2, long j3) {
        String d = dj1.d(str);
        if (d == null) {
            return j;
        }
        Long a = mh1.a(d);
        if (a == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
        }
        long longValue = a.longValue();
        boolean z = false;
        if (j2 <= longValue && longValue <= j3) {
            z = true;
        }
        if (z) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static final boolean c(String str, boolean z) {
        String d = dj1.d(str);
        return d == null ? z : Boolean.parseBoolean(d);
    }

    public static /* synthetic */ int d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return dj1.b(str, i, i2, i3);
    }

    public static /* synthetic */ long e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return dj1.c(str, j, j4, j3);
    }
}
