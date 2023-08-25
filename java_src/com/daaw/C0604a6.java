package com.daaw;

import java.util.Locale;
/* renamed from: com.daaw.a6 */
/* loaded from: classes.dex */
public class C0604a6 {
    /* renamed from: a */
    public static void m27601a(String str, float[] fArr, float[] fArr2) {
        if (str == null) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
        }
        try {
            int indexOf = str.indexOf(" ");
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(" ", i);
            int i2 = indexOf2 + 1;
            int indexOf3 = str.indexOf(" ", i2);
            if (indexOf >= 0 && indexOf2 >= 0 && indexOf3 >= 0) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(i, indexOf2);
                String substring3 = str.substring(i2, indexOf3);
                String substring4 = str.substring(indexOf3 + 1);
                fArr[0] = Float.parseFloat(substring);
                fArr[1] = Float.parseFloat(substring2);
                fArr[2] = Float.parseFloat(substring3);
                fArr[3] = Float.parseFloat(substring4);
            }
        } catch (NumberFormatException unused) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
        }
    }

    /* renamed from: b */
    public static String m27600b(float[] fArr) {
        return String.format(Locale.US, "%f %f %f %f", Float.valueOf(fArr[0]), Float.valueOf(fArr[1]), Float.valueOf(fArr[2]), Float.valueOf(fArr[3]));
    }
}
