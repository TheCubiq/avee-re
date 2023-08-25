package com.daaw;
/* loaded from: classes2.dex */
public final class f78 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ ua5 f9219p;

    /* renamed from: q */
    public final /* synthetic */ u78 f9220q;

    public f78(u78 u78Var, ua5 ua5Var) {
        this.f9220q = u78Var;
        this.f9219p = ua5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9220q) {
            this.f9220q.f28771a = false;
            if (!this.f9220q.f28773c.m5449z()) {
                this.f9220q.f28773c.f25143a.mo3895i().m14156v().m20653a("Connected to service");
                this.f9220q.f28773c.m5451x(this.f9219p);
            }
        }
    }
}
