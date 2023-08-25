package com.daaw;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class br1 {
    public static final boolean a;

    static {
        a = Build.VERSION.SDK_INT < 29;
    }

    public static String A(String str, String str2) {
        return (str == null || str.length() < 1) ? str2 : str;
    }

    public static void B(String str, int i, String[] strArr) {
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

    public static void C(String str, String str2, String[] strArr) {
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

    public static String D(String str, int i, String str2) {
        int indexOf;
        return (str != null && (indexOf = str.indexOf(i)) >= 0) ? str.substring(indexOf + 1) : str2;
    }

    public static Integer E(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static long F() {
        return SystemClock.uptimeMillis();
    }

    public static String G(Uri uri) {
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

    public static String H(int i) {
        if (i == 0) {
            return "00";
        }
        if (i / 10 == 0) {
            return "0" + i;
        }
        return String.valueOf(i);
    }

    public static String a(String[] strArr, int i, String str) {
        return (i < 0 || strArr.length <= i) ? str : strArr[i];
    }

    public static boolean b(int i) {
        return i % 2 != 0;
    }

    public static boolean c(long j) {
        return (j & (j - 1)) == 0;
    }

    public static float d(float f) {
        return f < 0.0f ? -1.0f : 1.0f;
    }

    public static int e(String[] strArr, String str) {
        return f(strArr, str, -1);
    }

    public static int f(String[] strArr, String str, int i) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals(str)) {
                return i2;
            }
        }
        return i;
    }

    public static <T> boolean g(T t, T t2) {
        return (t == null && t2 == null) || (t != null && t.equals(t2));
    }

    public static boolean h(String str, String str2) {
        return (str == null && str2 == null) || (str != null && str.equals(str2));
    }

    public static <T> T i(pd0 pd0Var) {
        if (pd0Var != null) {
            pd0Var.a();
            return null;
        }
        return null;
    }

    public static float j(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int k(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static String l(String str) {
        int indexOf = str.indexOf(0);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public static String m() {
        return "1.2.209";
    }

    public static String n(int i, boolean z) {
        StringBuilder sb;
        int i2 = i / 3600;
        int i3 = (i % 3600) / 60;
        int i4 = i % 60;
        if (z && i2 == 0) {
            sb = new StringBuilder();
        } else {
            sb = new StringBuilder();
            sb.append(H(i2));
            sb.append(":");
        }
        sb.append(H(i3));
        sb.append(":");
        sb.append(H(i4));
        return sb.toString();
    }

    public static String o(int i) {
        return p(i, true);
    }

    public static String p(int i, boolean z) {
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
        sb.append(H(i4));
        return sb.toString();
    }

    public static String q(int i) {
        return Integer.toHexString(i).toUpperCase();
    }

    public static void r(float[] fArr, float[] fArr2, float[] fArr3, float f) {
        float f2 = 1.0f - f;
        fArr3[0] = (fArr[0] * f2) + (fArr2[0] * f);
        fArr3[1] = (fArr[1] * f2) + (fArr2[1] * f);
        fArr3[2] = (fArr[2] * f2) + (fArr2[2] * f);
        fArr3[3] = (fArr[3] * f2) + (fArr2[3] * f);
    }

    public static int s(int i, int i2) {
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

    public static boolean t(String str, boolean z) {
        return (str == null || str.length() < 1) ? z : str.charAt(0) == 't' || str.charAt(0) == 'T' || str.charAt(0) == '1';
    }

    public static float u(String str) {
        return v(str, 0.0f);
    }

    public static float v(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static int w(String str) {
        return x(str, 0);
    }

    public static int x(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long y(String str) {
        return z(str, 0L);
    }

    public static long z(String str, long j) {
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
