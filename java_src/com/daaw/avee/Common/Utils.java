package com.daaw.avee.Common;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import com.daaw.avee.BuildConfig;
import java.util.List;
/* loaded from: classes.dex */
public class Utils {
    public static final boolean DEBUG_BUILD = false;
    public static final boolean PRE_Q;

    public static boolean IsPowerOfTwo(long j) {
        return (j & (j - 1)) == 0;
    }

    public static float SignNonZern(float f) {
        return f < 0.0f ? -1.0f : 1.0f;
    }

    public static String getAppVersionName() {
        return BuildConfig.VERSION_NAME;
    }

    public static byte int0(int i) {
        return (byte) i;
    }

    public static byte int1(int i) {
        return (byte) (i >> 8);
    }

    public static byte int2(int i) {
        return (byte) (i >> 16);
    }

    public static byte int3(int i) {
        return (byte) (i >> 24);
    }

    static {
        PRE_Q = Build.VERSION.SDK_INT < 29;
    }

    public static <T> T disposeSafe(IDisposable iDisposable) {
        if (iDisposable != null) {
            iDisposable.dispose();
            return null;
        }
        return null;
    }

    public static long tickCount() {
        return SystemClock.uptimeMillis();
    }

    public static int ensureRange(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static float ensureRange(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int pow2roundup(int i, int i2) {
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

    public static void stringSplitInTwo(String str, int i, String[] strArr) {
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

    public static void stringSplitInTwo(String str, String str2, String[] strArr) {
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

    public static String stringSplitInTwoGetSecond(String str, int i, String str2) {
        int indexOf;
        return (str != null && (indexOf = str.indexOf(i)) >= 0) ? str.substring(indexOf + 1) : str2;
    }

    public static String strToStrSafe(String str, String str2) {
        return (str == null || str.length() < 1) ? str2 : str;
    }

    public static boolean strToBoolSafe(String str, boolean z) {
        return (str == null || str.length() < 1) ? z : str.charAt(0) == 't' || str.charAt(0) == 'T' || str.charAt(0) == '1';
    }

    public static long strToLongSafe(String str) {
        return strToLongSafe(str, 0L);
    }

    public static long strToLongSafe(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static int strToIntSafe(String str) {
        return strToIntSafe(str, 0);
    }

    public static int strToIntSafe(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static float strToFloatSafe(String str) {
        return strToFloatSafe(str, 0.0f);
    }

    public static float strToFloatSafe(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static String fixIncludedNullTerminatorString(String str) {
        int indexOf = str.indexOf(0);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public static boolean compareNullStrings(String str, String str2) {
        return (str == null && str2 == null) || (str != null && str.equals(str2));
    }

    public static <T> boolean compareNullEqual(T t, T t2) {
        return (t == null && t2 == null) || (t != null && t.equals(t2));
    }

    public static int StringToIndex(String[] strArr, String str) {
        return StringToIndex(strArr, str, -1);
    }

    public static int StringToIndex(String[] strArr, String str, int i) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals(str)) {
                return i2;
            }
        }
        return i;
    }

    public static String IndexToString(String[] strArr, int i, String str) {
        return (i < 0 || strArr.length <= i) ? str : strArr[i];
    }

    public static String getDurationStringHHMMSS(int i) {
        return getDurationStringHHMMSS(i, true);
    }

    public static String getDurationStringHMSS(int i) {
        return getDurationStringHMSS(i, true);
    }

    public static String getDurationStringHHMMSS(int i, boolean z) {
        int i2 = i / 3600;
        int i3 = (i % 3600) / 60;
        int i4 = i % 60;
        if (z && i2 == 0) {
            return twoDigitString(i3) + ":" + twoDigitString(i4);
        }
        return twoDigitString(i2) + ":" + twoDigitString(i3) + ":" + twoDigitString(i4);
    }

    public static String getDurationStringHMSS(int i, boolean z) {
        int i2 = i / 3600;
        int i3 = (i % 3600) / 60;
        int i4 = i % 60;
        if (z && i2 == 0) {
            return i3 + ":" + twoDigitString(i4);
        }
        return i2 + ":" + i3 + ":" + twoDigitString(i4);
    }

    private static String twoDigitString(int i) {
        if (i == 0) {
            return "00";
        }
        if (i / 10 == 0) {
            return "0" + i;
        }
        return String.valueOf(i);
    }

    public static void lerpHsla(float[] fArr, float[] fArr2, float[] fArr3, float f) {
        float f2 = 1.0f - f;
        fArr3[0] = (fArr[0] * f2) + (fArr2[0] * f);
        fArr3[1] = (fArr[1] * f2) + (fArr2[1] * f);
        fArr3[2] = (fArr[2] * f2) + (fArr2[2] * f);
        fArr3[3] = (fArr[3] * f2) + (fArr2[3] * f);
    }

    public static boolean IsOdd(int i) {
        return i % 2 != 0;
    }

    public static String intToHexString(int i) {
        return Integer.toHexString(i).toUpperCase();
    }

    public static String tryExtractPrettyNameFromUri(Uri uri) {
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

    public static void putFloatB(byte[] bArr, int i, float f) {
        putIntB(bArr, i, Float.floatToRawIntBits(f));
    }

    public static void putFloatL(byte[] bArr, int i, float f) {
        putIntL(bArr, i, Float.floatToRawIntBits(f));
    }

    public static void putIntB(byte[] bArr, int i, int i2) {
        bArr[i] = int3(i2);
        bArr[i + 1] = int2(i2);
        bArr[i + 2] = int1(i2);
        bArr[i + 3] = int0(i2);
    }

    public static void putIntL(byte[] bArr, int i, int i2) {
        bArr[i + 3] = int3(i2);
        bArr[i + 2] = int2(i2);
        bArr[i + 1] = int1(i2);
        bArr[i] = int0(i2);
    }

    public static String[] getListTupleObj1ToArray(List<Tuple2<String, String>> list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = list.get(i).obj1;
        }
        return strArr;
    }

    public static String[] getListTupleObj2ToArray(List<Tuple2<String, String>> list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = list.get(i).obj2;
        }
        return strArr;
    }
}
