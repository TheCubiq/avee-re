package com.daaw;
/* loaded from: classes.dex */
public final class rq3 extends be3 {
    public final /* synthetic */ uq3 p;

    public /* synthetic */ rq3(uq3 uq3Var, nq3 nq3Var) {
        this.p = uq3Var;
    }

    @Override // com.daaw.ce3
    public final void u0(sd3 sd3Var, String str) {
        uq3 uq3Var = this.p;
        if (uq3.c(uq3Var) == null) {
            return;
        }
        uq3.c(uq3Var).onCustomClick(uq3.e(uq3Var, sd3Var), str);
    }
}
