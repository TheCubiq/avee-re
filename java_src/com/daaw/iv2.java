package com.daaw;
/* loaded from: classes.dex */
public final class iv2 implements Runnable {
    public final /* synthetic */ sv2 p;

    public iv2(sv2 sv2Var) {
        this.p = sv2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        vv2 vv2Var;
        sv2 sv2Var = this.p;
        z = sv2Var.U;
        if (z) {
            return;
        }
        vv2Var = sv2Var.D;
        vv2Var.b(sv2Var);
    }
}
