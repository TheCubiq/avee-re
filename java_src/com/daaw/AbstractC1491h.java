package com.daaw;

import com.daaw.InterfaceC2307nl;
import com.daaw.InterfaceC2307nl.InterfaceC2310b;
/* renamed from: com.daaw.h */
/* loaded from: classes2.dex */
public abstract class AbstractC1491h<B extends InterfaceC2307nl.InterfaceC2310b, E extends B> implements InterfaceC2307nl.InterfaceC2312c<E> {

    /* renamed from: p */
    public final z40<InterfaceC2307nl.InterfaceC2310b, E> f11905p;

    /* renamed from: q */
    public final InterfaceC2307nl.InterfaceC2312c<?> f11906q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.daaw.z40<com.daaw.nl$b, E extends B>, com.daaw.z40<? super com.daaw.nl$b, ? extends E extends B>, java.lang.Object] */
    public AbstractC1491h(InterfaceC2307nl.InterfaceC2312c<B> interfaceC2312c, z40<? super InterfaceC2307nl.InterfaceC2310b, ? extends E> z40Var) {
        ug0.m8268f(interfaceC2312c, "baseKey");
        ug0.m8268f(z40Var, "safeCast");
        this.f11905p = z40Var;
        this.f11906q = interfaceC2312c instanceof AbstractC1491h ? (InterfaceC2307nl.InterfaceC2312c<B>) ((AbstractC1491h) interfaceC2312c).f11906q : interfaceC2312c;
    }

    /* renamed from: a */
    public final boolean m21125a(InterfaceC2307nl.InterfaceC2312c<?> interfaceC2312c) {
        ug0.m8268f(interfaceC2312c, "key");
        return interfaceC2312c == this || this.f11906q == interfaceC2312c;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/daaw/nl$b;)TE; */
    /* renamed from: b */
    public final InterfaceC2307nl.InterfaceC2310b m21124b(InterfaceC2307nl.InterfaceC2310b interfaceC2310b) {
        ug0.m8268f(interfaceC2310b, "element");
        return (InterfaceC2307nl.InterfaceC2310b) this.f11905p.mo2829b(interfaceC2310b);
    }
}
