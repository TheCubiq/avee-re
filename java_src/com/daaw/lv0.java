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

    /* loaded from: classes.dex */
    public static class b {
        public Paint a;

        public b() {
            this.a = new Paint(1);
        }

        public Paint a() {
            return this.a;
        }

        public b b(int i) {
            this.a.setColor(i);
            return this;
        }

        public b c(Shader shader) {
            this.a.setShader(shader);
            return this;
        }

        public b d(float f) {
            this.a.setStrokeWidth(f);
            return this;
        }

        public b e(Paint.Style style) {
            this.a.setStyle(style);
            return this;
        }

        public b f(PorterDuff.Mode mode) {
            this.a.setXfermode(new PorterDuffXfermode(mode));
            return this;
        }
    }

    public static Bitmap a(int i) {
        Paint a2 = c().a();
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int round = Math.round(i / 2.0f);
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = 0;
            while (i3 < 2) {
                a2.setColor((i2 + i3) % 2 == 0 ? -1 : -3092272);
                int i4 = i3 + 1;
                canvas.drawRect(i2 * round, i3 * round, (i2 + 1) * round, i4 * round, a2);
                i3 = i4;
            }
        }
        return createBitmap;
    }

    public static Shader b(int i) {
        Bitmap a2 = a(Math.max(8, (i / 2) * 2));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        return new BitmapShader(a2, tileMode, tileMode);
    }

    public static b c() {
        return new b();
    }
}
