package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public abstract class wm6 {
    public static final f77 d = s67.i(null);
    public final g77 a;
    public final ScheduledExecutorService b;
    public final xm6 c;

    public wm6(g77 g77Var, ScheduledExecutorService scheduledExecutorService, xm6 xm6Var) {
        this.a = g77Var;
        this.b = scheduledExecutorService;
        this.c = xm6Var;
    }

    public final jm6 a(Object obj, f77... f77VarArr) {
        return new jm6(this, obj, Arrays.asList(f77VarArr), null);
    }

    public final vm6 b(Object obj, f77 f77Var) {
        return new vm6(this, obj, f77Var, Collections.singletonList(f77Var), f77Var);
    }

    public abstract String f(Object obj);
}
