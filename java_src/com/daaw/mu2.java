package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class mu2 {

    /* renamed from: a */
    public final Map f19153a = new HashMap();

    /* renamed from: b */
    public final u83 f19154b = new u83();

    public mu2() {
        m15760b(new gs2());
        m15760b(new kv2());
        m15760b(new ow2());
        m15760b(new t03());
        m15760b(new l63());
        m15760b(new q73());
        m15760b(new y93());
    }

    /* renamed from: a */
    public final gl2 m15761a(w07 w07Var, gl2 gl2Var) {
        ou7.m13921c(w07Var);
        if (gl2Var instanceof km2) {
            km2 km2Var = (km2) gl2Var;
            ArrayList m17664b = km2Var.m17664b();
            String m17665a = km2Var.m17665a();
            return (this.f19153a.containsKey(m17665a) ? (it2) this.f19153a.get(m17665a) : this.f19154b).mo3983a(m17665a, w07Var, m17664b);
        }
        return gl2Var;
    }

    /* renamed from: b */
    public final void m15760b(it2 it2Var) {
        for (db3 db3Var : it2Var.f13989a) {
            this.f19153a.put(db3Var.m24568b().toString(), it2Var);
        }
    }
}
