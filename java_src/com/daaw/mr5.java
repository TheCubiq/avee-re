package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class mr5 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;

    public mr5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new lr5((yh4) this.a.zzb(), (Context) this.b.zzb(), (Executor) this.c.zzb(), (ia5) this.d.zzb());
    }
}
