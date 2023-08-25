package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class mb6 implements wz7 {

    /* renamed from: a */
    public final m08 f18765a;

    /* renamed from: b */
    public final m08 f18766b;

    /* renamed from: c */
    public final m08 f18767c;

    /* renamed from: d */
    public final m08 f18768d;

    /* renamed from: e */
    public final m08 f18769e;

    /* renamed from: f */
    public final m08 f18770f;

    /* renamed from: g */
    public final m08 f18771g;

    public mb6(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7) {
        this.f18765a = m08Var;
        this.f18766b = m08Var2;
        this.f18767c = m08Var3;
        this.f18768d = m08Var4;
        this.f18769e = m08Var5;
        this.f18770f = m08Var6;
        this.f18771g = m08Var7;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        qz3 qz3Var = (qz3) this.f18765a.zzb();
        boolean booleanValue = ((ab6) this.f18766b).zzb().booleanValue();
        boolean booleanValue2 = ((bb6) this.f18767c).zzb().booleanValue();
        fz3 fz3Var = new fz3();
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new kb6(qz3Var, booleanValue, booleanValue2, fz3Var, g77Var, ((xa6) this.f18770f).m5332a(), (ScheduledExecutorService) this.f18771g.zzb(), null);
    }
}
