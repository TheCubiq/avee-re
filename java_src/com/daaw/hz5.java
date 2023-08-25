package com.daaw;
/* loaded from: classes.dex */
public final class hz5 implements pz5 {

    /* renamed from: a */
    public final /* synthetic */ iz5 f13077a;

    public hz5(iz5 iz5Var) {
        this.f13077a = iz5Var;
    }

    @Override // com.daaw.pz5
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2496a(Object obj) {
        oz4 oz4Var;
        oz4 oz4Var2 = (oz4) obj;
        synchronized (this.f13077a) {
            this.f13077a.f14139w = oz4Var2;
            oz4Var = this.f13077a.f14139w;
            oz4Var.mo2131b();
        }
    }

    @Override // com.daaw.pz5
    public final void zza() {
        synchronized (this.f13077a) {
            this.f13077a.f14139w = null;
        }
    }
}
