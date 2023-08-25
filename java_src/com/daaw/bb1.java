package com.daaw;

import android.graphics.PointF;
import com.daaw.he0;
/* loaded from: classes.dex */
public class bb1 extends xa1 {

    /* renamed from: h */
    public float f4592h = 0.5f;

    /* renamed from: i */
    public boolean f4593i = false;

    /* renamed from: j */
    public PointF f4594j = new PointF();

    /* renamed from: k */
    public PointF f4595k = new PointF();

    @Override // com.daaw.xa1, com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        super.mo2493a(c3239un);
        this.f4592h = c3239un.m7953o("barWidth", 0.5f);
        this.f4593i = c3239un.m7955n("mirror", false);
    }

    @Override // com.daaw.he0
    /* renamed from: m */
    public void mo2574m(de0 de0Var, he0.C1532a[] c1532aArr, float f, float f2, int i, float f3) {
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
        float f15;
        he0.C1532a[] c1532aArr2 = c1532aArr;
        int length = c1532aArr2.length;
        float round = Math.round((1.0f * f) / (length + 1)) * this.f4592h;
        int i2 = 0;
        while (i2 < c1532aArr2.length) {
            he0.C1532a c1532a = c1532aArr2[i2];
            int i3 = c1532a.f12435a;
            if (i3 >= 0) {
                he0.C1532a c1532a2 = c1532aArr2[i3];
                int m5339q = m5339q(i2, length, f3);
                PointF pointF = this.f4594j;
                pointF.x = c1532a2.f12439e;
                pointF.y = c1532a2.f12440f;
                PointF pointF2 = this.f4595k;
                pointF2.x = c1532a.f12439e;
                pointF2.y = c1532a.f12440f;
                float f16 = this.f32274f;
                float f17 = c1532a2.f12438d * (-2.0f) * f2 * f16;
                float f18 = c1532a.f12438d * (-2.0f) * f2 * f16;
                if (this.f4593i) {
                    pointF.x -= c1532a2.f12441g * f17;
                    pointF.y -= c1532a2.f12442h * f17;
                    double d = f17;
                    Double.isNaN(d);
                    f17 = (float) (d * 2.0d);
                    pointF2.x -= c1532a.f12441g * f18;
                    pointF2.y -= c1532a.f12442h * f18;
                    double d2 = f18;
                    Double.isNaN(d2);
                    f18 = (float) (d2 * 2.0d);
                }
                if (f17 < 0.0f) {
                    f5 = (bs1.m25861b(c1532a.f12441g, c1532a.f12442h) * round) + this.f4595k.x;
                    f7 = (bs1.m25860c(c1532a.f12441g, c1532a.f12442h) * round) + this.f4595k.y;
                    f4 = (c1532a.f12441g * f17) + f5;
                    f6 = (c1532a.f12442h * f17) + f7;
                } else {
                    float m25861b = (bs1.m25861b(c1532a.f12441g, c1532a.f12442h) * round) + this.f4595k.x;
                    float m25860c = (bs1.m25860c(c1532a.f12441g, c1532a.f12442h) * round) + this.f4595k.y;
                    f4 = m25861b;
                    f5 = (c1532a.f12441g * f17) + m25861b;
                    f6 = m25860c;
                    f7 = (c1532a.f12442h * f17) + m25860c;
                }
                if (f18 < 0.0f) {
                    f11 = (bs1.m25859d(c1532a.f12441g, c1532a.f12442h) * round) + this.f4595k.x;
                    float m25858e = (bs1.m25858e(c1532a.f12441g, c1532a.f12442h) * round) + this.f4595k.y;
                    f9 = (c1532a.f12442h * f18) + m25858e;
                    f8 = m25858e;
                    f10 = (c1532a.f12441g * f18) + f11;
                } else {
                    float m25859d = (bs1.m25859d(c1532a.f12441g, c1532a.f12442h) * round) + this.f4595k.x;
                    float m25858e2 = (bs1.m25858e(c1532a.f12441g, c1532a.f12442h) * round) + this.f4595k.y;
                    f8 = (c1532a.f12442h * f18) + m25858e2;
                    f9 = m25858e2;
                    f10 = m25859d;
                    f11 = (c1532a.f12441g * f18) + m25859d;
                }
                float f19 = f9;
                if (this.f32272d) {
                    float signum = Math.signum(f18);
                    float f20 = c1532a.f12441g;
                    float f21 = this.f32273e;
                    float f22 = c1532a.f12442h;
                    f14 = (f22 * signum * f21) + f19;
                    f12 = (f20 * signum * f21) + f10;
                    f13 = (f20 * signum * f21) + f4;
                    f15 = (f22 * signum * f21) + f6;
                } else {
                    f12 = f11;
                    f13 = f5;
                    f14 = f8;
                    f15 = f7;
                }
                if (de0Var.mo2883h()) {
                    de0Var.mo2881j().mo7294b(de0Var, f4, f6, f10, f19, f13, f15, f12, f14, 0.0f, m5339q, bs1.m25844s(), bs1.m25846q(), de0Var.mo2889b().mo4183c(), i, null);
                } else {
                    de0Var.mo2881j().mo7292d(de0Var, f4, f6, f10, f19, f13, f15, f12, f14, 0.0f, m5339q, bs1.m25844s(), bs1.m25846q(), new w31(i, de0Var.mo2889b().mo4181e(), (qr1) null, (InterfaceC1348g0<y31, sr1, w31>) null, 2));
                }
            }
            i2++;
            c1532aArr2 = c1532aArr;
        }
    }

    @Override // com.daaw.xa1, com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        super.mo2492o(c3239un);
        c3239un.m7990O("barWidth", this.f4592h, "misc", 0.0f, 2.0f);
        c3239un.m7993L("mirror", this.f4593i, "misc");
    }
}
