package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class vk3 implements i14 {
    public final /* synthetic */ il3 a;
    public final /* synthetic */ io6 b;
    public final /* synthetic */ jl3 c;

    public vk3(jl3 jl3Var, il3 il3Var, io6 io6Var) {
        this.c = jl3Var;
        this.a = il3Var;
        this.b = io6Var;
    }

    @Override // com.daaw.i14
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        il3 il3Var;
        vo6 vo6Var;
        vo6 vo6Var2;
        il3 il3Var2;
        il3 il3Var3;
        bk3 bk3Var = (bk3) obj;
        obj2 = this.c.a;
        synchronized (obj2) {
            this.c.i = 0;
            jl3 jl3Var = this.c;
            il3Var = jl3Var.h;
            if (il3Var != null) {
                il3 il3Var4 = this.a;
                il3Var2 = jl3Var.h;
                if (il3Var4 != il3Var2) {
                    zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    il3Var3 = this.c.h;
                    il3Var3.g();
                }
            }
            this.c.h = this.a;
            if (((Boolean) ta3.d.e()).booleanValue()) {
                jl3 jl3Var2 = this.c;
                vo6Var = jl3Var2.e;
                if (vo6Var != null) {
                    vo6Var2 = jl3Var2.e;
                    io6 io6Var = this.b;
                    io6Var.zzf(true);
                    vo6Var2.b(io6Var.zzl());
                }
            }
        }
    }
}
