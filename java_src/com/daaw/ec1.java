package com.daaw;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
/* loaded from: classes2.dex */
public class ec1 {

    /* renamed from: i */
    public static final int[] f8327i = new int[3];

    /* renamed from: j */
    public static final float[] f8328j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f8329k = new int[4];

    /* renamed from: l */
    public static final float[] f8330l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f8331a;

    /* renamed from: b */
    public final Paint f8332b;

    /* renamed from: c */
    public final Paint f8333c;

    /* renamed from: d */
    public int f8334d;

    /* renamed from: e */
    public int f8335e;

    /* renamed from: f */
    public int f8336f;

    /* renamed from: g */
    public final Path f8337g;

    /* renamed from: h */
    public Paint f8338h;

    public ec1() {
        this(-16777216);
    }

    public ec1(int i) {
        this.f8337g = new Path();
        this.f8338h = new Paint();
        this.f8331a = new Paint();
        m23609d(i);
        this.f8338h.setColor(0);
        Paint paint = new Paint(4);
        this.f8332b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f8333c = new Paint(paint);
    }

    /* renamed from: a */
    public void m23612a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z = f2 < 0.0f;
        Path path = this.f8337g;
        if (z) {
            int[] iArr = f8329k;
            iArr[0] = 0;
            iArr[1] = this.f8336f;
            iArr[2] = this.f8335e;
            iArr[3] = this.f8334d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = f8329k;
            iArr2[0] = 0;
            iArr2[1] = this.f8334d;
            iArr2[2] = this.f8335e;
            iArr2[3] = this.f8336f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = f8330l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.f8332b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f8329k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f8338h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f8332b);
        canvas.restore();
    }

    /* renamed from: b */
    public void m23611b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f8327i;
        iArr[0] = this.f8336f;
        iArr[1] = this.f8335e;
        iArr[2] = this.f8334d;
        Paint paint = this.f8333c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f8328j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f8333c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint m23610c() {
        return this.f8331a;
    }

    /* renamed from: d */
    public void m23609d(int i) {
        this.f8334d = C3838zg.m2344j(i, 68);
        this.f8335e = C3838zg.m2344j(i, 20);
        this.f8336f = C3838zg.m2344j(i, 0);
        this.f8331a.setColor(this.f8334d);
    }
}
