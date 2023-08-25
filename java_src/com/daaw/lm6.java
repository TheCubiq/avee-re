package com.daaw;

import java.util.Collections;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class lm6 {
    public static final vm6 a(Callable callable, Object obj, wm6 wm6Var) {
        g77 g77Var;
        g77Var = wm6Var.a;
        return b(callable, g77Var, obj, wm6Var);
    }

    public static final vm6 b(Callable callable, g77 g77Var, Object obj, wm6 wm6Var) {
        f77 f77Var;
        f77Var = wm6.d;
        return new vm6(wm6Var, obj, f77Var, Collections.emptyList(), g77Var.M(callable));
    }

    public static final vm6 c(f77 f77Var, Object obj, wm6 wm6Var) {
        f77 f77Var2;
        f77Var2 = wm6.d;
        return new vm6(wm6Var, obj, f77Var2, Collections.emptyList(), f77Var);
    }

    public static final vm6 d(final fm6 fm6Var, g77 g77Var, Object obj, wm6 wm6Var) {
        return b(new Callable() { // from class: com.daaw.km6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fm6.this.zza();
                return null;
            }
        }, g77Var, obj, wm6Var);
    }
}
