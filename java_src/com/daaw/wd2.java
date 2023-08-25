package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class wd2 {

    /* renamed from: a */
    public final List f31185a;

    /* renamed from: b */
    public final m42[] f31186b;

    public wd2(List list) {
        this.f31185a = list;
        this.f31186b = new m42[list.size()];
    }

    /* renamed from: a */
    public final void m6156a(long j, ik5 ik5Var) {
        if (ik5Var.m19713i() < 9) {
            return;
        }
        int m19709m = ik5Var.m19709m();
        int m19709m2 = ik5Var.m19709m();
        int m19703s = ik5Var.m19703s();
        if (m19709m == 434 && m19709m2 == 1195456820 && m19703s == 3) {
            oz8.m13791b(j, ik5Var, this.f31186b);
        }
    }

    /* renamed from: b */
    public final void m6155b(m09 m09Var, td2 td2Var) {
        for (int i = 0; i < this.f31186b.length; i++) {
            td2Var.m9282c();
            m42 mo3292n = m09Var.mo3292n(td2Var.m9284a(), 3);
            f92 f92Var = (f92) this.f31185a.get(i);
            String str = f92Var.f9275l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            uo4.m7873e(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            b72 b72Var = new b72();
            b72Var.m26384h(td2Var.m9283b());
            b72Var.m26372s(str);
            b72Var.m26370u(f92Var.f9267d);
            b72Var.m26380k(f92Var.f9266c);
            b72Var.m26393c0(f92Var.f9261D);
            b72Var.m26382i(f92Var.f9277n);
            mo3292n.mo16218f(b72Var.m26366y());
            this.f31186b[i] = mo3292n;
        }
    }
}
