package com.daaw;

import com.daaw.tc;
/* loaded from: classes.dex */
public class uc extends tc {
    public float A;
    public tc.a w;
    public bs1 x;
    public bs1 y;
    public float z;

    public uc(int i) {
        super(i);
        this.w = new tc.a();
        this.x = new bs1(0.0f, 0.0f);
        this.y = new bs1(0.0f, 0.0f);
    }

    @Override // com.daaw.sc0
    public void d(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        if (h((y31) de0Var, 4, w31Var, false)) {
            bs1Var.a = w31Var.i(bs1Var.a);
            bs1Var.b = w31Var.j(bs1Var.b);
            bs1Var2.a = w31Var.i(bs1Var2.a);
            w31Var.j(bs1Var2.b);
            bs1Var2.b = 0.0f;
            bs1 bs1Var3 = this.x;
            bs1Var3.a = (f + f5) * 0.5f;
            bs1Var3.b = (f2 + f6) * 0.5f;
            bs1 bs1Var4 = this.y;
            bs1Var4.a = (f3 + f7) * 0.5f;
            bs1Var4.b = (f4 + f8) * 0.5f;
            float l = bs1.l(f - f5, f2 - f6) * 0.5f * 0.0234375f;
            float l2 = bs1.l(f3 - f7, f4 - f8) * 0.5f * 0.0234375f;
            tc.a aVar = this.w;
            aVar.d = 1.0f;
            aVar.g = w31Var.k();
            tc.a aVar2 = this.w;
            aVar2.h = i;
            aVar2.c = f9;
            bs1 bs1Var5 = this.x;
            aVar2.a = bs1Var5.a;
            aVar2.b = bs1Var5.b;
            aVar2.e = bs1Var.a;
            aVar2.f = bs1Var2.b + l;
            x(aVar2);
            tc.a aVar3 = this.w;
            aVar3.a = f;
            aVar3.b = f2;
            aVar3.e = bs1Var.a;
            aVar3.f = bs1Var.b;
            x(aVar3);
            tc.a aVar4 = this.w;
            bs1 bs1Var6 = this.y;
            aVar4.a = bs1Var6.a;
            aVar4.b = bs1Var6.b;
            aVar4.e = bs1Var2.a;
            aVar4.f = bs1Var2.b + l2;
            x(aVar4);
            tc.a aVar5 = this.w;
            bs1 bs1Var7 = this.y;
            aVar5.a = bs1Var7.a;
            aVar5.b = bs1Var7.b;
            aVar5.e = bs1Var2.a;
            aVar5.f = bs1Var2.b + l2;
            x(aVar5);
            tc.a aVar6 = this.w;
            aVar6.a = f;
            aVar6.b = f2;
            aVar6.e = bs1Var.a;
            aVar6.f = bs1Var.b;
            x(aVar6);
            tc.a aVar7 = this.w;
            aVar7.a = f3;
            aVar7.b = f4;
            aVar7.e = bs1Var2.a;
            aVar7.f = bs1Var.b;
            x(aVar7);
            tc.a aVar8 = this.w;
            aVar8.a = f5;
            aVar8.b = f6;
            aVar8.e = bs1Var.a;
            aVar8.f = bs1Var.b;
            x(aVar8);
            tc.a aVar9 = this.w;
            bs1 bs1Var8 = this.x;
            aVar9.a = bs1Var8.a;
            aVar9.b = bs1Var8.b;
            aVar9.e = bs1Var.a;
            aVar9.f = bs1Var2.b + l;
            x(aVar9);
            tc.a aVar10 = this.w;
            aVar10.a = f7;
            aVar10.b = f8;
            aVar10.e = bs1Var2.a;
            aVar10.f = bs1Var.b;
            x(aVar10);
            tc.a aVar11 = this.w;
            aVar11.a = f7;
            aVar11.b = f8;
            aVar11.e = bs1Var2.a;
            aVar11.f = bs1Var.b;
            x(aVar11);
            tc.a aVar12 = this.w;
            bs1 bs1Var9 = this.x;
            aVar12.a = bs1Var9.a;
            aVar12.b = bs1Var9.b;
            aVar12.e = bs1Var.a;
            aVar12.f = bs1Var2.b + l;
            x(aVar12);
            tc.a aVar13 = this.w;
            bs1 bs1Var10 = this.y;
            aVar13.a = bs1Var10.a;
            aVar13.b = bs1Var10.b;
            aVar13.e = bs1Var2.a;
            aVar13.f = bs1Var2.b + l2;
            x(aVar13);
            this.b += 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // com.daaw.sc0
    public void f(de0 de0Var, t40<Integer, float[], int[], Boolean> t40Var, int i, float f, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        int i2;
        int i3;
        y31 y31Var = (y31) de0Var;
        float[] fArr = new float[8];
        char c = 4;
        int[] iArr = new int[4];
        bs1Var.a = w31Var.i(bs1Var.a);
        bs1Var.b = w31Var.j(bs1Var.b);
        bs1Var2.a = w31Var.i(bs1Var2.a);
        w31Var.j(bs1Var2.b);
        bs1Var2.b = 0.0f;
        tc.a aVar = this.w;
        aVar.d = 1.0f;
        aVar.g = w31Var.k();
        this.w.c = f;
        int i4 = this.n;
        int i5 = i4 - (i4 % 4);
        ?? r5 = 0;
        int i6 = 0;
        while (i6 < i) {
            if ((i6 * 4) % i5 == 0 && !h(y31Var, Math.min((i - i6) * 4, i5), w31Var, r5)) {
                return;
            }
            if (t40Var.j(Integer.valueOf(i6), fArr, iArr).booleanValue()) {
                bs1 bs1Var3 = this.x;
                bs1Var3.a = (fArr[r5] + fArr[c]) * 0.5f;
                bs1Var3.b = (fArr[1] + fArr[5]) * 0.5f;
                bs1 bs1Var4 = this.y;
                bs1Var4.a = (fArr[2] + fArr[6]) * 0.5f;
                bs1Var4.b = (fArr[3] + fArr[7]) * 0.5f;
                float l = bs1.l(fArr[r5] - fArr[c], fArr[1] - fArr[5]) * 0.5f * 0.0234375f;
                this.z = l;
                this.A = bs1.l(fArr[2] - fArr[6], fArr[3] - fArr[7]) * 0.5f * 0.0234375f;
                tc.a aVar2 = this.w;
                aVar2.e = bs1Var.a;
                aVar2.f = bs1Var2.b + l;
                bs1 bs1Var5 = this.x;
                i2 = i6;
                i3 = i5;
                y(aVar2, bs1Var5.a, bs1Var5.b, aVar2.c, iArr, 2);
                tc.a aVar3 = this.w;
                aVar3.e = bs1Var.a;
                aVar3.f = bs1Var.b;
                A(aVar3, fArr, iArr, 0);
                tc.a aVar4 = this.w;
                aVar4.e = bs1Var2.a;
                aVar4.f = bs1Var2.b + this.A;
                bs1 bs1Var6 = this.y;
                y(aVar4, bs1Var6.a, bs1Var6.b, aVar4.c, iArr, 3);
                tc.a aVar5 = this.w;
                aVar5.e = bs1Var2.a;
                aVar5.f = bs1Var2.b + this.A;
                bs1 bs1Var7 = this.y;
                y(aVar5, bs1Var7.a, bs1Var7.b, aVar5.c, iArr, 3);
                tc.a aVar6 = this.w;
                aVar6.e = bs1Var.a;
                aVar6.f = bs1Var.b;
                A(aVar6, fArr, iArr, 0);
                tc.a aVar7 = this.w;
                aVar7.e = bs1Var2.a;
                aVar7.f = bs1Var.b;
                A(aVar7, fArr, iArr, 1);
                tc.a aVar8 = this.w;
                aVar8.e = bs1Var.a;
                aVar8.f = bs1Var.b;
                A(aVar8, fArr, iArr, 2);
                tc.a aVar9 = this.w;
                aVar9.e = bs1Var.a;
                aVar9.f = bs1Var2.b + this.z;
                bs1 bs1Var8 = this.x;
                y(aVar9, bs1Var8.a, bs1Var8.b, aVar9.c, iArr, 0);
                tc.a aVar10 = this.w;
                aVar10.e = bs1Var2.a;
                aVar10.f = bs1Var.b;
                A(aVar10, fArr, iArr, 3);
                tc.a aVar11 = this.w;
                aVar11.e = bs1Var2.a;
                aVar11.f = bs1Var.b;
                A(aVar11, fArr, iArr, 3);
                tc.a aVar12 = this.w;
                aVar12.e = bs1Var.a;
                aVar12.f = bs1Var2.b + this.z;
                bs1 bs1Var9 = this.x;
                y(aVar12, bs1Var9.a, bs1Var9.b, aVar12.c, iArr, 0);
                tc.a aVar13 = this.w;
                aVar13.e = bs1Var2.a;
                aVar13.f = bs1Var2.b + this.A;
                bs1 bs1Var10 = this.y;
                y(aVar13, bs1Var10.a, bs1Var10.b, aVar13.c, iArr, 1);
                this.b += 4;
            } else {
                i2 = i6;
                i3 = i5;
            }
            i6 = i2 + 1;
            i5 = i3;
            r5 = 0;
            c = 4;
        }
    }
}
