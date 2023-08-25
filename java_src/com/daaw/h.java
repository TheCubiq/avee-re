package com.daaw;

import com.daaw.nl;
import com.daaw.nl.b;
/* loaded from: classes2.dex */
public abstract class h<B extends nl.b, E extends B> implements nl.c<E> {
    public final z40<nl.b, E> p;
    public final nl.c<?> q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.daaw.z40<com.daaw.nl$b, E extends B>, com.daaw.z40<? super com.daaw.nl$b, ? extends E extends B>, java.lang.Object] */
    public h(nl.c<B> cVar, z40<? super nl.b, ? extends E> z40Var) {
        ug0.f(cVar, "baseKey");
        ug0.f(z40Var, "safeCast");
        this.p = z40Var;
        this.q = cVar instanceof h ? (nl.c<B>) ((h) cVar).q : cVar;
    }

    public final boolean a(nl.c<?> cVar) {
        ug0.f(cVar, "key");
        return cVar == this || this.q == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/daaw/nl$b;)TE; */
    public final nl.b b(nl.b bVar) {
        ug0.f(bVar, "element");
        return (nl.b) this.p.b(bVar);
    }
}
