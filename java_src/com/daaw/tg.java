package com.daaw;

import android.graphics.Color;
/* loaded from: classes.dex */
public class tg {
    public float a;
    public float b;
    public float[] c = new float[3];
    public float[] d;
    public int e;

    public tg(float f, float f2, float[] fArr) {
        f(f, f2, fArr);
    }

    public int a() {
        return this.e;
    }

    public float[] b() {
        return this.c;
    }

    public float[] c(float f) {
        if (this.d == null) {
            this.d = (float[]) this.c.clone();
        }
        float[] fArr = this.d;
        float[] fArr2 = this.c;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = f;
        return fArr;
    }

    public float d() {
        return this.a;
    }

    public float e() {
        return this.b;
    }

    public void f(float f, float f2, float[] fArr) {
        this.a = f;
        this.b = f2;
        float[] fArr2 = this.c;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        this.e = Color.HSVToColor(fArr2);
    }

    public double g(float f, float f2) {
        double d = this.a - f;
        double d2 = this.b - f2;
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d2);
        return (d * d) + (d2 * d2);
    }
}
