package com.daaw;
/* loaded from: classes.dex */
public final class kz5 implements pz5 {
    public final /* synthetic */ lz5 a;

    public kz5(lz5 lz5Var) {
        this.a = lz5Var;
    }

    @Override // com.daaw.pz5
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        synchronized (this.a) {
            this.a.c = ((zl4) obj).c();
            ((zl4) obj).b();
        }
    }

    @Override // com.daaw.pz5
    public final void zza() {
        synchronized (this.a) {
        }
    }
}
