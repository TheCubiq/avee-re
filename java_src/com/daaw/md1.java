package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class md1 {

    /* renamed from: a */
    public static ThreadLocal f18803a = new ThreadLocal();

    /* renamed from: a */
    public static Bitmap m16085a(int i, int i2, int i3, int i4, Bitmap bitmap) {
        Bitmap createBitmap;
        int i5 = !br1.m25907b(i) ? i + 1 : i;
        int i6 = !br1.m25907b(i2) ? i2 + 1 : i2;
        if (bitmap != null && bitmap.getWidth() == i5 && bitmap.getHeight() == i6) {
            createBitmap = bitmap;
        } else {
            if (bitmap != null) {
                bitmap.recycle();
            }
            createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
        }
        byte[] bArr = new byte[i5 * i6 * 4];
        int i7 = i5 / 2;
        int i8 = i6 / 2;
        float m25851l = bs1.m25851l(i7, i8);
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        f80.m22857q(fArr, i3);
        f80.m22857q(fArr2, i4);
        float[] fArr3 = {0.0f, fArr[1], fArr[2], fArr[3]};
        for (int i9 = 0; i9 < i6; i9++) {
            for (int i10 = 0; i10 < i5; i10++) {
                float min = Math.min(1.0f, bs1.m25851l(i7 - i10, i8 - i9) / m25851l);
                float f = min * min;
                float f2 = 1.0f - f;
                if (Math.abs(fArr[0] - fArr2[0]) > 180.0f) {
                    if (fArr[0] < 180.0f) {
                        fArr[0] = fArr[0] + 360.0f;
                    }
                    fArr2[0] = fArr2[0] + 360.0f;
                }
                fArr3[0] = (fArr[0] * f2) + (fArr2[0] * f);
                createBitmap.setPixel(i10, i9, f80.m22861m(fArr3));
            }
        }
        return createBitmap;
    }

    /* renamed from: b */
    public static void m16084b(Paint paint, float f, float f2, String str, int i) {
        paint.setTextSize(48.0f);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        paint.setTextSize(Math.min((f * 48.0f) / rect.width(), (f2 * 48.0f) / (rect.height() * i)));
    }

    /* renamed from: c */
    public static Bitmap m16083c(int i, int i2, String str, int i3, int i4, int i5, Drawable drawable) {
        return m16082d(Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888), i, i2, str, i3, i4, i5, drawable, null);
    }

    /* renamed from: d */
    public static Bitmap m16082d(Bitmap bitmap, int i, int i2, String str, int i3, int i4, int i5, Drawable drawable, Bitmap bitmap2) {
        ArrayList<String> arrayList = new ArrayList();
        String[] split = str.split("\\s+");
        int i6 = 0;
        int i7 = 0;
        while (i6 < split.length) {
            int length = split[i6].length();
            String str2 = split[i6];
            i6++;
            if (i6 < split.length && split[i6].length() == 1) {
                length += 2;
                String str3 = split[i6];
            }
            if (length > i7) {
                i7 = length;
            }
        }
        String str4 = "";
        arrayList.add("");
        int i8 = 0;
        for (String str5 : split) {
            int length2 = str5.length();
            if (length2 > 0) {
                int i9 = i8 + length2;
                if (i9 > i7) {
                    arrayList.add(str5);
                    i8 = length2;
                } else if (i8 > 0) {
                    arrayList.set(arrayList.size() - 1, ((String) arrayList.get(arrayList.size() - 1)) + " " + str5);
                    i8 += length2 + 1;
                } else {
                    arrayList.set(arrayList.size() - 1, str5);
                    i8 = i9;
                }
            }
        }
        int i10 = 0;
        for (String str6 : arrayList) {
            int length3 = str6.length();
            if (length3 > i10) {
                str4 = str6;
                i10 = length3;
            }
        }
        Paint paint = new Paint();
        paint.setColor(i3);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        int min = Math.min(i, i2);
        float f = min - (min / 11);
        m16084b(paint, (1.0f - Math.max(0.0f, Math.min((arrayList.size() - 1) * 0.04f, 0.4f))) * f, f * 0.9f, str4, arrayList.size());
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Bitmap m16085a = m16085a(i / 8, i2 / 8, i4, i5, (Bitmap) f18803a.get());
        if (m16085a != null) {
            Paint paint2 = new Paint();
            paint2.setAlpha(Color.alpha(i4));
            paint2.setAntiAlias(true);
            paint2.setFilterBitmap(true);
            canvas.drawBitmap(m16085a, (Rect) null, new RectF(0.0f, 0.0f, i, i2), paint2);
        }
        f18803a.set(m16085a);
        float f2 = paint.getFontMetrics().leading;
        float f3 = -(paint.descent() + paint.ascent());
        float f4 = i * 0.5f;
        float f5 = (i2 * 0.5f) + ((-((arrayList.size() * f3) + (arrayList.size() - (f2 * 1.0f)))) * 0.5f) + (1.0f * f3);
        for (String str7 : arrayList) {
            canvas.drawText(str7, f4, f5, paint);
            f5 += f3 + f2;
        }
        return bitmap;
    }

    /* renamed from: e */
    public static float m16081e(char c) {
        char upperCase = Character.toUpperCase(c);
        if ((upperCase >= 'A') && (upperCase <= 'Z')) {
            return (upperCase - 'A') / 26.0f;
        }
        return 0.5f;
    }
}
