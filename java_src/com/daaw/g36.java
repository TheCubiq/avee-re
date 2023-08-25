package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class g36 implements wz7 {
    public final m08 a;
    public final m08 b;

    public g36(m08 m08Var, m08 m08Var2) {
        this.a = m08Var;
        this.b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        d27 s;
        w26 a = y26.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.zzb();
        if (((Boolean) zzba.zzc().b(g93.y3)).booleanValue()) {
            s = d27.t(new j56(a, ((Integer) zzba.zzc().b(g93.z3)).intValue(), scheduledExecutorService));
        } else {
            s = d27.s();
        }
        e08.b(s);
        return s;
    }
}
