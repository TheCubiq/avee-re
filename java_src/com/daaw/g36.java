package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class g36 implements wz7 {

    /* renamed from: a */
    public final m08 f10236a;

    /* renamed from: b */
    public final m08 f10237b;

    public g36(m08 m08Var, m08 m08Var2) {
        this.f10236a = m08Var;
        this.f10237b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        d27 m24761s;
        w26 m4234a = y26.m4234a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f10237b.zzb();
        if (((Boolean) zzba.zzc().m23658b(g93.f10889y3)).booleanValue()) {
            m24761s = d27.m24760t(new j56(m4234a, ((Integer) zzba.zzc().m23658b(g93.f10900z3)).intValue(), scheduledExecutorService));
        } else {
            m24761s = d27.m24761s();
        }
        e08.m23801b(m24761s);
        return m24761s;
    }
}
