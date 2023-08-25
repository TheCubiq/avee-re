package com.daaw;

import com.daaw.nl;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class mw implements nl, Serializable {
    public static final mw p = new mw();

    @Override // com.daaw.nl
    public <R> R fold(R r, n50<? super R, ? super nl.b, ? extends R> n50Var) {
        ug0.f(n50Var, "operation");
        return r;
    }

    @Override // com.daaw.nl
    public <E extends nl.b> E get(nl.c<E> cVar) {
        ug0.f(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // com.daaw.nl
    public nl minusKey(nl.c<?> cVar) {
        ug0.f(cVar, "key");
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
