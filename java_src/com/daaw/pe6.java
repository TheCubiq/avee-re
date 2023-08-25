package com.daaw;

import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class pe6 implements cf6 {

    /* renamed from: a */
    public final cf6 f22873a;
    @GuardedBy("this")

    /* renamed from: b */
    public rp4 f22874b;

    public pe6(cf6 cf6Var) {
        this.f22873a = cf6Var;
    }

    @Override // com.daaw.cf6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ f77 mo13423a(df6 df6Var, ye6 ye6Var, Object obj) {
        return m13421c(df6Var, ye6Var, null);
    }

    @Override // com.daaw.cf6
    /* renamed from: b */
    public final synchronized rp4 zzd() {
        return this.f22874b;
    }

    /* renamed from: c */
    public final synchronized f77 m13421c(df6 df6Var, ye6 ye6Var, rp4 rp4Var) {
        this.f22874b = rp4Var;
        if (df6Var.f7038a == null) {
            return ((oe6) this.f22873a).m14317c(df6Var, ye6Var, rp4Var);
        }
        jn4 zzb = rp4Var.zzb();
        return zzb.m18383i(zzb.m18381k(s67.m10634i(df6Var.f7038a)));
    }
}
