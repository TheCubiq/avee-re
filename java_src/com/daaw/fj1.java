package com.daaw;
/* loaded from: classes2.dex */
public final /* synthetic */ class fj1 {
    /* renamed from: a */
    public static final int m22607a(String str, int i, int i2, int i3) {
        return (int) dj1.m24354c(str, i, i2, i3);
    }

    /* renamed from: b */
    public static final long m22606b(String str, long j, long j2, long j3) {
        String m24353d = dj1.m24353d(str);
        if (m24353d == null) {
            return j;
        }
        Long m16030a = mh1.m16030a(m24353d);
        if (m16030a == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m24353d + '\'').toString());
        }
        long longValue = m16030a.longValue();
        boolean z = false;
        if (j2 <= longValue && longValue <= j3) {
            z = true;
        }
        if (z) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m22605c(String str, boolean z) {
        String m24353d = dj1.m24353d(str);
        return m24353d == null ? z : Boolean.parseBoolean(m24353d);
    }

    /* renamed from: d */
    public static /* synthetic */ int m22604d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return dj1.m24355b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m22603e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return dj1.m24354c(str, j, j4, j3);
    }
}
