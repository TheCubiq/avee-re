package com.daaw;

import com.daaw.C2120lv;
/* renamed from: com.daaw.px */
/* loaded from: classes.dex */
public class C2650px {

    /* renamed from: a */
    public static double f23469a = 20.0d;

    /* renamed from: b */
    public static double f23470b = 22050.0d;

    /* renamed from: a */
    public static void m12964a(C2120lv c2120lv, zx0 zx0Var) {
        float f;
        C2120lv.C2121a c2121a;
        zx0Var.m1811a();
        if (c2120lv.f17809b.length <= 0) {
            return;
        }
        float log10 = (float) Math.log10(f23469a);
        float log102 = ((float) Math.log10(f23470b)) - log10;
        int i = 0;
        while (true) {
            C2120lv.C2121a[] c2121aArr = c2120lv.f17809b;
            if (i >= c2121aArr.length) {
                return;
            }
            float log103 = (float) Math.log10(c2121aArr[i].f17810a);
            if (log103 >= log10) {
                f = (log103 - log10) / log102;
                if (f > 1.0f) {
                    zx0Var.m1808d(f, c2120lv.f17809b[i].f17811b);
                    return;
                }
                c2121a = c2120lv.f17809b[i];
            } else {
                f = 0.0f;
                c2121a = c2120lv.f17809b[i];
            }
            zx0Var.m1808d(f, c2121a.f17811b);
            i++;
        }
    }

    /* renamed from: b */
    public static void m12963b(C2120lv c2120lv, C2120lv c2120lv2, C2120lv c2120lv3, float f, float f2, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[fArr.length];
        float[] fArr4 = new float[fArr.length];
        float[] fArr5 = new float[fArr.length];
        zx0 zx0Var = new zx0();
        m12964a(c2120lv, zx0Var);
        m12961d(zx0Var, fArr3, fArr2);
        m12964a(c2120lv2, zx0Var);
        m12961d(zx0Var, fArr4, fArr2);
        m12964a(c2120lv3, zx0Var);
        m12961d(zx0Var, fArr5, fArr2);
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = fArr3[i] + (fArr4[i] * f) + (fArr5[i] * f2);
            fArr[i] = br1.m25899j(fArr[i], -1.0f, 1.0f);
        }
    }

    /* renamed from: c */
    public static void m12962c(C2120lv c2120lv, C2120lv c2120lv2) {
        C2120lv.C2121a[] c2121aArr = c2120lv2.f17809b;
        int length = c2121aArr.length;
        float[] fArr = new float[length];
        int length2 = c2121aArr.length;
        float[] fArr2 = new float[length2];
        for (int i = 0; i < length2; i++) {
            fArr2[i] = c2120lv2.f17809b[i].f17810a;
        }
        zx0 zx0Var = new zx0();
        m12964a(c2120lv, zx0Var);
        m12961d(zx0Var, fArr, fArr2);
        for (int i2 = 0; i2 < length; i2++) {
            c2120lv2.f17809b[i2].f17811b = fArr[i2];
        }
    }

    /* renamed from: d */
    public static void m12961d(zx0 zx0Var, float[] fArr, float[] fArr2) {
        float log10 = (float) Math.log10(f23469a);
        float log102 = ((float) Math.log10(f23470b)) - log10;
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = zx0Var.m1810b(((double) fArr2[i]) == f23469a ? 0.0f : (((float) Math.log10(fArr2[i])) - log10) / log102);
        }
    }
}
