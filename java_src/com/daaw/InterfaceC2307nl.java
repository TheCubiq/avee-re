package com.daaw;

import com.daaw.InterfaceC1840jl;
/* renamed from: com.daaw.nl */
/* loaded from: classes2.dex */
public interface InterfaceC2307nl {

    /* renamed from: com.daaw.nl$a */
    /* loaded from: classes2.dex */
    public static final class C2308a {

        /* renamed from: com.daaw.nl$a$a */
        /* loaded from: classes2.dex */
        public static final class C2309a extends si0 implements n50<InterfaceC2307nl, InterfaceC2310b, InterfaceC2307nl> {

            /* renamed from: q */
            public static final C2309a f20214q = new C2309a();

            public C2309a() {
                super(2);
            }

            @Override // com.daaw.n50
            /* renamed from: d */
            public final InterfaceC2307nl mo15095c(InterfaceC2307nl interfaceC2307nl, InterfaceC2310b interfaceC2310b) {
                C1082dh c1082dh;
                ug0.m8268f(interfaceC2307nl, "acc");
                ug0.m8268f(interfaceC2310b, "element");
                InterfaceC2307nl minusKey = interfaceC2307nl.minusKey(interfaceC2310b.getKey());
                C2215mw c2215mw = C2215mw.f19172p;
                if (minusKey == c2215mw) {
                    return interfaceC2310b;
                }
                InterfaceC1840jl.C1842b c1842b = InterfaceC1840jl.f15175b;
                InterfaceC1840jl interfaceC1840jl = (InterfaceC1840jl) minusKey.get(c1842b);
                if (interfaceC1840jl == null) {
                    c1082dh = new C1082dh(minusKey, interfaceC2310b);
                } else {
                    InterfaceC2307nl minusKey2 = minusKey.minusKey(c1842b);
                    if (minusKey2 == c2215mw) {
                        return new C1082dh(interfaceC2310b, interfaceC1840jl);
                    }
                    c1082dh = new C1082dh(new C1082dh(minusKey2, interfaceC2310b), interfaceC1840jl);
                }
                return c1082dh;
            }
        }

        /* renamed from: a */
        public static InterfaceC2307nl m15096a(InterfaceC2307nl interfaceC2307nl, InterfaceC2307nl interfaceC2307nl2) {
            ug0.m8268f(interfaceC2307nl2, "context");
            return interfaceC2307nl2 == C2215mw.f19172p ? interfaceC2307nl : (InterfaceC2307nl) interfaceC2307nl2.fold(interfaceC2307nl, C2309a.f20214q);
        }
    }

    /* renamed from: com.daaw.nl$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC2310b extends InterfaceC2307nl {

        /* renamed from: com.daaw.nl$b$a */
        /* loaded from: classes2.dex */
        public static final class C2311a {
            /* renamed from: a */
            public static <R> R m15093a(InterfaceC2310b interfaceC2310b, R r, n50<? super R, ? super InterfaceC2310b, ? extends R> n50Var) {
                ug0.m8268f(n50Var, "operation");
                return n50Var.mo15095c(r, interfaceC2310b);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: b */
            public static <E extends InterfaceC2310b> E m15092b(InterfaceC2310b interfaceC2310b, InterfaceC2312c<E> interfaceC2312c) {
                ug0.m8268f(interfaceC2312c, "key");
                if (ug0.m8273a(interfaceC2310b.getKey(), interfaceC2312c)) {
                    ug0.m8270d(interfaceC2310b, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return interfaceC2310b;
                }
                return null;
            }

            /* renamed from: c */
            public static InterfaceC2307nl m15091c(InterfaceC2310b interfaceC2310b, InterfaceC2312c<?> interfaceC2312c) {
                ug0.m8268f(interfaceC2312c, "key");
                return ug0.m8273a(interfaceC2310b.getKey(), interfaceC2312c) ? C2215mw.f19172p : interfaceC2310b;
            }

            /* renamed from: d */
            public static InterfaceC2307nl m15090d(InterfaceC2310b interfaceC2310b, InterfaceC2307nl interfaceC2307nl) {
                ug0.m8268f(interfaceC2307nl, "context");
                return C2308a.m15096a(interfaceC2310b, interfaceC2307nl);
            }
        }

        @Override // com.daaw.InterfaceC2307nl
        <E extends InterfaceC2310b> E get(InterfaceC2312c<E> interfaceC2312c);

        InterfaceC2312c<?> getKey();
    }

    /* renamed from: com.daaw.nl$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC2312c<E extends InterfaceC2310b> {
    }

    <R> R fold(R r, n50<? super R, ? super InterfaceC2310b, ? extends R> n50Var);

    <E extends InterfaceC2310b> E get(InterfaceC2312c<E> interfaceC2312c);

    InterfaceC2307nl minusKey(InterfaceC2312c<?> interfaceC2312c);
}
