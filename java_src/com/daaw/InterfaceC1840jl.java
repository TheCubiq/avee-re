package com.daaw;

import com.daaw.InterfaceC2307nl;
/* renamed from: com.daaw.jl */
/* loaded from: classes2.dex */
public interface InterfaceC1840jl extends InterfaceC2307nl.InterfaceC2310b {

    /* renamed from: b */
    public static final C1842b f15175b = C1842b.f15176p;

    /* renamed from: com.daaw.jl$a */
    /* loaded from: classes2.dex */
    public static final class C1841a {
        /* renamed from: a */
        public static <E extends InterfaceC2307nl.InterfaceC2310b> E m18443a(InterfaceC1840jl interfaceC1840jl, InterfaceC2307nl.InterfaceC2312c<E> interfaceC2312c) {
            ug0.m8268f(interfaceC2312c, "key");
            if (!(interfaceC2312c instanceof AbstractC1491h)) {
                if (InterfaceC1840jl.f15175b == interfaceC2312c) {
                    ug0.m8270d(interfaceC1840jl, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                    return interfaceC1840jl;
                }
                return null;
            }
            AbstractC1491h abstractC1491h = (AbstractC1491h) interfaceC2312c;
            if (abstractC1491h.m21125a(interfaceC1840jl.getKey())) {
                E e = (E) abstractC1491h.m21124b(interfaceC1840jl);
                if (e instanceof InterfaceC2307nl.InterfaceC2310b) {
                    return e;
                }
                return null;
            }
            return null;
        }

        /* renamed from: b */
        public static InterfaceC2307nl m18442b(InterfaceC1840jl interfaceC1840jl, InterfaceC2307nl.InterfaceC2312c<?> interfaceC2312c) {
            ug0.m8268f(interfaceC2312c, "key");
            if (!(interfaceC2312c instanceof AbstractC1491h)) {
                return InterfaceC1840jl.f15175b == interfaceC2312c ? C2215mw.f19172p : interfaceC1840jl;
            }
            AbstractC1491h abstractC1491h = (AbstractC1491h) interfaceC2312c;
            return (!abstractC1491h.m21125a(interfaceC1840jl.getKey()) || abstractC1491h.m21124b(interfaceC1840jl) == null) ? interfaceC1840jl : C2215mw.f19172p;
        }
    }

    /* renamed from: com.daaw.jl$b */
    /* loaded from: classes2.dex */
    public static final class C1842b implements InterfaceC2307nl.InterfaceC2312c<InterfaceC1840jl> {

        /* renamed from: p */
        public static final /* synthetic */ C1842b f15176p = new C1842b();
    }

    /* renamed from: D */
    <T> InterfaceC1438gl<T> mo13315D(InterfaceC1438gl<? super T> interfaceC1438gl);

    /* renamed from: E */
    void mo13314E(InterfaceC1438gl<?> interfaceC1438gl);
}
