package com.daaw;

import com.daaw.InterfaceC1840jl;
import com.daaw.InterfaceC2307nl;
/* renamed from: com.daaw.pl */
/* loaded from: classes2.dex */
public abstract class AbstractC2557pl extends AbstractC1347g implements InterfaceC1840jl {

    /* renamed from: p */
    public static final C2558a f23007p = new C2558a(null);

    /* renamed from: com.daaw.pl$a */
    /* loaded from: classes2.dex */
    public static final class C2558a extends AbstractC1491h<InterfaceC1840jl, AbstractC2557pl> {

        /* renamed from: com.daaw.pl$a$a */
        /* loaded from: classes2.dex */
        public static final class C2559a extends si0 implements z40<InterfaceC2307nl.InterfaceC2310b, AbstractC2557pl> {

            /* renamed from: q */
            public static final C2559a f23008q = new C2559a();

            public C2559a() {
                super(1);
            }

            @Override // com.daaw.z40
            /* renamed from: d */
            public final AbstractC2557pl mo2829b(InterfaceC2307nl.InterfaceC2310b interfaceC2310b) {
                if (interfaceC2310b instanceof AbstractC2557pl) {
                    return (AbstractC2557pl) interfaceC2310b;
                }
                return null;
            }
        }

        public C2558a() {
            super(InterfaceC1840jl.f15175b, C2559a.f23008q);
        }

        public /* synthetic */ C2558a(C2575pq c2575pq) {
            this();
        }
    }

    public AbstractC2557pl() {
        super(InterfaceC1840jl.f15175b);
    }

    @Override // com.daaw.InterfaceC1840jl
    /* renamed from: D */
    public final <T> InterfaceC1438gl<T> mo13315D(InterfaceC1438gl<? super T> interfaceC1438gl) {
        return new C0887bu(this, interfaceC1438gl);
    }

    @Override // com.daaw.InterfaceC1840jl
    /* renamed from: E */
    public final void mo13314E(InterfaceC1438gl<?> interfaceC1438gl) {
        ((C0887bu) interfaceC1438gl).m25827l();
    }

    /* renamed from: T */
    public abstract void mo5048T(InterfaceC2307nl interfaceC2307nl, Runnable runnable);

    /* renamed from: U */
    public boolean mo11594U(InterfaceC2307nl interfaceC2307nl) {
        return true;
    }

    /* renamed from: V */
    public AbstractC2557pl m13313V(int i) {
        yj0.m3657a(i);
        return new xj0(this, i);
    }

    @Override // com.daaw.AbstractC1347g, com.daaw.InterfaceC2307nl.InterfaceC2310b, com.daaw.InterfaceC2307nl
    public <E extends InterfaceC2307nl.InterfaceC2310b> E get(InterfaceC2307nl.InterfaceC2312c<E> interfaceC2312c) {
        return (E) InterfaceC1840jl.C1841a.m18443a(this, interfaceC2312c);
    }

    @Override // com.daaw.AbstractC1347g, com.daaw.InterfaceC2307nl
    public InterfaceC2307nl minusKey(InterfaceC2307nl.InterfaceC2312c<?> interfaceC2312c) {
        return InterfaceC1840jl.C1841a.m18442b(this, interfaceC2312c);
    }

    public String toString() {
        return C0666aq.m27227a(this) + '@' + C0666aq.m27226b(this);
    }
}
