package com.daaw;
/* loaded from: classes.dex */
public final class n33 extends e14 {
    public final /* synthetic */ t33 q;

    public n33(t33 t33Var) {
        this.q = t33Var;
    }

    @Override // com.daaw.e14, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        t33.e(this.q);
        return super.cancel(z);
    }
}
