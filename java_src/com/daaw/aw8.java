package com.daaw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class aw8 extends ad2 {
    public final h68 r;
    public final Map s;

    public aw8(h68 h68Var) {
        super("require");
        this.s = new HashMap();
        this.r = h68Var;
    }

    @Override // com.daaw.ad2
    public final gl2 a(w07 w07Var, List list) {
        gl2 gl2Var;
        ou7.h("require", 1, list);
        String zzi = w07Var.b((gl2) list.get(0)).zzi();
        if (this.s.containsKey(zzi)) {
            return (gl2) this.s.get(zzi);
        }
        h68 h68Var = this.r;
        if (h68Var.a.containsKey(zzi)) {
            try {
                gl2Var = (gl2) ((Callable) h68Var.a.get(zzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(zzi)));
            }
        } else {
            gl2Var = gl2.g;
        }
        if (gl2Var instanceof ad2) {
            this.s.put(zzi, (ad2) gl2Var);
        }
        return gl2Var;
    }
}
