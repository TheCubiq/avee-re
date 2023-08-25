package com.daaw;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
@Deprecated
/* loaded from: classes.dex */
public final class pd5 extends rd5 {
    public final yn6 i;

    public pd5(Executor executor, p04 p04Var, yn6 yn6Var, ao6 ao6Var) {
        super(executor, p04Var, ao6Var);
        this.i = yn6Var;
        yn6Var.a(this.b);
    }

    public final Map f() {
        return new HashMap(this.b);
    }
}
