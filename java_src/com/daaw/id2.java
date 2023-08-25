package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class id2 {
    public final List a;
    public final m42[] b;

    public id2(List list) {
        this.a = list;
        this.b = new m42[list.size()];
    }

    public final void a(long j, ik5 ik5Var) {
        oz8.a(j, ik5Var, this.b);
    }

    public final void b(m09 m09Var, td2 td2Var) {
        for (int i = 0; i < this.b.length; i++) {
            td2Var.c();
            m42 n = m09Var.n(td2Var.a(), 3);
            f92 f92Var = (f92) this.a.get(i);
            String str = f92Var.l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            uo4.e(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            String str2 = f92Var.a;
            if (str2 == null) {
                str2 = td2Var.b();
            }
            b72 b72Var = new b72();
            b72Var.h(str2);
            b72Var.s(str);
            b72Var.u(f92Var.d);
            b72Var.k(f92Var.c);
            b72Var.c0(f92Var.D);
            b72Var.i(f92Var.n);
            n.f(b72Var.y());
            this.b[i] = n;
        }
    }
}
