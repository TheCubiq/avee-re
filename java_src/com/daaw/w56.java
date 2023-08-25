package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class w56 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public w56(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a = ((h94) this.a).a();
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new u56(a, g77Var, ((cq4) this.c).a());
    }
}
