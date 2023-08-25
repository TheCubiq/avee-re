package com.daaw;
/* loaded from: classes2.dex */
public final class t98 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ rj1 f27145p;

    /* renamed from: q */
    public final /* synthetic */ xc8 f27146q;

    public t98(xc8 xc8Var, rj1 rj1Var) {
        this.f27146q = xc8Var;
        this.f27145p = rj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        gu0 gu0Var;
        gu0 gu0Var2;
        obj = this.f27146q.f32573b;
        synchronized (obj) {
            xc8 xc8Var = this.f27146q;
            gu0Var = xc8Var.f32574c;
            if (gu0Var != null) {
                gu0Var2 = xc8Var.f32574c;
                gu0Var2.mo5820c((Exception) ry0.m10830j(this.f27145p.mo11240j()));
            }
        }
    }
}
