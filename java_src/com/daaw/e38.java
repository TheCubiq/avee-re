package com.daaw;
/* loaded from: classes2.dex */
public final class e38 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ rj1 f8106p;

    /* renamed from: q */
    public final /* synthetic */ k68 f8107q;

    public e38(k68 k68Var, rj1 rj1Var) {
        this.f8107q = k68Var;
        this.f8106p = rj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        cu0 cu0Var;
        cu0 cu0Var2;
        obj = this.f8107q.f15718b;
        synchronized (obj) {
            k68 k68Var = this.f8107q;
            cu0Var = k68Var.f15719c;
            if (cu0Var != null) {
                cu0Var2 = k68Var.f15719c;
                cu0Var2.mo6614a(this.f8106p);
            }
        }
    }
}
