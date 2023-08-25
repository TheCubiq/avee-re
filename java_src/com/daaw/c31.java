package com.daaw;
/* loaded from: classes.dex */
public class c31 {
    public float a;
    public int f;
    public int g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float c = 0.0f;
    public float b = 0.0f;
    public float e = 0.0f;
    public float d = 0.0f;

    public c31(float f) {
        this.a = f;
        g(100);
        h(0.0f, 1.0f, 0.0f, 1.0f);
    }

    public void a(int i, float f) {
        if (i < this.f || i > this.g) {
            return;
        }
        float f2 = this.d;
        float max = Math.max(0.0f, Math.min(f - f2, this.e - f2));
        this.j = Math.max(this.h, max);
        this.h += max;
    }

    public float b() {
        float f = this.h / this.i;
        float f2 = this.a;
        return (f * (1.0f - f2)) + ((this.j / this.k) * f2);
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.c;
    }

    public float e() {
        return this.d;
    }

    public float f() {
        return this.e;
    }

    public void g(int i) {
        int round;
        this.h = 0.0f;
        float f = i;
        this.f = Math.round(this.b * f);
        this.g = Math.round(f * this.c);
        float f2 = this.e;
        float f3 = this.d;
        this.k = f2 - f3;
        this.i = Math.max((f2 - f3) * ((round - this.f) + 1), 1.0E-4f);
    }

    public void h(float f, float f2, float f3, float f4) {
        this.b = Math.min(f, f2);
        this.d = Math.min(f3, f4);
        this.c = Math.max(f + 0.01f, f2);
        this.e = Math.max(f3 + 1.0f, f4);
        this.f = 0;
        this.g = 0;
        this.i = 1.0E-4f;
    }
}
