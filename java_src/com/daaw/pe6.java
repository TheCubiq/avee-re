package com.daaw;

import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class pe6 implements cf6 {
    public final cf6 a;
    @GuardedBy("this")
    public rp4 b;

    public pe6(cf6 cf6Var) {
        this.a = cf6Var;
    }

    @Override // com.daaw.cf6
    public final /* bridge */ /* synthetic */ f77 a(df6 df6Var, ye6 ye6Var, Object obj) {
        return c(df6Var, ye6Var, null);
    }

    @Override // com.daaw.cf6
    /* renamed from: b */
    public final synchronized rp4 zzd() {
        return this.b;
    }

    public final synchronized f77 c(df6 df6Var, ye6 ye6Var, rp4 rp4Var) {
        this.b = rp4Var;
        if (df6Var.a == null) {
            return ((oe6) this.a).c(df6Var, ye6Var, rp4Var);
        }
        jn4 zzb = rp4Var.zzb();
        return zzb.i(zzb.k(s67.i(df6Var.a)));
    }
}
