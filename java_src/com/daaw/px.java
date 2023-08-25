package com.daaw;

import com.daaw.lv;
/* loaded from: classes.dex */
public class px {
    public static double a = 20.0d;
    public static double b = 22050.0d;

    public static void a(lv lvVar, zx0 zx0Var) {
        float f;
        lv.a aVar;
        zx0Var.a();
        if (lvVar.b.length <= 0) {
            return;
        }
        float log10 = (float) Math.log10(a);
        float log102 = ((float) Math.log10(b)) - log10;
        int i = 0;
        while (true) {
            lv.a[] aVarArr = lvVar.b;
            if (i >= aVarArr.length) {
                return;
            }
            float log103 = (float) Math.log10(aVarArr[i].a);
            if (log103 >= log10) {
                f = (log103 - log10) / log102;
                if (f > 1.0f) {
                    zx0Var.d(f, lvVar.b[i].b);
                    return;
                }
                aVar = lvVar.b[i];
            } else {
                f = 0.0f;
                aVar = lvVar.b[i];
            }
            zx0Var.d(f, aVar.b);
            i++;
        }
    }

    public static void b(lv lvVar, lv lvVar2, lv lvVar3, float f, float f2, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[fArr.length];
        float[] fArr4 = new float[fArr.length];
        float[] fArr5 = new float[fArr.length];
        zx0 zx0Var = new zx0();
        a(lvVar, zx0Var);
        d(zx0Var, fArr3, fArr2);
        a(lvVar2, zx0Var);
        d(zx0Var, fArr4, fArr2);
        a(lvVar3, zx0Var);
        d(zx0Var, fArr5, fArr2);
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = fArr3[i] + (fArr4[i] * f) + (fArr5[i] * f2);
            fArr[i] = br1.j(fArr[i], -1.0f, 1.0f);
        }
    }

    public static void c(lv lvVar, lv lvVar2) {
        lv.a[] aVarArr = lvVar2.b;
        int length = aVarArr.length;
        float[] fArr = new float[length];
        int length2 = aVarArr.length;
        float[] fArr2 = new float[length2];
        for (int i = 0; i < length2; i++) {
            fArr2[i] = lvVar2.b[i].a;
        }
        zx0 zx0Var = new zx0();
        a(lvVar, zx0Var);
        d(zx0Var, fArr, fArr2);
        for (int i2 = 0; i2 < length; i2++) {
            lvVar2.b[i2].b = fArr[i2];
        }
    }

    public static void d(zx0 zx0Var, float[] fArr, float[] fArr2) {
        float log10 = (float) Math.log10(a);
        float log102 = ((float) Math.log10(b)) - log10;
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = zx0Var.b(((double) fArr2[i]) == a ? 0.0f : (((float) Math.log10(fArr2[i])) - log10) / log102);
        }
    }
}
