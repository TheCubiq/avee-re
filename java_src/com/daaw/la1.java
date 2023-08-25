package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public class la1 {
    public es1[] a;

    public la1(List<es1> list) {
        this.a = new es1[list.size()];
        int i = 0;
        while (true) {
            es1[] es1VarArr = this.a;
            if (i >= es1VarArr.length) {
                return;
            }
            es1VarArr[i] = list.get(i);
            i++;
        }
    }

    public float a() {
        float f = 0.0f;
        int i = 0;
        while (true) {
            es1[] es1VarArr = this.a;
            if (i >= es1VarArr.length) {
                return f;
            }
            es1 es1Var = es1VarArr[i];
            f += bs1.l(es1Var.a - es1Var.c, es1Var.b - es1Var.d);
            i++;
        }
    }

    public boolean b(float f, float[] fArr, float[] fArr2) {
        if ((fArr != null && fArr.length < 2) || (fArr2 != null && fArr2.length < 2)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        float f2 = 0.0f;
        int i = 0;
        while (true) {
            es1[] es1VarArr = this.a;
            if (i >= es1VarArr.length) {
                return true;
            }
            es1 es1Var = es1VarArr[i];
            bs1 bs1Var = new bs1(es1Var.c - es1Var.a, es1Var.d - es1Var.b);
            float l = bs1.l(bs1Var.a, bs1Var.b) + f2;
            if (f < l) {
                float f3 = f - f2;
                bs1Var.o();
                float f4 = bs1Var.a;
                fArr2[0] = f4;
                float f5 = bs1Var.b;
                fArr2[1] = f5;
                fArr[0] = es1Var.a + (f4 * f3);
                fArr[1] = es1Var.b + (f5 * f3);
                return true;
            }
            i++;
            f2 = l;
        }
    }
}
