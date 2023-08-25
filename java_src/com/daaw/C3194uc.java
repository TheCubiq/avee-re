package com.daaw;

import com.daaw.AbstractC3044tc;
/* renamed from: com.daaw.uc */
/* loaded from: classes.dex */
public class C3194uc extends AbstractC3044tc {

    /* renamed from: A */
    public float f28867A;

    /* renamed from: w */
    public AbstractC3044tc.C3045a f28868w;

    /* renamed from: x */
    public bs1 f28869x;

    /* renamed from: y */
    public bs1 f28870y;

    /* renamed from: z */
    public float f28871z;

    public C3194uc(int i) {
        super(i);
        this.f28868w = new AbstractC3044tc.C3045a();
        this.f28869x = new bs1(0.0f, 0.0f);
        this.f28870y = new bs1(0.0f, 0.0f);
    }

    @Override // com.daaw.sc0
    /* renamed from: d */
    public void mo7292d(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        if (m9361h((y31) de0Var, 4, w31Var, false)) {
            bs1Var.f5090a = w31Var.m6549i(bs1Var.f5090a);
            bs1Var.f5091b = w31Var.m6548j(bs1Var.f5091b);
            bs1Var2.f5090a = w31Var.m6549i(bs1Var2.f5090a);
            w31Var.m6548j(bs1Var2.f5091b);
            bs1Var2.f5091b = 0.0f;
            bs1 bs1Var3 = this.f28869x;
            bs1Var3.f5090a = (f + f5) * 0.5f;
            bs1Var3.f5091b = (f2 + f6) * 0.5f;
            bs1 bs1Var4 = this.f28870y;
            bs1Var4.f5090a = (f3 + f7) * 0.5f;
            bs1Var4.f5091b = (f4 + f8) * 0.5f;
            float m25851l = bs1.m25851l(f - f5, f2 - f6) * 0.5f * 0.0234375f;
            float m25851l2 = bs1.m25851l(f3 - f7, f4 - f8) * 0.5f * 0.0234375f;
            AbstractC3044tc.C3045a c3045a = this.f28868w;
            c3045a.f27355d = 1.0f;
            c3045a.f27358g = w31Var.m6547k();
            AbstractC3044tc.C3045a c3045a2 = this.f28868w;
            c3045a2.f27359h = i;
            c3045a2.f27354c = f9;
            bs1 bs1Var5 = this.f28869x;
            c3045a2.f27352a = bs1Var5.f5090a;
            c3045a2.f27353b = bs1Var5.f5091b;
            c3045a2.f27356e = bs1Var.f5090a;
            c3045a2.f27357f = bs1Var2.f5091b + m25851l;
            m9345x(c3045a2);
            AbstractC3044tc.C3045a c3045a3 = this.f28868w;
            c3045a3.f27352a = f;
            c3045a3.f27353b = f2;
            c3045a3.f27356e = bs1Var.f5090a;
            c3045a3.f27357f = bs1Var.f5091b;
            m9345x(c3045a3);
            AbstractC3044tc.C3045a c3045a4 = this.f28868w;
            bs1 bs1Var6 = this.f28870y;
            c3045a4.f27352a = bs1Var6.f5090a;
            c3045a4.f27353b = bs1Var6.f5091b;
            c3045a4.f27356e = bs1Var2.f5090a;
            c3045a4.f27357f = bs1Var2.f5091b + m25851l2;
            m9345x(c3045a4);
            AbstractC3044tc.C3045a c3045a5 = this.f28868w;
            bs1 bs1Var7 = this.f28870y;
            c3045a5.f27352a = bs1Var7.f5090a;
            c3045a5.f27353b = bs1Var7.f5091b;
            c3045a5.f27356e = bs1Var2.f5090a;
            c3045a5.f27357f = bs1Var2.f5091b + m25851l2;
            m9345x(c3045a5);
            AbstractC3044tc.C3045a c3045a6 = this.f28868w;
            c3045a6.f27352a = f;
            c3045a6.f27353b = f2;
            c3045a6.f27356e = bs1Var.f5090a;
            c3045a6.f27357f = bs1Var.f5091b;
            m9345x(c3045a6);
            AbstractC3044tc.C3045a c3045a7 = this.f28868w;
            c3045a7.f27352a = f3;
            c3045a7.f27353b = f4;
            c3045a7.f27356e = bs1Var2.f5090a;
            c3045a7.f27357f = bs1Var.f5091b;
            m9345x(c3045a7);
            AbstractC3044tc.C3045a c3045a8 = this.f28868w;
            c3045a8.f27352a = f5;
            c3045a8.f27353b = f6;
            c3045a8.f27356e = bs1Var.f5090a;
            c3045a8.f27357f = bs1Var.f5091b;
            m9345x(c3045a8);
            AbstractC3044tc.C3045a c3045a9 = this.f28868w;
            bs1 bs1Var8 = this.f28869x;
            c3045a9.f27352a = bs1Var8.f5090a;
            c3045a9.f27353b = bs1Var8.f5091b;
            c3045a9.f27356e = bs1Var.f5090a;
            c3045a9.f27357f = bs1Var2.f5091b + m25851l;
            m9345x(c3045a9);
            AbstractC3044tc.C3045a c3045a10 = this.f28868w;
            c3045a10.f27352a = f7;
            c3045a10.f27353b = f8;
            c3045a10.f27356e = bs1Var2.f5090a;
            c3045a10.f27357f = bs1Var.f5091b;
            m9345x(c3045a10);
            AbstractC3044tc.C3045a c3045a11 = this.f28868w;
            c3045a11.f27352a = f7;
            c3045a11.f27353b = f8;
            c3045a11.f27356e = bs1Var2.f5090a;
            c3045a11.f27357f = bs1Var.f5091b;
            m9345x(c3045a11);
            AbstractC3044tc.C3045a c3045a12 = this.f28868w;
            bs1 bs1Var9 = this.f28869x;
            c3045a12.f27352a = bs1Var9.f5090a;
            c3045a12.f27353b = bs1Var9.f5091b;
            c3045a12.f27356e = bs1Var.f5090a;
            c3045a12.f27357f = bs1Var2.f5091b + m25851l;
            m9345x(c3045a12);
            AbstractC3044tc.C3045a c3045a13 = this.f28868w;
            bs1 bs1Var10 = this.f28870y;
            c3045a13.f27352a = bs1Var10.f5090a;
            c3045a13.f27353b = bs1Var10.f5091b;
            c3045a13.f27356e = bs1Var2.f5090a;
            c3045a13.f27357f = bs1Var2.f5091b + m25851l2;
            m9345x(c3045a13);
            this.f27331b += 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // com.daaw.sc0
    /* renamed from: f */
    public void mo7290f(de0 de0Var, t40<Integer, float[], int[], Boolean> t40Var, int i, float f, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        int i2;
        int i3;
        y31 y31Var = (y31) de0Var;
        float[] fArr = new float[8];
        char c = 4;
        int[] iArr = new int[4];
        bs1Var.f5090a = w31Var.m6549i(bs1Var.f5090a);
        bs1Var.f5091b = w31Var.m6548j(bs1Var.f5091b);
        bs1Var2.f5090a = w31Var.m6549i(bs1Var2.f5090a);
        w31Var.m6548j(bs1Var2.f5091b);
        bs1Var2.f5091b = 0.0f;
        AbstractC3044tc.C3045a c3045a = this.f28868w;
        c3045a.f27355d = 1.0f;
        c3045a.f27358g = w31Var.m6547k();
        this.f28868w.f27354c = f;
        int i4 = this.f27343n;
        int i5 = i4 - (i4 % 4);
        ?? r5 = 0;
        int i6 = 0;
        while (i6 < i) {
            if ((i6 * 4) % i5 == 0 && !m9361h(y31Var, Math.min((i - i6) * 4, i5), w31Var, r5)) {
                return;
            }
            if (t40Var.mo2575j(Integer.valueOf(i6), fArr, iArr).booleanValue()) {
                bs1 bs1Var3 = this.f28869x;
                bs1Var3.f5090a = (fArr[r5] + fArr[c]) * 0.5f;
                bs1Var3.f5091b = (fArr[1] + fArr[5]) * 0.5f;
                bs1 bs1Var4 = this.f28870y;
                bs1Var4.f5090a = (fArr[2] + fArr[6]) * 0.5f;
                bs1Var4.f5091b = (fArr[3] + fArr[7]) * 0.5f;
                float m25851l = bs1.m25851l(fArr[r5] - fArr[c], fArr[1] - fArr[5]) * 0.5f * 0.0234375f;
                this.f28871z = m25851l;
                this.f28867A = bs1.m25851l(fArr[2] - fArr[6], fArr[3] - fArr[7]) * 0.5f * 0.0234375f;
                AbstractC3044tc.C3045a c3045a2 = this.f28868w;
                c3045a2.f27356e = bs1Var.f5090a;
                c3045a2.f27357f = bs1Var2.f5091b + m25851l;
                bs1 bs1Var5 = this.f28869x;
                i2 = i6;
                i3 = i5;
                m9344y(c3045a2, bs1Var5.f5090a, bs1Var5.f5091b, c3045a2.f27354c, iArr, 2);
                AbstractC3044tc.C3045a c3045a3 = this.f28868w;
                c3045a3.f27356e = bs1Var.f5090a;
                c3045a3.f27357f = bs1Var.f5091b;
                m9365A(c3045a3, fArr, iArr, 0);
                AbstractC3044tc.C3045a c3045a4 = this.f28868w;
                c3045a4.f27356e = bs1Var2.f5090a;
                c3045a4.f27357f = bs1Var2.f5091b + this.f28867A;
                bs1 bs1Var6 = this.f28870y;
                m9344y(c3045a4, bs1Var6.f5090a, bs1Var6.f5091b, c3045a4.f27354c, iArr, 3);
                AbstractC3044tc.C3045a c3045a5 = this.f28868w;
                c3045a5.f27356e = bs1Var2.f5090a;
                c3045a5.f27357f = bs1Var2.f5091b + this.f28867A;
                bs1 bs1Var7 = this.f28870y;
                m9344y(c3045a5, bs1Var7.f5090a, bs1Var7.f5091b, c3045a5.f27354c, iArr, 3);
                AbstractC3044tc.C3045a c3045a6 = this.f28868w;
                c3045a6.f27356e = bs1Var.f5090a;
                c3045a6.f27357f = bs1Var.f5091b;
                m9365A(c3045a6, fArr, iArr, 0);
                AbstractC3044tc.C3045a c3045a7 = this.f28868w;
                c3045a7.f27356e = bs1Var2.f5090a;
                c3045a7.f27357f = bs1Var.f5091b;
                m9365A(c3045a7, fArr, iArr, 1);
                AbstractC3044tc.C3045a c3045a8 = this.f28868w;
                c3045a8.f27356e = bs1Var.f5090a;
                c3045a8.f27357f = bs1Var.f5091b;
                m9365A(c3045a8, fArr, iArr, 2);
                AbstractC3044tc.C3045a c3045a9 = this.f28868w;
                c3045a9.f27356e = bs1Var.f5090a;
                c3045a9.f27357f = bs1Var2.f5091b + this.f28871z;
                bs1 bs1Var8 = this.f28869x;
                m9344y(c3045a9, bs1Var8.f5090a, bs1Var8.f5091b, c3045a9.f27354c, iArr, 0);
                AbstractC3044tc.C3045a c3045a10 = this.f28868w;
                c3045a10.f27356e = bs1Var2.f5090a;
                c3045a10.f27357f = bs1Var.f5091b;
                m9365A(c3045a10, fArr, iArr, 3);
                AbstractC3044tc.C3045a c3045a11 = this.f28868w;
                c3045a11.f27356e = bs1Var2.f5090a;
                c3045a11.f27357f = bs1Var.f5091b;
                m9365A(c3045a11, fArr, iArr, 3);
                AbstractC3044tc.C3045a c3045a12 = this.f28868w;
                c3045a12.f27356e = bs1Var.f5090a;
                c3045a12.f27357f = bs1Var2.f5091b + this.f28871z;
                bs1 bs1Var9 = this.f28869x;
                m9344y(c3045a12, bs1Var9.f5090a, bs1Var9.f5091b, c3045a12.f27354c, iArr, 0);
                AbstractC3044tc.C3045a c3045a13 = this.f28868w;
                c3045a13.f27356e = bs1Var2.f5090a;
                c3045a13.f27357f = bs1Var2.f5091b + this.f28867A;
                bs1 bs1Var10 = this.f28870y;
                m9344y(c3045a13, bs1Var10.f5090a, bs1Var10.f5091b, c3045a13.f27354c, iArr, 1);
                this.f27331b += 4;
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
