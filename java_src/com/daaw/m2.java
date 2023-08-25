package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
/* loaded from: classes.dex */
public class m2 extends d {
    public int A;
    public Paint B;
    public Paint C;
    public Paint D;
    public Paint E;
    public Paint F;
    public Bitmap G;
    public Canvas H;
    public xg I;

    public m2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = lv0.c().a();
        this.C = lv0.c().a();
        this.D = lv0.c().a();
        this.E = lv0.c().b(-1).f(PorterDuff.Mode.CLEAR).a();
        this.F = lv0.c().a();
    }

    @Override // com.daaw.d
    public void a() {
        super.a();
        this.B.setShader(lv0.b(this.w * 2));
        this.G = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        this.H = new Canvas(this.G);
    }

    @Override // com.daaw.d
    public void b(Canvas canvas) {
        int width = canvas.getWidth();
        float height = canvas.getHeight();
        canvas.drawRect(0.0f, 0.0f, width, height, this.B);
        int max = Math.max(2, width / 256);
        int i = 0;
        while (i <= width) {
            float f = i;
            this.C.setColor(this.A);
            this.C.setAlpha(Math.round((f / (width - 1)) * 255.0f));
            i += max;
            canvas.drawRect(f, 0.0f, i, height, this.C);
        }
    }

    @Override // com.daaw.d
    public void c(Canvas canvas, float f, float f2) {
        this.D.setColor(this.A);
        this.D.setAlpha(Math.round(this.x * 255.0f));
        if (this.y) {
            canvas.drawCircle(f, f2, this.v, this.E);
        }
        if (this.x >= 1.0f) {
            canvas.drawCircle(f, f2, this.v * 0.75f, this.D);
            return;
        }
        this.H.drawColor(0, PorterDuff.Mode.CLEAR);
        this.H.drawCircle(f, f2, (this.v * 0.75f) + 4.0f, this.B);
        this.H.drawCircle(f, f2, (this.v * 0.75f) + 4.0f, this.D);
        Paint a = lv0.c().b(-1).e(Paint.Style.STROKE).d(6.0f).f(PorterDuff.Mode.CLEAR).a();
        this.F = a;
        this.H.drawCircle(f, f2, (this.v * 0.75f) + (a.getStrokeWidth() / 2.0f), this.F);
        canvas.drawBitmap(this.G, 0.0f, 0.0f, (Paint) null);
    }

    @Override // com.daaw.d
    public void f(float f) {
        xg xgVar = this.I;
        if (xgVar != null) {
            xgVar.setAlphaValue(f);
        }
    }

    public void setColor(int i) {
        this.A = i;
        this.x = zq1.d(i);
        if (this.r != null) {
            g();
            invalidate();
        }
    }

    public void setColorPicker(xg xgVar) {
        this.I = xgVar;
    }
}
