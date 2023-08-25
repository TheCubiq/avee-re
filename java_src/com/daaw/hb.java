package com.daaw;

import java.util.Random;
/* loaded from: classes.dex */
public class hb extends a {
    public float D;
    public final Random f = new Random();
    public String g = null;
    public float h = 1.5f;
    public float i = 0.1f;
    public bs1 j = new bs1(0.0f, 0.0f);
    public boolean k = true;
    public float[] l = {1.0f, 1.0f, 1.0f, 1.0f};
    public float[] m = {1.0f, 1.0f, 1.0f, 1.0f};
    public float n = 0.0f;
    public float o = 0.0f;
    public float p = 0.0f;
    public float q = 0.0f;
    public float r = 1.0f;
    public float s = 4.0f;
    public float t = 4.0f;
    public float u = 4.0f;
    public float v = 0.0f;
    public float w = 0.0f;
    public float[] x = new float[4];
    public float[] y = new float[4];
    public float z = 0.1f;
    public float A = 0.1f;
    public float B = 0.1f;
    public float C = 0.1f;

    public hb() {
        v(0.1f);
    }

    public void A(float f) {
        this.s = f;
    }

    @Override // com.daaw.a, com.daaw.zc0
    public void a(un unVar) {
        super.a(unVar);
        this.l = unVar.m("ColorFrom", new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        this.m = unVar.m("ColorTo", new float[]{0.0f, 0.0f, 0.5f, 0.5f});
        this.h = unVar.o("lifetime", 8.0f);
        v(unVar.o("fadeInAndOutTime", 0.1f));
        this.j = unVar.z("gravity", new bs1(0.0f, 0.0f));
        this.k = unVar.n("velocityAngle", true);
        this.r = unVar.o("sizeAspectRatio", 1.0f);
        this.s = unVar.o("startSize", 0.0f);
        this.t = unVar.o("fadeInSize", 4.0f);
        this.u = unVar.o("endSize", 4.0f);
        this.v = unVar.o("endSizeRandom", 10.0f);
        this.w = unVar.o("endSizeZFactor", 0.0f);
        this.n = unVar.o("sideSineWaveFreq", 0.0f);
        this.o = unVar.o("sideSineWaveFreqRandom", 0.0f);
        this.p = unVar.o("sideSineWaveMag", 0.0f);
        this.q = unVar.o("sideSineWaveMagRandom", 0.0f);
    }

    @Override // com.daaw.ae0
    public boolean g(y31 y31Var, zd0 zd0Var, ds1 ds1Var, ds1 ds1Var2) {
        wv0 wv0Var = (wv0) zd0Var;
        float nextFloat = this.f.nextFloat();
        float f = 1.0f - nextFloat;
        ds1 ds1Var3 = new ds1(ds1Var2.a * 0.2f, ds1Var2.b * 0.2f, ds1Var2.c * 0.02f);
        ds1Var3.c();
        float f2 = this.v * nextFloat;
        this.D = this.u + (this.w * ds1Var3.c);
        this.e = this.a + (this.b * nextFloat);
        wv0Var.h(4);
        wv0Var.i(0).g = this.n + (this.o * f);
        wv0Var.i(0).h = this.p + (this.q * nextFloat);
        wv0Var.i(1).g = this.n + (this.o * f);
        wv0Var.i(1).h = this.p + (this.q * nextFloat);
        wv0Var.i(2).g = this.n + (this.o * f);
        wv0Var.i(2).h = this.p + (this.q * nextFloat);
        wv0Var.i(3).g = this.n + (this.o * f);
        wv0Var.i(3).h = this.p + (this.q * nextFloat);
        wv0Var.i(0).a = 0.0f;
        wv0Var.i(1).a = this.z;
        wv0Var.i(2).a = this.A;
        wv0Var.i(3).a = 1.0f;
        wv0Var.i(0).e = this.k;
        wv0Var.i(1).e = this.k;
        wv0Var.i(2).e = this.k;
        wv0Var.i(3).e = this.k;
        xv0 i = wv0Var.i(0);
        xv0 i2 = wv0Var.i(0);
        float f3 = this.s + f2;
        i2.c = f3;
        i.b = f3;
        xv0 i3 = wv0Var.i(1);
        xv0 i4 = wv0Var.i(1);
        float f4 = ((this.t + f2) * this.B) + (this.D * this.z);
        i4.c = f4;
        i3.b = f4;
        xv0 i5 = wv0Var.i(2);
        xv0 i6 = wv0Var.i(2);
        float f5 = ((this.t + f2) * this.C) + (this.D * this.A);
        i6.c = f5;
        i5.b = f5;
        xv0 i7 = wv0Var.i(3);
        xv0 i8 = wv0Var.i(3);
        float f6 = this.D + f2;
        i8.c = f6;
        i7.b = f6;
        wv0Var.i(0).b = wv0Var.i(0).c * this.r;
        wv0Var.i(1).b = wv0Var.i(1).c * this.r;
        wv0Var.i(2).b = wv0Var.i(2).c * this.r;
        wv0Var.i(3).b = wv0Var.i(3).c * this.r;
        br1.r(this.l, this.m, this.x, nextFloat);
        f80.j(this.x, this.y);
        wv0Var.i(0).c(0);
        wv0Var.i(1).d(this.y);
        wv0Var.i(2).d(this.y);
        wv0Var.i(3).c(0);
        ds1 ds1Var4 = wv0Var.o;
        ds1Var4.a = ds1Var.a;
        ds1Var4.b = ds1Var.b;
        ds1Var4.c = ds1Var.c;
        ds1 ds1Var5 = wv0Var.l;
        float f7 = ds1Var3.a;
        float f8 = this.e;
        ds1Var5.a = f7 * f8;
        ds1Var5.b = ds1Var3.b * f8;
        ds1Var5.c = ds1Var3.c * f8;
        wv0Var.n = this.j;
        wv0Var.a = br1.F();
        wv0Var.b = 0.0f;
        wv0Var.e = 0.0f;
        wv0Var.f = 0.0f;
        wv0Var.g = this.h;
        wv0Var.i = false;
        wv0Var.h = false;
        wv0Var.j = null;
        wv0Var.j(true);
        return true;
    }

    @Override // com.daaw.ae0
    public zd0 h() {
        return new wv0();
    }

    @Override // com.daaw.a, com.daaw.zc0
    public void o(un unVar) {
        super.o(unVar);
        unVar.I("ColorFrom", this.l, "appearance");
        unVar.I("ColorTo", this.m, "appearance");
        unVar.O("lifetime", this.h, "behaviour", 0.1f, 10.0f);
        unVar.O("fadeInAndOutTime", this.i, "appearance", 0.0f, 0.5f);
        unVar.k0("gravity", this.j, "behaviour", -300.0f, 300.0f);
        unVar.L("velocityAngle", this.k, "appearance");
        unVar.O("sizeAspectRatio", this.r, "appearance", 0.1f, 10.0f);
        unVar.O("startSize", this.s, "appearance", 0.0f, 20.0f);
        unVar.O("fadeInSize", this.t, "appearance", 0.0f, 20.0f);
        unVar.O("endSize", this.u, "appearance", 0.0f, 20.0f);
        unVar.O("endSizeRandom", this.v, "appearance", 0.0f, 20.0f);
        unVar.O("endSizeZFactor", this.w, "appearance", 0.0f, 40.0f);
        unVar.O("sideSineWaveFreq", this.n, "waveBehaviour", 0.0f, 10.0f);
        unVar.O("sideSineWaveFreqRandom", this.o, "waveBehaviour", -10.0f, 10.0f);
        unVar.O("sideSineWaveMag", this.p, "waveBehaviour", 0.0f, 10.0f);
        unVar.O("sideSineWaveMagRandom", this.q, "waveBehaviour", -10.0f, 10.0f);
    }

    public void r(int i) {
        f80.p(this.l, i);
    }

    public void s(int i) {
        f80.p(this.m, i);
    }

    public void t(float f) {
        this.u = f;
    }

    public void u(float f) {
        this.v = f;
    }

    public void v(float f) {
        float min = Math.min(Math.max(0.0f, f), 0.5f);
        this.i = min;
        this.z = min;
        float f2 = 1.0f - min;
        this.A = f2;
        this.B = 1.0f - min;
        this.C = 1.0f - f2;
    }

    public void w(float f) {
        this.t = f;
    }

    public void x(float f) {
        this.h = f;
    }

    public void y(float f) {
        this.n = f;
    }

    public void z(float f) {
        this.p = f;
    }
}
