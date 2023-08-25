package com.daaw;

import java.util.Map;
import java.util.concurrent.Executor;
@Deprecated
/* loaded from: classes.dex */
public final class kd5 {
    public final pd5 a;
    public final Executor b;
    public final Map c;

    public kd5(pd5 pd5Var, Executor executor) {
        this.a = pd5Var;
        this.c = pd5Var.f();
        this.b = executor;
    }

    public final jd5 a() {
        jd5 jd5Var = new jd5(this);
        jd5.a(jd5Var);
        return jd5Var;
    }
}
