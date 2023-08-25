package com.daaw;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
/* loaded from: classes.dex */
public class lv0 {

    /* renamed from: com.daaw.lv0$b */
    /* loaded from: classes.dex */
    public static class C2123b {

        /* renamed from: a */
        public Paint f17812a;

        public C2123b() {
            this.f17812a = new Paint(1);
        }

        /* renamed from: a */
        public Paint m16489a() {
            return this.f17812a;
        }

        /* renamed from: b */
        public C2123b m16488b(int i) {
            this.f17812a.setColor(i);
            return this;
        }

        /* renamed from: c */
        public C2123b m16487c(Shader shader) {
            this.f17812a.setShader(shader);
            return this;
        }

        /* renamed from: d */
        public C2123b m16486d(float f) {
            this.f17812a.setStrokeWidth(f);
            return this;
        }

        /* renamed from: e */
        public C2123b m16485e(Paint.Style style) {
            this.f17812a.setStyle(style);
            return this;
        }

        /* renamed from: f */
        public C2123b m16484f(PorterDuff.Mode mode) {
            this.f17812a.setXfermode(new PorterDuffXfermode(mode));
            return this;
        }
    }

    /* renamed from: a */
    public static Bitmap m16492a(int i) {
        Paint m16489a = m16490c().m16489a();
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int round = Math.round(i / 2.0f);
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = 0;
            while (i3 < 2) {
                m16489a.setColor((i2 + i3) % 2 == 0 ? -1 : -3092272);
                int i4 = i3 + 1;
                canvas.drawRect(i2 * round, i3 * round, (i2 + 1) * round, i4 * round, m16489a);
                i3 = i4;
            }
        }
        return createBitmap;
    }

    /* renamed from: b */
    public static Shader m16491b(int i) {
        Bitmap m16492a = m16492a(Math.max(8, (i / 2) * 2));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        return new BitmapShader(m16492a, tileMode, tileMode);
    }

    /* renamed from: c */
    public static C2123b m16490c() {
        return new C2123b();
    }
}
