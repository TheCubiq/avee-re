package com.daaw;
/* loaded from: classes2.dex */
public class h91<T> extends f<T> implements vl {
    public final gl<T> r;

    @Override // com.daaw.uh0
    public final boolean I() {
        return true;
    }

    @Override // com.daaw.vl
    public final vl a() {
        gl<T> glVar = this.r;
        if (glVar instanceof vl) {
            return (vl) glVar;
        }
        return null;
    }

    @Override // com.daaw.uh0
    public void h(Object obj) {
        cu.c(vg0.a(this.r), rh.a(obj, this.r), null, 2, null);
    }

    @Override // com.daaw.f
    public void i0(Object obj) {
        gl<T> glVar = this.r;
        glVar.b(rh.a(obj, glVar));
    }
}
