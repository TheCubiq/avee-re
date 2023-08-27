package com.daaw.avee.comp.Visualizer.Graphic;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.Vec2i;
import com.daaw.avee.Common.tlog;
import mdesl.graphics.ITexture;
/* loaded from: classes.dex */
public class SpriteFont {
    private static Bitmap tmpBitmap1024 = Bitmap.createBitmap(1024, 1024, Bitmap.Config.ARGB_8888);
    private AtlasTexture atlasTexture;
    private CharSet charSet;
    private int fontMetricHeight;
    private int fontMetricMaxHeight;
    private Glyph[] glyphs;
    private VTexture texture;
    private Vec2f textureDim;
    private boolean valid;

    public SpriteFont(Typeface typeface, int i, CharSet charSet) {
        this.valid = true;
        this.charSet = charSet;
        try {
            init(typeface, i);
        } catch (Exception e) {
            tlog.e(e, "failed to create SpriteFont");
            this.valid = false;
        }
        if (isValid()) {
            return;
        }
        try {
            init(typeface, i / 2);
        } catch (Exception e2) {
            tlog.e(e2, "failed to create SpriteFont");
            this.valid = false;
        }
        if (isValid()) {
            return;
        }
        tlog.w("failed to create SpriteFont");
    }

    public SpriteFont(String str, int i, Rect[] rectArr, CharSet charSet) {
        this.valid = true;
        this.charSet = charSet;
        this.fontMetricHeight = i;
        this.glyphs = new Glyph[charSet.count()];
        for (int i2 = 0; i2 < this.charSet.count(); i2++) {
            this.glyphs[i2].x = rectArr[i2].left;
            this.glyphs[i2].y = rectArr[i2].top;
            this.glyphs[i2].width = rectArr[i2].width();
            float f = i;
            this.glyphs[i2].height = f;
            this.glyphs[i2].spaceWidth = rectArr[i2].width();
            this.glyphs[i2].spaceHeight = f;
        }
        this.texture = new VTexture(str, 9729, 9729, 10497, false);
        this.atlasTexture = new AtlasTexture(this.texture, true);
        this.textureDim = new Vec2f(this.texture.getWidth(), this.texture.getHeight());
    }

    private void init(Typeface typeface, int i) {
        int i2;
        int i3;
        int i4 = 1;
        this.valid = true;
        Paint paint = new Paint();
        paint.setTypeface(typeface);
        paint.setTextSize(i);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setTextAlign(Paint.Align.LEFT);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i5 = fontMetricsInt.top;
        int i6 = fontMetricsInt.ascent;
        int i7 = fontMetricsInt.descent;
        int i8 = fontMetricsInt.bottom;
        int i9 = fontMetricsInt.leading;
        this.fontMetricMaxHeight = i8 - i5;
        this.fontMetricHeight = i7 - i6;
        this.glyphs = new Glyph[this.charSet.count()];
        int ceil = ((int) Math.ceil(Math.sqrt(this.charSet.count()))) * (this.fontMetricMaxHeight + 1);
        int pow2roundup = pow2roundup(ceil);
        int pow2roundup2 = pow2roundup(ceil);
        int i10 = 0;
        Bitmap bitmap = null;
        try {
            int pow2roundup3 = pow2roundup(pow2roundup);
            int pow2roundup4 = pow2roundup(pow2roundup2);
            tlog.w("Creating bitmap atlas for fonts, W:" + pow2roundup3 + " H: " + pow2roundup4);
            if (pow2roundup4 <= 1024 && pow2roundup3 <= 1024) {
                bitmap = tmpBitmap1024;
                tmpBitmap1024.eraseColor(0);
            } else {
                bitmap = Bitmap.createBitmap(pow2roundup3, pow2roundup4, Bitmap.Config.ARGB_8888);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        Bitmap bitmap2 = bitmap;
        if (bitmap2 == null) {
            this.valid = false;
            tlog.w("failed to create bitmap W:" + pow2roundup(pow2roundup) + " H: " + pow2roundup(pow2roundup2));
            return;
        }
        Canvas canvas = new Canvas(bitmap2);
        int count = this.charSet.count();
        float[] fArr = new float[count];
        int count2 = this.charSet.count();
        char[] cArr = new char[count2];
        for (int i11 = 0; i11 < count2; i11++) {
            cArr[i11] = this.charSet.getCharByIndex(i11);
        }
        if (paint.getTextWidths(cArr, 0, count, fArr) < count) {
            tlog.w("widthsReturned < charWidths.length");
        }
        int abs = Math.abs(i5);
        canvas.drawColor(0);
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.charSet.count()) {
            this.glyphs[i13] = new Glyph();
            char[] cArr2 = new char[i4];
            cArr2[i10] = this.charSet.getCharByIndex(i13);
            float f = fArr[i13];
            Rect rect = new Rect();
            paint.getTextBounds(cArr2, i10, i4, rect);
            if (rect.width() + i12 >= bitmap2.getWidth()) {
                i2 = abs + this.fontMetricMaxHeight;
                i3 = 0;
            } else {
                i2 = abs;
                i3 = i12;
            }
            int i14 = i3;
            int i15 = i13;
            canvas.drawText(cArr2, 0, 1, i3 - rect.left, i2, paint);
            this.glyphs[i15].x = i14;
            this.glyphs[i15].y = i2 - Math.abs(i5);
            this.glyphs[i15].width = rect.width();
            this.glyphs[i15].height = this.fontMetricMaxHeight;
            this.glyphs[i15].visualXOffset = rect.left;
            this.glyphs[i15].visualYOffset = i8;
            this.glyphs[i15].spaceWidth = f;
            this.glyphs[i15].spaceHeight = this.fontMetricHeight;
            i12 = i14 + rect.width() + 2;
            i13 = i15 + 1;
            abs = i2;
            i4 = 1;
            i10 = 0;
        }
        if (abs != 0) {
            i12 = bitmap2.getWidth();
        }
        int pow2roundup5 = pow2roundup(i12);
        int pow2roundup6 = pow2roundup(abs + Math.abs(i8) + 1);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, pow2roundup5, pow2roundup6);
        this.textureDim = new Vec2f(pow2roundup5, pow2roundup6);
        this.texture = new VTexture(createBitmap, 9729, 9729, 10497, false);
        this.atlasTexture = new AtlasTexture(this.texture, true);
        if (createBitmap != bitmap2) {
            createBitmap.recycle();
        }
        if (tmpBitmap1024 != bitmap2) {
            bitmap2.recycle();
        }
    }

    public boolean isValid() {
        return this.valid;
    }

    static int pow2roundup(int i) {
        return Utils.pow2roundup(i, 4096);
    }

    public Vec2f textureDim() {
        return this.textureDim;
    }

    public float fontHeight() {
        return this.fontMetricHeight;
    }

    public float fontMaxHeight() {
        return this.fontMetricMaxHeight;
    }

    public void dispose() {
        this.atlasTexture.dispose();
    }

    public Glyph getSpriteDescByChar(char c) {
        return this.glyphs[this.charSet.getIndexByChar(c)];
    }

    public ITexture getTexture() {
        return this.texture;
    }

    public IAtlasTexture getEntryTexture() {
        return this.atlasTexture;
    }

    public Vec2i measureText(String str) {
        float f = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            f += getSpriteDescByChar(str.charAt(i)).width;
        }
        return new Vec2i((int) f, (int) fontHeight());
    }

    public int measureTextY() {
        return (int) fontHeight();
    }

    /* loaded from: classes.dex */
    public class Glyph {
        public float height;
        public float spaceHeight;
        public float spaceWidth;
        public float visualXOffset;
        public float visualYOffset;
        public float width;
        public float x;
        public float y;

        public Glyph() {
        }
    }
}
