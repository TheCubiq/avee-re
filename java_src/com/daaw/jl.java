package com.daaw;

import com.daaw.nl;
/* loaded from: classes2.dex */
public interface jl extends nl.b {
    public static final b b = b.p;

    /* loaded from: classes2.dex */
    public static final class a {
        public static <E extends nl.b> E a(jl jlVar, nl.c<E> cVar) {
            ug0.f(cVar, "key");
            if (!(cVar instanceof h)) {
                if (jl.b == cVar) {
                    ug0.d(jlVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                    return jlVar;
                }
                return null;
            }
            h hVar = (h) cVar;
            if (hVar.a(jlVar.getKey())) {
                E e = (E) hVar.b(jlVar);
                if (e instanceof nl.b) {
                    return e;
                }
                return null;
            }
            return null;
        }

        public static nl b(jl jlVar, nl.c<?> cVar) {
            ug0.f(cVar, "key");
            if (!(cVar instanceof h)) {
                return jl.b == cVar ? mw.p : jlVar;
            }
            h hVar = (h) cVar;
            return (!hVar.a(jlVar.getKey()) || hVar.b(jlVar) == null) ? jlVar : mw.p;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements nl.c<jl> {
        public static final /* synthetic */ b p = new b();
    }

    <T> gl<T> D(gl<? super T> glVar);

    void E(gl<?> glVar);
}
