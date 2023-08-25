package com.daaw;

import com.daaw.qj;
/* loaded from: classes.dex */
public class su0 {
    public static boolean[] a = new boolean[3];

    public static void a(rj rjVar, ak0 ak0Var, qj qjVar) {
        qjVar.j = -1;
        qjVar.k = -1;
        qj.b bVar = rjVar.M[0];
        qj.b bVar2 = qj.b.WRAP_CONTENT;
        if (bVar != bVar2 && qjVar.M[0] == qj.b.MATCH_PARENT) {
            int i = qjVar.B.e;
            int N = rjVar.N() - qjVar.D.e;
            lj ljVar = qjVar.B;
            ljVar.g = ak0Var.q(ljVar);
            lj ljVar2 = qjVar.D;
            ljVar2.g = ak0Var.q(ljVar2);
            ak0Var.f(qjVar.B.g, i);
            ak0Var.f(qjVar.D.g, N);
            qjVar.j = 2;
            qjVar.h0(i, N);
        }
        if (rjVar.M[1] == bVar2 || qjVar.M[1] != qj.b.MATCH_PARENT) {
            return;
        }
        int i2 = qjVar.C.e;
        int t = rjVar.t() - qjVar.E.e;
        lj ljVar3 = qjVar.C;
        ljVar3.g = ak0Var.q(ljVar3);
        lj ljVar4 = qjVar.E;
        ljVar4.g = ak0Var.q(ljVar4);
        ak0Var.f(qjVar.C.g, i2);
        ak0Var.f(qjVar.E.g, t);
        if (qjVar.Y > 0 || qjVar.M() == 8) {
            lj ljVar5 = qjVar.F;
            ljVar5.g = ak0Var.q(ljVar5);
            ak0Var.f(qjVar.F.g, qjVar.Y + i2);
        }
        qjVar.k = 2;
        qjVar.w0(i2, t);
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
