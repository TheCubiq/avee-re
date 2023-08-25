package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public final class h77 implements Executor {

    /* renamed from: p */
    public final /* synthetic */ Executor f12162p;

    /* renamed from: q */
    public final /* synthetic */ c57 f12163q;

    public h77(Executor executor, c57 c57Var) {
        this.f12162p = executor;
        this.f12163q = c57Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f12162p.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f12163q.mo14485i(e);
        }
    }
}
