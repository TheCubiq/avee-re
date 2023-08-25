package com.daaw;

import com.daaw.nl;
/* loaded from: classes2.dex */
public abstract class il extends na {
    public final nl q;
    public transient gl<Object> r;

    @Override // com.daaw.na
    public void e() {
        gl<?> glVar = this.r;
        if (glVar != null && glVar != this) {
            nl.b bVar = getContext().get(jl.b);
            ug0.c(bVar);
            ((jl) bVar).E(glVar);
        }
        this.r = mh.p;
    }

    public final gl<Object> f() {
        gl<Object> glVar = this.r;
        if (glVar == null) {
            jl jlVar = (jl) getContext().get(jl.b);
            if (jlVar == null || (glVar = jlVar.D(this)) == null) {
                glVar = this;
            }
            this.r = glVar;
        }
        return glVar;
    }

    @Override // com.daaw.gl
    public nl getContext() {
        nl nlVar = this.q;
        ug0.c(nlVar);
        return nlVar;
    }
}
