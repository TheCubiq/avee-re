package com.daaw;
/* loaded from: classes2.dex */
public final class bf8 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ rj1 f4774p;

    /* renamed from: q */
    public final /* synthetic */ nh8 f4775q;

    public bf8(nh8 nh8Var, rj1 rj1Var) {
        this.f4775q = nh8Var;
        this.f4774p = rj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ku0 ku0Var;
        ku0 ku0Var2;
        obj = this.f4775q.f20131b;
        synchronized (obj) {
            nh8 nh8Var = this.f4775q;
            ku0Var = nh8Var.f20132c;
            if (ku0Var != null) {
                ku0Var2 = nh8Var.f20132c;
                ku0Var2.onSuccess(this.f4774p.mo11239k());
            }
        }
    }
}
