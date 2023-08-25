package com.daaw;

import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class oe6 implements cf6 {
    @GuardedBy("this")
    public rp4 a;

    @Override // com.daaw.cf6
    public final /* bridge */ /* synthetic */ f77 a(df6 df6Var, ye6 ye6Var, Object obj) {
        return c(df6Var, ye6Var, null);
    }

    @Override // com.daaw.cf6
    /* renamed from: b */
    public final synchronized rp4 zzd() {
        return this.a;
    }

    public final synchronized f77 c(df6 df6Var, ye6 ye6Var, rp4 rp4Var) {
        jn4 zzb;
        if (rp4Var != null) {
            this.a = rp4Var;
        } else {
            this.a = (rp4) ye6Var.a(df6Var.b).zzh();
        }
        zzb = this.a.zzb();
        return zzb.i(zzb.j());
    }
}
