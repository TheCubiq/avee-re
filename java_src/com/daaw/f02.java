package com.daaw;
/* loaded from: classes.dex */
public final class f02 implements Runnable {
    public final /* synthetic */ int p;
    public final /* synthetic */ i02 q;

    public f02(i02 i02Var, int i) {
        this.q = i02Var;
        this.p = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.h(this.p);
    }
}
