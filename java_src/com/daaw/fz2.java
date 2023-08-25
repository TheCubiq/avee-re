package com.daaw;
/* loaded from: classes.dex */
public final class fz2 {
    /* renamed from: a */
    public static boolean m22128a(String str) {
        return "audio".equals(m22126c(str));
    }

    /* renamed from: b */
    public static boolean m22127b(String str) {
        return "video".equals(m22126c(str));
    }

    /* renamed from: c */
    public static String m22126c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: ".concat(str));
    }
}
