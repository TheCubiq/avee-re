package com.daaw;
/* loaded from: classes.dex */
public final class of2 implements Runnable {
    public final /* synthetic */ String p;
    public final /* synthetic */ long q;
    public final /* synthetic */ qf2 r;

    public of2(qf2 qf2Var, String str, long j) {
        this.r = qf2Var;
        this.p = str;
        this.q = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg2 bg2Var;
        bg2 bg2Var2;
        bg2Var = this.r.p;
        bg2Var.a(this.p, this.q);
        qf2 qf2Var = this.r;
        bg2Var2 = qf2Var.p;
        bg2Var2.b(qf2Var.toString());
    }
}
