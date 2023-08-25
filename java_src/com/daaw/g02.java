package com.daaw;

import com.daaw.k3;
/* loaded from: classes.dex */
public final class g02 implements Runnable {
    public final /* synthetic */ h02 p;

    public g02(h02 h02Var) {
        this.p = h02Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k3.f fVar;
        k3.f fVar2;
        i02 i02Var = this.p.a;
        fVar = i02Var.q;
        fVar2 = i02Var.q;
        fVar.disconnect(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
