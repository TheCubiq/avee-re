package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class wk3 implements g14 {

    /* renamed from: a */
    public final /* synthetic */ il3 f31292a;

    /* renamed from: b */
    public final /* synthetic */ io6 f31293b;

    /* renamed from: c */
    public final /* synthetic */ jl3 f31294c;

    public wk3(jl3 jl3Var, il3 il3Var, io6 io6Var) {
        this.f31294c = jl3Var;
        this.f31292a = il3Var;
        this.f31293b = io6Var;
    }

    @Override // com.daaw.g14
    public final void zza() {
        Object obj;
        vo6 vo6Var;
        vo6 vo6Var2;
        obj = this.f31294c.f15180a;
        synchronized (obj) {
            this.f31294c.f15188i = 1;
            zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.f31292a.m19660g();
            if (((Boolean) ta3.f27159d.m16137e()).booleanValue()) {
                jl3 jl3Var = this.f31294c;
                vo6Var = jl3Var.f15184e;
                if (vo6Var != null) {
                    vo6Var2 = jl3Var.f15184e;
                    io6 io6Var = this.f31293b;
                    io6Var.zzf(false);
                    vo6Var2.m6969b(io6Var.zzl());
                }
            }
        }
    }
}
