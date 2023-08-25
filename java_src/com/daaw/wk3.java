package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class wk3 implements g14 {
    public final /* synthetic */ il3 a;
    public final /* synthetic */ io6 b;
    public final /* synthetic */ jl3 c;

    public wk3(jl3 jl3Var, il3 il3Var, io6 io6Var) {
        this.c = jl3Var;
        this.a = il3Var;
        this.b = io6Var;
    }

    @Override // com.daaw.g14
    public final void zza() {
        Object obj;
        vo6 vo6Var;
        vo6 vo6Var2;
        obj = this.c.a;
        synchronized (obj) {
            this.c.i = 1;
            zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.a.g();
            if (((Boolean) ta3.d.e()).booleanValue()) {
                jl3 jl3Var = this.c;
                vo6Var = jl3Var.e;
                if (vo6Var != null) {
                    vo6Var2 = jl3Var.e;
                    io6 io6Var = this.b;
                    io6Var.zzf(false);
                    vo6Var2.b(io6Var.zzl());
                }
            }
        }
    }
}
