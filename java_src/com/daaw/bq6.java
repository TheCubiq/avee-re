package com.daaw;
/* loaded from: classes2.dex */
public final class bq6 implements Runnable {
    public final /* synthetic */ vn7 p;
    public final /* synthetic */ dr6 q;

    public bq6(dr6 dr6Var, vn7 vn7Var) {
        this.q = dr6Var;
        this.p = vn7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr6.c(this.q, this.p);
        this.q.l(this.p.g);
    }
}
