package com.daaw;
/* loaded from: classes.dex */
public class c31 {

    /* renamed from: a */
    public float f5438a;

    /* renamed from: f */
    public int f5443f;

    /* renamed from: g */
    public int f5444g;

    /* renamed from: h */
    public float f5445h;

    /* renamed from: i */
    public float f5446i;

    /* renamed from: j */
    public float f5447j;

    /* renamed from: k */
    public float f5448k;

    /* renamed from: c */
    public float f5440c = 0.0f;

    /* renamed from: b */
    public float f5439b = 0.0f;

    /* renamed from: e */
    public float f5442e = 0.0f;

    /* renamed from: d */
    public float f5441d = 0.0f;

    public c31(float f) {
        this.f5438a = f;
        m25645g(100);
        m25644h(0.0f, 1.0f, 0.0f, 1.0f);
    }

    /* renamed from: a */
    public void m25651a(int i, float f) {
        if (i < this.f5443f || i > this.f5444g) {
            return;
        }
        float f2 = this.f5441d;
        float max = Math.max(0.0f, Math.min(f - f2, this.f5442e - f2));
        this.f5447j = Math.max(this.f5445h, max);
        this.f5445h += max;
    }

    /* renamed from: b */
    public float m25650b() {
        float f = this.f5445h / this.f5446i;
        float f2 = this.f5438a;
        return (f * (1.0f - f2)) + ((this.f5447j / this.f5448k) * f2);
    }

    /* renamed from: c */
    public float m25649c() {
        return this.f5439b;
    }

    /* renamed from: d */
    public float m25648d() {
        return this.f5440c;
    }

    /* renamed from: e */
    public float m25647e() {
        return this.f5441d;
    }

    /* renamed from: f */
    public float m25646f() {
        return this.f5442e;
    }

    /* renamed from: g */
    public void m25645g(int i) {
        int round;
        this.f5445h = 0.0f;
        float f = i;
        this.f5443f = Math.round(this.f5439b * f);
        this.f5444g = Math.round(f * this.f5440c);
        float f2 = this.f5442e;
        float f3 = this.f5441d;
        this.f5448k = f2 - f3;
        this.f5446i = Math.max((f2 - f3) * ((round - this.f5443f) + 1), 1.0E-4f);
    }

    /* renamed from: h */
    public void m25644h(float f, float f2, float f3, float f4) {
        this.f5439b = Math.min(f, f2);
        this.f5441d = Math.min(f3, f4);
        this.f5440c = Math.max(f + 0.01f, f2);
        this.f5442e = Math.max(f3 + 1.0f, f4);
        this.f5443f = 0;
        this.f5444g = 0;
        this.f5446i = 1.0E-4f;
    }
}
