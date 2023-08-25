package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public final class ov2 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ IOException f22035p;

    /* renamed from: q */
    public final /* synthetic */ sv2 f22036q;

    public ov2(sv2 sv2Var, IOException iOException) {
        this.f22036q = sv2Var;
        this.f22035p = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tv2 tv2Var;
        tv2Var = this.f22036q.f26693t;
        tv2Var.mo8770c(this.f22035p);
    }
}
