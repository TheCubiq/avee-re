package com.daaw;
/* loaded from: classes.dex */
public final class j24 implements Runnable {
    public final /* synthetic */ m24 p;

    public j24(m24 m24Var) {
        this.p = m24Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.m("surfaceCreated", new String[0]);
    }
}
