package com.daaw;

import android.graphics.Bitmap;
/* renamed from: com.daaw.vg */
/* loaded from: classes.dex */
public class C3328vg {
    /* renamed from: a */
    public static int m7195a(int i, int i2, int i3) {
        return i + (i2 * i3);
    }

    /* renamed from: b */
    public static int m7194b(int[] iArr, int[] iArr2) {
        return Math.max(Math.max(Math.abs(iArr[0] - iArr2[0]), Math.abs(iArr[1] - iArr2[1])), Math.abs(iArr[2] - iArr2[2]));
    }

    /* renamed from: c */
    public static int m7193c(int[] iArr) {
        int[] iArr2 = new int[4];
        int[] iArr3 = {0, 0, 0, 0};
        for (int i : iArr) {
            f80.m22856r(iArr2, 0, i);
            iArr3[0] = iArr3[0] + iArr2[0];
            iArr3[1] = iArr3[1] + iArr2[1];
            iArr3[2] = iArr3[2] + iArr2[2];
            iArr3[3] = iArr3[3] + iArr2[3];
        }
        iArr3[0] = iArr3[0] / iArr.length;
        iArr3[1] = iArr3[1] / iArr.length;
        iArr3[2] = iArr3[2] / iArr.length;
        iArr3[3] = iArr3[3] / iArr.length;
        int i2 = -16711936;
        int i3 = 999999;
        for (int i4 : iArr) {
            f80.m22856r(iArr2, 0, i4);
            int m7194b = m7194b(iArr2, iArr3);
            if (m7194b < i3) {
                i2 = i4;
                i3 = m7194b;
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], T] */
    /* JADX WARN: Type inference failed for: r0v56, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, android.graphics.Bitmap] */
    /* renamed from: d */
    public static Bitmap m7192d(Bitmap bitmap, ye0 ye0Var, l31<Bitmap> l31Var, l31<int[]> l31Var2) {
        int i;
        float min;
        if (ye0Var == null) {
            return bitmap;
        }
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = l31Var2.f16995a;
        if (iArr == null || iArr.length < width) {
            try {
                l31Var2.f16995a = new int[width];
            } catch (Exception unused) {
                return bitmap;
            }
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config == config2) {
            Bitmap bitmap2 = l31Var.f16995a;
            if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || l31Var.f16995a.getHeight() != bitmap.getHeight()) {
                Bitmap bitmap3 = l31Var.f16995a;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                }
                l31Var.f16995a = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            }
            bitmap.getPixels(l31Var2.f16995a, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else {
            try {
                l31Var.f16995a = bitmap.copy(config2, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                l31Var.f16995a.getPixels(l31Var2.f16995a, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        int i2 = ye0Var.f33564a;
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        if (ye0Var.f33565b) {
            int width2 = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i3 = width2 - 1;
            int i4 = height - 1;
            int i5 = width2 / 2;
            int i6 = height / 2;
            i = 0;
            i2 = m7193c(new int[]{l31Var2.f16995a[m7195a(0, 0, width2)], l31Var2.f16995a[m7195a(i3, 0, width2)], l31Var2.f16995a[m7195a(i3, i4, width2)], l31Var2.f16995a[m7195a(0, i4, width2)], l31Var2.f16995a[m7195a(i5, 0, width2)], l31Var2.f16995a[m7195a(i3, i6, width2)], l31Var2.f16995a[m7195a(i5, i4, width2)], l31Var2.f16995a[m7195a(0, i6, width2)]});
        } else {
            i = 0;
        }
        f80.m22858p(fArr, i2);
        f80.m22856r(iArr2, i, i2);
        iArr3[i] = 128 - iArr2[i];
        iArr3[1] = 128 - iArr2[1];
        iArr3[2] = 128 - iArr2[2];
        iArr3[3] = 255 - iArr2[3];
        int i7 = 0;
        while (i7 < width) {
            int i8 = l31Var2.f16995a[i7];
            f80.m22856r(iArr4, 0, i8);
            f80.m22858p(fArr2, i8);
            float min2 = Math.min(Math.abs(fArr2[0] - fArr[0]) * 5.0f, 1.0f);
            Math.min(Math.abs(fArr2[1] - fArr[1]) * 1.0f, 1.0f);
            float min3 = 1.0f - Math.min(1.0f, (((int) (Math.max(Math.min(Math.abs(fArr2[2] - fArr[2]) * 2.0f, 1.0f), min2) * 255.0f)) / 255.0f) * 1.0f);
            int[] iArr5 = iArr3;
            float pow = 1.0f - ((float) Math.pow(1.0f - ((float) Math.pow(min, ye0Var.f33566c * 2.0f)), ye0Var.f33567d * 2.0f));
            iArr4[0] = iArr4[0] + ((int) (iArr5[0] * min3));
            iArr4[1] = iArr4[1] + ((int) (iArr5[1] * min3));
            iArr4[2] = iArr4[2] + ((int) (iArr5[2] * min3));
            iArr4[3] = (int) (255.0f * pow);
            iArr4[0] = (int) (iArr4[0] * pow);
            iArr4[1] = (int) (iArr4[1] * pow);
            iArr4[2] = (int) (iArr4[2] * pow);
            if (iArr4[0] < 0) {
                iArr4[0] = 0;
            }
            if (iArr4[1] < 0) {
                iArr4[1] = 0;
            }
            if (iArr4[2] < 0) {
                iArr4[2] = 0;
            }
            if (iArr4[3] < 0) {
                iArr4[3] = 0;
            }
            if (iArr4[0] > 255) {
                iArr4[0] = 255;
            }
            if (iArr4[1] > 255) {
                iArr4[1] = 255;
            }
            if (iArr4[2] > 255) {
                iArr4[2] = 255;
            }
            if (iArr4[3] > 255) {
                iArr4[3] = 255;
            }
            l31Var2.f16995a[i7] = f80.m22873a(iArr4);
            i7++;
            iArr3 = iArr5;
        }
        l31Var.f16995a.setPixels(l31Var2.f16995a, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return l31Var.f16995a;
    }
}
