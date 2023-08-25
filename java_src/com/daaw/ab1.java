package com.daaw;

import com.daaw.he0;
/* loaded from: classes.dex */
public class ab1 extends xa1 {
    public static bs1 m = new bs1(0.0f, 0.5f);
    public static bs1 n = new bs1(1.0f, 0.5f);
    public static bs1 o = new bs1(0.0f, 0.5f);
    public static bs1 p = new bs1(1.0f, 0.5f);
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
        bs1 bs1Var;
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
        float f13;
        float f14;
        sc0 j;
        float f15;
        bs1 s;
        bs1 q;
        z6 c2;
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
        he0.a[] aVarArr2 = aVarArr;
        int length = aVarArr2.length;
        float round = Math.round((f * 0.5f) / (length + 1)) * this.h;
        bs1 bs1Var2 = new bs1(0.0f, 0.0f);
        bs1 bs1Var3 = new bs1(0.0f, 0.0f);
        int i5 = 0;
        while (i5 < aVarArr2.length) {
            he0.a aVar = aVarArr2[i5];
            int i6 = aVar.a;
            this.k = i6 < 0 ? aVar : aVarArr2[i6];
            int i7 = aVar.b;
            this.l = i7 < 0 ? aVar : aVarArr2[i7];
            int q2 = q(i5, length, f3);
            float f24 = aVar.e;
            float f25 = aVar.f;
            float f26 = aVar.d * (-2.0f) * f2;
            float signum = Math.signum(f26);
            float f27 = f26 * this.f;
            if (this.i) {
                f24 -= aVar.g * f27;
                f25 -= aVar.h * f27;
                double d2 = f27;
                Double.isNaN(d2);
                f27 = (float) (d2 * 2.0d);
            }
            if (this.j) {
                float f28 = aVar.g;
                he0.a aVar2 = this.k;
                bs1Var2.a = aVar2.g + f28;
                float f29 = aVar.h;
                bs1Var2.b = aVar2.h + f29;
                he0.a aVar3 = this.l;
                bs1Var3.a = f28 + aVar3.g;
                bs1Var3.b = f29 + aVar3.h;
                bs1Var3.p();
                bs1Var2.p();
                float b = (bs1.b(aVar.g, aVar.h) * round) + f24;
                float c3 = (bs1.c(aVar.g, aVar.h) * round) + f25;
                d = (bs1.d(aVar.g, aVar.h) * round) + f24;
                e = (bs1.e(aVar.g, aVar.h) * round) + f25;
                float f30 = (bs1Var2.a * f27) + b;
                float f31 = (bs1Var2.b * f27) + c3;
                float f32 = (bs1Var3.a * f27) + d;
                i2 = length;
                float f33 = (bs1Var3.b * f27) + e;
                float f34 = -(bs1.l(f30 - f32, f31 - f33) * 0.5f);
                f8 = (bs1Var2.a * f34) + f30;
                f12 = (bs1Var2.b * f34) + f31;
                bs1Var = bs1Var2;
                float f35 = (bs1Var3.a * f34) + f32;
                float f36 = (bs1Var3.b * f34) + f33;
                f6 = f33;
                f11 = f31;
                c = c3;
                f7 = f32;
                f10 = f36;
                f9 = f35;
                f4 = f30;
                f5 = b;
            } else {
                i2 = length;
                bs1Var = bs1Var2;
                float b2 = (bs1.b(aVar.g, aVar.h) * round) + f24;
                c = (bs1.c(aVar.g, aVar.h) * round) + f25;
                d = (bs1.d(aVar.g, aVar.h) * round) + f24;
                e = (bs1.e(aVar.g, aVar.h) * round) + f25;
                float f37 = aVar.g;
                f4 = (f37 * f27) + b2;
                float f38 = aVar.h;
                float f39 = (f38 * f27) + c;
                float f40 = (f37 * f27) + d;
                float f41 = (f27 * f38) + e;
                float f42 = -round;
                float f43 = (f38 * f42) + f41;
                f5 = b2;
                f6 = f41;
                f7 = f40;
                f8 = (f37 * f42) + f4;
                f9 = (f37 * f42) + f40;
                f10 = f43;
                f11 = f39;
                f12 = (f38 * f42) + f39;
            }
            if (this.d) {
                float f44 = aVar.g;
                float f45 = this.e;
                float f46 = aVar.h;
                f14 = f7 + (f44 * signum * f45);
                f5 = (f44 * signum * f45) + f4;
                f13 = f6 + (f46 * signum * f45);
                c = (f46 * signum * f45) + f11;
            } else {
                f13 = e;
                f14 = d;
            }
            float f47 = aVar.g;
            float f48 = (f47 * round) + f5;
            float f49 = aVar.h;
            float f50 = (f49 * round) + c;
            float f51 = (f47 * round) + f14;
            float f52 = (f49 * round) + f13;
            if (Math.abs(round) > 0.01f) {
                f15 = 0.0f;
                de0Var2 = de0Var;
                i3 = q2;
                i4 = i;
                de0Var.j().e(de0Var2, f8, f12, f9, f10, f4, f11, f7, f6, 0.0f, i3, bs1.s(), n, de0Var.b().d(), i4);
                de0Var.j().e(de0Var2, f4, f11, f7, f6, f5, c, f14, f13, 0.0f, i3, m, p, de0Var.b().d(), i4);
                j = de0Var.j();
                s = o;
                q = bs1.q();
                c2 = de0Var.b().d();
                f16 = f5;
                f17 = c;
                f18 = f14;
                f19 = f13;
                f20 = f48;
                f21 = f50;
                f22 = f51;
                f23 = f52;
            } else {
                j = de0Var.j();
                f15 = 0.0f;
                s = bs1.s();
                q = bs1.q();
                c2 = de0Var.b().c();
                de0Var2 = de0Var;
                f16 = f4;
                f17 = f11;
                f18 = f7;
                f19 = f6;
                f20 = f5;
                f21 = c;
                f22 = f14;
                f23 = f13;
                i3 = q2;
                i4 = i;
            }
            j.e(de0Var2, f16, f17, f18, f19, f20, f21, f22, f23, f15, i3, s, q, c2, i4);
            i5++;
            aVarArr2 = aVarArr;
            length = i2;
            bs1Var2 = bs1Var;
        }
    }

    @Override // com.daaw.xa1, com.daaw.zc0
    public void o(un unVar) {
        super.o(unVar);
        unVar.O("barWidth", this.h, "misc", 0.0f, 2.0f);
        unVar.L("barWidthAffectedByShape", this.j, "b");
        unVar.L("mirror", this.i, "misc");
    }
}
