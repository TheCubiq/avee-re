package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class jf8 {
    /* renamed from: a */
    public static int m18536a(int i, int i2, String str) {
        String m6061a;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                m6061a = wh8.m6061a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            } else {
                m6061a = wh8.m6061a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(m6061a);
        }
        return i;
    }

    /* renamed from: b */
    public static int m18535b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m18532e(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static Object m18534c(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    /* renamed from: d */
    public static void m18533d(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? m18532e(i, i3, "start index") : (i2 < 0 || i2 > i3) ? m18532e(i2, i3, "end index") : wh8.m6061a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: e */
    public static String m18532e(int i, int i2, String str) {
        if (i < 0) {
            return wh8.m6061a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return wh8.m6061a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
