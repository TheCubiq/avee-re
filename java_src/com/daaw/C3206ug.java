package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
/* renamed from: com.daaw.ug */
/* loaded from: classes.dex */
public class C3206ug extends ColorDrawable {

    /* renamed from: a */
    public float f29034a;

    /* renamed from: b */
    public Paint f29035b;

    /* renamed from: c */
    public Paint f29036c;

    /* renamed from: d */
    public Paint f29037d;

    public C3206ug(int i) {
        super(i);
        this.f29035b = lv0.m16490c().m16485e(Paint.Style.STROKE).m16486d(this.f29034a).m16488b(-6381922).m16489a();
        this.f29036c = lv0.m16490c().m16485e(Paint.Style.FILL).m16488b(0).m16489a();
        this.f29037d = lv0.m16490c().m16487c(lv0.m16491b(26)).m16489a();
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawColor(0);
        float width = canvas.getWidth() / 2.0f;
        float f = width / 8.0f;
        this.f29034a = f;
        this.f29035b.setStrokeWidth(f);
        this.f29036c.setColor(getColor());
        canvas.drawCircle(width, width, width - this.f29034a, this.f29037d);
        canvas.drawCircle(width, width, width - this.f29034a, this.f29036c);
        canvas.drawCircle(width, width, width - this.f29034a, this.f29035b);
    }

    @Override // android.graphics.drawable.ColorDrawable
    public void setColor(int i) {
        super.setColor(i);
        invalidateSelf();
    }
}
