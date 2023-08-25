package com.daaw;

import com.daaw.InterfaceC2307nl;
import java.io.Serializable;
/* renamed from: com.daaw.mw */
/* loaded from: classes2.dex */
public final class C2215mw implements InterfaceC2307nl, Serializable {

    /* renamed from: p */
    public static final C2215mw f19172p = new C2215mw();

    @Override // com.daaw.InterfaceC2307nl
    public <R> R fold(R r, n50<? super R, ? super InterfaceC2307nl.InterfaceC2310b, ? extends R> n50Var) {
        ug0.m8268f(n50Var, "operation");
        return r;
    }

    @Override // com.daaw.InterfaceC2307nl
    public <E extends InterfaceC2307nl.InterfaceC2310b> E get(InterfaceC2307nl.InterfaceC2312c<E> interfaceC2312c) {
        ug0.m8268f(interfaceC2312c, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // com.daaw.InterfaceC2307nl
    public InterfaceC2307nl minusKey(InterfaceC2307nl.InterfaceC2312c<?> interfaceC2312c) {
        ug0.m8268f(interfaceC2312c, "key");
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
