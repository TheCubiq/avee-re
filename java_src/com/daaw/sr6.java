package com.daaw;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class sr6 {
    public final BlockingQueue a;
    public final ThreadPoolExecutor b;
    public final ArrayDeque c = new ArrayDeque();
    public rr6 d = null;

    public sr6() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = linkedBlockingQueue;
        this.b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public final void a(rr6 rr6Var) {
        this.d = null;
        c();
    }

    public final void b(rr6 rr6Var) {
        rr6Var.b(this);
        this.c.add(rr6Var);
        if (this.d == null) {
            c();
        }
    }

    public final void c() {
        rr6 rr6Var = (rr6) this.c.poll();
        this.d = rr6Var;
        if (rr6Var != null) {
            rr6Var.executeOnExecutor(this.b, new Object[0]);
        }
    }
}
