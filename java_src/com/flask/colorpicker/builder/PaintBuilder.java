package com.flask.colorpicker.builder;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
/* loaded from: classes.dex */
public class PaintBuilder {
    public static PaintHolder newPaint() {
        return new PaintHolder();
    }

    /* loaded from: classes.dex */
    public static class PaintHolder {
        private Paint paint;

        private PaintHolder() {
            this.paint = new Paint(1);
        }

        public PaintHolder color(int i) {
            this.paint.setColor(i);
            return this;
        }

        public PaintHolder antiAlias(boolean z) {
            this.paint.setAntiAlias(z);
            return this;
        }

        public PaintHolder style(Paint.Style style) {
            this.paint.setStyle(style);
            return this;
        }

        public PaintHolder mode(PorterDuff.Mode mode) {
            this.paint.setXfermode(new PorterDuffXfermode(mode));
            return this;
        }

        public PaintHolder stroke(float f) {
            this.paint.setStrokeWidth(f);
            return this;
        }

        public PaintHolder xPerMode(PorterDuff.Mode mode) {
            this.paint.setXfermode(new PorterDuffXfermode(mode));
            return this;
        }

        public PaintHolder shader(Shader shader) {
            this.paint.setShader(shader);
            return this;
        }

        public Paint build() {
            return this.paint;
        }
    }

    public static Shader createAlphaPatternShader(int i) {
        return new BitmapShader(createAlphaBackgroundPattern(Math.max(8, (i / 2) * 2)), Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
    }

    private static Bitmap createAlphaBackgroundPattern(int i) {
        Paint build = newPaint().build();
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int round = Math.round(i / 2.0f);
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = 0;
            while (i3 < 2) {
                if ((i2 + i3) % 2 == 0) {
                    build.setColor(-1);
                } else {
                    build.setColor(-3092272);
                }
                int i4 = i3 + 1;
                canvas.drawRect(i2 * round, i3 * round, (i2 + 1) * round, i4 * round, build);
                i3 = i4;
            }
        }
        return createBitmap;
    }
}
