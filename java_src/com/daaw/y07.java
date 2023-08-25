package com.daaw;
/* loaded from: classes2.dex */
public final class y07 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ ru7 f33206p;

    public y07(ru7 ru7Var) {
        this.f33206p = ru7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        zt0 zt0Var;
        zt0 zt0Var2;
        obj = this.f33206p.f25634b;
        synchronized (obj) {
            ru7 ru7Var = this.f33206p;
            zt0Var = ru7Var.f25635c;
            if (zt0Var != null) {
                zt0Var2 = ru7Var.f25635c;
                zt0Var2.mo1920b();
            }
        }
    }
}
