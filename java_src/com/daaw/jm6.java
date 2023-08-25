package com.daaw;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class jm6 {
    public final Object a;
    public final List b;
    public final /* synthetic */ wm6 c;

    public /* synthetic */ jm6(wm6 wm6Var, Object obj, List list, im6 im6Var) {
        this.c = wm6Var;
        this.a = obj;
        this.b = list;
    }

    public final vm6 a(Callable callable) {
        g77 g77Var;
        r67 c = s67.c(this.b);
        f77 a = c.a(new Callable() { // from class: com.daaw.hm6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, z04.f);
        wm6 wm6Var = this.c;
        Object obj = this.a;
        List list = this.b;
        g77Var = wm6Var.a;
        return new vm6(wm6Var, obj, a, list, c.a(callable, g77Var));
    }
}
