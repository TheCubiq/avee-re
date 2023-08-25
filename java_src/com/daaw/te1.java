package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.SparseArray;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class te1 {
    public static Bitmap i = Bitmap.createBitmap(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV, NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV, Bitmap.Config.ARGB_8888);
    public static final char[] j = {61451, 7838};
    public final ve[] a;
    public vr1 b;
    public z6 c;
    public SparseArray<a> d;
    public bs1 e;
    public int f;
    public int g;
    public boolean h;

    /* loaded from: classes.dex */
    public class a {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;

        public a() {
        }
    }

    public te1(Typeface typeface, int i2, ve... veVarArr) {
        this.h = true;
        this.a = veVarArr;
        try {
            e(typeface, i2);
        } catch (Exception e) {
            lz1.b(e, "failed to create SpriteFont");
            this.h = false;
        }
        if (f()) {
            return;
        }
        try {
            e(typeface, i2 / 2);
        } catch (Exception e2) {
            lz1.b(e2, "failed to create SpriteFont");
            this.h = false;
        }
        if (f()) {
            return;
        }
        lz1.c("failed to create SpriteFont");
    }

    public static int g(int i2) {
        return br1.s(i2, 4096);
    }

    public void a() {
        this.c.a();
    }

    public float b() {
        return this.f;
    }

    public qc0 c() {
        return this.c;
    }

    public a d(char c) {
        SparseArray<a> sparseArray = this.d;
        return sparseArray.get(c, sparseArray.valueAt(0));
    }

    public final void e(Typeface typeface, int i2) {
        ve[] veVarArr;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int length = j.length;
        for (ve veVar : this.a) {
            length += veVar.a();
        }
        char[] cArr = new char[length];
        int i7 = 0;
        for (ve veVar2 : this.a) {
            for (int i8 = 0; i8 < veVar2.c; i8++) {
                cArr[i7] = veVar2.m(i8);
                i7++;
            }
        }
        char[] cArr2 = j;
        int length2 = cArr2.length;
        int i9 = 0;
        while (true) {
            i3 = 1;
            if (i9 >= length2) {
                break;
            }
            cArr[i7] = cArr2[i9];
            i7++;
            i9++;
        }
        this.h = true;
        Paint paint = new Paint();
        paint.setTypeface(typeface);
        paint.setTextSize(i2);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setTextAlign(Paint.Align.LEFT);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i10 = fontMetricsInt.top;
        int i11 = fontMetricsInt.ascent;
        int i12 = fontMetricsInt.descent;
        int i13 = fontMetricsInt.bottom;
        this.g = i13 - i10;
        this.f = i12 - i11;
        this.d = new SparseArray<>(length);
        int ceil = ((int) Math.ceil(Math.sqrt(length))) * (this.g + 1);
        int g = g(ceil);
        int g2 = g(ceil);
        Bitmap bitmap = null;
        try {
            int g3 = g(g);
            int g4 = g(g2);
            lz1.c("Creating bitmap atlas for fonts, W:" + g3 + " H: " + g4);
            if (g4 > 1024 || g3 > 1024) {
                bitmap = Bitmap.createBitmap(g3, g4, Bitmap.Config.ARGB_8888);
            } else {
                bitmap = i;
                bitmap.eraseColor(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        Bitmap bitmap2 = bitmap;
        if (bitmap2 == null) {
            this.h = false;
            lz1.c("failed to create bitmap W:" + g(g) + " H: " + g(g2));
            return;
        }
        Canvas canvas = new Canvas(bitmap2);
        float[] fArr = new float[length];
        if (paint.getTextWidths(cArr, 0, length, fArr) < length) {
            lz1.c("widthsReturned < charWidths.length");
        }
        int abs = Math.abs(i10);
        canvas.drawColor(0);
        int i14 = 0;
        int i15 = 0;
        while (i15 < length) {
            a aVar = new a();
            char[] cArr3 = new char[i3];
            cArr3[i6] = cArr[i15];
            float f = fArr[i15];
            Rect rect = new Rect();
            paint.getTextBounds(cArr3, i6, i3, rect);
            if (i14 + rect.width() >= bitmap2.getWidth()) {
                i4 = abs + this.g;
                i5 = 0;
            } else {
                i4 = abs;
                i5 = i14;
            }
            int i16 = i15;
            int i17 = i13;
            canvas.drawText(cArr3, 0, 1, i5 - rect.left, i4, paint);
            aVar.a = i5;
            aVar.b = i4 - Math.abs(i10);
            aVar.c = rect.width();
            aVar.d = this.g;
            aVar.e = rect.left;
            aVar.f = i17;
            aVar.g = f;
            aVar.h = this.f;
            this.d.append(cArr[i16], aVar);
            i14 = i5 + rect.width() + 2;
            i15 = i16 + 1;
            abs = i4;
            i13 = i17;
            i6 = 0;
            i3 = 1;
        }
        int i18 = i13;
        if (abs != 0) {
            i14 = bitmap2.getWidth();
        }
        int g5 = g(i14);
        int g6 = g(abs + Math.abs(i18) + 1);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, g5, g6);
        this.e = new bs1(g5, g6);
        this.b = new vr1(createBitmap, 9729, 9729, 10497, false);
        this.c = new z6(this.b, true);
        if (createBitmap != bitmap2) {
            createBitmap.recycle();
        }
        if (i != bitmap2) {
            bitmap2.recycle();
        }
    }

    public boolean f() {
        return this.h;
    }

    public bs1 h() {
        return this.e;
    }
}
