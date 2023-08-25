package com.daaw;
/* loaded from: classes2.dex */
public final class ip1<T> extends h91<T> {
    public nl s;
    public Object t;

    @Override // com.daaw.h91, com.daaw.f
    public void i0(Object obj) {
        nl nlVar = this.s;
        if (nlVar != null) {
            bl1.a(nlVar, this.t);
            this.s = null;
            this.t = null;
        }
        Object a = rh.a(obj, this.r);
        gl<T> glVar = this.r;
        nl context = glVar.getContext();
        Object c = bl1.c(context, null);
        ip1<?> c2 = c != bl1.a ? ol.c(glVar, context, c) : null;
        try {
            this.r.b(a);
            lp1 lp1Var = lp1.a;
        } finally {
            if (c2 == null || c2.l0()) {
                bl1.a(context, c);
            }
        }
    }

    public final boolean l0() {
        if (this.s == null) {
            return false;
        }
        this.s = null;
        this.t = null;
        return true;
    }

    public final void m0(nl nlVar, Object obj) {
        this.s = nlVar;
        this.t = obj;
    }
}
