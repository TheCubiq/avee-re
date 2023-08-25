package com.daaw;

import android.graphics.Color;
/* renamed from: com.daaw.tg */
/* loaded from: classes.dex */
public class C3073tg {

    /* renamed from: a */
    public float f27611a;

    /* renamed from: b */
    public float f27612b;

    /* renamed from: c */
    public float[] f27613c = new float[3];

    /* renamed from: d */
    public float[] f27614d;

    /* renamed from: e */
    public int f27615e;

    public C3073tg(float f, float f2, float[] fArr) {
        m9187f(f, f2, fArr);
    }

    /* renamed from: a */
    public int m9192a() {
        return this.f27615e;
    }

    /* renamed from: b */
    public float[] m9191b() {
        return this.f27613c;
    }

    /* renamed from: c */
    public float[] m9190c(float f) {
        if (this.f27614d == null) {
            this.f27614d = (float[]) this.f27613c.clone();
        }
        float[] fArr = this.f27614d;
        float[] fArr2 = this.f27613c;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = f;
        return fArr;
    }

    /* renamed from: d */
    public float m9189d() {
        return this.f27611a;
    }

    /* renamed from: e */
    public float m9188e() {
        return this.f27612b;
    }

    /* renamed from: f */
    public void m9187f(float f, float f2, float[] fArr) {
        this.f27611a = f;
        this.f27612b = f2;
        float[] fArr2 = this.f27613c;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        this.f27615e = Color.HSVToColor(fArr2);
    }

    /* renamed from: g */
    public double m9186g(float f, float f2) {
        double d = this.f27611a - f;
        double d2 = this.f27612b - f2;
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d2);
        return (d * d) + (d2 * d2);
    }
}
