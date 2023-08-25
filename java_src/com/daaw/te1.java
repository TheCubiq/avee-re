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

    /* renamed from: i */
    public static Bitmap f27556i = Bitmap.createBitmap(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV, NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV, Bitmap.Config.ARGB_8888);

    /* renamed from: j */
    public static final char[] f27557j = {61451, 7838};

    /* renamed from: a */
    public final C3325ve[] f27558a;

    /* renamed from: b */
    public vr1 f27559b;

    /* renamed from: c */
    public C3812z6 f27560c;

    /* renamed from: d */
    public SparseArray<C3071a> f27561d;

    /* renamed from: e */
    public bs1 f27562e;

    /* renamed from: f */
    public int f27563f;

    /* renamed from: g */
    public int f27564g;

    /* renamed from: h */
    public boolean f27565h;

    /* renamed from: com.daaw.te1$a */
    /* loaded from: classes.dex */
    public class C3071a {

        /* renamed from: a */
        public float f27566a;

        /* renamed from: b */
        public float f27567b;

        /* renamed from: c */
        public float f27568c;

        /* renamed from: d */
        public float f27569d;

        /* renamed from: e */
        public float f27570e;

        /* renamed from: f */
        public float f27571f;

        /* renamed from: g */
        public float f27572g;

        /* renamed from: h */
        public float f27573h;

        public C3071a() {
        }
    }

    public te1(Typeface typeface, int i, C3325ve... c3325veArr) {
        this.f27565h = true;
        this.f27558a = c3325veArr;
        try {
            m9228e(typeface, i);
        } catch (Exception e) {
            lz1.m16364b(e, "failed to create SpriteFont");
            this.f27565h = false;
        }
        if (m9227f()) {
            return;
        }
        try {
            m9228e(typeface, i / 2);
        } catch (Exception e2) {
            lz1.m16364b(e2, "failed to create SpriteFont");
            this.f27565h = false;
        }
        if (m9227f()) {
            return;
        }
        lz1.m16363c("failed to create SpriteFont");
    }

    /* renamed from: g */
    public static int m9226g(int i) {
        return br1.m25890s(i, 4096);
    }

    /* renamed from: a */
    public void m9232a() {
        this.f27560c.mo2801a();
    }

    /* renamed from: b */
    public float m9231b() {
        return this.f27563f;
    }

    /* renamed from: c */
    public qc0 m9230c() {
        return this.f27560c;
    }

    /* renamed from: d */
    public C3071a m9229d(char c) {
        SparseArray<C3071a> sparseArray = this.f27561d;
        return sparseArray.get(c, sparseArray.valueAt(0));
    }

    /* renamed from: e */
    public final void m9228e(Typeface typeface, int i) {
        C3325ve[] c3325veArr;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int length = f27557j.length;
        for (C3325ve c3325ve : this.f27558a) {
            length += c3325ve.m7238a();
        }
        char[] cArr = new char[length];
        int i6 = 0;
        for (C3325ve c3325ve2 : this.f27558a) {
            for (int i7 = 0; i7 < c3325ve2.f30167c; i7++) {
                cArr[i6] = c3325ve2.m7226m(i7);
                i6++;
            }
        }
        char[] cArr2 = f27557j;
        int length2 = cArr2.length;
        int i8 = 0;
        while (true) {
            i2 = 1;
            if (i8 >= length2) {
                break;
            }
            cArr[i6] = cArr2[i8];
            i6++;
            i8++;
        }
        this.f27565h = true;
        Paint paint = new Paint();
        paint.setTypeface(typeface);
        paint.setTextSize(i);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setTextAlign(Paint.Align.LEFT);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i9 = fontMetricsInt.top;
        int i10 = fontMetricsInt.ascent;
        int i11 = fontMetricsInt.descent;
        int i12 = fontMetricsInt.bottom;
        this.f27564g = i12 - i9;
        this.f27563f = i11 - i10;
        this.f27561d = new SparseArray<>(length);
        int ceil = ((int) Math.ceil(Math.sqrt(length))) * (this.f27564g + 1);
        int m9226g = m9226g(ceil);
        int m9226g2 = m9226g(ceil);
        Bitmap bitmap = null;
        try {
            int m9226g3 = m9226g(m9226g);
            int m9226g4 = m9226g(m9226g2);
            lz1.m16363c("Creating bitmap atlas for fonts, W:" + m9226g3 + " H: " + m9226g4);
            if (m9226g4 > 1024 || m9226g3 > 1024) {
                bitmap = Bitmap.createBitmap(m9226g3, m9226g4, Bitmap.Config.ARGB_8888);
            } else {
                bitmap = f27556i;
                bitmap.eraseColor(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        Bitmap bitmap2 = bitmap;
        if (bitmap2 == null) {
            this.f27565h = false;
            lz1.m16363c("failed to create bitmap W:" + m9226g(m9226g) + " H: " + m9226g(m9226g2));
            return;
        }
        Canvas canvas = new Canvas(bitmap2);
        float[] fArr = new float[length];
        if (paint.getTextWidths(cArr, 0, length, fArr) < length) {
            lz1.m16363c("widthsReturned < charWidths.length");
        }
        int abs = Math.abs(i9);
        canvas.drawColor(0);
        int i13 = 0;
        int i14 = 0;
        while (i14 < length) {
            C3071a c3071a = new C3071a();
            char[] cArr3 = new char[i2];
            cArr3[i5] = cArr[i14];
            float f = fArr[i14];
            Rect rect = new Rect();
            paint.getTextBounds(cArr3, i5, i2, rect);
            if (i13 + rect.width() >= bitmap2.getWidth()) {
                i3 = abs + this.f27564g;
                i4 = 0;
            } else {
                i3 = abs;
                i4 = i13;
            }
            int i15 = i14;
            int i16 = i12;
            canvas.drawText(cArr3, 0, 1, i4 - rect.left, i3, paint);
            c3071a.f27566a = i4;
            c3071a.f27567b = i3 - Math.abs(i9);
            c3071a.f27568c = rect.width();
            c3071a.f27569d = this.f27564g;
            c3071a.f27570e = rect.left;
            c3071a.f27571f = i16;
            c3071a.f27572g = f;
            c3071a.f27573h = this.f27563f;
            this.f27561d.append(cArr[i15], c3071a);
            i13 = i4 + rect.width() + 2;
            i14 = i15 + 1;
            abs = i3;
            i12 = i16;
            i5 = 0;
            i2 = 1;
        }
        int i17 = i12;
        if (abs != 0) {
            i13 = bitmap2.getWidth();
        }
        int m9226g5 = m9226g(i13);
        int m9226g6 = m9226g(abs + Math.abs(i17) + 1);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, m9226g5, m9226g6);
        this.f27562e = new bs1(m9226g5, m9226g6);
        this.f27559b = new vr1(createBitmap, 9729, 9729, 10497, false);
        this.f27560c = new C3812z6(this.f27559b, true);
        if (createBitmap != bitmap2) {
            createBitmap.recycle();
        }
        if (f27556i != bitmap2) {
            bitmap2.recycle();
        }
    }

    /* renamed from: f */
    public boolean m9227f() {
        return this.f27565h;
    }

    /* renamed from: h */
    public bs1 m9225h() {
        return this.f27562e;
    }
}
