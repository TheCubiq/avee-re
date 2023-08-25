package com.daaw;

import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
public final class xe2 implements Runnable {
    public final /* synthetic */ qf2 p;
    public final /* synthetic */ ye2 q;

    public xe2(ye2 ye2Var, qf2 qf2Var) {
        this.q = ye2Var;
        this.p = qf2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.q.q;
            blockingQueue.put(this.p);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
