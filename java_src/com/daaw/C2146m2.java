package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
/* renamed from: com.daaw.m2 */
/* loaded from: classes.dex */
public class C2146m2 extends AbstractC1031d {

    /* renamed from: A */
    public int f17996A;

    /* renamed from: B */
    public Paint f17997B;

    /* renamed from: C */
    public Paint f17998C;

    /* renamed from: D */
    public Paint f17999D;

    /* renamed from: E */
    public Paint f18000E;

    /* renamed from: F */
    public Paint f18001F;

    /* renamed from: G */
    public Bitmap f18002G;

    /* renamed from: H */
    public Canvas f18003H;

    /* renamed from: I */
    public C3538xg f18004I;

    public C2146m2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17997B = lv0.m16490c().m16489a();
        this.f17998C = lv0.m16490c().m16489a();
        this.f17999D = lv0.m16490c().m16489a();
        this.f18000E = lv0.m16490c().m16488b(-1).m16484f(PorterDuff.Mode.CLEAR).m16489a();
        this.f18001F = lv0.m16490c().m16489a();
    }

    @Override // com.daaw.AbstractC1031d
    /* renamed from: a */
    public void mo16296a() {
        super.mo16296a();
        this.f17997B.setShader(lv0.m16491b(this.f6330w * 2));
        this.f18002G = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        this.f18003H = new Canvas(this.f18002G);
    }

    @Override // com.daaw.AbstractC1031d
    /* renamed from: b */
    public void mo7122b(Canvas canvas) {
        int width = canvas.getWidth();
        float height = canvas.getHeight();
        canvas.drawRect(0.0f, 0.0f, width, height, this.f17997B);
        int max = Math.max(2, width / 256);
        int i = 0;
        while (i <= width) {
            float f = i;
            this.f17998C.setColor(this.f17996A);
            this.f17998C.setAlpha(Math.round((f / (width - 1)) * 255.0f));
            i += max;
            canvas.drawRect(f, 0.0f, i, height, this.f17998C);
        }
    }

    @Override // com.daaw.AbstractC1031d
    /* renamed from: c */
    public void mo7121c(Canvas canvas, float f, float f2) {
        this.f17999D.setColor(this.f17996A);
        this.f17999D.setAlpha(Math.round(this.f6331x * 255.0f));
        if (this.f6332y) {
            canvas.drawCircle(f, f2, this.f6329v, this.f18000E);
        }
        if (this.f6331x >= 1.0f) {
            canvas.drawCircle(f, f2, this.f6329v * 0.75f, this.f17999D);
            return;
        }
        this.f18003H.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f18003H.drawCircle(f, f2, (this.f6329v * 0.75f) + 4.0f, this.f17997B);
        this.f18003H.drawCircle(f, f2, (this.f6329v * 0.75f) + 4.0f, this.f17999D);
        Paint m16489a = lv0.m16490c().m16488b(-1).m16485e(Paint.Style.STROKE).m16486d(6.0f).m16484f(PorterDuff.Mode.CLEAR).m16489a();
        this.f18001F = m16489a;
        this.f18003H.drawCircle(f, f2, (this.f6329v * 0.75f) + (m16489a.getStrokeWidth() / 2.0f), this.f18001F);
        canvas.drawBitmap(this.f18002G, 0.0f, 0.0f, (Paint) null);
    }

    @Override // com.daaw.AbstractC1031d
    /* renamed from: f */
    public void mo7120f(float f) {
        C3538xg c3538xg = this.f18004I;
        if (c3538xg != null) {
            c3538xg.setAlphaValue(f);
        }
    }

    public void setColor(int i) {
        this.f17996A = i;
        this.f6331x = zq1.m1984d(i);
        if (this.f6325r != null) {
            m24846g();
            invalidate();
        }
    }

    public void setColorPicker(C3538xg c3538xg) {
        this.f18004I = c3538xg;
    }
}
