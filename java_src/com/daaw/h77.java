package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public final class h77 implements Executor {
    public final /* synthetic */ Executor p;
    public final /* synthetic */ c57 q;

    public h77(Executor executor, c57 c57Var) {
        this.p = executor;
        this.q = c57Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.p.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.q.i(e);
        }
    }
}
