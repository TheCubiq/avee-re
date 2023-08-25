package com.daaw;

import java.util.Objects;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class u77 extends e77 {
    public final Callable r;
    public final /* synthetic */ v77 s;

    public u77(v77 v77Var, Callable callable) {
        this.s = v77Var;
        Objects.requireNonNull(callable);
        this.r = callable;
    }

    @Override // com.daaw.e77
    public final Object a() {
        return this.r.call();
    }

    @Override // com.daaw.e77
    public final String b() {
        return this.r.toString();
    }

    @Override // com.daaw.e77
    public final void d(Throwable th) {
        this.s.i(th);
    }

    @Override // com.daaw.e77
    public final void e(Object obj) {
        this.s.h(obj);
    }

    @Override // com.daaw.e77
    public final boolean f() {
        return this.s.isDone();
    }
}
