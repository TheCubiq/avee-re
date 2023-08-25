package com.daaw;
/* loaded from: classes2.dex */
public final class g68 implements Runnable {
    public final /* synthetic */ tc8 p;

    public /* synthetic */ g68(tc8 tc8Var, z28 z28Var) {
        this.p = tc8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long b = this.p.b();
        if (b == -1 || mq.d().a() <= b) {
            return;
        }
        tc8.f(tc8.c(this.p));
    }
}
