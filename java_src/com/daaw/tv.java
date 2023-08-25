package com.daaw;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
/* loaded from: classes.dex */
public abstract class tv {
    public static String C = "10";
    public static final String[] D = {"Na", "Start", "Center", "End"};
    public static ge0 E = new qa1();
    public static za1 F = (za1) new za1().s(-1, -1, -1);
    public int a;
    public float b;
    public float c;
    public int e;
    public uv g;
    public boolean u;
    public String d = "Nothing";
    public String f = "";
    public boolean h = false;
    public int i = 0;
    public int j = 0;
    public boolean k = true;
    public xn0 l = xn0.a();
    public float m = 0.0f;
    public xn0 n = xn0.a();
    public int o = 0;
    public int p = 0;
    public float q = 0.5f;
    public float r = 0.5f;
    public float s = 0.5f;
    public float t = 0.5f;
    public boolean v = false;
    public boolean w = false;
    public float x = 0.5f;
    public float y = 0.5f;
    public xn0 z = xn0.a();
    public boolean A = false;
    public float B = Float.MAX_VALUE;

    /* loaded from: classes.dex */
    public static class a {
        public static int a = 1;

        public static int a() {
            int i = a;
            a = i + 1;
            return i;
        }
    }

    public tv(int i, float f, float f2) {
        this.e = -1;
        this.e = a.a();
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public static void H(PointF pointF, float f, float f2, PointF pointF2, float f3) {
        double d = f;
        double d2 = pointF2.x - f;
        double d3 = f3;
        double cos = Math.cos(d3);
        Double.isNaN(d2);
        Double.isNaN(d);
        double d4 = d + (d2 * cos);
        double d5 = pointF2.y - f2;
        double sin = Math.sin(d3);
        Double.isNaN(d5);
        pointF.x = (float) (d4 - (d5 * sin));
        double d6 = f2;
        double d7 = pointF2.x - f;
        double sin2 = Math.sin(d3);
        Double.isNaN(d7);
        Double.isNaN(d6);
        double d8 = pointF2.y - f2;
        double cos2 = Math.cos(d3);
        Double.isNaN(d8);
        pointF.y = (float) (d6 + (d7 * sin2) + (d8 * cos2));
    }

    public static void I(PointF pointF, PointF pointF2, float f) {
        double d = pointF2.x;
        double d2 = f;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        double d3 = d * cos;
        double d4 = pointF2.y;
        double sin = Math.sin(d2);
        Double.isNaN(d4);
        pointF.x = (float) (d3 - (d4 * sin));
        double d5 = pointF2.x;
        double sin2 = Math.sin(d2);
        Double.isNaN(d5);
        double d6 = pointF2.y;
        double cos2 = Math.cos(d2);
        Double.isNaN(d6);
        pointF.y = (float) ((d5 * sin2) + (d6 * cos2));
    }

    public static RectF r(aq0 aq0Var, dm0 dm0Var, dm0 dm0Var2) {
        bs1 bs1Var = new bs1(0.0f, 0.0f);
        dm0Var.j(aq0Var, bs1Var);
        float k = aq0Var.k(0.5f, true) - aq0Var.k(bs1Var.a, true);
        dm0Var2.j(aq0Var, bs1Var);
        float f = aq0Var.f(bs1Var.a, false);
        float g = aq0Var.g(bs1Var.b, false);
        float c = k - aq0Var.c(0.5f, false, f, g);
        float l = (aq0Var.l(0.5f, true) - aq0Var.l(bs1Var.b, true)) - aq0Var.d(0.5f, false, f, g);
        return new RectF(c, l, f + c, g + l);
    }

    public void A(un unVar) {
        unVar.O("rotation", this.m * 360.0f, "0_general", 0.0f, 300.0f);
        this.l.o(unVar.F("measureRot", "", "0_general", new String[0]));
    }

    public void B(y31 y31Var, e40 e40Var) {
        C(y31Var);
        y31Var.i(e40Var);
        y31Var.e(this.i);
    }

    public void C(y31 y31Var) {
        if (!this.h) {
            v(y31Var);
            y31Var.n();
        }
        this.h = true;
        if (this.j == 0) {
            y31Var.l();
        }
        w(y31Var, this.j);
        this.j++;
    }

    public void D(y31 y31Var) {
        float f = this.B / 1.0f;
        if (f > 1.0f) {
            return;
        }
        RectF n = n(y31Var.u.b);
        this.B += y31Var.d();
        float f2 = 1.0f - f;
        F.r(f80.e(f2, f2, f2, f2));
        na1.Z(y31Var, 0, n, 8, 2.5f, F, E);
    }

    public void E(y31 y31Var, e40 e40Var) {
        C(y31Var);
    }

    public void F(y31 y31Var) {
        C(y31Var);
    }

    public void G(de0 de0Var, e40 e40Var) {
        de0Var.i(e40Var);
        de0Var.e(this.i);
    }

    public void J(int i) {
        this.i = i;
    }

    public boolean K(un unVar, int i) {
        if (unVar == null) {
            return false;
        }
        t(unVar);
        return true;
    }

    public void L(float f, float f2) {
        this.s = f;
        this.t = f2;
    }

    public void M(bs1 bs1Var) {
        this.s = bs1Var.a;
        this.t = bs1Var.b;
    }

    public void N(float f, float f2) {
        this.q = f;
        this.r = f2;
    }

    public void O(bs1 bs1Var) {
        this.q = bs1Var.a;
        this.r = bs1Var.b;
    }

    public void P(boolean z, boolean z2) {
        this.u = z;
        this.v = z2;
    }

    public void Q(float f) {
        this.m = f;
    }

    public void R(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public void S(bs1 bs1Var) {
        this.x = bs1Var.a;
        this.y = bs1Var.b;
    }

    public void T(boolean z) {
        this.A = z;
    }

    public void U(int i) {
        X();
    }

    public void V(boolean z) {
        this.k = z;
    }

    public boolean W() {
        return this.k;
    }

    public void X() {
        this.B = 0.0f;
    }

    public void b(y31 y31Var, pr1 pr1Var, float f, float f2, float f3) {
        c(y31Var, pr1Var, f, f2, f3, -10.0f);
    }

    public void c(y31 y31Var, pr1 pr1Var, float f, float f2, float f3, float f4) {
        pr1 pr1Var2 = y31Var.A;
        pr1Var2.d();
        pr1Var2.c(f3 * 360.0f);
        y31Var.C.d();
        y31Var.C.e(-f, -f2, f4);
        y31Var.B.b(pr1Var2, y31Var.C);
        pr1Var2.d();
        pr1Var2.e(f, f2, 0.0f);
        y31Var.C.b(pr1Var2, y31Var.B);
        y31Var.r(pr1Var, y31Var.C);
    }

    public void d() {
        k(null);
    }

    public tv e(int i) {
        if (this.e == i) {
            return this;
        }
        return null;
    }

    public int f() {
        return this.i;
    }

    public boolean g(un unVar, int i, od0 od0Var) {
        if (unVar == null) {
            return false;
        }
        unVar.E(h());
        unVar.r0(i());
        z(unVar, od0Var);
        return true;
    }

    public abstract String h();

    public String i() {
        return C;
    }

    public String j(int i) {
        Context c = dx0.c();
        return c == null ? "" : c.getString(i);
    }

    public void k(y31 y31Var) {
        x(y31Var);
        m();
    }

    public void l() {
        this.h = false;
        this.j = 0;
    }

    public void m() {
        this.h = false;
        this.j = 0;
    }

    public RectF n(aq0 aq0Var) {
        bs1 l = this.n.l(aq0Var);
        float i = aq0Var.i(this.o) + aq0Var.k(this.q, this.o != 0 || this.u) + aq0Var.k(l.a, true);
        float j = aq0Var.j(this.p) + aq0Var.l(this.r, this.p != 0 || this.v) + aq0Var.l(l.b, true);
        bs1 l2 = this.z.l(aq0Var);
        float f = aq0Var.f(this.x + l2.a, this.A);
        float g = aq0Var.g(this.y + l2.b, this.A);
        float c = i - aq0Var.c(this.s, false, f, g);
        float d = j - aq0Var.d(this.t, false, f, g);
        return new RectF(c, d, f + c, g + d);
    }

    public RectF o(aq0 aq0Var, cs1 cs1Var) {
        bs1 l = this.n.l(aq0Var);
        boolean z = false;
        float i = aq0Var.i(this.o) + aq0Var.k(this.q, this.o != 0 || this.u) + aq0Var.k(l.a, true);
        float j = aq0Var.j(this.p) + aq0Var.l(this.r, (this.p != 0 || this.v) ? true : true) + aq0Var.l(l.b, true);
        this.z.l(aq0Var);
        float f = cs1Var.a;
        float f2 = cs1Var.b;
        float c = i - aq0Var.c(this.s, this.w, f, f2);
        float d = j - aq0Var.d(this.t, this.w, f, f2);
        return new RectF(c, d, f + c, f2 + d);
    }

    public RectF p(aq0 aq0Var) {
        bs1 l = this.n.l(aq0Var);
        float i = aq0Var.i(this.o) + aq0Var.k(this.q, this.o != 0 || this.u) + aq0Var.k(l.a, true);
        float j = aq0Var.j(this.p) + aq0Var.l(this.r, this.p != 0 || this.v) + aq0Var.l(l.b, true);
        bs1 l2 = this.z.l(aq0Var);
        float f = aq0Var.f(this.x + l2.a, this.A);
        float g = aq0Var.g(this.y + l2.b, this.A);
        float c = i - aq0Var.c(0.5f, false, f, g);
        float d = j - aq0Var.d(0.5f, false, f, g);
        return new RectF(c, d, f + c, g + d);
    }

    public RectF q(aq0 aq0Var) {
        return n(aq0Var);
    }

    public float s(aq0 aq0Var) {
        return (this.m + this.l.i(aq0Var)) % 1.0f;
    }

    public void t(un unVar) {
        this.f = unVar.A();
        V(unVar.n("visible", true));
        J(fc.a(unVar.h("blendMode").C(fc.b(this.a)), this.a));
        O(unVar.z("position", new bs1(0.5f, 0.5f)));
        String[] strArr = y2.a;
        this.o = unVar.v("anchorX", strArr, 0);
        this.p = unVar.v("anchorY", strArr, 0);
        this.n.n(unVar.h("MeasurePos"), this.d, 0.5f, 0.5f);
        M(unVar.z("alignmentPosition", new bs1(0.5f, 0.5f)));
        T(unVar.n("scaleIsUniform", false));
        S(unVar.z("scale", new bs1(this.b, this.c)));
        this.z.n(unVar.h("measureScale"), "Nothing", 0.5f, 0.5f);
    }

    public void u(un unVar) {
        Q(unVar.o("rotation", 0.0f) / 360.0f);
        this.l.n(unVar.h("measureRot"), "Nothing", 0.5f, 0.5f);
    }

    public boolean v(y31 y31Var) {
        return true;
    }

    public void w(y31 y31Var, int i) {
    }

    public void x(y31 y31Var) {
    }

    public void y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
    }

    public void z(un unVar, od0 od0Var) {
        unVar.V("_id", this.e, "");
        unVar.q0(this.f);
        unVar.L("visible", this.k, "0_general");
        unVar.F("blendMode", fc.b(this.i), "0_general", fc.a);
        unVar.k0("position", new bs1(this.q, this.r), "0_general", -1.0f, 1.0f);
        String a2 = y2.a(this.o, 0);
        String[] strArr = y2.a;
        unVar.m0("anchorX", a2, "0_general", strArr);
        unVar.m0("anchorY", y2.a(this.p, 0), "0_general", strArr);
        this.n.p(unVar.F("MeasurePos", "", "0_general", new String[0]));
        unVar.k0("alignmentPosition", new bs1(this.s, this.t), "0_general", 0.0f, 1.0f);
        unVar.L("scaleIsUniform", this.A, "0_general");
        unVar.k0("scale", new bs1(this.x, this.y), "0_general", 0.0f, 2.0f);
        this.z.q(unVar.F("measureScale", "", "0_general", new String[0]));
    }
}
