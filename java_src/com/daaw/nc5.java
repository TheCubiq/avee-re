package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class nc5 implements fn6 {
    public final Map p;
    public final x33 q;

    public nc5(x33 x33Var, Map map) {
        this.p = map;
        this.q = x33Var;
    }

    @Override // com.daaw.fn6
    public final void A(ym6 ym6Var, String str) {
        if (this.p.containsKey(ym6Var)) {
            this.q.c(((mc5) this.p.get(ym6Var)).a);
        }
    }

    @Override // com.daaw.fn6
    public final void M(ym6 ym6Var, String str) {
        if (this.p.containsKey(ym6Var)) {
            this.q.c(((mc5) this.p.get(ym6Var)).b);
        }
    }

    @Override // com.daaw.fn6
    public final void S(ym6 ym6Var, String str, Throwable th) {
        if (this.p.containsKey(ym6Var)) {
            this.q.c(((mc5) this.p.get(ym6Var)).c);
        }
    }

    @Override // com.daaw.fn6
    public final void k(ym6 ym6Var, String str) {
    }
}
