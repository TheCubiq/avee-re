package com.daaw;

import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class oe6 implements cf6 {
    @GuardedBy("this")

    /* renamed from: a */
    public rp4 f21527a;

    @Override // com.daaw.cf6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ f77 mo13423a(df6 df6Var, ye6 ye6Var, Object obj) {
        return m14317c(df6Var, ye6Var, null);
    }

    @Override // com.daaw.cf6
    /* renamed from: b */
    public final synchronized rp4 zzd() {
        return this.f21527a;
    }

    /* renamed from: c */
    public final synchronized f77 m14317c(df6 df6Var, ye6 ye6Var, rp4 rp4Var) {
        jn4 zzb;
        if (rp4Var != null) {
            this.f21527a = rp4Var;
        } else {
            this.f21527a = (rp4) ye6Var.mo3795a(df6Var.f7039b).zzh();
        }
        zzb = this.f21527a.zzb();
        return zzb.m18383i(zzb.m18382j());
    }
}
