package com.daaw;
/* loaded from: classes.dex */
public final class kd6 implements pz5 {

    /* renamed from: a */
    public final /* synthetic */ ld6 f16318a;

    public kd6(ld6 ld6Var) {
        this.f16318a = ld6Var;
    }

    @Override // com.daaw.pz5
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2496a(Object obj) {
        dd6 dd6Var;
        dd6 dd6Var2;
        si4 si4Var = (si4) obj;
        synchronized (this.f16318a) {
            si4 si4Var2 = this.f16318a.f17291y;
            if (si4Var2 != null) {
                si4Var2.mo2132a();
            }
            ld6 ld6Var = this.f16318a;
            ld6Var.f17291y = si4Var;
            si4Var.m10330i(ld6Var);
            ld6 ld6Var2 = this.f16318a;
            dd6Var = ld6Var2.f17287u;
            dd6Var2 = ld6Var2.f17287u;
            dd6Var.m24520k(new ti4(si4Var, ld6Var2, dd6Var2));
            si4Var.mo2131b();
        }
    }

    @Override // com.daaw.pz5
    public final void zza() {
        synchronized (this.f16318a) {
            this.f16318a.f17291y = null;
        }
    }
}
