package com.daaw;

import com.daaw.nl;
/* loaded from: classes2.dex */
public abstract class g implements nl.b {
    private final nl.c<?> key;

    public g(nl.c<?> cVar) {
        ug0.f(cVar, "key");
        this.key = cVar;
    }

    @Override // com.daaw.nl
    public <R> R fold(R r, n50<? super R, ? super nl.b, ? extends R> n50Var) {
        return (R) nl.b.a.a(this, r, n50Var);
    }

    @Override // com.daaw.nl.b, com.daaw.nl
    public <E extends nl.b> E get(nl.c<E> cVar) {
        return (E) nl.b.a.b(this, cVar);
    }

    @Override // com.daaw.nl.b
    public nl.c<?> getKey() {
        return this.key;
    }

    @Override // com.daaw.nl
    public nl minusKey(nl.c<?> cVar) {
        return nl.b.a.c(this, cVar);
    }

    public nl plus(nl nlVar) {
        return nl.b.a.d(this, nlVar);
    }
}
