package com.daaw;
/* loaded from: classes2.dex */
public class oh1 extends nh1 {
    /* renamed from: A */
    public static /* synthetic */ String m14301A(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m14280y(str, str2, str3);
    }

    /* renamed from: B */
    public static final CharSequence m14300B(CharSequence charSequence) {
        ug0.m8268f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean m6133c = C3433we.m6133c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!m6133c) {
                    break;
                }
                length--;
            } else if (m6133c) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: f */
    public static final boolean m14299f(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        ug0.m8268f(charSequence, "<this>");
        ug0.m8268f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m14291n(charSequence, (String) charSequence2, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (m14293l(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m14298g(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m14299f(charSequence, charSequence2, z);
    }

    /* renamed from: h */
    public static final int m14297h(CharSequence charSequence) {
        ug0.m8268f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: i */
    public static final int m14296i(CharSequence charSequence, char c, int i, boolean z) {
        ug0.m8268f(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? m14290o(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    /* renamed from: j */
    public static final int m14295j(CharSequence charSequence, String str, int i, boolean z) {
        ug0.m8268f(charSequence, "<this>");
        ug0.m8268f(str, "string");
        return (z || !(charSequence instanceof String)) ? m14293l(charSequence, str, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i);
    }

    /* renamed from: k */
    public static final int m14294k(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        ng0 pg0Var = !z2 ? new pg0(f31.m22948a(i, 0), f31.m22946c(i2, charSequence.length())) : f31.m22944e(f31.m22946c(i, m14297h(charSequence)), f31.m22948a(i2, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int m15187d = pg0Var.m15187d();
            int m15186e = pg0Var.m15186e();
            int m15185f = pg0Var.m15185f();
            if ((m15185f <= 0 || m15187d > m15186e) && (m15185f >= 0 || m15186e > m15187d)) {
                return -1;
            }
            while (!nh1.m15179c((String) charSequence2, 0, (String) charSequence, m15187d, charSequence2.length(), z)) {
                if (m15187d == m15186e) {
                    return -1;
                }
                m15187d += m15185f;
            }
            return m15187d;
        }
        int m15187d2 = pg0Var.m15187d();
        int m15186e2 = pg0Var.m15186e();
        int m15185f2 = pg0Var.m15185f();
        if ((m15185f2 <= 0 || m15187d2 > m15186e2) && (m15185f2 >= 0 || m15186e2 > m15187d2)) {
            return -1;
        }
        while (!m14286s(charSequence2, 0, charSequence, m15187d2, charSequence2.length(), z)) {
            if (m15187d2 == m15186e2) {
                return -1;
            }
            m15187d2 += m15185f2;
        }
        return m15187d2;
    }

    /* renamed from: l */
    public static /* synthetic */ int m14293l(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m14294k(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: m */
    public static /* synthetic */ int m14292m(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m14296i(charSequence, c, i, z);
    }

    /* renamed from: n */
    public static /* synthetic */ int m14291n(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m14295j(charSequence, str, i, z);
    }

    /* renamed from: o */
    public static final int m14290o(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        ug0.m8268f(charSequence, "<this>");
        ug0.m8268f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C2410o6.m14536h(cArr), i);
        }
        mg0 it = new pg0(f31.m22948a(i, 0), m14297h(charSequence)).iterator();
        while (it.hasNext()) {
            int mo14310a = it.mo14310a();
            char charAt = charSequence.charAt(mo14310a);
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    continue;
                    break;
                } else if (C3531xe.m5197d(cArr[i2], charAt, z)) {
                    z2 = true;
                    continue;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return mo14310a;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public static final int m14289p(CharSequence charSequence, char c, int i, boolean z) {
        ug0.m8268f(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? m14287r(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    /* renamed from: q */
    public static /* synthetic */ int m14288q(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m14297h(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m14289p(charSequence, c, i, z);
    }

    /* renamed from: r */
    public static final int m14287r(CharSequence charSequence, char[] cArr, int i, boolean z) {
        ug0.m8268f(charSequence, "<this>");
        ug0.m8268f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C2410o6.m14536h(cArr), i);
        }
        for (int m22946c = f31.m22946c(i, m14297h(charSequence)); -1 < m22946c; m22946c--) {
            char charAt = charSequence.charAt(m22946c);
            int length = cArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (C3531xe.m5197d(cArr[i2], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return m22946c;
            }
        }
        return -1;
    }

    /* renamed from: s */
    public static final boolean m14286s(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        ug0.m8268f(charSequence, "<this>");
        ug0.m8268f(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C3531xe.m5197d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public static final String m14285t(String str, String str2, String str3) {
        ug0.m8268f(str, "<this>");
        ug0.m8268f(str2, "delimiter");
        ug0.m8268f(str3, "missingDelimiterValue");
        int m14291n = m14291n(str, str2, 0, false, 6, null);
        if (m14291n == -1) {
            return str3;
        }
        String substring = str.substring(m14291n + str2.length(), str.length());
        ug0.m8269e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: u */
    public static /* synthetic */ String m14284u(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m14285t(str, str2, str3);
    }

    /* renamed from: v */
    public static final String m14283v(String str, char c, String str2) {
        ug0.m8268f(str, "<this>");
        ug0.m8268f(str2, "missingDelimiterValue");
        int m14288q = m14288q(str, c, 0, false, 6, null);
        if (m14288q == -1) {
            return str2;
        }
        String substring = str.substring(m14288q + 1, str.length());
        ug0.m8269e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: w */
    public static /* synthetic */ String m14282w(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m14283v(str, c, str2);
    }

    /* renamed from: x */
    public static final String m14281x(String str, char c, String str2) {
        ug0.m8268f(str, "<this>");
        ug0.m8268f(str2, "missingDelimiterValue");
        int m14292m = m14292m(str, c, 0, false, 6, null);
        if (m14292m == -1) {
            return str2;
        }
        String substring = str.substring(0, m14292m);
        ug0.m8269e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: y */
    public static final String m14280y(String str, String str2, String str3) {
        ug0.m8268f(str, "<this>");
        ug0.m8268f(str2, "delimiter");
        ug0.m8268f(str3, "missingDelimiterValue");
        int m14291n = m14291n(str, str2, 0, false, 6, null);
        if (m14291n == -1) {
            return str3;
        }
        String substring = str.substring(0, m14291n);
        ug0.m8269e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: z */
    public static /* synthetic */ String m14279z(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m14281x(str, c, str2);
    }
}
