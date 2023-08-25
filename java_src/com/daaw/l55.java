package com.daaw;
/* loaded from: classes.dex */
public final class l55 implements ir4 {
    public final j35 p;
    public final o35 q;

    public l55(j35 j35Var, o35 o35Var) {
        this.p = j35Var;
        this.q = o35Var;
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        j35 j35Var = this.p;
        if (j35Var.c0() == null) {
            return;
        }
        a74 Y = j35Var.Y();
        a74 Z = j35Var.Z();
        if (Y == null) {
            Y = Z == null ? null : Z;
        }
        if (!this.q.d() || Y == null) {
            return;
        }
        Y.T("onSdkImpression", new g6());
    }
}
