package com.daaw;
/* loaded from: classes.dex */
public final class cf2 implements Runnable {

    /* renamed from: p */
    public final qf2 f5784p;

    /* renamed from: q */
    public final wf2 f5785q;

    /* renamed from: r */
    public final Runnable f5786r;

    public cf2(qf2 qf2Var, wf2 wf2Var, Runnable runnable) {
        this.f5784p = qf2Var;
        this.f5785q = wf2Var;
        this.f5786r = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5784p.zzw();
        wf2 wf2Var = this.f5785q;
        if (wf2Var.m6087c()) {
            this.f5784p.mo1347c(wf2Var.f31212a);
        } else {
            this.f5784p.zzn(wf2Var.f31214c);
        }
        if (this.f5785q.f31215d) {
            this.f5784p.zzm("intermediate-response");
        } else {
            this.f5784p.m12568d("done");
        }
        Runnable runnable = this.f5786r;
        if (runnable != null) {
            runnable.run();
        }
    }
}
