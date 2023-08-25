package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class n86 implements wz7 {

    /* renamed from: a */
    public final m08 f19708a;

    /* renamed from: b */
    public final m08 f19709b;

    /* renamed from: c */
    public final m08 f19710c;

    /* renamed from: d */
    public final m08 f19711d;

    /* renamed from: e */
    public final m08 f19712e;

    /* renamed from: f */
    public final m08 f19713f;

    /* renamed from: g */
    public final m08 f19714g;

    public n86(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7) {
        this.f19708a = m08Var;
        this.f19709b = m08Var2;
        this.f19710c = m08Var3;
        this.f19711d = m08Var4;
        this.f19712e = m08Var5;
        this.f19713f = m08Var6;
        this.f19714g = m08Var7;
    }

    /* renamed from: a */
    public static l86 m15413a(hz3 hz3Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        return new l86(hz3Var, context, scheduledExecutorService, executor, i, z, z2, null);
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        return new l86(new hz3(), ((h94) this.f19709b).m20923a(), (ScheduledExecutorService) this.f19710c.zzb(), g77Var, ((ya6) this.f19712e).zzb().intValue(), ((za6) this.f19713f).zzb().booleanValue(), ((bb6) this.f19714g).zzb().booleanValue(), null);
    }
}
