package com.daaw;
/* loaded from: classes2.dex */
public final class m88 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ yb8 f18662p;

    /* renamed from: q */
    public final /* synthetic */ Runnable f18663q;

    public m88(s88 s88Var, yb8 yb8Var, Runnable runnable) {
        this.f18662p = yb8Var;
        this.f18663q = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18662p.m3907c();
        this.f18662p.m3888l0(this.f18663q);
        this.f18662p.m3935C();
    }
}
