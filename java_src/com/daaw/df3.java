package com.daaw;
/* loaded from: classes.dex */
public final class df3 extends be3 {
    public final /* synthetic */ gf3 p;

    public /* synthetic */ df3(gf3 gf3Var, cf3 cf3Var) {
        this.p = gf3Var;
    }

    @Override // com.daaw.ce3
    public final void u0(sd3 sd3Var, String str) {
        gf3 gf3Var = this.p;
        if (gf3.a(gf3Var) == null) {
            return;
        }
        gf3.a(gf3Var).onCustomClick(gf3.c(gf3Var, sd3Var), str);
    }
}
