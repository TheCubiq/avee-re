package com.daaw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class aw8 extends ad2 {

    /* renamed from: r */
    public final h68 f4070r;

    /* renamed from: s */
    public final Map f4071s;

    public aw8(h68 h68Var) {
        super("require");
        this.f4071s = new HashMap();
        this.f4070r = h68Var;
    }

    @Override // com.daaw.ad2
    /* renamed from: a */
    public final gl2 mo5780a(w07 w07Var, List list) {
        gl2 gl2Var;
        ou7.m13916h("require", 1, list);
        String zzi = w07Var.m6608b((gl2) list.get(0)).zzi();
        if (this.f4071s.containsKey(zzi)) {
            return (gl2) this.f4071s.get(zzi);
        }
        h68 h68Var = this.f4070r;
        if (h68Var.f12114a.containsKey(zzi)) {
            try {
                gl2Var = (gl2) ((Callable) h68Var.f12114a.get(zzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(zzi)));
            }
        } else {
            gl2Var = gl2.f11420g;
        }
        if (gl2Var instanceof ad2) {
            this.f4071s.put(zzi, (ad2) gl2Var);
        }
        return gl2Var;
    }
}
