package com.daaw;
/* loaded from: classes2.dex */
public final class hp1 extends AbstractC2557pl {

    /* renamed from: q */
    public static final hp1 f12767q = new hp1();

    @Override // com.daaw.AbstractC2557pl
    /* renamed from: T */
    public void mo5048T(InterfaceC2307nl interfaceC2307nl, Runnable runnable) {
        jz1 jz1Var = (jz1) interfaceC2307nl.get(jz1.f15531q);
        if (jz1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        jz1Var.f15532p = true;
    }

    @Override // com.daaw.AbstractC2557pl
    /* renamed from: U */
    public boolean mo11594U(InterfaceC2307nl interfaceC2307nl) {
        return false;
    }

    @Override // com.daaw.AbstractC2557pl
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
