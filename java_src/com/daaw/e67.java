package com.daaw;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public abstract class e67 extends e77 {

    /* renamed from: r */
    public final Executor f8201r;

    /* renamed from: s */
    public final /* synthetic */ f67 f8202s;

    public e67(f67 f67Var, Executor executor) {
        this.f8202s = f67Var;
        Objects.requireNonNull(executor);
        this.f8201r = executor;
    }

    @Override // com.daaw.e77
    /* renamed from: d */
    public final void mo8450d(Throwable th) {
        this.f8202s.f9201E = null;
        if (th instanceof ExecutionException) {
            this.f8202s.mo14485i(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.f8202s.cancel(false);
        } else {
            this.f8202s.mo14485i(th);
        }
    }

    @Override // com.daaw.e77
    /* renamed from: e */
    public final void mo8449e(Object obj) {
        this.f8202s.f9201E = null;
        mo23698h(obj);
    }

    @Override // com.daaw.e77
    /* renamed from: f */
    public final boolean mo8448f() {
        return this.f8202s.isDone();
    }

    /* renamed from: h */
    public abstract void mo23698h(Object obj);

    /* renamed from: i */
    public final void m23697i() {
        try {
            this.f8201r.execute(this);
        } catch (RejectedExecutionException e) {
            this.f8202s.mo14485i(e);
        }
    }
}
