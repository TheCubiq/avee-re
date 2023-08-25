package com.daaw;
/* loaded from: classes.dex */
public final class cf2 implements Runnable {
    public final qf2 p;
    public final wf2 q;
    public final Runnable r;

    public cf2(qf2 qf2Var, wf2 wf2Var, Runnable runnable) {
        this.p = qf2Var;
        this.q = wf2Var;
        this.r = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.zzw();
        wf2 wf2Var = this.q;
        if (wf2Var.c()) {
            this.p.c(wf2Var.a);
        } else {
            this.p.zzn(wf2Var.c);
        }
        if (this.q.d) {
            this.p.zzm("intermediate-response");
        } else {
            this.p.d("done");
        }
        Runnable runnable = this.r;
        if (runnable != null) {
            runnable.run();
        }
    }
}
