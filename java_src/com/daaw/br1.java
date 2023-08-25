package com.daaw;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class br1 {

    /* renamed from: a */
    public static final boolean f5068a;

    static {
        f5068a = Build.VERSION.SDK_INT < 29;
    }

    /* renamed from: A */
    public static String m25916A(String str, String str2) {
        return (str == null || str.length() < 1) ? str2 : str;
    }

    /* renamed from: B */
    public static void m25915B(String str, int i, String[] strArr) {
        if (str == null) {
            strArr[0] = "";
            strArr[1] = "";
            return;
        }
        int indexOf = str.indexOf(i);
        if (indexOf < 0) {
            strArr[0] = "";
            strArr[1] = "";
            return;
        }
        strArr[0] = str.substring(0, indexOf);
        strArr[1] = str.substring(indexOf + 1);
    }

    /* renamed from: C */
    public static void m25914C(String str, String str2, String[] strArr) {
        if (str == null) {
            strArr[0] = "";
            strArr[1] = "";
            return;
        }
        int indexOf = str.indexOf(str2);
        if (indexOf < 0) {
            strArr[0] = "";
            strArr[1] = "";
            return;
        }
        strArr[0] = str.substring(0, indexOf);
        strArr[1] = str.substring(indexOf + str2.length());
    }

    /* renamed from: D */
    public static String m25913D(String str, int i, String str2) {
        int indexOf;
        return (str != null && (indexOf = str.indexOf(i)) >= 0) ? str.substring(indexOf + 1) : str2;
    }

    /* renamed from: E */
    public static Integer m25912E(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: F */
    public static long m25911F() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: G */
    public static String m25910G(Uri uri) {
        String path = uri.getPath();
        int length = path.length();
        int lastIndexOf = path.lastIndexOf(".");
        if (lastIndexOf < 0) {
            lastIndexOf = length - 1;
        }
        int max = Math.max(path.lastIndexOf(47, lastIndexOf), 0) + 1;
        int indexOf = path.indexOf(47, lastIndexOf);
        if (indexOf < 0) {
            indexOf = (length - 1) + 1;
        }
        try {
            String substring = path.substring(max, indexOf);
            if (substring.length() < 2) {
                return null;
            }
            return substring;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: H */
    public static String m25909H(int i) {
        if (i == 0) {
            return "00";
        }
        if (i / 10 == 0) {
            return "0" + i;
        }
        return String.valueOf(i);
    }

    /* renamed from: a */
    public static String m25908a(String[] strArr, int i, String str) {
        return (i < 0 || strArr.length <= i) ? str : strArr[i];
    }

    /* renamed from: b */
    public static boolean m25907b(int i) {
        return i % 2 != 0;
    }

    /* renamed from: c */
    public static boolean m25906c(long j) {
        return (j & (j - 1)) == 0;
    }

    /* renamed from: d */
    public static float m25905d(float f) {
        return f < 0.0f ? -1.0f : 1.0f;
    }

    /* renamed from: e */
    public static int m25904e(String[] strArr, String str) {
        return m25903f(strArr, str, -1);
    }

    /* renamed from: f */
    public static int m25903f(String[] strArr, String str, int i) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals(str)) {
                return i2;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static <T> boolean m25902g(T t, T t2) {
        return (t == null && t2 == null) || (t != null && t.equals(t2));
    }

    /* renamed from: h */
    public static boolean m25901h(String str, String str2) {
        return (str == null && str2 == null) || (str != null && str.equals(str2));
    }

    /* renamed from: i */
    public static <T> T m25900i(pd0 pd0Var) {
        if (pd0Var != null) {
            pd0Var.mo9363a();
            return null;
        }
        return null;
    }

    /* renamed from: j */
    public static float m25899j(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: k */
    public static int m25898k(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: l */
    public static String m25897l(String str) {
        int indexOf = str.indexOf(0);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    /* renamed from: m */
    public static String m25896m() {
        return "1.2.209";
    }

    /* renamed from: n */
    public static String m25895n(int i, boolean z) {
        StringBuilder sb;
        int i2 = i / 3600;
        int i3 = (i % 3600) / 60;
        int i4 = i % 60;
        if (z && i2 == 0) {
            sb = new StringBuilder();
        } else {
            sb = new StringBuilder();
            sb.append(m25909H(i2));
            sb.append(":");
        }
        sb.append(m25909H(i3));
        sb.append(":");
        sb.append(m25909H(i4));
        return sb.toString();
    }

    /* renamed from: o */
    public static String m25894o(int i) {
        return m25893p(i, true);
    }

    /* renamed from: p */
    public static String m25893p(int i, boolean z) {
        StringBuilder sb;
        int i2 = i / 3600;
        int i3 = (i % 3600) / 60;
        int i4 = i % 60;
        if (z && i2 == 0) {
            sb = new StringBuilder();
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(":");
        }
        sb.append(i3);
        sb.append(":");
        sb.append(m25909H(i4));
        return sb.toString();
    }

    /* renamed from: q */
    public static String m25892q(int i) {
        return Integer.toHexString(i).toUpperCase();
    }

    /* renamed from: r */
    public static void m25891r(float[] fArr, float[] fArr2, float[] fArr3, float f) {
        float f2 = 1.0f - f;
        fArr3[0] = (fArr[0] * f2) + (fArr2[0] * f);
        fArr3[1] = (fArr[1] * f2) + (fArr2[1] * f);
        fArr3[2] = (fArr[2] * f2) + (fArr2[2] * f);
        fArr3[3] = (fArr[3] * f2) + (fArr2[3] * f);
    }

    /* renamed from: s */
    public static int m25890s(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        int i3 = i - 1;
        int i4 = i3 | (i3 >> 1);
        int i5 = i4 | (i4 >> 2);
        int i6 = i5 | (i5 >> 4);
        int i7 = i6 | (i6 >> 8);
        return Math.min((i7 | (i7 >> 16)) + 1, i2);
    }

    /* renamed from: t */
    public static boolean m25889t(String str, boolean z) {
        return (str == null || str.length() < 1) ? z : str.charAt(0) == 't' || str.charAt(0) == 'T' || str.charAt(0) == '1';
    }

    /* renamed from: u */
    public static float m25888u(String str) {
        return m25887v(str, 0.0f);
    }

    /* renamed from: v */
    public static float m25887v(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    /* renamed from: w */
    public static int m25886w(String str) {
        return m25885x(str, 0);
    }

    /* renamed from: x */
    public static int m25885x(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: y */
    public static long m25884y(String str) {
        return m25883z(str, 0L);
    }

    /* renamed from: z */
    public static long m25883z(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }
}
