package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;
import com.daaw.avee.R;
import com.daaw.he0;
/* loaded from: classes.dex */
public class na1 extends tv {
    public he0 G;
    public he0 H;
    public ge0 I;
    public boolean J;
    public float K;
    public float L;
    public float M;
    public PointF N;
    public PointF O;
    public PointF P;
    public PointF Q;
    public je0 R;
    public he0.a[] S;
    public int T;
    public int U;
    public int V;
    public int W;
    public dm0 X;

    public na1() {
        super(2, 0.5f, 0.5f);
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = false;
        this.K = 3.0f;
        this.L = 0.009f;
        this.M = 1.0f;
        this.N = new PointF();
        this.O = new PointF();
        this.P = new PointF();
        this.Q = new PointF();
        this.R = null;
        this.S = new he0.a[0];
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 1;
        this.X = dm0.a(0.0f);
        h0(new oa1());
        i0(new wa1());
        j0(2);
    }

    public static void Z(de0 de0Var, int i, RectF rectF, int i2, float f, he0 he0Var, ge0 ge0Var) {
        he0.a[] aVarArr = new he0.a[0];
        PointF pointF = new PointF();
        PointF pointF2 = new PointF();
        PointF pointF3 = new PointF();
        PointF pointF4 = new PointF();
        ge0Var.d(de0Var);
        if (i2 != 0) {
            aVarArr = new he0.a[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                aVarArr[i3] = new he0.a();
                aVarArr[i3].c = -1;
            }
        }
        he0.a[] aVarArr2 = aVarArr;
        if (i2 < 1) {
            return;
        }
        float k = ge0Var.k(rectF, i2);
        int i4 = 0;
        while (i4 < i2) {
            int i5 = i4;
            int e = ge0Var.e(false, i4, i2, rectF, 0.0f, pointF3, pointF4);
            if (Float.isNaN(pointF4.x)) {
                pointF4.x = 1.0f;
                pointF4.y = 0.0f;
            }
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            double d = 0.0f;
            Double.isNaN(d);
            float f2 = (float) (d * 3.141592653589793d * 2.0d);
            tv.H(pointF, centerX, centerY, pointF3, f2);
            tv.I(pointF2, pointF4, f2);
            if (e >= 0) {
                aVarArr2[e].c = i5;
            }
            he0.a aVar = aVarArr2[i5];
            aVar.a = e;
            aVar.d = f;
            aVar.e = pointF.x;
            aVar.f = pointF.y;
            aVar.g = pointF2.x;
            aVar.h = pointF2.y;
            i4 = i5 + 1;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            he0.a aVar2 = aVarArr2[i6];
            aVar2.b = aVar2.c;
            aVar2.c = -1;
        }
        if (he0Var != null) {
            he0Var.m(de0Var, aVarArr2, k, 0.5f, i, 0.0f);
        }
    }

    @Override // com.daaw.tv
    public void B(y31 y31Var, e40 e40Var) {
        super.B(y31Var, e40Var);
        Y(y31Var);
    }

    @Override // com.daaw.tv
    public void G(de0 de0Var, e40 e40Var) {
        super.G(de0Var, e40Var);
        Y(de0Var);
    }

    public final void Y(de0 de0Var) {
        int i;
        fe0 b = de0Var.b().a().b(this.W - 1);
        if (b != null) {
            if ((this.G == null && this.H == null) || this.I == null) {
                return;
            }
            RectF n = n(de0Var.b().a());
            float s = s(de0Var.b().a());
            RectF p = p(de0Var.b().a());
            float centerX = p.centerX();
            float centerY = p.centerY();
            float max = Math.max(0.0f, Math.min(1.0f, this.X.i(de0Var.b().a())));
            this.I.d(de0Var);
            je0 f = b.f(this.U, this.V, this.T, this.R);
            this.R = f;
            int size = f.size();
            if (size != this.S.length) {
                this.S = new he0.a[size];
                for (int i2 = 0; i2 < size; i2++) {
                    this.S[i2] = new he0.a();
                    this.S[i2].c = -1;
                }
            }
            if (size < 1) {
                return;
            }
            float e = de0Var.b().a().e(this.L);
            float e2 = de0Var.b().a().e(this.M);
            float e3 = de0Var.b().a().e(this.K) * 0.002f;
            float k = this.I.k(n, size);
            float signum = Math.signum(e3);
            float abs = Math.abs(e3);
            if (this.G == null && this.H == null) {
                return;
            }
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3;
                float f2 = e2;
                RectF rectF = n;
                int e4 = this.I.e(this.J, i3, size, n, 0.0f, this.P, this.Q);
                if (Float.isNaN(this.Q.x)) {
                    PointF pointF = this.Q;
                    pointF.x = 1.0f;
                    pointF.y = 0.0f;
                }
                PointF pointF2 = this.N;
                PointF pointF3 = this.P;
                double d = s;
                Double.isNaN(d);
                float f3 = (float) (d * 3.141592653589793d * 2.0d);
                tv.H(pointF2, centerX, centerY, pointF3, f3);
                tv.I(this.O, this.Q, f3);
                if (e4 >= 0) {
                    i = i4;
                    this.S[e4].c = i;
                } else {
                    i = i4;
                }
                he0.a aVar = this.S[i];
                aVar.a = e4;
                aVar.d = (Math.min(this.R.get(i) * abs, f2) * signum) + e;
                PointF pointF4 = this.N;
                aVar.e = pointF4.x;
                aVar.f = pointF4.y;
                PointF pointF5 = this.O;
                aVar.g = pointF5.x;
                aVar.h = pointF5.y;
                i3 = i + 1;
                e2 = f2;
                n = rectF;
            }
            for (int i5 = 0; i5 < size; i5++) {
                he0.a aVar2 = this.S[i5];
                aVar2.b = aVar2.c;
                aVar2.c = -1;
            }
            he0 he0Var = this.G;
            if (he0Var != null) {
                he0Var.m(de0Var, this.S, k, 0.5f, f(), max);
            }
            he0 he0Var2 = this.H;
            if (he0Var2 != null) {
                he0Var2.m(de0Var, this.S, k, 0.5f, f(), max);
            }
        }
    }

    public void a0(int i) {
        this.W = i;
    }

    public void b0(float f) {
        this.K = f;
    }

    public void c0(dm0 dm0Var) {
        this.X = dm0Var;
    }

    public void d0(float f) {
        this.M = f;
    }

    public void e0(float f) {
        this.L = f;
    }

    public void f0(int i) {
        this.V = i;
    }

    public void g0(int i) {
        this.U = i;
    }

    @Override // com.daaw.tv
    public String h() {
        return "Bars";
    }

    public void h0(ge0 ge0Var) {
        this.I = ge0Var;
    }

    public void i0(he0 he0Var) {
        this.G = he0Var;
    }

    public void j0(int i) {
        this.T = i;
    }

    @Override // com.daaw.tv
    public void t(un unVar) {
        super.t(unVar);
        super.u(unVar);
        this.J = unVar.n("flipInput", false);
        b0(unVar.o("heightScale", 3.0f));
        e0(unVar.o("minHeightScale", 0.009f));
        d0(unVar.o("maxHeightScale", 1.0f));
        un h = unVar.h("ShapePath");
        ge0 a = pa1.a(h.C("Circle"), this.I);
        this.I = a;
        if (a != null) {
            a.a(h);
        }
        c0(unVar.s("colorBlendOffset", dm0.a(0.0f)));
        j0(unVar.r("softness", 2));
        g0(unVar.r("reactionDelay", 0));
        f0(unVar.r("reactionAccumulatedDelay", 0));
        a0(unVar.r("audioProviderIndex", 1));
        un h2 = unVar.h("Segment1");
        he0 a2 = ya1.a(h2.C("Bars"), this.G);
        this.G = a2;
        if (a2 != null) {
            a2.a(h2);
        }
        un h3 = unVar.h("Segment2");
        he0 a3 = ya1.a(h3.C("None"), this.H);
        this.H = a3;
        if (a3 != null) {
            a3.a(h3);
        }
    }

    @Override // com.daaw.tv
    public boolean v(y31 y31Var) {
        return super.v(y31Var);
    }

    @Override // com.daaw.tv
    public void x(y31 y31Var) {
        super.x(y31Var);
    }

    @Override // com.daaw.tv
    public void z(un unVar, od0 od0Var) {
        super.z(unVar, od0Var);
        super.A(unVar);
        unVar.p0(j(R.string.title_segment));
        unVar.L("flipInput", this.J, "1_bars");
        unVar.O("heightScale", this.K, "1_bars", -10.0f, 10.0f);
        unVar.O("minHeightScale", this.L, "1_bars", -0.03f, 0.03f);
        unVar.O("maxHeightScale", this.M, "1_bars", 0.1f, 1.0f);
        un F = unVar.F("ShapePath", pa1.b(this.I), "1_bars", c60.m ? pa1.b : pa1.a);
        ge0 ge0Var = this.I;
        if (ge0Var != null) {
            ge0Var.o(F);
        }
        unVar.Z("colorBlendOffset", this.X, "1_bars", 0.0f, 1.0f);
        unVar.W("softness", this.T, "2_Behavior", 0, 20);
        unVar.W("reactionDelay", this.U, "2_Behavior", 0, 9);
        unVar.W("reactionAccumulatedDelay", this.V, "2_Behavior", 0, 9);
        unVar.W("audioProviderIndex", this.W, "2_Behavior", 1, 4);
        String b = ya1.b(this.G);
        String[] strArr = ya1.a;
        un F2 = unVar.F("Segment1", b, "1_bars", strArr);
        he0 he0Var = this.G;
        if (he0Var != null) {
            he0Var.o(F2);
        }
        un F3 = unVar.F("Segment2", ya1.b(this.H), "1_bars", strArr);
        he0 he0Var2 = this.H;
        if (he0Var2 != null) {
            he0Var2.o(F3);
        }
    }
}
