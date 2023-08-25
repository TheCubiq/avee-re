package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class vk3 implements i14 {

    /* renamed from: a */
    public final /* synthetic */ il3 f30283a;

    /* renamed from: b */
    public final /* synthetic */ io6 f30284b;

    /* renamed from: c */
    public final /* synthetic */ jl3 f30285c;

    public vk3(jl3 jl3Var, il3 il3Var, io6 io6Var) {
        this.f30285c = jl3Var;
        this.f30283a = il3Var;
        this.f30284b = io6Var;
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
        obj2 = this.f30285c.f15180a;
        synchronized (obj2) {
            this.f30285c.f15188i = 0;
            jl3 jl3Var = this.f30285c;
            il3Var = jl3Var.f15187h;
            if (il3Var != null) {
                il3 il3Var4 = this.f30283a;
                il3Var2 = jl3Var.f15187h;
                if (il3Var4 != il3Var2) {
                    zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    il3Var3 = this.f30285c.f15187h;
                    il3Var3.m19660g();
                }
            }
            this.f30285c.f15187h = this.f30283a;
            if (((Boolean) ta3.f27159d.m16137e()).booleanValue()) {
                jl3 jl3Var2 = this.f30285c;
                vo6Var = jl3Var2.f15184e;
                if (vo6Var != null) {
                    vo6Var2 = jl3Var2.f15184e;
                    io6 io6Var = this.f30284b;
                    io6Var.zzf(true);
                    vo6Var2.m6969b(io6Var.zzl());
                }
            }
        }
    }
}
