package com.daaw;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class gg5 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;
    public final m08 f;
    public final m08 g;
    public final m08 h;
    public final m08 i;
    public final m08 j;

    public gg5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7, m08 m08Var8, m08 m08Var9, m08 m08Var10) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
        this.e = m08Var5;
        this.f = m08Var6;
        this.g = m08Var7;
        this.h = m08Var8;
        this.i = m08Var9;
        this.j = m08Var10;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.a.zzb();
        Context a = ((h94) this.b).a();
        WeakReference a2 = ((i94) this.c).a();
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new fg5(executor, a, a2, g77Var, (ya5) this.e.zzb(), (ScheduledExecutorService) this.f.zzb(), (td5) this.g.zzb(), ((u94) this.h).a(), ((xx4) this.i).zzb(), (vo6) this.j.zzb());
    }
}
