package com.daaw;

import com.daaw.te1;
/* loaded from: classes.dex */
public class ue1 {

    /* renamed from: a */
    public AbstractC3044tc f29009a;

    public ue1(AbstractC3044tc abstractC3044tc) {
        this.f29009a = abstractC3044tc;
    }

    /* renamed from: a */
    public void m8291a(y31 y31Var, te1 te1Var, ds1 ds1Var, String str, int i, int i2, boolean z, int i3, int i4, int i5, int i6, w31 w31Var) {
        bs1 bs1Var;
        bs1 bs1Var2;
        bs1 bs1Var3;
        bs1 bs1Var4;
        ue1 ue1Var = this;
        te1 te1Var2 = te1Var;
        int length = str.length();
        float f = ds1Var.f7696a;
        float f2 = ds1Var.f7697b;
        float f3 = i3 + i5;
        float f4 = i4 + i6;
        bs1 bs1Var5 = new bs1(0.0f, 0.0f);
        bs1 bs1Var6 = new bs1(0.0f, 0.0f);
        char c = '\n';
        if (!z) {
            float f5 = f2;
            float f6 = f;
            int i7 = i2;
            while (i7 < length) {
                char charAt = str.charAt(i7);
                if (charAt == c) {
                    f5 += te1Var.m9231b();
                    f6 = f;
                    bs1Var3 = bs1Var6;
                    bs1Var4 = bs1Var5;
                } else {
                    te1.C3071a m9229d = te1Var2.m9229d(charAt);
                    bs1Var5.f5090a = m9229d.f27566a / te1Var.m9225h().f5090a;
                    bs1Var5.f5091b = m9229d.f27567b / te1Var.m9225h().f5091b;
                    bs1Var6.f5090a = (m9229d.f27566a + m9229d.f27568c) / te1Var.m9225h().f5090a;
                    bs1Var6.f5091b = (m9229d.f27567b + m9229d.f27569d) / te1Var.m9225h().f5091b;
                    float f7 = m9229d.f27569d;
                    bs1Var3 = bs1Var6;
                    bs1Var4 = bs1Var5;
                    ue1Var.f29009a.m9355n(y31Var, m9229d.f27570e + f6, (m9229d.f27571f + f5) - f7, 1.0f, m9229d.f27568c, f7, i, bs1Var4, bs1Var3, w31Var, false);
                    f6 += m9229d.f27572g;
                }
                i7++;
                bs1Var5 = bs1Var4;
                bs1Var6 = bs1Var3;
                c = '\n';
            }
            return;
        }
        bs1 bs1Var7 = bs1Var5;
        bs1 bs1Var8 = bs1Var6;
        float f8 = f;
        float f9 = f2;
        int i8 = i2;
        while (i8 < length) {
            char charAt2 = str.charAt(i8);
            if (charAt2 == '\n') {
                f9 += te1Var.m9231b();
                bs1Var = bs1Var7;
                bs1Var2 = bs1Var8;
            } else {
                te1.C3071a m9229d2 = te1Var2.m9229d(charAt2);
                float f10 = i3 - f8;
                float f11 = i4 - f9;
                float f12 = m9229d2.f27568c;
                float f13 = (f12 + f8) - f3;
                float f14 = m9229d2.f27569d;
                float f15 = (f14 + f9) - f4;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f15 < 0.0f) {
                    f15 = 0.0f;
                }
                if (f10 > f12 || f13 > f12 || f11 > f14 || f15 > f14) {
                    bs1Var = bs1Var7;
                    bs1Var2 = bs1Var8;
                    f8 += m9229d2.f27572g;
                } else {
                    float f16 = f8 + f10;
                    float f17 = m9229d2.f27566a + f10;
                    float f18 = m9229d2.f27567b + f11;
                    float f19 = f12 - f13;
                    float f20 = f14 - f15;
                    bs1 bs1Var9 = bs1Var7;
                    bs1Var9.f5090a = f17 / te1Var.m9225h().f5090a;
                    bs1Var9.f5091b = f18 / te1Var.m9225h().f5091b;
                    bs1Var8.f5090a = (f17 + f19) / te1Var.m9225h().f5090a;
                    bs1Var8.f5091b = (f18 + f20) / te1Var.m9225h().f5091b;
                    bs1Var = bs1Var9;
                    bs1Var2 = bs1Var8;
                    ue1Var.f29009a.m9355n(y31Var, f16, f9 + f11, 1.0f, f19, f20, i, bs1Var, bs1Var2, w31Var, false);
                    f8 = f16 + m9229d2.f27572g;
                }
            }
            i8++;
            ue1Var = this;
            te1Var2 = te1Var;
            bs1Var7 = bs1Var;
            bs1Var8 = bs1Var2;
        }
    }

    /* renamed from: b */
    public cs1 m8290b(te1 te1Var, String str) {
        float f = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            f += te1Var.m9229d(str.charAt(i)).f27572g;
        }
        return new cs1((int) f, (int) te1Var.m9231b());
    }
}
