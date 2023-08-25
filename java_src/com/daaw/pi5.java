package com.daaw;

import android.content.Context;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class pi5 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public pi5(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        final sl2 sl2Var = (sl2) this.a.zzb();
        final Context a = ((h94) this.b).a();
        g77 g77Var = z04.a;
        e08.b(g77Var);
        f77 M = g77Var.M(new Callable() { // from class: com.daaw.mi5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sl2 sl2Var2 = sl2.this;
                return sl2Var2.c().zzg(a);
            }
        });
        e08.b(M);
        return M;
    }
}
