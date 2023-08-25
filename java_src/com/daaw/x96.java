package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class x96 implements wz7 {

    /* renamed from: a */
    public final m08 f32250a;

    /* renamed from: b */
    public final m08 f32251b;

    /* renamed from: c */
    public final m08 f32252c;

    /* renamed from: d */
    public final m08 f32253d;

    /* renamed from: e */
    public final m08 f32254e;

    /* renamed from: f */
    public final m08 f32255f;

    /* renamed from: g */
    public final m08 f32256g;

    public x96(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7) {
        this.f32250a = m08Var;
        this.f32251b = m08Var2;
        this.f32252c = m08Var3;
        this.f32253d = m08Var4;
        this.f32254e = m08Var5;
        this.f32255f = m08Var6;
        this.f32256g = m08Var7;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new v96(new hz3(), ((ya6) this.f32251b).zzb().intValue(), ((h94) this.f32252c).m20923a(), (qz3) this.f32253d.zzb(), (ScheduledExecutorService) this.f32254e.zzb(), g77Var, ((xa6) this.f32256g).m5332a(), null);
    }
}
