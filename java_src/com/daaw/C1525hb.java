package com.daaw;

import java.util.Random;
/* renamed from: com.daaw.hb */
/* loaded from: classes.dex */
public class C1525hb extends AbstractC0559a {

    /* renamed from: D */
    public float f12322D;

    /* renamed from: f */
    public final Random f12323f = new Random();

    /* renamed from: g */
    public String f12324g = null;

    /* renamed from: h */
    public float f12325h = 1.5f;

    /* renamed from: i */
    public float f12326i = 0.1f;

    /* renamed from: j */
    public bs1 f12327j = new bs1(0.0f, 0.0f);

    /* renamed from: k */
    public boolean f12328k = true;

    /* renamed from: l */
    public float[] f12329l = {1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: m */
    public float[] f12330m = {1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: n */
    public float f12331n = 0.0f;

    /* renamed from: o */
    public float f12332o = 0.0f;

    /* renamed from: p */
    public float f12333p = 0.0f;

    /* renamed from: q */
    public float f12334q = 0.0f;

    /* renamed from: r */
    public float f12335r = 1.0f;

    /* renamed from: s */
    public float f12336s = 4.0f;

    /* renamed from: t */
    public float f12337t = 4.0f;

    /* renamed from: u */
    public float f12338u = 4.0f;

    /* renamed from: v */
    public float f12339v = 0.0f;

    /* renamed from: w */
    public float f12340w = 0.0f;

    /* renamed from: x */
    public float[] f12341x = new float[4];

    /* renamed from: y */
    public float[] f12342y = new float[4];

    /* renamed from: z */
    public float f12343z = 0.1f;

    /* renamed from: A */
    public float f12319A = 0.1f;

    /* renamed from: B */
    public float f12320B = 0.1f;

    /* renamed from: C */
    public float f12321C = 0.1f;

    public C1525hb() {
        m20867v(0.1f);
    }

    /* renamed from: A */
    public void m20874A(float f) {
        this.f12336s = f;
    }

    @Override // com.daaw.AbstractC0559a, com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        super.mo2493a(c3239un);
        this.f12329l = c3239un.m7957m("ColorFrom", new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        this.f12330m = c3239un.m7957m("ColorTo", new float[]{0.0f, 0.0f, 0.5f, 0.5f});
        this.f12325h = c3239un.m7953o("lifetime", 8.0f);
        m20867v(c3239un.m7953o("fadeInAndOutTime", 0.1f));
        this.f12327j = c3239un.m7937z("gravity", new bs1(0.0f, 0.0f));
        this.f12328k = c3239un.m7955n("velocityAngle", true);
        this.f12335r = c3239un.m7953o("sizeAspectRatio", 1.0f);
        this.f12336s = c3239un.m7953o("startSize", 0.0f);
        this.f12337t = c3239un.m7953o("fadeInSize", 4.0f);
        this.f12338u = c3239un.m7953o("endSize", 4.0f);
        this.f12339v = c3239un.m7953o("endSizeRandom", 10.0f);
        this.f12340w = c3239un.m7953o("endSizeZFactor", 0.0f);
        this.f12331n = c3239un.m7953o("sideSineWaveFreq", 0.0f);
        this.f12332o = c3239un.m7953o("sideSineWaveFreqRandom", 0.0f);
        this.f12333p = c3239un.m7953o("sideSineWaveMag", 0.0f);
        this.f12334q = c3239un.m7953o("sideSineWaveMagRandom", 0.0f);
    }

    @Override // com.daaw.ae0
    /* renamed from: g */
    public boolean mo20873g(y31 y31Var, zd0 zd0Var, ds1 ds1Var, ds1 ds1Var2) {
        wv0 wv0Var = (wv0) zd0Var;
        float nextFloat = this.f12323f.nextFloat();
        float f = 1.0f - nextFloat;
        ds1 ds1Var3 = new ds1(ds1Var2.f7696a * 0.2f, ds1Var2.f7697b * 0.2f, ds1Var2.f7698c * 0.02f);
        ds1Var3.m24011c();
        float f2 = this.f12339v * nextFloat;
        this.f12322D = this.f12338u + (this.f12340w * ds1Var3.f7698c);
        this.f2656e = this.f2652a + (this.f2653b * nextFloat);
        wv0Var.m5779h(4);
        wv0Var.m5778i(0).f32978g = this.f12331n + (this.f12332o * f);
        wv0Var.m5778i(0).f32979h = this.f12333p + (this.f12334q * nextFloat);
        wv0Var.m5778i(1).f32978g = this.f12331n + (this.f12332o * f);
        wv0Var.m5778i(1).f32979h = this.f12333p + (this.f12334q * nextFloat);
        wv0Var.m5778i(2).f32978g = this.f12331n + (this.f12332o * f);
        wv0Var.m5778i(2).f32979h = this.f12333p + (this.f12334q * nextFloat);
        wv0Var.m5778i(3).f32978g = this.f12331n + (this.f12332o * f);
        wv0Var.m5778i(3).f32979h = this.f12333p + (this.f12334q * nextFloat);
        wv0Var.m5778i(0).f32972a = 0.0f;
        wv0Var.m5778i(1).f32972a = this.f12343z;
        wv0Var.m5778i(2).f32972a = this.f12319A;
        wv0Var.m5778i(3).f32972a = 1.0f;
        wv0Var.m5778i(0).f32976e = this.f12328k;
        wv0Var.m5778i(1).f32976e = this.f12328k;
        wv0Var.m5778i(2).f32976e = this.f12328k;
        wv0Var.m5778i(3).f32976e = this.f12328k;
        xv0 m5778i = wv0Var.m5778i(0);
        xv0 m5778i2 = wv0Var.m5778i(0);
        float f3 = this.f12336s + f2;
        m5778i2.f32974c = f3;
        m5778i.f32973b = f3;
        xv0 m5778i3 = wv0Var.m5778i(1);
        xv0 m5778i4 = wv0Var.m5778i(1);
        float f4 = ((this.f12337t + f2) * this.f12320B) + (this.f12322D * this.f12343z);
        m5778i4.f32974c = f4;
        m5778i3.f32973b = f4;
        xv0 m5778i5 = wv0Var.m5778i(2);
        xv0 m5778i6 = wv0Var.m5778i(2);
        float f5 = ((this.f12337t + f2) * this.f12321C) + (this.f12322D * this.f12319A);
        m5778i6.f32974c = f5;
        m5778i5.f32973b = f5;
        xv0 m5778i7 = wv0Var.m5778i(3);
        xv0 m5778i8 = wv0Var.m5778i(3);
        float f6 = this.f12322D + f2;
        m5778i8.f32974c = f6;
        m5778i7.f32973b = f6;
        wv0Var.m5778i(0).f32973b = wv0Var.m5778i(0).f32974c * this.f12335r;
        wv0Var.m5778i(1).f32973b = wv0Var.m5778i(1).f32974c * this.f12335r;
        wv0Var.m5778i(2).f32973b = wv0Var.m5778i(2).f32974c * this.f12335r;
        wv0Var.m5778i(3).f32973b = wv0Var.m5778i(3).f32974c * this.f12335r;
        br1.m25891r(this.f12329l, this.f12330m, this.f12341x, nextFloat);
        f80.m22864j(this.f12341x, this.f12342y);
        wv0Var.m5778i(0).m4492c(0);
        wv0Var.m5778i(1).m4491d(this.f12342y);
        wv0Var.m5778i(2).m4491d(this.f12342y);
        wv0Var.m5778i(3).m4492c(0);
        ds1 ds1Var4 = wv0Var.f31548o;
        ds1Var4.f7696a = ds1Var.f7696a;
        ds1Var4.f7697b = ds1Var.f7697b;
        ds1Var4.f7698c = ds1Var.f7698c;
        ds1 ds1Var5 = wv0Var.f31545l;
        float f7 = ds1Var3.f7696a;
        float f8 = this.f2656e;
        ds1Var5.f7696a = f7 * f8;
        ds1Var5.f7697b = ds1Var3.f7697b * f8;
        ds1Var5.f7698c = ds1Var3.f7698c * f8;
        wv0Var.f31547n = this.f12327j;
        wv0Var.f31534a = br1.m25911F();
        wv0Var.f31535b = 0.0f;
        wv0Var.f31538e = 0.0f;
        wv0Var.f31539f = 0.0f;
        wv0Var.f31540g = this.f12325h;
        wv0Var.f31542i = false;
        wv0Var.f31541h = false;
        wv0Var.f31543j = null;
        wv0Var.m5777j(true);
        return true;
    }

    @Override // com.daaw.ae0
    /* renamed from: h */
    public zd0 mo20872h() {
        return new wv0();
    }

    @Override // com.daaw.AbstractC0559a, com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        super.mo2492o(c3239un);
        c3239un.m7996I("ColorFrom", this.f12329l, "appearance");
        c3239un.m7996I("ColorTo", this.f12330m, "appearance");
        c3239un.m7990O("lifetime", this.f12325h, "behaviour", 0.1f, 10.0f);
        c3239un.m7990O("fadeInAndOutTime", this.f12326i, "appearance", 0.0f, 0.5f);
        c3239un.add_Vec2Slider("gravity", this.f12327j, "behaviour", -300.0f, 300.0f);
        c3239un.add_Checkbox("velocityAngle", this.f12328k, "appearance");
        c3239un.m7990O("sizeAspectRatio", this.f12335r, "appearance", 0.1f, 10.0f);
        c3239un.m7990O("startSize", this.f12336s, "appearance", 0.0f, 20.0f);
        c3239un.m7990O("fadeInSize", this.f12337t, "appearance", 0.0f, 20.0f);
        c3239un.m7990O("endSize", this.f12338u, "appearance", 0.0f, 20.0f);
        c3239un.m7990O("endSizeRandom", this.f12339v, "appearance", 0.0f, 20.0f);
        c3239un.m7990O("endSizeZFactor", this.f12340w, "appearance", 0.0f, 40.0f);
        c3239un.m7990O("sideSineWaveFreq", this.f12331n, "waveBehaviour", 0.0f, 10.0f);
        c3239un.m7990O("sideSineWaveFreqRandom", this.f12332o, "waveBehaviour", -10.0f, 10.0f);
        c3239un.m7990O("sideSineWaveMag", this.f12333p, "waveBehaviour", 0.0f, 10.0f);
        c3239un.m7990O("sideSineWaveMagRandom", this.f12334q, "waveBehaviour", -10.0f, 10.0f);
    }

    /* renamed from: r */
    public void m20871r(int i) {
        f80.m22858p(this.f12329l, i);
    }

    /* renamed from: s */
    public void m20870s(int i) {
        f80.m22858p(this.f12330m, i);
    }

    /* renamed from: t */
    public void m20869t(float f) {
        this.f12338u = f;
    }

    /* renamed from: u */
    public void m20868u(float f) {
        this.f12339v = f;
    }

    /* renamed from: v */
    public void m20867v(float f) {
        float min = Math.min(Math.max(0.0f, f), 0.5f);
        this.f12326i = min;
        this.f12343z = min;
        float f2 = 1.0f - min;
        this.f12319A = f2;
        this.f12320B = 1.0f - min;
        this.f12321C = 1.0f - f2;
    }

    /* renamed from: w */
    public void m20866w(float f) {
        this.f12337t = f;
    }

    /* renamed from: x */
    public void m20865x(float f) {
        this.f12325h = f;
    }

    /* renamed from: y */
    public void m20864y(float f) {
        this.f12331n = f;
    }

    /* renamed from: z */
    public void m20863z(float f) {
        this.f12333p = f;
    }
}
