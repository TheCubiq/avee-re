package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;
/* loaded from: classes.dex */
public class ta1 implements ge0 {

    /* renamed from: c */
    public float f27151c;

    /* renamed from: a */
    public float f27149a = 1.0f;

    /* renamed from: b */
    public int f27150b = 3;

    /* renamed from: d */
    public float f27152d = 0.0f;

    /* renamed from: e */
    public PointF f27153e = new PointF();

    /* renamed from: f */
    public PointF f27154f = new PointF();

    public ta1() {
        m9416c(3);
    }

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        this.f27149a = c3239un.m7953o("radius", 1.0f);
        m9416c(c3239un.m7947r("sides", 3));
    }

    /* renamed from: c */
    public ta1 m9416c(int i) {
        this.f27150b = Math.max(i, 3);
        this.f27151c = 6.2831855f / i;
        return this;
    }

    @Override // com.daaw.ge0
    /* renamed from: d */
    public void mo8393d(de0 de0Var) {
    }

    @Override // com.daaw.ge0
    /* renamed from: e */
    public int mo8392e(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        float f2 = (z ? i2 - i : i) / i2;
        int i3 = this.f27150b;
        float f3 = (int) (i3 * f2);
        float f4 = (f2 - (f3 / i3)) / (1.0f / i3);
        float f5 = this.f27151c;
        double d = (f3 * f5) + this.f27152d;
        double d2 = f5;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d2 + d;
        Double.isNaN(d);
        double d4 = (d + d3) * 0.5d;
        this.f27153e.x = (float) ((-Math.sin(d)) * 1.0d);
        this.f27153e.y = (float) (Math.cos(d) * 1.0d);
        this.f27154f.x = (float) ((-Math.sin(d3)) * 1.0d);
        this.f27154f.y = (float) (Math.cos(d3) * 1.0d);
        pointF2.x = (float) ((-Math.sin(d4)) * 1.0d);
        pointF2.y = (float) (Math.cos(d4) * 1.0d);
        PointF pointF3 = this.f27153e;
        float f6 = pointF3.x;
        PointF pointF4 = this.f27154f;
        pointF.x = f6 + ((pointF4.x - f6) * f4);
        float f7 = pointF3.y;
        pointF.y = f7 + ((pointF4.y - f7) * f4);
        float width = (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.f27149a;
        pointF.x = rectF.centerX() + ((-pointF.x) * width);
        pointF.y = rectF.centerY() + ((-pointF.y) * width);
        return ((i + i2) - 1) % i2;
    }

    @Override // com.daaw.ge0
    /* renamed from: i */
    public int mo8391i(RectF rectF) {
        return this.f27150b;
    }

    @Override // com.daaw.ge0
    /* renamed from: k */
    public float mo8389k(RectF rectF, int i) {
        return this.f27151c * this.f27150b * this.f27149a * (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f;
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        c3239un.m7990O("radius", this.f27149a, "misc", 0.15f, 3.0f);
        c3239un.m7982W("sides", this.f27150b, "misc", 3, 18);
    }
}
