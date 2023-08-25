package com.daaw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
/* loaded from: classes.dex */
public class vj0 extends AbstractC1031d {

    /* renamed from: A */
    public int f30257A;

    /* renamed from: B */
    public Paint f30258B;

    /* renamed from: C */
    public Paint f30259C;

    /* renamed from: D */
    public Paint f30260D;

    /* renamed from: E */
    public C3538xg f30261E;

    public vj0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30258B = lv0.m16490c().m16489a();
        this.f30259C = lv0.m16490c().m16489a();
        this.f30260D = lv0.m16490c().m16488b(-1).m16484f(PorterDuff.Mode.CLEAR).m16489a();
    }

    @Override // com.daaw.AbstractC1031d
    /* renamed from: b */
    public void mo7122b(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float[] fArr = new float[3];
        Color.colorToHSV(this.f30257A, fArr);
        int max = Math.max(2, width / 256);
        int i = 0;
        while (i <= width) {
            float f = i;
            fArr[2] = f / (width - 1);
            this.f30258B.setColor(Color.HSVToColor(fArr));
            i += max;
            canvas.drawRect(f, 0.0f, i, height, this.f30258B);
        }
    }

    @Override // com.daaw.AbstractC1031d
    /* renamed from: c */
    public void mo7121c(Canvas canvas, float f, float f2) {
        this.f30259C.setColor(zq1.m1985c(this.f30257A, this.f6331x));
        if (this.f6332y) {
            canvas.drawCircle(f, f2, this.f6329v, this.f30260D);
        }
        canvas.drawCircle(f, f2, this.f6329v * 0.75f, this.f30259C);
    }

    @Override // com.daaw.AbstractC1031d
    /* renamed from: f */
    public void mo7120f(float f) {
        C3538xg c3538xg = this.f30261E;
        if (c3538xg != null) {
            c3538xg.setLightness(f);
        }
    }

    public void setColor(int i) {
        this.f30257A = i;
        this.f6331x = zq1.m1982f(i);
        if (this.f6325r != null) {
            m24846g();
            invalidate();
        }
    }

    public void setColorPicker(C3538xg c3538xg) {
        this.f30261E = c3538xg;
    }
}
