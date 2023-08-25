package com.daaw;

import com.daaw.InterfaceC2307nl;
/* loaded from: classes2.dex */
public final class jp1 implements InterfaceC2307nl.InterfaceC2310b, InterfaceC2307nl.InterfaceC2312c<jp1> {

    /* renamed from: p */
    public static final jp1 f15304p = new jp1();

    @Override // com.daaw.InterfaceC2307nl
    public <R> R fold(R r, n50<? super R, ? super InterfaceC2307nl.InterfaceC2310b, ? extends R> n50Var) {
        return (R) InterfaceC2307nl.InterfaceC2310b.C2311a.m15093a(this, r, n50Var);
    }

    @Override // com.daaw.InterfaceC2307nl.InterfaceC2310b, com.daaw.InterfaceC2307nl
    public <E extends InterfaceC2307nl.InterfaceC2310b> E get(InterfaceC2307nl.InterfaceC2312c<E> interfaceC2312c) {
        return (E) InterfaceC2307nl.InterfaceC2310b.C2311a.m15092b(this, interfaceC2312c);
    }

    @Override // com.daaw.InterfaceC2307nl.InterfaceC2310b
    public InterfaceC2307nl.InterfaceC2312c<?> getKey() {
        return this;
    }

    @Override // com.daaw.InterfaceC2307nl
    public InterfaceC2307nl minusKey(InterfaceC2307nl.InterfaceC2312c<?> interfaceC2312c) {
        return InterfaceC2307nl.InterfaceC2310b.C2311a.m15091c(this, interfaceC2312c);
    }
}
