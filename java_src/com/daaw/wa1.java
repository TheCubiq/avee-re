package com.daaw;

import com.daaw.he0;
/* loaded from: classes.dex */
public class wa1 extends xa1 {

    /* renamed from: h */
    public float f31093h = 0.5f;

    /* renamed from: i */
    public boolean f31094i = false;

    /* renamed from: j */
    public boolean f31095j = false;

    /* renamed from: k */
    public he0.C1532a f31096k;

    /* renamed from: l */
    public he0.C1532a f31097l;

    @Override // com.daaw.xa1, com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        super.mo2493a(c3239un);
        this.f31093h = c3239un.m7953o("barWidth", 0.5f);
        this.f31095j = c3239un.m7955n("barWidthAffectedByShape", false);
        this.f31094i = c3239un.m7955n("mirror", false);
    }

    @Override // com.daaw.he0
    /* renamed from: m */
    public void mo2574m(de0 de0Var, he0.C1532a[] c1532aArr, float f, float f2, int i, float f3) {
        int i2;
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
        he0.C1532a[] c1532aArr2 = c1532aArr;
        int length = c1532aArr2.length;
        float round = Math.round((0.5f * f) / (length + 1)) * this.f31093h;
        bs1 bs1Var = new bs1(0.0f, 0.0f);
        bs1 bs1Var2 = new bs1(0.0f, 0.0f);
        boolean mo2883h = de0Var.mo2883h();
        w31 w31Var = !mo2883h ? new w31(i, de0Var.mo2889b().mo4181e(), (qr1) null, (InterfaceC1348g0<y31, sr1, w31>) null, 2) : null;
        int i3 = 0;
        while (i3 < c1532aArr2.length) {
            he0.C1532a c1532a = c1532aArr2[i3];
            int i4 = c1532a.f12435a;
            this.f31096k = i4 < 0 ? c1532a : c1532aArr2[i4];
            int i5 = c1532a.f12436b;
            this.f31097l = i5 < 0 ? c1532a : c1532aArr2[i5];
            int m5339q = m5339q(i3, length, f3);
            float f13 = c1532a.f12439e;
            float f14 = c1532a.f12440f;
            float f15 = c1532a.f12438d * (-2.0f) * f2;
            float m25905d = br1.m25905d(f15);
            float f16 = f15 * this.f32274f;
            if (this.f31094i) {
                f13 -= c1532a.f12441g * f16;
                f14 -= c1532a.f12442h * f16;
                i2 = length;
                double d = f16;
                Double.isNaN(d);
                f16 = (float) (d * 2.0d);
            } else {
                i2 = length;
            }
            if (this.f31095j) {
                float f17 = c1532a.f12441g;
                he0.C1532a c1532a2 = this.f31096k;
                bs1Var.f5090a = c1532a2.f12441g + f17;
                float f18 = c1532a.f12442h;
                bs1Var.f5091b = c1532a2.f12442h + f18;
                he0.C1532a c1532a3 = this.f31097l;
                bs1Var2.f5090a = f17 + c1532a3.f12441g;
                bs1Var2.f5091b = f18 + c1532a3.f12442h;
                bs1Var2.m25847p();
                bs1Var.m25847p();
                float m25861b = (bs1.m25861b(c1532a.f12441g, c1532a.f12442h) * round) + f13;
                m25860c = (bs1.m25860c(c1532a.f12441g, c1532a.f12442h) * round) + f14;
                m25859d = (bs1.m25859d(c1532a.f12441g, c1532a.f12442h) * round) + f13;
                m25858e = (bs1.m25858e(c1532a.f12441g, c1532a.f12442h) * round) + f14;
                float f19 = (bs1Var.f5090a * f16) + m25861b;
                float f20 = (bs1Var2.f5090a * f16) + m25859d;
                f4 = (bs1Var2.f5091b * f16) + m25858e;
                f6 = (bs1Var.f5091b * f16) + m25860c;
                f5 = f20;
                f7 = m25861b;
                f8 = f19;
            } else {
                float m25861b2 = (bs1.m25861b(c1532a.f12441g, c1532a.f12442h) * round) + f13;
                m25860c = (bs1.m25860c(c1532a.f12441g, c1532a.f12442h) * round) + f14;
                m25859d = (bs1.m25859d(c1532a.f12441g, c1532a.f12442h) * round) + f13;
                m25858e = (bs1.m25858e(c1532a.f12441g, c1532a.f12442h) * round) + f14;
                float f21 = c1532a.f12441g;
                float f22 = (f21 * f16) + m25861b2;
                float f23 = c1532a.f12442h;
                f4 = (f23 * f16) + m25858e;
                f5 = (f21 * f16) + m25859d;
                f6 = (f23 * f16) + m25860c;
                f7 = m25861b2;
                f8 = f22;
            }
            if (this.f32272d) {
                float f24 = c1532a.f12441g;
                float f25 = this.f32273e;
                float f26 = c1532a.f12442h;
                f11 = f5 + (f24 * m25905d * f25);
                f9 = f8 + (f24 * m25905d * f25);
                f12 = f4 + (f26 * m25905d * f25);
                f10 = f6 + (f26 * m25905d * f25);
            } else {
                f9 = f7;
                f10 = m25860c;
                f11 = m25859d;
                f12 = m25858e;
            }
            sc0 mo2881j = de0Var.mo2881j();
            bs1 m25844s = bs1.m25844s();
            bs1 m25846q = bs1.m25846q();
            if (mo2883h) {
                mo2881j.mo7294b(de0Var, f8, f6, f5, f4, f9, f10, f11, f12, 0.0f, m5339q, m25844s, m25846q, de0Var.mo2889b().mo4183c(), i, null);
            } else {
                mo2881j.mo7292d(de0Var, f8, f6, f5, f4, f9, f10, f11, f12, 0.0f, m5339q, m25844s, m25846q, w31Var);
            }
            i3++;
            c1532aArr2 = c1532aArr;
            length = i2;
        }
    }

    @Override // com.daaw.xa1, com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        super.mo2492o(c3239un);
        c3239un.m7990O("barWidth", this.f31093h, "misc", 0.0f, 2.0f);
        c3239un.m7993L("barWidthAffectedByShape", this.f31095j, "b");
        c3239un.m7993L("mirror", this.f31094i, "b");
    }
}
