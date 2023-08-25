package com.daaw;

import com.daaw.C2716qj;
/* loaded from: classes.dex */
public class su0 {

    /* renamed from: a */
    public static boolean[] f26648a = new boolean[3];

    /* renamed from: a */
    public static void m9852a(C2865rj c2865rj, ak0 ak0Var, C2716qj c2716qj) {
        c2716qj.f24033j = -1;
        c2716qj.f24035k = -1;
        C2716qj.EnumC2718b enumC2718b = c2865rj.f24001M[0];
        C2716qj.EnumC2718b enumC2718b2 = C2716qj.EnumC2718b.WRAP_CONTENT;
        if (enumC2718b != enumC2718b2 && c2716qj.f24001M[0] == C2716qj.EnumC2718b.MATCH_PARENT) {
            int i = c2716qj.f23990B.f17434e;
            int m12450N = c2865rj.m12450N() - c2716qj.f23992D.f17434e;
            C2041lj c2041lj = c2716qj.f23990B;
            c2041lj.f17436g = ak0Var.m27404q(c2041lj);
            C2041lj c2041lj2 = c2716qj.f23992D;
            c2041lj2.f17436g = ak0Var.m27404q(c2041lj2);
            ak0Var.m27415f(c2716qj.f23990B.f17436g, i);
            ak0Var.m27415f(c2716qj.f23992D.f17436g, m12450N);
            c2716qj.f24033j = 2;
            c2716qj.m12426h0(i, m12450N);
        }
        if (c2865rj.f24001M[1] == enumC2718b2 || c2716qj.f24001M[1] != C2716qj.EnumC2718b.MATCH_PARENT) {
            return;
        }
        int i2 = c2716qj.f23991C.f17434e;
        int m12403t = c2865rj.m12403t() - c2716qj.f23993E.f17434e;
        C2041lj c2041lj3 = c2716qj.f23991C;
        c2041lj3.f17436g = ak0Var.m27404q(c2041lj3);
        C2041lj c2041lj4 = c2716qj.f23993E;
        c2041lj4.f17436g = ak0Var.m27404q(c2041lj4);
        ak0Var.m27415f(c2716qj.f23991C.f17436g, i2);
        ak0Var.m27415f(c2716qj.f23993E.f17436g, m12403t);
        if (c2716qj.f24013Y > 0 || c2716qj.m12451M() == 8) {
            C2041lj c2041lj5 = c2716qj.f23994F;
            c2041lj5.f17436g = ak0Var.m27404q(c2041lj5);
            ak0Var.m27415f(c2716qj.f23994F.f17436g, c2716qj.f24013Y + i2);
        }
        c2716qj.f24035k = 2;
        c2716qj.m12396w0(i2, m12403t);
    }

    /* renamed from: b */
    public static final boolean m9851b(int i, int i2) {
        return (i & i2) == i2;
    }
}
