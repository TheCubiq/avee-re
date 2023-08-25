package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;
/* loaded from: classes.dex */
public class oa1 implements ge0 {

    /* renamed from: a */
    public float f21190a = 1.0f;

    /* renamed from: b */
    public float f21191b = 0.0f;

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        this.f21190a = c3239un.m7953o("radius", 1.0f);
        this.f21191b = c3239un.m7953o("gap", 0.0f);
    }

    @Override // com.daaw.ge0
    /* renamed from: d */
    public void mo8393d(de0 de0Var) {
    }

    @Override // com.daaw.ge0
    /* renamed from: e */
    public int mo8392e(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        int i3 = z ? i2 - i : i;
        float f2 = this.f21191b;
        double d = (((i3 / i2) + f) * (1.0f - f2)) + (f2 * 0.5f);
        Double.isNaN(d);
        double d2 = d * 6.283185307179586d;
        pointF2.x = (float) ((-Math.sin(d2)) * 1.0d);
        pointF2.y = (float) (Math.cos(d2) * 1.0d);
        float width = (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.f21190a;
        pointF.x = rectF.centerX() + ((-pointF2.x) * width);
        pointF.y = rectF.centerY() + ((-pointF2.y) * width);
        return ((i + i2) - 1) % i2;
    }

    @Override // com.daaw.ge0
    /* renamed from: i */
    public int mo8391i(RectF rectF) {
        return Math.max((int) ((mo8389k(rectF, 0) / 18.0f) + 0.5f), 18);
    }

    @Override // com.daaw.ge0
    /* renamed from: k */
    public float mo8389k(RectF rectF, int i) {
        double width = (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.f21190a;
        Double.isNaN(width);
        return ((float) (width * 6.283185307179586d)) * (1.0f - this.f21191b);
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        c3239un.m7990O("radius", this.f21190a, "misc", 0.5f, 3.0f);
        c3239un.m7990O("gap", this.f21191b, "misc", 0.0f, 0.9f);
    }
}
