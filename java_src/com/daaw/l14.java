package com.daaw;

import java.util.concurrent.atomic.AtomicInteger;
@Deprecated
/* loaded from: classes.dex */
public class l14 {
    public final e14 a;
    public final AtomicInteger b;

    public l14() {
        e14 e14Var = new e14();
        this.a = e14Var;
        this.b = new AtomicInteger(0);
        s67.r(e14Var, new j14(this), z04.f);
    }

    @Deprecated
    public final int a() {
        return this.b.get();
    }

    @Deprecated
    public final void c() {
        this.a.c(new Exception());
    }

    @Deprecated
    public final void d(Object obj) {
        this.a.b(obj);
    }

    @Deprecated
    public final void e(i14 i14Var, g14 g14Var) {
        s67.r(this.a, new k14(this, i14Var, g14Var), z04.f);
    }
}
