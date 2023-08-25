package com.daaw;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class u71 {
    public static final Pattern a = Pattern.compile("[\\s,]*");
    public static final RectF b = new RectF();
    public static final Matrix c = new Matrix();
    public static final Matrix d = new Matrix();

    public static float a(float f, float f2, float f3, float f4) {
        return ((float) Math.toDegrees(Math.atan2(f, f2) - Math.atan2(f3, f4))) % 360.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if ("lhvcsqta".indexOf(java.lang.Character.toLowerCase(r4)) >= 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0194 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Path b(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.u71.b(java.lang.String):android.graphics.Path");
    }

    public static void c(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
        if (f5 == 0.0f || f6 == 0.0f) {
            path.lineTo(f3, f4);
        } else if (f3 == f && f4 == f2) {
        } else {
            float abs = Math.abs(f5);
            float abs2 = Math.abs(f6);
            double d2 = (3.1415927f * f7) / 180.0f;
            float sin = (float) Math.sin(d2);
            float cos = (float) Math.cos(d2);
            float f8 = (f - f3) / 2.0f;
            float f9 = (f2 - f4) / 2.0f;
            float f10 = (cos * f8) + (sin * f9);
            float f11 = ((-sin) * f8) + (f9 * cos);
            float f12 = f10 * f10;
            float f13 = f11 * f11;
            float f14 = abs * abs;
            float f15 = abs2 * abs2;
            float f16 = ((f12 / f14) + (f13 / f15)) * 1.001f;
            if (f16 > 1.0f) {
                float sqrt = (float) Math.sqrt(f16);
                abs *= sqrt;
                abs2 *= sqrt;
                f14 = abs * abs;
                f15 = abs2 * abs2;
            }
            float f17 = f14 * f15;
            float f18 = f14 * f13;
            float f19 = f15 * f12;
            float sqrt2 = ((float) Math.sqrt(((f17 - f18) - f19) / (f18 + f19))) * (i == i2 ? -1 : 1);
            float f20 = ((sqrt2 * abs) * f11) / abs2;
            float f21 = (((-sqrt2) * abs2) * f10) / abs;
            float f22 = ((cos * f20) - (sin * f21)) + ((f + f3) / 2.0f);
            float f23 = (sin * f20) + (cos * f21) + ((f2 + f4) / 2.0f);
            float f24 = (f10 - f20) / abs;
            float f25 = (f11 - f21) / abs2;
            float a2 = a(1.0f, 0.0f, f24, f25);
            float a3 = a(f24, f25, ((-f10) - f20) / abs, ((-f11) - f21) / abs2);
            if (i2 == 0 && a3 > 0.0f) {
                a3 -= 360.0f;
            } else if (i2 != 0 && a3 < 0.0f) {
                a3 += 360.0f;
            }
            if (f7 % 360.0f == 0.0f) {
                RectF rectF = b;
                rectF.set(f22 - abs, f23 - abs2, f22 + abs, f23 + abs2);
                path.arcTo(rectF, a2, a3);
                return;
            }
            RectF rectF2 = b;
            rectF2.set(-abs, -abs2, abs, abs2);
            Matrix matrix = c;
            matrix.reset();
            matrix.postRotate(f7);
            matrix.postTranslate(f22, f23);
            Matrix matrix2 = d;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.arcTo(rectF2, a2, a3);
            path.transform(matrix);
        }
    }

    public static Path d(String str) {
        return b(str);
    }
}
