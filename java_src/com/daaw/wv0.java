package com.daaw;
/* loaded from: classes.dex */
public class wv0 implements zd0 {
    public static boolean v = true;
    public static ds1 w = new ds1(0.0f, 0.0f, 0.0f);
    public static ds1 x = new ds1(0.0f, 0.0f, 0.0f);
    public static ds1 y = new ds1(0.0f, 0.0f, 0.0f);
    public long a;
    public float b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public z6 j;
    public float p;
    public boolean u;
    public xv0[] k = new xv0[0];
    public ds1 l = new ds1(0.0f, 0.0f, 0.0f);
    public ds1 m = new ds1(0.0f, 0.0f, 0.0f);
    public bs1 n = new bs1(0.0f, 0.0f);
    public ds1 o = new ds1(0.0f, 0.0f, 0.0f);
    public float q = 0.0f;
    public boolean r = false;
    public boolean s = false;
    public xv0 t = new xv0();

    public wv0() {
        this.u = false;
        if (v) {
            this.u = true;
            v = false;
        }
    }

    @Override // com.daaw.zd0
    public float[] a() {
        return this.t.b();
    }

    @Override // com.daaw.zd0
    public float b() {
        return this.p;
    }

    @Override // com.daaw.zd0
    public float c() {
        return this.t.c;
    }

    @Override // com.daaw.zd0
    public boolean d(float f, float f2, bs1 bs1Var, bs1 bs1Var2, float f3, float f4, bs1 bs1Var3, float f5, float f6, bs1 bs1Var4, pr1 pr1Var, float f7) {
        xv0[] xv0VarArr;
        float b;
        float f8;
        ds1 ds1Var;
        if (this.r) {
            float f9 = this.e + f;
            this.e = f9;
            float f10 = f9 / this.g;
            this.f = f10;
            if (f10 > 1.0f || this.k == null) {
                this.r = false;
                return false;
            }
            float f11 = 0.0f;
            if (bs1Var4 != null) {
                this.f = Math.max(this.f, 1.0f - (Math.max((-this.o.c) - f7, 0.0f) / (10.0f * f7)));
            }
            int i = 0;
            while (true) {
                xv0VarArr = this.k;
                if (i >= xv0VarArr.length || xv0VarArr[i].a >= this.f) {
                    break;
                }
                i++;
            }
            int i2 = i - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= xv0VarArr.length - 1) {
                i2 = xv0VarArr.length - 2;
            }
            int i3 = i2 + 1;
            int i4 = i2 >= 0 ? i2 : 0;
            float f12 = (this.f - xv0VarArr[i4].a) / (xv0VarArr[i3].a - xv0VarArr[i4].a);
            xv0.a(this.t, xv0VarArr[i4], xv0VarArr[i3], f12 <= 1.0f ? f12 : 1.0f);
            xv0 xv0Var = this.t;
            xv0Var.b *= f3;
            xv0Var.c *= f3;
            ds1 ds1Var2 = this.l;
            float f13 = ds1Var2.a;
            ds1Var2.a = f13 + ((f13 - bs1Var3.a) * f5);
            float f14 = ds1Var2.b;
            ds1Var2.b = f14 + ((f14 - bs1Var3.b) * f5);
            ds1Var2.c += 0.0f;
            float f15 = xv0Var.g;
            float sin = (float) Math.sin(f15 + (this.e * f15));
            xv0 xv0Var2 = this.t;
            float f16 = sin * xv0Var2.h;
            float f17 = xv0Var2.g;
            xv0 xv0Var3 = this.t;
            float cos = ((float) Math.cos(f17 + (this.e * f17))) * xv0Var3.h;
            ds1 ds1Var3 = x;
            ds1 ds1Var4 = this.l;
            ds1Var3.a = -ds1Var4.b;
            ds1Var3.b = ds1Var4.c;
            ds1Var3.c = ds1Var4.a;
            ds1 ds1Var5 = y;
            float f18 = -ds1Var4.c;
            ds1Var5.a = f18;
            float f19 = ds1Var4.a;
            ds1Var5.b = f19;
            float f20 = ds1Var4.b;
            ds1Var5.c = f20;
            if (bs1Var4 != null) {
                ds1 ds1Var6 = this.m;
                ds1Var6.a = (f18 * f16) + f19 + (ds1Var3.a * cos);
                ds1Var6.b = (f19 * f16) + f20 + (ds1Var3.b * cos);
                ds1Var6.c = ds1Var4.c + (f20 * f16) + (ds1Var3.c * cos);
            } else {
                ds1 ds1Var7 = this.m;
                ds1Var7.a = f19 + (f20 * f16);
                ds1Var7.b = f20 + ((-ds1Var4.a) * f16);
                ds1Var7.c = ds1Var4.c;
            }
            ds1 ds1Var8 = this.o;
            float f21 = ds1Var8.a;
            ds1 ds1Var9 = this.m;
            ds1Var8.a = f21 + (ds1Var9.a * f * f4 * f2);
            ds1Var8.b += ds1Var9.b * f * f4 * f2;
            ds1Var8.c += ds1Var9.c * f * f4 * f2;
            float f22 = ds1Var4.a;
            bs1 bs1Var5 = this.n;
            ds1Var4.a = f22 + (bs1Var5.a * f * f2);
            ds1Var4.b += bs1Var5.b * f * f2;
            if (xv0Var3.e) {
                if (bs1Var4 != null) {
                    float atan = (float) Math.atan(bs1.l(bs1Var4.a - ds1Var8.a, bs1Var4.b - ds1Var8.b) / this.o.c);
                    float f23 = bs1Var4.a;
                    float f24 = this.o.a;
                    ds1 ds1Var10 = this.m;
                    ds1 ds1Var11 = w;
                    float f25 = bs1Var4.a;
                    ds1 ds1Var12 = this.o;
                    ds1Var11.a = f25 - ds1Var12.a;
                    ds1Var11.b = bs1Var4.b - ds1Var12.b;
                    ds1Var11.c = 0.0f;
                    this.q = ds1Var11.a();
                    b = Math.min(Math.abs(atan - ((float) Math.atan(bs1.l(f23 - (f24 - ds1Var10.a), bs1Var4.b - (ds1Var.b - ds1Var10.b)) / (this.o.c - this.m.c)))), 0.3f);
                    f8 = 100.05f;
                } else {
                    this.q = ds1Var9.a();
                    b = this.m.b();
                    f8 = 0.05f;
                }
                f11 = b * f8;
            } else {
                this.q = xv0Var3.d;
            }
            this.p = this.t.b + (f11 * f4 * f6);
            return true;
        }
        return false;
    }

    @Override // com.daaw.zd0
    public boolean e() {
        return this.r;
    }

    @Override // com.daaw.zd0
    public void f(float f) {
        z6 z6Var = this.j;
        int i = z6Var != null ? z6Var.i() : 1;
        boolean z = this.h;
        if (!z) {
            this.c = (int) (i * this.f);
        }
        if (!this.i && this.c >= i) {
            this.c = i - 1;
        }
        this.c %= i;
        if (z) {
            return;
        }
        this.d = this.f * 1.0f;
    }

    @Override // com.daaw.zd0
    public float g() {
        return this.q;
    }

    @Override // com.daaw.zd0
    public ds1 getPosition() {
        return this.o;
    }

    public void h(int i) {
        if (this.k.length == i) {
            return;
        }
        this.k = new xv0[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = new xv0();
        }
    }

    public xv0 i(int i) {
        return this.k[i];
    }

    public void j(boolean z) {
        this.r = z;
    }

    @Override // com.daaw.zd0
    public void setVisible(boolean z) {
        this.s = z;
    }
}
