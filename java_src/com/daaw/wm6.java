package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public abstract class wm6 {

    /* renamed from: d */
    public static final f77 f31345d = s67.m10634i(null);

    /* renamed from: a */
    public final g77 f31346a;

    /* renamed from: b */
    public final ScheduledExecutorService f31347b;

    /* renamed from: c */
    public final xm6 f31348c;

    public wm6(g77 g77Var, ScheduledExecutorService scheduledExecutorService, xm6 xm6Var) {
        this.f31346a = g77Var;
        this.f31347b = scheduledExecutorService;
        this.f31348c = xm6Var;
    }

    /* renamed from: a */
    public final jm6 m5976a(Object obj, f77... f77VarArr) {
        return new jm6(this, obj, Arrays.asList(f77VarArr), null);
    }

    /* renamed from: b */
    public final vm6 m5975b(Object obj, f77 f77Var) {
        return new vm6(this, obj, f77Var, Collections.singletonList(f77Var), f77Var);
    }

    /* renamed from: f */
    public abstract String mo5971f(Object obj);
}
