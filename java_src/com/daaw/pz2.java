package com.daaw;

import android.os.Build;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class pz2 {

    /* renamed from: a */
    public static final int f23547a;

    /* renamed from: b */
    public static final String f23548b;

    /* renamed from: c */
    public static final String f23549c;

    /* renamed from: d */
    public static final String f23550d;

    /* renamed from: e */
    public static final String f23551e;

    /* renamed from: f */
    public static final Pattern f23552f;

    /* renamed from: g */
    public static final Pattern f23553g;

    /* renamed from: h */
    public static final Pattern f23554h;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i = 26;
        }
        f23547a = i;
        String str = Build.DEVICE;
        f23548b = str;
        String str2 = Build.MANUFACTURER;
        f23549c = str2;
        String str3 = Build.MODEL;
        f23550d = str3;
        f23551e = str + ", " + str3 + ", " + str2 + ", " + i;
        f23552f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f23553g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f23554h = Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    /* renamed from: a */
    public static float m12849a(float f, float f2, float f3) {
        return Math.max(0.1f, Math.min(f, 8.0f));
    }

    /* renamed from: b */
    public static int m12848b(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = binarySearch ^ (-1);
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i) : i;
    }

    /* renamed from: c */
    public static int m12847c(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = binarySearch + 1;
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* renamed from: d */
    public static int m12846d(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: e */
    public static int m12845e(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: f */
    public static int m12844f(int i) {
        return i != 1 ? 13107200 : 3538944;
    }

    /* renamed from: g */
    public static int m12843g(String str) {
        int length = str.length();
        az2.m26585c(length <= 4);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i << 8) | str.charAt(i2);
        }
        return i;
    }

    /* renamed from: h */
    public static int m12842h(int i) {
        if (i != 8) {
            if (i != 16) {
                if (i != 24) {
                    return i != 32 ? 0 : 1073741824;
                }
                return Integer.MIN_VALUE;
            }
            return 2;
        }
        return 3;
    }

    /* renamed from: i */
    public static int m12841i(int i, int i2) {
        if (i != Integer.MIN_VALUE) {
            if (i != 1073741824) {
                if (i != 2) {
                    if (i == 3) {
                        return i2;
                    }
                    throw new IllegalArgumentException();
                }
                return i2 + i2;
            }
            return i2 * 4;
        }
        return i2 * 3;
    }

    /* renamed from: j */
    public static long m12840j(long j, long j2, long j3) {
        if (j3 < j2 || j3 % j2 != 0) {
            if (j3 >= j2 || j2 % j3 != 0) {
                double d = j;
                double d2 = j2;
                double d3 = j3;
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d);
                return (long) (d * (d2 / d3));
            }
            return j * (j2 / j3);
        }
        return j / (j3 / j2);
    }

    /* renamed from: k */
    public static String m12839k(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = objArr.length;
            if (i >= length) {
                return sb.toString();
            }
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    /* renamed from: l */
    public static ExecutorService m12838l(String str) {
        return Executors.newSingleThreadExecutor(new oz2("Loader:ExtractorMediaPeriod"));
    }

    /* renamed from: m */
    public static void m12837m(kx2 kx2Var) {
        if (kx2Var != null) {
            try {
                kx2Var.zzd();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: n */
    public static void m12836n(long[] jArr, long j, long j2) {
        int i = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (j2 < 1000000 && 1000000 % j2 == 0) {
            long j4 = 1000000 / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        } else {
            double d = j2;
            Double.isNaN(d);
            double d2 = 1000000.0d / d;
            while (i < jArr.length) {
                double d3 = jArr[i];
                Double.isNaN(d3);
                jArr[i] = (long) (d3 * d2);
                i++;
            }
        }
    }

    /* renamed from: o */
    public static boolean m12835o(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: p */
    public static byte[] m12834p(String str) {
        byte[] bArr = new byte[38];
        for (int i = 0; i < 38; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i2), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i2 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: q */
    public static byte[] m12833q(String str) {
        return str.getBytes(Charset.defaultCharset());
    }
}
