package com.daaw;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public abstract class e67 extends e77 {
    public final Executor r;
    public final /* synthetic */ f67 s;

    public e67(f67 f67Var, Executor executor) {
        this.s = f67Var;
        Objects.requireNonNull(executor);
        this.r = executor;
    }

    @Override // com.daaw.e77
    public final void d(Throwable th) {
        this.s.E = null;
        if (th instanceof ExecutionException) {
            this.s.i(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.s.cancel(false);
        } else {
            this.s.i(th);
        }
    }

    @Override // com.daaw.e77
    public final void e(Object obj) {
        this.s.E = null;
        h(obj);
    }

    @Override // com.daaw.e77
    public final boolean f() {
        return this.s.isDone();
    }

    public abstract void h(Object obj);

    public final void i() {
        try {
            this.r.execute(this);
        } catch (RejectedExecutionException e) {
            this.s.i(e);
        }
    }
}
