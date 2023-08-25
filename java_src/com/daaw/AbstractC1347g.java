package com.daaw;

import com.daaw.InterfaceC2307nl;
/* renamed from: com.daaw.g */
/* loaded from: classes2.dex */
public abstract class AbstractC1347g implements InterfaceC2307nl.InterfaceC2310b {
    private final InterfaceC2307nl.InterfaceC2312c<?> key;

    public AbstractC1347g(InterfaceC2307nl.InterfaceC2312c<?> interfaceC2312c) {
        ug0.m8268f(interfaceC2312c, "key");
        this.key = interfaceC2312c;
    }

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
        return this.key;
    }

    @Override // com.daaw.InterfaceC2307nl
    public InterfaceC2307nl minusKey(InterfaceC2307nl.InterfaceC2312c<?> interfaceC2312c) {
        return InterfaceC2307nl.InterfaceC2310b.C2311a.m15091c(this, interfaceC2312c);
    }

    public InterfaceC2307nl plus(InterfaceC2307nl interfaceC2307nl) {
        return InterfaceC2307nl.InterfaceC2310b.C2311a.m15090d(this, interfaceC2307nl);
    }
}
