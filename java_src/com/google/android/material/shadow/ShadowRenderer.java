package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
/* loaded from: classes2.dex */
public class ShadowRenderer {
    private static final int COLOR_ALPHA_END = 0;
    private static final int COLOR_ALPHA_MIDDLE = 20;
    private static final int COLOR_ALPHA_START = 68;
    private final Paint cornerShadowPaint;
    private final Paint edgeShadowPaint;
    private final Path scratch;
    private int shadowEndColor;
    private int shadowMiddleColor;
    private final Paint shadowPaint;
    private int shadowStartColor;
    private static final int[] edgeColors = new int[3];
    private static final float[] edgePositions = {0.0f, 0.5f, 1.0f};
    private static final int[] cornerColors = new int[4];
    private static final float[] cornerPositions = {0.0f, 0.0f, 0.5f, 1.0f};

    public ShadowRenderer() {
        this(ViewCompat.MEASURED_STATE_MASK);
    }

    public ShadowRenderer(int i) {
        this.scratch = new Path();
        setShadowColor(i);
        Paint paint = new Paint(4);
        this.cornerShadowPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.shadowPaint = paint2;
        paint2.setColor(this.shadowStartColor);
        this.edgeShadowPaint = new Paint(this.cornerShadowPaint);
    }

    public void setShadowColor(int i) {
        this.shadowStartColor = ColorUtils.setAlphaComponent(i, 68);
        this.shadowMiddleColor = ColorUtils.setAlphaComponent(i, 20);
        this.shadowEndColor = ColorUtils.setAlphaComponent(i, 0);
    }

    public void drawEdgeShadow(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = edgeColors;
        iArr[0] = this.shadowEndColor;
        iArr[1] = this.shadowMiddleColor;
        iArr[2] = this.shadowStartColor;
        this.edgeShadowPaint.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, edgeColors, edgePositions, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.edgeShadowPaint);
        canvas.restore();
    }

    public void drawCornerShadow(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z = f2 < 0.0f;
        Path path = this.scratch;
        if (z) {
            int[] iArr = cornerColors;
            iArr[0] = 0;
            iArr[1] = this.shadowEndColor;
            iArr[2] = this.shadowMiddleColor;
            iArr[3] = this.shadowStartColor;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = cornerColors;
            iArr2[0] = 0;
            iArr2[1] = this.shadowStartColor;
            iArr2[2] = this.shadowMiddleColor;
            iArr2[3] = this.shadowEndColor;
        }
        float width = 1.0f - (i / (rectF.width() / 2.0f));
        float[] fArr = cornerPositions;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.cornerShadowPaint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, cornerColors, cornerPositions, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        canvas.drawArc(rectF, f, f2, true, this.cornerShadowPaint);
        canvas.restore();
    }

    public Paint getShadowPaint() {
        return this.shadowPaint;
    }
}
