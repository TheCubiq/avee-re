package com.daaw;
/* loaded from: classes.dex */
public final class cy5 implements pz5 {

    /* renamed from: a */
    public final /* synthetic */ dy5 f6272a;

    public cy5(dy5 dy5Var) {
        this.f6272a = dy5Var;
    }

    @Override // com.daaw.pz5
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2496a(Object obj) {
        zi4 zi4Var;
        zi4 zi4Var2;
        zi4 zi4Var3;
        zi4 zi4Var4 = (zi4) obj;
        synchronized (this.f6272a) {
            dy5 dy5Var = this.f6272a;
            zi4Var = dy5Var.f7984w;
            if (zi4Var != null) {
                zi4Var3 = dy5Var.f7984w;
                zi4Var3.mo2132a();
            }
            this.f6272a.f7984w = zi4Var4;
            zi4Var2 = this.f6272a.f7984w;
            zi4Var2.mo2131b();
        }
    }

    @Override // com.daaw.pz5
    public final void zza() {
        synchronized (this.f6272a) {
            this.f6272a.f7984w = null;
        }
    }
}
