package com.daaw;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class xd7 {
    public final dq7 a;
    public final Class b;

    public /* synthetic */ xd7(dq7 dq7Var, Class cls, wd7 wd7Var) {
        this.a = dq7Var;
        this.b = cls;
    }

    public static xd7 b(sd7 sd7Var, dq7 dq7Var, Class cls) {
        return new rd7(dq7Var, cls, sd7Var);
    }

    public abstract m87 a(gf7 gf7Var, @Nullable x97 x97Var);

    public final dq7 c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
