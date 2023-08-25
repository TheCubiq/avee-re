package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public final class ov2 implements Runnable {
    public final /* synthetic */ IOException p;
    public final /* synthetic */ sv2 q;

    public ov2(sv2 sv2Var, IOException iOException) {
        this.q = sv2Var;
        this.p = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tv2 tv2Var;
        tv2Var = this.q.t;
        tv2Var.c(this.p);
    }
}
