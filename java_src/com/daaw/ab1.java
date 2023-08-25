package com.daaw;

import com.daaw.he0;
/* loaded from: classes.dex */
public class ab1 extends xa1 {

    /* renamed from: m */
    public static bs1 f3031m = new bs1(0.0f, 0.5f);

    /* renamed from: n */
    public static bs1 f3032n = new bs1(1.0f, 0.5f);

    /* renamed from: o */
    public static bs1 f3033o = new bs1(0.0f, 0.5f);

    /* renamed from: p */
    public static bs1 f3034p = new bs1(1.0f, 0.5f);

    /* renamed from: h */
    public float f3035h = 0.5f;

    /* renamed from: i */
    public boolean f3036i = false;

    /* renamed from: j */
    public boolean f3037j = false;

    /* renamed from: k */
    public he0.C1532a f3038k;

    /* renamed from: l */
    public he0.C1532a f3039l;

    @Override // com.daaw.xa1, com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        super.mo2493a(c3239un);
        this.f3035h = c3239un.m7953o("barWidth", 0.5f);
        this.f3037j = c3239un.m7955n("barWidthAffectedByShape", false);
        this.f3036i = c3239un.m7955n("mirror", false);
    }

    @Override // com.daaw.he0
    /* renamed from: m */
    public void mo2574m(de0 de0Var, he0.C1532a[] c1532aArr, float f, float f2, int i, float f3) {
        int i2;
        bs1 bs1Var;
        float m25860c;
        float m25859d;
        float m25858e;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        sc0 mo2881j;
        float f15;
        bs1 m25844s;
        bs1 m25846q;
        C3812z6 mo4183c;
        de0 de0Var2;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        int i3;
        int i4;
        he0.C1532a[] c1532aArr2 = c1532aArr;
        int length = c1532aArr2.length;
        float round = Math.round((f * 0.5f) / (length + 1)) * this.f3035h;
        bs1 bs1Var2 = new bs1(0.0f, 0.0f);
        bs1 bs1Var3 = new bs1(0.0f, 0.0f);
        int i5 = 0;
        while (i5 < c1532aArr2.length) {
            he0.C1532a c1532a = c1532aArr2[i5];
            int i6 = c1532a.f12435a;
            this.f3038k = i6 < 0 ? c1532a : c1532aArr2[i6];
            int i7 = c1532a.f12436b;
            this.f3039l = i7 < 0 ? c1532a : c1532aArr2[i7];
            int m5339q = m5339q(i5, length, f3);
            float f24 = c1532a.f12439e;
            float f25 = c1532a.f12440f;
            float f26 = c1532a.f12438d * (-2.0f) * f2;
            float signum = Math.signum(f26);
            float f27 = f26 * this.f32274f;
            if (this.f3036i) {
                f24 -= c1532a.f12441g * f27;
                f25 -= c1532a.f12442h * f27;
                double d = f27;
                Double.isNaN(d);
                f27 = (float) (d * 2.0d);
            }
            if (this.f3037j) {
                float f28 = c1532a.f12441g;
                he0.C1532a c1532a2 = this.f3038k;
                bs1Var2.f5090a = c1532a2.f12441g + f28;
                float f29 = c1532a.f12442h;
                bs1Var2.f5091b = c1532a2.f12442h + f29;
                he0.C1532a c1532a3 = this.f3039l;
                bs1Var3.f5090a = f28 + c1532a3.f12441g;
                bs1Var3.f5091b = f29 + c1532a3.f12442h;
                bs1Var3.m25847p();
                bs1Var2.m25847p();
                float m25861b = (bs1.m25861b(c1532a.f12441g, c1532a.f12442h) * round) + f24;
                float m25860c2 = (bs1.m25860c(c1532a.f12441g, c1532a.f12442h) * round) + f25;
                m25859d = (bs1.m25859d(c1532a.f12441g, c1532a.f12442h) * round) + f24;
                m25858e = (bs1.m25858e(c1532a.f12441g, c1532a.f12442h) * round) + f25;
                float f30 = (bs1Var2.f5090a * f27) + m25861b;
                float f31 = (bs1Var2.f5091b * f27) + m25860c2;
                float f32 = (bs1Var3.f5090a * f27) + m25859d;
                i2 = length;
                float f33 = (bs1Var3.f5091b * f27) + m25858e;
                float f34 = -(bs1.m25851l(f30 - f32, f31 - f33) * 0.5f);
                f8 = (bs1Var2.f5090a * f34) + f30;
                f12 = (bs1Var2.f5091b * f34) + f31;
                bs1Var = bs1Var2;
                float f35 = (bs1Var3.f5090a * f34) + f32;
                float f36 = (bs1Var3.f5091b * f34) + f33;
                f6 = f33;
                f11 = f31;
                m25860c = m25860c2;
                f7 = f32;
                f10 = f36;
                f9 = f35;
                f4 = f30;
                f5 = m25861b;
            } else {
                i2 = length;
                bs1Var = bs1Var2;
                float m25861b2 = (bs1.m25861b(c1532a.f12441g, c1532a.f12442h) * round) + f24;
                m25860c = (bs1.m25860c(c1532a.f12441g, c1532a.f12442h) * round) + f25;
                m25859d = (bs1.m25859d(c1532a.f12441g, c1532a.f12442h) * round) + f24;
                m25858e = (bs1.m25858e(c1532a.f12441g, c1532a.f12442h) * round) + f25;
                float f37 = c1532a.f12441g;
                f4 = (f37 * f27) + m25861b2;
                float f38 = c1532a.f12442h;
                float f39 = (f38 * f27) + m25860c;
                float f40 = (f37 * f27) + m25859d;
                float f41 = (f27 * f38) + m25858e;
                float f42 = -round;
                float f43 = (f38 * f42) + f41;
                f5 = m25861b2;
                f6 = f41;
                f7 = f40;
                f8 = (f37 * f42) + f4;
                f9 = (f37 * f42) + f40;
                f10 = f43;
                f11 = f39;
                f12 = (f38 * f42) + f39;
            }
            if (this.f32272d) {
                float f44 = c1532a.f12441g;
                float f45 = this.f32273e;
                float f46 = c1532a.f12442h;
                f14 = f7 + (f44 * signum * f45);
                f5 = (f44 * signum * f45) + f4;
                f13 = f6 + (f46 * signum * f45);
                m25860c = (f46 * signum * f45) + f11;
            } else {
                f13 = m25858e;
                f14 = m25859d;
            }
            float f47 = c1532a.f12441g;
            float f48 = (f47 * round) + f5;
            float f49 = c1532a.f12442h;
            float f50 = (f49 * round) + m25860c;
            float f51 = (f47 * round) + f14;
            float f52 = (f49 * round) + f13;
            if (Math.abs(round) > 0.01f) {
                f15 = 0.0f;
                de0Var2 = de0Var;
                i3 = m5339q;
                i4 = i;
                de0Var.mo2881j().mo7291e(de0Var2, f8, f12, f9, f10, f4, f11, f7, f6, 0.0f, i3, bs1.m25844s(), f3032n, de0Var.mo2889b().mo4182d(), i4);
                de0Var.mo2881j().mo7291e(de0Var2, f4, f11, f7, f6, f5, m25860c, f14, f13, 0.0f, i3, f3031m, f3034p, de0Var.mo2889b().mo4182d(), i4);
                mo2881j = de0Var.mo2881j();
                m25844s = f3033o;
                m25846q = bs1.m25846q();
                mo4183c = de0Var.mo2889b().mo4182d();
                f16 = f5;
                f17 = m25860c;
                f18 = f14;
                f19 = f13;
                f20 = f48;
                f21 = f50;
                f22 = f51;
                f23 = f52;
            } else {
                mo2881j = de0Var.mo2881j();
                f15 = 0.0f;
                m25844s = bs1.m25844s();
                m25846q = bs1.m25846q();
                mo4183c = de0Var.mo2889b().mo4183c();
                de0Var2 = de0Var;
                f16 = f4;
                f17 = f11;
                f18 = f7;
                f19 = f6;
                f20 = f5;
                f21 = m25860c;
                f22 = f14;
                f23 = f13;
                i3 = m5339q;
                i4 = i;
            }
            mo2881j.mo7291e(de0Var2, f16, f17, f18, f19, f20, f21, f22, f23, f15, i3, m25844s, m25846q, mo4183c, i4);
            i5++;
            c1532aArr2 = c1532aArr;
            length = i2;
            bs1Var2 = bs1Var;
        }
    }

    @Override // com.daaw.xa1, com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        super.mo2492o(c3239un);
        c3239un.m7990O("barWidth", this.f3035h, "misc", 0.0f, 2.0f);
        c3239un.add_Checkbox("barWidthAffectedByShape", this.f3037j, "b");
        c3239un.add_Checkbox("mirror", this.f3036i, "misc");
    }
}
