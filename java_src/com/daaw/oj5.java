package com.daaw;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class oj5 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;
    public final m08 f;
    public final m08 g;

    public oj5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
        this.e = m08Var5;
        this.f = m08Var6;
        this.g = m08Var7;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a = ((h94) this.a).a();
        ri6 a2 = ((cq4) this.b).a();
        ki5 zzb = ((li5) this.c).zzb();
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new nj5(a, a2, zzb, g77Var, (ScheduledExecutorService) this.e.zzb(), (zo5) this.f.zzb(), (to6) this.g.zzb());
    }
}
