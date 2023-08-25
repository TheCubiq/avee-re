package com.daaw;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class o66 implements wz7 {

    /* renamed from: a */
    public final m08 f21085a;

    /* renamed from: b */
    public final m08 f21086b;

    /* renamed from: c */
    public final m08 f21087c;

    /* renamed from: d */
    public final m08 f21088d;

    /* renamed from: e */
    public final m08 f21089e;

    /* renamed from: f */
    public final m08 f21090f;

    public o66(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6) {
        this.f21085a = m08Var;
        this.f21086b = m08Var2;
        this.f21087c = m08Var3;
        this.f21088d = m08Var4;
        this.f21089e = m08Var5;
        this.f21090f = m08Var6;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new m66(g77Var, (ScheduledExecutorService) this.f21086b.zzb(), (String) this.f21087c.zzb(), (Context) this.f21088d.zzb(), ((cq4) this.f21089e).m25128a(), (b94) this.f21090f.zzb());
    }
}
