package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class pn6 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public pn6(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        qz7 a = vz7.a(this.a);
        qz7 a2 = vz7.a(this.b);
        Object rn6Var = ((Boolean) zzba.zzc().b(g93.L7)).booleanValue() ? new rn6((on6) a.zzb(), (ScheduledExecutorService) this.c.zzb()) : (on6) a2.zzb();
        e08.b(rn6Var);
        return rn6Var;
    }
}
