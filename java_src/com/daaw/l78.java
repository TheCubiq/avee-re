package com.daaw;
/* loaded from: classes2.dex */
public final class l78 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ ua5 f17113p;

    /* renamed from: q */
    public final /* synthetic */ u78 f17114q;

    public l78(u78 u78Var, ua5 ua5Var) {
        this.f17114q = u78Var;
        this.f17113p = ua5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17114q) {
            this.f17114q.f28771a = false;
            if (!this.f17114q.f28773c.m5449z()) {
                this.f17114q.f28773c.f25143a.mo3895i().m14161p().m20653a("Connected to remote service");
                this.f17114q.f28773c.m5451x(this.f17113p);
            }
        }
    }
}
