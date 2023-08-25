package com.daaw;
/* loaded from: classes.dex */
public final class hz5 implements pz5 {
    public final /* synthetic */ iz5 a;

    public hz5(iz5 iz5Var) {
        this.a = iz5Var;
    }

    @Override // com.daaw.pz5
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        oz4 oz4Var;
        oz4 oz4Var2 = (oz4) obj;
        synchronized (this.a) {
            this.a.w = oz4Var2;
            oz4Var = this.a.w;
            oz4Var.b();
        }
    }

    @Override // com.daaw.pz5
    public final void zza() {
        synchronized (this.a) {
            this.a.w = null;
        }
    }
}
