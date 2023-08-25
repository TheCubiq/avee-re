package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class mu2 {
    public final Map a = new HashMap();
    public final u83 b = new u83();

    public mu2() {
        b(new gs2());
        b(new kv2());
        b(new ow2());
        b(new t03());
        b(new l63());
        b(new q73());
        b(new y93());
    }

    public final gl2 a(w07 w07Var, gl2 gl2Var) {
        ou7.c(w07Var);
        if (gl2Var instanceof km2) {
            km2 km2Var = (km2) gl2Var;
            ArrayList b = km2Var.b();
            String a = km2Var.a();
            return (this.a.containsKey(a) ? (it2) this.a.get(a) : this.b).a(a, w07Var, b);
        }
        return gl2Var;
    }

    public final void b(it2 it2Var) {
        for (db3 db3Var : it2Var.a) {
            this.a.put(db3Var.b().toString(), it2Var);
        }
    }
}
