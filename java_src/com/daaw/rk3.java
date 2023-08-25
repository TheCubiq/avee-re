package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
/* loaded from: classes.dex */
public final class rk3 implements zg3 {

    /* renamed from: a */
    public final /* synthetic */ il3 f25393a;

    /* renamed from: b */
    public final /* synthetic */ bk3 f25394b;

    /* renamed from: c */
    public final /* synthetic */ jl3 f25395c;

    public rk3(jl3 jl3Var, il3 il3Var, bk3 bk3Var) {
        this.f25395c = jl3Var;
        this.f25393a = il3Var;
        this.f25394b = bk3Var;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2341a(Object obj, Map map) {
        Object obj2;
        kl3 kl3Var = (kl3) obj;
        obj2 = this.f25395c.f15180a;
        synchronized (obj2) {
            if (this.f25393a.m17210a() != -1 && this.f25393a.m17210a() != 1) {
                this.f25395c.f15188i = 0;
                bk3 bk3Var = this.f25394b;
                bk3Var.mo16862B0("/log", yg3.f33650g);
                bk3Var.mo16862B0("/result", yg3.f33658o);
                this.f25393a.m17207d(this.f25394b);
                this.f25395c.f15187h = this.f25393a;
                zze.zza("Successfully loaded JS Engine.");
            }
        }
    }
}
