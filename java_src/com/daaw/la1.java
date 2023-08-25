package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public class la1 {

    /* renamed from: a */
    public es1[] f17175a;

    public la1(List<es1> list) {
        this.f17175a = new es1[list.size()];
        int i = 0;
        while (true) {
            es1[] es1VarArr = this.f17175a;
            if (i >= es1VarArr.length) {
                return;
            }
            es1VarArr[i] = list.get(i);
            i++;
        }
    }

    /* renamed from: a */
    public float m17074a() {
        float f = 0.0f;
        int i = 0;
        while (true) {
            es1[] es1VarArr = this.f17175a;
            if (i >= es1VarArr.length) {
                return f;
            }
            es1 es1Var = es1VarArr[i];
            f += bs1.m25851l(es1Var.f8721a - es1Var.f8723c, es1Var.f8722b - es1Var.f8724d);
            i++;
        }
    }

    /* renamed from: b */
    public boolean m17073b(float f, float[] fArr, float[] fArr2) {
        if ((fArr != null && fArr.length < 2) || (fArr2 != null && fArr2.length < 2)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        float f2 = 0.0f;
        int i = 0;
        while (true) {
            es1[] es1VarArr = this.f17175a;
            if (i >= es1VarArr.length) {
                return true;
            }
            es1 es1Var = es1VarArr[i];
            bs1 bs1Var = new bs1(es1Var.f8723c - es1Var.f8721a, es1Var.f8724d - es1Var.f8722b);
            float m25851l = bs1.m25851l(bs1Var.f5090a, bs1Var.f5091b) + f2;
            if (f < m25851l) {
                float f3 = f - f2;
                bs1Var.m25848o();
                float f4 = bs1Var.f5090a;
                fArr2[0] = f4;
                float f5 = bs1Var.f5091b;
                fArr2[1] = f5;
                fArr[0] = es1Var.f8721a + (f4 * f3);
                fArr[1] = es1Var.f8722b + (f5 * f3);
                return true;
            }
            i++;
            f2 = m25851l;
        }
    }
}
