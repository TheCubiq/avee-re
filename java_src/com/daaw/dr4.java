package com.daaw;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class dr4 implements wz7 {

    /* renamed from: a */
    public final m08 f7650a;

    /* renamed from: b */
    public final m08 f7651b;

    /* renamed from: c */
    public final m08 f7652c;

    /* renamed from: d */
    public final m08 f7653d;

    public dr4(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.f7650a = m08Var;
        this.f7651b = m08Var2;
        this.f7652c = m08Var3;
        this.f7653d = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        xq4 zzb = ((cr4) this.f7650a).zzb();
        Set zzb2 = ((k08) this.f7651b).zzb();
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new br4(zzb, zzb2, g77Var, (ScheduledExecutorService) this.f7653d.zzb());
    }
}
