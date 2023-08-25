package com.daaw;

import com.daaw.jl;
/* loaded from: classes2.dex */
public interface nl {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.daaw.nl$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0080a extends si0 implements n50<nl, b, nl> {
            public static final C0080a q = new C0080a();

            public C0080a() {
                super(2);
            }

            @Override // com.daaw.n50
            /* renamed from: d */
            public final nl c(nl nlVar, b bVar) {
                dh dhVar;
                ug0.f(nlVar, "acc");
                ug0.f(bVar, "element");
                nl minusKey = nlVar.minusKey(bVar.getKey());
                mw mwVar = mw.p;
                if (minusKey == mwVar) {
                    return bVar;
                }
                jl.b bVar2 = jl.b;
                jl jlVar = (jl) minusKey.get(bVar2);
                if (jlVar == null) {
                    dhVar = new dh(minusKey, bVar);
                } else {
                    nl minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == mwVar) {
                        return new dh(bVar, jlVar);
                    }
                    dhVar = new dh(new dh(minusKey2, bVar), jlVar);
                }
                return dhVar;
            }
        }

        public static nl a(nl nlVar, nl nlVar2) {
            ug0.f(nlVar2, "context");
            return nlVar2 == mw.p ? nlVar : (nl) nlVar2.fold(nlVar, C0080a.q);
        }
    }

    /* loaded from: classes2.dex */
    public interface b extends nl {

        /* loaded from: classes2.dex */
        public static final class a {
            public static <R> R a(b bVar, R r, n50<? super R, ? super b, ? extends R> n50Var) {
                ug0.f(n50Var, "operation");
                return n50Var.c(r, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                ug0.f(cVar, "key");
                if (ug0.a(bVar.getKey(), cVar)) {
                    ug0.d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            public static nl c(b bVar, c<?> cVar) {
                ug0.f(cVar, "key");
                return ug0.a(bVar.getKey(), cVar) ? mw.p : bVar;
            }

            public static nl d(b bVar, nl nlVar) {
                ug0.f(nlVar, "context");
                return a.a(bVar, nlVar);
            }
        }

        @Override // com.daaw.nl
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* loaded from: classes2.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r, n50<? super R, ? super b, ? extends R> n50Var);

    <E extends b> E get(c<E> cVar);

    nl minusKey(c<?> cVar);
}
