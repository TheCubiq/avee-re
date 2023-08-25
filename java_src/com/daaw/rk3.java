package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
/* loaded from: classes.dex */
public final class rk3 implements zg3 {
    public final /* synthetic */ il3 a;
    public final /* synthetic */ bk3 b;
    public final /* synthetic */ jl3 c;

    public rk3(jl3 jl3Var, il3 il3Var, bk3 bk3Var) {
        this.c = jl3Var;
        this.a = il3Var;
        this.b = bk3Var;
    }

    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        Object obj2;
        kl3 kl3Var = (kl3) obj;
        obj2 = this.c.a;
        synchronized (obj2) {
            if (this.a.a() != -1 && this.a.a() != 1) {
                this.c.i = 0;
                bk3 bk3Var = this.b;
                bk3Var.B0("/log", yg3.g);
                bk3Var.B0("/result", yg3.o);
                this.a.d(this.b);
                this.c.h = this.a;
                zze.zza("Successfully loaded JS Engine.");
            }
        }
    }
}
