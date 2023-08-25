package com.daaw;
/* loaded from: classes2.dex */
public final class dk2 implements Runnable {
    public final /* synthetic */ xe7 p;
    public final /* synthetic */ hl2 q;

    public dk2(hl2 hl2Var, xe7 xe7Var) {
        this.q = hl2Var;
        this.p = xe7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.a();
        if (b52.a()) {
            this.p.r().z(this);
            return;
        }
        boolean e = this.q.e();
        this.q.c = 0L;
        if (e) {
            this.q.c();
        }
    }
}
