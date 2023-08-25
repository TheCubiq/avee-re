package com.daaw;
/* loaded from: classes.dex */
public final class kd6 implements pz5 {
    public final /* synthetic */ ld6 a;

    public kd6(ld6 ld6Var) {
        this.a = ld6Var;
    }

    @Override // com.daaw.pz5
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dd6 dd6Var;
        dd6 dd6Var2;
        si4 si4Var = (si4) obj;
        synchronized (this.a) {
            si4 si4Var2 = this.a.y;
            if (si4Var2 != null) {
                si4Var2.a();
            }
            ld6 ld6Var = this.a;
            ld6Var.y = si4Var;
            si4Var.i(ld6Var);
            ld6 ld6Var2 = this.a;
            dd6Var = ld6Var2.u;
            dd6Var2 = ld6Var2.u;
            dd6Var.k(new ti4(si4Var, ld6Var2, dd6Var2));
            si4Var.b();
        }
    }

    @Override // com.daaw.pz5
    public final void zza() {
        synchronized (this.a) {
            this.a.y = null;
        }
    }
}
