package com.daaw;

import com.daaw.jl;
import com.daaw.nl;
/* loaded from: classes2.dex */
public abstract class pl extends g implements jl {
    public static final a p = new a(null);

    /* loaded from: classes2.dex */
    public static final class a extends h<jl, pl> {

        /* renamed from: com.daaw.pl$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0082a extends si0 implements z40<nl.b, pl> {
            public static final C0082a q = new C0082a();

            public C0082a() {
                super(1);
            }

            @Override // com.daaw.z40
            /* renamed from: d */
            public final pl b(nl.b bVar) {
                if (bVar instanceof pl) {
                    return (pl) bVar;
                }
                return null;
            }
        }

        public a() {
            super(jl.b, C0082a.q);
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }
    }

    public pl() {
        super(jl.b);
    }

    @Override // com.daaw.jl
    public final <T> gl<T> D(gl<? super T> glVar) {
        return new bu(this, glVar);
    }

    @Override // com.daaw.jl
    public final void E(gl<?> glVar) {
        ((bu) glVar).l();
    }

    public abstract void T(nl nlVar, Runnable runnable);

    public boolean U(nl nlVar) {
        return true;
    }

    public pl V(int i) {
        yj0.a(i);
        return new xj0(this, i);
    }

    @Override // com.daaw.g, com.daaw.nl.b, com.daaw.nl
    public <E extends nl.b> E get(nl.c<E> cVar) {
        return (E) jl.a.a(this, cVar);
    }

    @Override // com.daaw.g, com.daaw.nl
    public nl minusKey(nl.c<?> cVar) {
        return jl.a.b(this, cVar);
    }

    public String toString() {
        return aq.a(this) + '@' + aq.b(this);
    }
}
