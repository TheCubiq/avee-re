package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class r96 implements wz7 {

    /* renamed from: a */
    public final m08 f24990a;

    /* renamed from: b */
    public final m08 f24991b;

    /* renamed from: c */
    public final m08 f24992c;

    /* renamed from: d */
    public final m08 f24993d;

    /* renamed from: e */
    public final m08 f24994e;

    public r96(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5) {
        this.f24990a = m08Var;
        this.f24991b = m08Var2;
        this.f24992c = m08Var3;
        this.f24993d = m08Var4;
        this.f24994e = m08Var5;
    }

    /* renamed from: a */
    public static p96 m11549a(String str, y23 y23Var, qz3 qz3Var, ScheduledExecutorService scheduledExecutorService, g77 g77Var) {
        return new p96(str, y23Var, qz3Var, scheduledExecutorService, g77Var, null);
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new p96(((xa6) this.f24990a).m5332a(), new y23(), (qz3) this.f24992c.zzb(), (ScheduledExecutorService) this.f24993d.zzb(), g77Var, null);
    }
}
