package com.daaw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
/* loaded from: classes.dex */
public class vj0 extends d {
    public int A;
    public Paint B;
    public Paint C;
    public Paint D;
    public xg E;

    public vj0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = lv0.c().a();
        this.C = lv0.c().a();
        this.D = lv0.c().b(-1).f(PorterDuff.Mode.CLEAR).a();
    }

    @Override // com.daaw.d
    public void b(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float[] fArr = new float[3];
        Color.colorToHSV(this.A, fArr);
        int max = Math.max(2, width / 256);
        int i = 0;
        while (i <= width) {
            float f = i;
            fArr[2] = f / (width - 1);
            this.B.setColor(Color.HSVToColor(fArr));
            i += max;
            canvas.drawRect(f, 0.0f, i, height, this.B);
        }
    }

    @Override // com.daaw.d
    public void c(Canvas canvas, float f, float f2) {
        this.C.setColor(zq1.c(this.A, this.x));
        if (this.y) {
            canvas.drawCircle(f, f2, this.v, this.D);
        }
        canvas.drawCircle(f, f2, this.v * 0.75f, this.C);
    }

    @Override // com.daaw.d
    public void f(float f) {
        xg xgVar = this.E;
        if (xgVar != null) {
            xgVar.setLightness(f);
        }
    }

    public void setColor(int i) {
        this.A = i;
        this.x = zq1.f(i);
        if (this.r != null) {
            g();
            invalidate();
        }
    }

    public void setColorPicker(xg xgVar) {
        this.E = xgVar;
    }
}
