package com.daaw;

import android.content.Context;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class pi5 implements wz7 {

    /* renamed from: a */
    public final m08 f22956a;

    /* renamed from: b */
    public final m08 f22957b;

    /* renamed from: c */
    public final m08 f22958c;

    public pi5(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.f22956a = m08Var;
        this.f22957b = m08Var2;
        this.f22958c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        final sl2 sl2Var = (sl2) this.f22956a.zzb();
        final Context m20923a = ((h94) this.f22957b).m20923a();
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        f77 mo20112M = g77Var.mo20112M(new Callable() { // from class: com.daaw.mi5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sl2 sl2Var2 = sl2.this;
                return sl2Var2.m10202c().zzg(m20923a);
            }
        });
        e08.m23801b(mo20112M);
        return mo20112M;
    }
}
