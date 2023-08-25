package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class pn6 implements wz7 {

    /* renamed from: a */
    public final m08 f23083a;

    /* renamed from: b */
    public final m08 f23084b;

    /* renamed from: c */
    public final m08 f23085c;

    public pn6(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.f23083a = m08Var;
        this.f23084b = m08Var2;
        this.f23085c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        qz7 m6639a = vz7.m6639a(this.f23083a);
        qz7 m6639a2 = vz7.m6639a(this.f23084b);
        Object rn6Var = ((Boolean) zzba.zzc().m23658b(g93.f10479L7)).booleanValue() ? new rn6((on6) m6639a.zzb(), (ScheduledExecutorService) this.f23085c.zzb()) : (on6) m6639a2.zzb();
        e08.m23801b(rn6Var);
        return rn6Var;
    }
}
