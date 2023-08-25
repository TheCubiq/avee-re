package com.daaw;
/* loaded from: classes2.dex */
public final class g68 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ tc8 f10312p;

    public /* synthetic */ g68(tc8 tc8Var, z28 z28Var) {
        this.f10312p = tc8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long m9301b = this.f10312p.m9301b();
        if (m9301b == -1 || C2202mq.m15857d().mo15860a() <= m9301b) {
            return;
        }
        tc8.m9297f(tc8.m9300c(this.f10312p));
    }
}
