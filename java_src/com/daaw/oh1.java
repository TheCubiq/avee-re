package com.daaw;
/* loaded from: classes2.dex */
public class oh1 extends nh1 {
    public static /* synthetic */ String A(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return y(str, str2, str3);
    }

    public static final CharSequence B(CharSequence charSequence) {
        ug0.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c = we.c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!c) {
                    break;
                }
                length--;
            } else if (c) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final boolean f(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        ug0.f(charSequence, "<this>");
        ug0.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (n(charSequence, (String) charSequence2, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (l(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean g(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return f(charSequence, charSequence2, z);
    }

    public static final int h(CharSequence charSequence) {
        ug0.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int i(CharSequence charSequence, char c, int i, boolean z) {
        ug0.f(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? o(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static final int j(CharSequence charSequence, String str, int i, boolean z) {
        ug0.f(charSequence, "<this>");
        ug0.f(str, "string");
        return (z || !(charSequence instanceof String)) ? l(charSequence, str, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i);
    }

    public static final int k(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        ng0 pg0Var = !z2 ? new pg0(f31.a(i, 0), f31.c(i2, charSequence.length())) : f31.e(f31.c(i, h(charSequence)), f31.a(i2, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int d = pg0Var.d();
            int e = pg0Var.e();
            int f = pg0Var.f();
            if ((f <= 0 || d > e) && (f >= 0 || e > d)) {
                return -1;
            }
            while (!nh1.c((String) charSequence2, 0, (String) charSequence, d, charSequence2.length(), z)) {
                if (d == e) {
                    return -1;
                }
                d += f;
            }
            return d;
        }
        int d2 = pg0Var.d();
        int e2 = pg0Var.e();
        int f2 = pg0Var.f();
        if ((f2 <= 0 || d2 > e2) && (f2 >= 0 || e2 > d2)) {
            return -1;
        }
        while (!s(charSequence2, 0, charSequence, d2, charSequence2.length(), z)) {
            if (d2 == e2) {
                return -1;
            }
            d2 += f2;
        }
        return d2;
    }

    public static /* synthetic */ int l(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return k(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    public static /* synthetic */ int m(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return i(charSequence, c, i, z);
    }

    public static /* synthetic */ int n(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return j(charSequence, str, i, z);
    }

    public static final int o(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        ug0.f(charSequence, "<this>");
        ug0.f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(o6.h(cArr), i);
        }
        mg0 it = new pg0(f31.a(i, 0), h(charSequence)).iterator();
        while (it.hasNext()) {
            int a = it.a();
            char charAt = charSequence.charAt(a);
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    continue;
                    break;
                } else if (xe.d(cArr[i2], charAt, z)) {
                    z2 = true;
                    continue;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return a;
            }
        }
        return -1;
    }

    public static final int p(CharSequence charSequence, char c, int i, boolean z) {
        ug0.f(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? r(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    public static /* synthetic */ int q(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = h(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return p(charSequence, c, i, z);
    }

    public static final int r(CharSequence charSequence, char[] cArr, int i, boolean z) {
        ug0.f(charSequence, "<this>");
        ug0.f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(o6.h(cArr), i);
        }
        for (int c = f31.c(i, h(charSequence)); -1 < c; c--) {
            char charAt = charSequence.charAt(c);
            int length = cArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (xe.d(cArr[i2], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return c;
            }
        }
        return -1;
    }

    public static final boolean s(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        ug0.f(charSequence, "<this>");
        ug0.f(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!xe.d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final String t(String str, String str2, String str3) {
        ug0.f(str, "<this>");
        ug0.f(str2, "delimiter");
        ug0.f(str3, "missingDelimiterValue");
        int n = n(str, str2, 0, false, 6, null);
        if (n == -1) {
            return str3;
        }
        String substring = str.substring(n + str2.length(), str.length());
        ug0.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String u(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return t(str, str2, str3);
    }

    public static final String v(String str, char c, String str2) {
        ug0.f(str, "<this>");
        ug0.f(str2, "missingDelimiterValue");
        int q = q(str, c, 0, false, 6, null);
        if (q == -1) {
            return str2;
        }
        String substring = str.substring(q + 1, str.length());
        ug0.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String w(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return v(str, c, str2);
    }

    public static final String x(String str, char c, String str2) {
        ug0.f(str, "<this>");
        ug0.f(str2, "missingDelimiterValue");
        int m = m(str, c, 0, false, 6, null);
        if (m == -1) {
            return str2;
        }
        String substring = str.substring(0, m);
        ug0.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String y(String str, String str2, String str3) {
        ug0.f(str, "<this>");
        ug0.f(str2, "delimiter");
        ug0.f(str3, "missingDelimiterValue");
        int n = n(str, str2, 0, false, 6, null);
        if (n == -1) {
            return str3;
        }
        String substring = str.substring(0, n);
        ug0.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String z(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return x(str, c, str2);
    }
}
