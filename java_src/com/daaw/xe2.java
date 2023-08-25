package com.daaw;

import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
public final class xe2 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ qf2 f32632p;

    /* renamed from: q */
    public final /* synthetic */ ye2 f32633q;

    public xe2(ye2 ye2Var, qf2 qf2Var) {
        this.f32633q = ye2Var;
        this.f32632p = qf2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.f32633q.f33602q;
            blockingQueue.put(this.f32632p);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
