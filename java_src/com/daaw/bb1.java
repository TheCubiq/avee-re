package com.daaw;

import android.graphics.PointF;
import com.daaw.he0;
/* loaded from: classes.dex */
public class bb1 extends xa1 {
    public float h = 0.5f;
    public boolean i = false;
    public PointF j = new PointF();
    public PointF k = new PointF();

    @Override // com.daaw.xa1, com.daaw.zc0
    public void a(un unVar) {
        super.a(unVar);
        this.h = unVar.o("barWidth", 0.5f);
        this.i = unVar.n("mirror", false);
    }

    @Override // com.daaw.he0
    public void m(de0 de0Var, he0.a[] aVarArr, float f, float f2, int i, float f3) {
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
        he0.a[] aVarArr2 = aVarArr;
        int length = aVarArr2.length;
        float round = Math.round((1.0f * f) / (length + 1)) * this.h;
        int i2 = 0;
        while (i2 < aVarArr2.length) {
            he0.a aVar = aVarArr2[i2];
            int i3 = aVar.a;
            if (i3 >= 0) {
                he0.a aVar2 = aVarArr2[i3];
                int q = q(i2, length, f3);
                PointF pointF = this.j;
                pointF.x = aVar2.e;
                pointF.y = aVar2.f;
                PointF pointF2 = this.k;
                pointF2.x = aVar.e;
                pointF2.y = aVar.f;
                float f16 = this.f;
                float f17 = aVar2.d * (-2.0f) * f2 * f16;
                float f18 = aVar.d * (-2.0f) * f2 * f16;
                if (this.i) {
                    pointF.x -= aVar2.g * f17;
                    pointF.y -= aVar2.h * f17;
                    double d = f17;
                    Double.isNaN(d);
                    f17 = (float) (d * 2.0d);
                    pointF2.x -= aVar.g * f18;
                    pointF2.y -= aVar.h * f18;
                    double d2 = f18;
                    Double.isNaN(d2);
                    f18 = (float) (d2 * 2.0d);
                }
                if (f17 < 0.0f) {
                    f5 = (bs1.b(aVar.g, aVar.h) * round) + this.k.x;
                    f7 = (bs1.c(aVar.g, aVar.h) * round) + this.k.y;
                    f4 = (aVar.g * f17) + f5;
                    f6 = (aVar.h * f17) + f7;
                } else {
                    float b = (bs1.b(aVar.g, aVar.h) * round) + this.k.x;
                    float c = (bs1.c(aVar.g, aVar.h) * round) + this.k.y;
                    f4 = b;
                    f5 = (aVar.g * f17) + b;
                    f6 = c;
                    f7 = (aVar.h * f17) + c;
                }
                if (f18 < 0.0f) {
                    f11 = (bs1.d(aVar.g, aVar.h) * round) + this.k.x;
                    float e = (bs1.e(aVar.g, aVar.h) * round) + this.k.y;
                    f9 = (aVar.h * f18) + e;
                    f8 = e;
                    f10 = (aVar.g * f18) + f11;
                } else {
                    float d3 = (bs1.d(aVar.g, aVar.h) * round) + this.k.x;
                    float e2 = (bs1.e(aVar.g, aVar.h) * round) + this.k.y;
                    f8 = (aVar.h * f18) + e2;
                    f9 = e2;
                    f10 = d3;
                    f11 = (aVar.g * f18) + d3;
                }
                float f19 = f9;
                if (this.d) {
                    float signum = Math.signum(f18);
                    float f20 = aVar.g;
                    float f21 = this.e;
                    float f22 = aVar.h;
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
                if (de0Var.h()) {
                    de0Var.j().b(de0Var, f4, f6, f10, f19, f13, f15, f12, f14, 0.0f, q, bs1.s(), bs1.q(), de0Var.b().c(), i, null);
                } else {
                    de0Var.j().d(de0Var, f4, f6, f10, f19, f13, f15, f12, f14, 0.0f, q, bs1.s(), bs1.q(), new w31(i, de0Var.b().e(), (qr1) null, (g0<y31, sr1, w31>) null, 2));
                }
            }
            i2++;
            aVarArr2 = aVarArr;
        }
    }

    @Override // com.daaw.xa1, com.daaw.zc0
    public void o(un unVar) {
        super.o(unVar);
        unVar.O("barWidth", this.h, "misc", 0.0f, 2.0f);
        unVar.L("mirror", this.i, "misc");
    }
}
