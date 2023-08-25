package com.daaw;
/* loaded from: classes.dex */
public final class l24 implements Runnable {
    public final /* synthetic */ boolean p;
    public final /* synthetic */ m24 q;

    public l24(m24 m24Var, boolean z) {
        this.q = m24Var;
        this.p = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.m("windowVisibilityChanged", "isVisible", String.valueOf(this.p));
    }
}
