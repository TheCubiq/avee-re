package com.daaw;
/* loaded from: classes.dex */
public final class kz5 implements pz5 {

    /* renamed from: a */
    public final /* synthetic */ lz5 f16906a;

    public kz5(lz5 lz5Var) {
        this.f16906a = lz5Var;
    }

    @Override // com.daaw.pz5
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2496a(Object obj) {
        synchronized (this.f16906a) {
            this.f16906a.f17926c = ((zl4) obj).m2130c();
            ((zl4) obj).mo2131b();
        }
    }

    @Override // com.daaw.pz5
    public final void zza() {
        synchronized (this.f16906a) {
        }
    }
}
