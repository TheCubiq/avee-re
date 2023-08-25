package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class sy6 {
    /* renamed from: a */
    public static int m9708a(int i, int i2, String str) {
        String m20317b;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                m20317b = hz6.m20317b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            } else {
                m20317b = hz6.m20317b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(m20317b);
        }
        return i;
    }

    /* renamed from: b */
    public static int m9707b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m9699j(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static Object m9706c(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    /* renamed from: d */
    public static Object m9705d(@CheckForNull Object obj, String str, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(hz6.m20317b(str, obj2));
    }

    /* renamed from: e */
    public static void m9704e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: f */
    public static void m9703f(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: g */
    public static void m9702g(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? m9699j(i, i3, "start index") : (i2 < 0 || i2 > i3) ? m9699j(i2, i3, "end index") : hz6.m20317b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: h */
    public static void m9701h(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: i */
    public static void m9700i(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: j */
    public static String m9699j(int i, int i2, String str) {
        if (i < 0) {
            return hz6.m20317b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return hz6.m20317b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
