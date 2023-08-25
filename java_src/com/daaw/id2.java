package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class id2 {

    /* renamed from: a */
    public final List f13515a;

    /* renamed from: b */
    public final m42[] f13516b;

    public id2(List list) {
        this.f13515a = list;
        this.f13516b = new m42[list.size()];
    }

    /* renamed from: a */
    public final void m19915a(long j, ik5 ik5Var) {
        oz8.m13792a(j, ik5Var, this.f13516b);
    }

    /* renamed from: b */
    public final void m19914b(m09 m09Var, td2 td2Var) {
        for (int i = 0; i < this.f13516b.length; i++) {
            td2Var.m9282c();
            m42 mo3292n = m09Var.mo3292n(td2Var.m9284a(), 3);
            f92 f92Var = (f92) this.f13515a.get(i);
            String str = f92Var.f9275l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            uo4.m7873e(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            String str2 = f92Var.f9264a;
            if (str2 == null) {
                str2 = td2Var.m9283b();
            }
            b72 b72Var = new b72();
            b72Var.m26384h(str2);
            b72Var.m26372s(str);
            b72Var.m26370u(f92Var.f9267d);
            b72Var.m26380k(f92Var.f9266c);
            b72Var.m26393c0(f92Var.f9261D);
            b72Var.m26382i(f92Var.f9277n);
            mo3292n.mo16218f(b72Var.m26366y());
            this.f13516b[i] = mo3292n;
        }
    }
}
