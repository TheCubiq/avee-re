package com.daaw;
@Deprecated
/* renamed from: com.daaw.q6 */
/* loaded from: classes2.dex */
public class C2691q6 {
    /* renamed from: a */
    public static void m12757a(int i, int i2) {
        m12756b(null, i, i2);
    }

    /* renamed from: b */
    public static void m12756b(String str, int i, int i2) {
        m12755c(str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: c */
    public static void m12755c(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            m12746l(str, obj, obj2);
        }
    }

    /* renamed from: d */
    public static void m12754d(String str, String str2) {
        m12753e(null, str, str2);
    }

    /* renamed from: e */
    public static void m12753e(String str, String str2, String str3) {
        if (str2 == null && str3 == null) {
            return;
        }
        if (str2 == null || !str2.equals(str3)) {
            if (str == null) {
                str = "";
            }
            throw new C1535hh(str, str2, str3);
        }
    }

    /* renamed from: f */
    public static void m12752f(Object obj) {
        m12751g(null, obj);
    }

    /* renamed from: g */
    public static void m12751g(String str, Object obj) {
        m12750h(str, obj != null);
    }

    /* renamed from: h */
    public static void m12750h(String str, boolean z) {
        if (z) {
            return;
        }
        m12747k(str);
    }

    /* renamed from: i */
    public static void m12749i(boolean z) {
        m12750h(null, z);
    }

    /* renamed from: j */
    public static void m12748j() {
        m12747k(null);
    }

    /* renamed from: k */
    public static void m12747k(String str) {
        if (str != null) {
            throw new C2828r6(str);
        }
        throw new C2828r6();
    }

    /* renamed from: l */
    public static void m12746l(String str, Object obj, Object obj2) {
        m12747k(m12745m(str, obj, obj2));
    }

    /* renamed from: m */
    public static String m12745m(String str, Object obj, Object obj2) {
        String str2;
        if (str == null || str.length() <= 0) {
            str2 = "";
        } else {
            str2 = str + " ";
        }
        return str2 + "expected:<" + obj + "> but was:<" + obj2 + ">";
    }
}
