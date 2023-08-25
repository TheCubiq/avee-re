package com.daaw;
/* loaded from: classes.dex */
public final class cy5 implements pz5 {
    public final /* synthetic */ dy5 a;

    public cy5(dy5 dy5Var) {
        this.a = dy5Var;
    }

    @Override // com.daaw.pz5
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        zi4 zi4Var;
        zi4 zi4Var2;
        zi4 zi4Var3;
        zi4 zi4Var4 = (zi4) obj;
        synchronized (this.a) {
            dy5 dy5Var = this.a;
            zi4Var = dy5Var.w;
            if (zi4Var != null) {
                zi4Var3 = dy5Var.w;
                zi4Var3.a();
            }
            this.a.w = zi4Var4;
            zi4Var2 = this.a.w;
            zi4Var2.b();
        }
    }

    @Override // com.daaw.pz5
    public final void zza() {
        synchronized (this.a) {
            this.a.w = null;
        }
    }
}
