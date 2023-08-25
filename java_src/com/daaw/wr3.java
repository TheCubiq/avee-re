package com.daaw;
/* loaded from: classes2.dex */
public final class wr3 implements Runnable {
    public final /* synthetic */ long p;
    public final /* synthetic */ vk4 q;

    public wr3(vk4 vk4Var, long j) {
        this.q = vk4Var;
        this.p = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.p(this.p);
    }
}
