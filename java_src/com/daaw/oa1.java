package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;
/* loaded from: classes.dex */
public class oa1 implements ge0 {
    public float a = 1.0f;
    public float b = 0.0f;

    @Override // com.daaw.zc0
    public void a(un unVar) {
        this.a = unVar.o("radius", 1.0f);
        this.b = unVar.o("gap", 0.0f);
    }

    @Override // com.daaw.ge0
    public void d(de0 de0Var) {
    }

    @Override // com.daaw.ge0
    public int e(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        int i3 = z ? i2 - i : i;
        float f2 = this.b;
        double d = (((i3 / i2) + f) * (1.0f - f2)) + (f2 * 0.5f);
        Double.isNaN(d);
        double d2 = d * 6.283185307179586d;
        pointF2.x = (float) ((-Math.sin(d2)) * 1.0d);
        pointF2.y = (float) (Math.cos(d2) * 1.0d);
        float width = (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.a;
        pointF.x = rectF.centerX() + ((-pointF2.x) * width);
        pointF.y = rectF.centerY() + ((-pointF2.y) * width);
        return ((i + i2) - 1) % i2;
    }

    @Override // com.daaw.ge0
    public int i(RectF rectF) {
        return Math.max((int) ((k(rectF, 0) / 18.0f) + 0.5f), 18);
    }

    @Override // com.daaw.ge0
    public float k(RectF rectF, int i) {
        double width = (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.a;
        Double.isNaN(width);
        return ((float) (width * 6.283185307179586d)) * (1.0f - this.b);
    }

    @Override // com.daaw.zc0
    public void o(un unVar) {
        unVar.O("radius", this.a, "misc", 0.5f, 3.0f);
        unVar.O("gap", this.b, "misc", 0.0f, 0.9f);
    }
}
