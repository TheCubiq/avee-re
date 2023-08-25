package com.daaw;

import java.util.Collections;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class lm6 {
    /* renamed from: a */
    public static final vm6 m16721a(Callable callable, Object obj, wm6 wm6Var) {
        g77 g77Var;
        g77Var = wm6Var.f31346a;
        return m16720b(callable, g77Var, obj, wm6Var);
    }

    /* renamed from: b */
    public static final vm6 m16720b(Callable callable, g77 g77Var, Object obj, wm6 wm6Var) {
        f77 f77Var;
        f77Var = wm6.f31345d;
        return new vm6(wm6Var, obj, f77Var, Collections.emptyList(), g77Var.mo20112M(callable));
    }

    /* renamed from: c */
    public static final vm6 m16719c(f77 f77Var, Object obj, wm6 wm6Var) {
        f77 f77Var2;
        f77Var2 = wm6.f31345d;
        return new vm6(wm6Var, obj, f77Var2, Collections.emptyList(), f77Var);
    }

    /* renamed from: d */
    public static final vm6 m16718d(final fm6 fm6Var, g77 g77Var, Object obj, wm6 wm6Var) {
        return m16720b(new Callable() { // from class: com.daaw.km6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fm6.this.zza();
                return null;
            }
        }, g77Var, obj, wm6Var);
    }
}
