package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class aj6 {
    public final th6 a;
    public final wh6 b;
    public final cq5 c;
    public final op6 d;
    public final to6 e;

    public aj6(cq5 cq5Var, op6 op6Var, th6 th6Var, wh6 wh6Var, to6 to6Var) {
        this.a = th6Var;
        this.b = wh6Var;
        this.c = cq5Var;
        this.d = op6Var;
        this.e = to6Var;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), 2);
        }
    }

    public final void b(String str, int i) {
        if (!this.a.k0) {
            this.d.c(str, this.e);
            return;
        }
        this.c.u(new eq5(zzt.zzB().a(), this.b.b, str, i));
    }

    public final void c(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), i);
        }
    }
}
