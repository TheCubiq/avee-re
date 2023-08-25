package com.daaw;
/* loaded from: classes2.dex */
public final class hp1 extends pl {
    public static final hp1 q = new hp1();

    @Override // com.daaw.pl
    public void T(nl nlVar, Runnable runnable) {
        jz1 jz1Var = (jz1) nlVar.get(jz1.q);
        if (jz1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        jz1Var.p = true;
    }

    @Override // com.daaw.pl
    public boolean U(nl nlVar) {
        return false;
    }

    @Override // com.daaw.pl
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
