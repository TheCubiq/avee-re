package com.daaw;
@Deprecated
/* loaded from: classes2.dex */
public class q6 {
    public static void a(int i, int i2) {
        b(null, i, i2);
    }

    public static void b(String str, int i, int i2) {
        c(str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void c(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            l(str, obj, obj2);
        }
    }

    public static void d(String str, String str2) {
        e(null, str, str2);
    }

    public static void e(String str, String str2, String str3) {
        if (str2 == null && str3 == null) {
            return;
        }
        if (str2 == null || !str2.equals(str3)) {
            if (str == null) {
                str = "";
            }
            throw new hh(str, str2, str3);
        }
    }

    public static void f(Object obj) {
        g(null, obj);
    }

    public static void g(String str, Object obj) {
        h(str, obj != null);
    }

    public static void h(String str, boolean z) {
        if (z) {
            return;
        }
        k(str);
    }

    public static void i(boolean z) {
        h(null, z);
    }

    public static void j() {
        k(null);
    }

    public static void k(String str) {
        if (str != null) {
            throw new r6(str);
        }
        throw new r6();
    }

    public static void l(String str, Object obj, Object obj2) {
        k(m(str, obj, obj2));
    }

    public static String m(String str, Object obj, Object obj2) {
        String str2;
        if (str == null || str.length() <= 0) {
            str2 = "";
        } else {
            str2 = str + " ";
        }
        return str2 + "expected:<" + obj + "> but was:<" + obj2 + ">";
    }
}
