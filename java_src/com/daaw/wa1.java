package com.daaw;

import com.daaw.he0;
/* loaded from: classes.dex */
public class wa1 extends xa1 {
    public float h = 0.5f;
    public boolean i = false;
    public boolean j = false;
    public he0.a k;
    public he0.a l;

    @Override // com.daaw.xa1, com.daaw.zc0
    public void a(un unVar) {
        super.a(unVar);
        this.h = unVar.o("barWidth", 0.5f);
        this.j = unVar.n("barWidthAffectedByShape", false);
        this.i = unVar.n("mirror", false);
    }

    @Override // com.daaw.he0
    public void m(de0 de0Var, he0.a[] aVarArr, float f, float f2, int i, float f3) {
        int i2;
        float c;
        float d;
        float e;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        he0.a[] aVarArr2 = aVarArr;
        int length = aVarArr2.length;
        float round = Math.round((0.5f * f) / (length + 1)) * this.h;
        bs1 bs1Var = new bs1(0.0f, 0.0f);
        bs1 bs1Var2 = new bs1(0.0f, 0.0f);
        boolean h = de0Var.h();
        w31 w31Var = !h ? new w31(i, de0Var.b().e(), (qr1) null, (g0<y31, sr1, w31>) null, 2) : null;
        int i3 = 0;
        while (i3 < aVarArr2.length) {
            he0.a aVar = aVarArr2[i3];
            int i4 = aVar.a;
            this.k = i4 < 0 ? aVar : aVarArr2[i4];
            int i5 = aVar.b;
            this.l = i5 < 0 ? aVar : aVarArr2[i5];
            int q = q(i3, length, f3);
            float f13 = aVar.e;
            float f14 = aVar.f;
            float f15 = aVar.d * (-2.0f) * f2;
            float d2 = br1.d(f15);
            float f16 = f15 * this.f;
            if (this.i) {
                f13 -= aVar.g * f16;
                f14 -= aVar.h * f16;
                i2 = length;
                double d3 = f16;
                Double.isNaN(d3);
                f16 = (float) (d3 * 2.0d);
            } else {
                i2 = length;
            }
            if (this.j) {
                float f17 = aVar.g;
                he0.a aVar2 = this.k;
                bs1Var.a = aVar2.g + f17;
                float f18 = aVar.h;
                bs1Var.b = aVar2.h + f18;
                he0.a aVar3 = this.l;
                bs1Var2.a = f17 + aVar3.g;
                bs1Var2.b = f18 + aVar3.h;
                bs1Var2.p();
                bs1Var.p();
                float b = (bs1.b(aVar.g, aVar.h) * round) + f13;
                c = (bs1.c(aVar.g, aVar.h) * round) + f14;
                d = (bs1.d(aVar.g, aVar.h) * round) + f13;
                e = (bs1.e(aVar.g, aVar.h) * round) + f14;
                float f19 = (bs1Var.a * f16) + b;
                float f20 = (bs1Var2.a * f16) + d;
                f4 = (bs1Var2.b * f16) + e;
                f6 = (bs1Var.b * f16) + c;
                f5 = f20;
                f7 = b;
                f8 = f19;
            } else {
                float b2 = (bs1.b(aVar.g, aVar.h) * round) + f13;
                c = (bs1.c(aVar.g, aVar.h) * round) + f14;
                d = (bs1.d(aVar.g, aVar.h) * round) + f13;
                e = (bs1.e(aVar.g, aVar.h) * round) + f14;
                float f21 = aVar.g;
                float f22 = (f21 * f16) + b2;
                float f23 = aVar.h;
                f4 = (f23 * f16) + e;
                f5 = (f21 * f16) + d;
                f6 = (f23 * f16) + c;
                f7 = b2;
                f8 = f22;
            }
            if (this.d) {
                float f24 = aVar.g;
                float f25 = this.e;
                float f26 = aVar.h;
                f11 = f5 + (f24 * d2 * f25);
                f9 = f8 + (f24 * d2 * f25);
                f12 = f4 + (f26 * d2 * f25);
                f10 = f6 + (f26 * d2 * f25);
            } else {
                f9 = f7;
                f10 = c;
                f11 = d;
                f12 = e;
            }
            sc0 j = de0Var.j();
            bs1 s = bs1.s();
            bs1 q2 = bs1.q();
            if (h) {
                j.b(de0Var, f8, f6, f5, f4, f9, f10, f11, f12, 0.0f, q, s, q2, de0Var.b().c(), i, null);
            } else {
                j.d(de0Var, f8, f6, f5, f4, f9, f10, f11, f12, 0.0f, q, s, q2, w31Var);
            }
            i3++;
            aVarArr2 = aVarArr;
            length = i2;
        }
    }

    @Override // com.daaw.xa1, com.daaw.zc0
    public void o(un unVar) {
        super.o(unVar);
        unVar.O("barWidth", this.h, "misc", 0.0f, 2.0f);
        unVar.L("barWidthAffectedByShape", this.j, "b");
        unVar.L("mirror", this.i, "b");
    }
}
