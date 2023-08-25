package com.daaw;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class d67 extends e67 {
    public final Callable t;
    public final /* synthetic */ f67 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d67(f67 f67Var, Callable callable, Executor executor) {
        super(f67Var, executor);
        this.u = f67Var;
        Objects.requireNonNull(callable);
        this.t = callable;
    }

    @Override // com.daaw.e77
    public final Object a() {
        return this.t.call();
    }

    @Override // com.daaw.e77
    public final String b() {
        return this.t.toString();
    }

    @Override // com.daaw.e67
    public final void h(Object obj) {
        this.u.h(obj);
    }
}
