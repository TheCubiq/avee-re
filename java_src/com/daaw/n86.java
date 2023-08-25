package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class n86 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;
    public final m08 f;
    public final m08 g;

    public n86(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
        this.e = m08Var5;
        this.f = m08Var6;
        this.g = m08Var7;
    }

    public static l86 a(hz3 hz3Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        return new l86(hz3Var, context, scheduledExecutorService, executor, i, z, z2, null);
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new l86(new hz3(), ((h94) this.b).a(), (ScheduledExecutorService) this.c.zzb(), g77Var, ((ya6) this.e).zzb().intValue(), ((za6) this.f).zzb().booleanValue(), ((bb6) this.g).zzb().booleanValue(), null);
    }
}
