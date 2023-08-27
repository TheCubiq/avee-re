package com.daaw.avee.comp.AlbumArt;

import android.graphics.Bitmap;
import com.daaw.avee.Common.Ref;
import com.daaw.avee.comp.Visualizer.Graphic.GraphicsUtils;
/* loaded from: classes.dex */
public class ColorKey {
    static int XYtoI(int i, int i2, int i3) {
        return i + (i2 * i3);
    }

    static int ItoX(int i, int i2) {
        return i % i2;
    }

    static int ItoY(int i, int i2) {
        return i / i2;
    }

    static int compareColorRGB(int[] iArr, int[] iArr2) {
        return Math.max(Math.max(Math.abs(iArr[0] - iArr2[0]), Math.abs(iArr[1] - iArr2[1])), Math.abs(iArr[2] - iArr2[2]));
    }

    static int pickBgColor(int[] iArr) {
        int[] iArr2 = new int[4];
        int[] iArr3 = {0, 0, 0, 0};
        for (int i : iArr) {
            GraphicsUtils.intColorToInt4Color(iArr2, 0, i);
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
            GraphicsUtils.intColorToInt4Color(iArr2, 0, i4);
            int compareColorRGB = compareColorRGB(iArr2, iArr3);
            if (compareColorRGB < i3) {
                i2 = i4;
                i3 = compareColorRGB;
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, int[]] */
    /* JADX WARN: Type inference failed for: r0v57, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.graphics.Bitmap] */
    public static Bitmap processBitmapColorKey(Bitmap bitmap, ImageColorKeyParams imageColorKeyParams, Ref<Bitmap> ref, Ref<int[]> ref2) {
        int i;
        float min;
        if (imageColorKeyParams == null) {
            return bitmap;
        }
        int width = bitmap.getWidth() * bitmap.getHeight();
        if (ref2.obj == null || ref2.obj.length < width) {
            try {
                ref2.obj = new int[width];
            } catch (Exception unused) {
                return bitmap;
            }
        }
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            if (ref.obj == null || ref.obj.getWidth() != bitmap.getWidth() || ref.obj.getHeight() != bitmap.getHeight()) {
                if (ref.obj != null) {
                    ref.obj.recycle();
                }
                ref.obj = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            }
            bitmap.getPixels(ref2.obj, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else {
            try {
                ref.obj = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                ref.obj.getPixels(ref2.obj, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        int i2 = imageColorKeyParams.colorKey;
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        if (imageColorKeyParams.autoDetect) {
            int width2 = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i3 = width2 - 1;
            int i4 = height - 1;
            int i5 = width2 / 2;
            int i6 = height / 2;
            i = 0;
            i2 = pickBgColor(new int[]{ref2.obj[XYtoI(0, 0, width2)], ref2.obj[XYtoI(i3, 0, width2)], ref2.obj[XYtoI(i3, i4, width2)], ref2.obj[XYtoI(0, i4, width2)], ref2.obj[XYtoI(i5, 0, width2)], ref2.obj[XYtoI(i3, i6, width2)], ref2.obj[XYtoI(i5, i4, width2)], ref2.obj[XYtoI(0, i6, width2)]});
        } else {
            i = 0;
        }
        GraphicsUtils.intColorToHlsa1(fArr, i2);
        GraphicsUtils.intColorToInt4Color(iArr, i, i2);
        iArr2[i] = 128 - iArr[i];
        iArr2[1] = 128 - iArr[1];
        iArr2[2] = 128 - iArr[2];
        iArr2[3] = 255 - iArr[3];
        int i7 = 0;
        while (i7 < width) {
            int i8 = ref2.obj[i7];
            GraphicsUtils.intColorToInt4Color(iArr3, 0, i8);
            GraphicsUtils.intColorToHlsa1(fArr2, i8);
            float min2 = Math.min(Math.abs(fArr2[0] - fArr[0]) * 5.0f, 1.0f);
            Math.min(Math.abs(fArr2[1] - fArr[1]) * 1.0f, 1.0f);
            float min3 = 1.0f - Math.min(1.0f, (((int) (Math.max(Math.min(Math.abs(fArr2[2] - fArr[2]) * 2.0f, 1.0f), min2) * 255.0f)) / 255.0f) * 1.0f);
            int[] iArr4 = iArr2;
            float pow = 1.0f - ((float) Math.pow(1.0f - ((float) Math.pow(min, imageColorKeyParams.transparencyStrength * 2.0f)), imageColorKeyParams.opacityStrength * 2.0f));
            iArr3[0] = iArr3[0] + ((int) (iArr4[0] * min3));
            iArr3[1] = iArr3[1] + ((int) (iArr4[1] * min3));
            iArr3[2] = iArr3[2] + ((int) (iArr4[2] * min3));
            iArr3[3] = (int) (255.0f * pow);
            iArr3[0] = (int) (iArr3[0] * pow);
            iArr3[1] = (int) (iArr3[1] * pow);
            iArr3[2] = (int) (iArr3[2] * pow);
            if (iArr3[0] < 0) {
                iArr3[0] = 0;
            }
            if (iArr3[1] < 0) {
                iArr3[1] = 0;
            }
            if (iArr3[2] < 0) {
                iArr3[2] = 0;
            }
            if (iArr3[3] < 0) {
                iArr3[3] = 0;
            }
            if (iArr3[0] > 255) {
                iArr3[0] = 255;
            }
            if (iArr3[1] > 255) {
                iArr3[1] = 255;
            }
            if (iArr3[2] > 255) {
                iArr3[2] = 255;
            }
            if (iArr3[3] > 255) {
                iArr3[3] = 255;
            }
            ref2.obj[i7] = GraphicsUtils.Int4ColorToIntColor(iArr3);
            i7++;
            iArr2 = iArr4;
        }
        ref.obj.setPixels(ref2.obj, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return ref.obj;
    }
}
