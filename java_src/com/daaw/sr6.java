package com.daaw;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class sr6 {

    /* renamed from: a */
    public final BlockingQueue f26574a;

    /* renamed from: b */
    public final ThreadPoolExecutor f26575b;

    /* renamed from: c */
    public final ArrayDeque f26576c = new ArrayDeque();

    /* renamed from: d */
    public rr6 f26577d = null;

    public sr6() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f26574a = linkedBlockingQueue;
        this.f26575b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    public final void m9937a(rr6 rr6Var) {
        this.f26577d = null;
        m9935c();
    }

    /* renamed from: b */
    public final void m9936b(rr6 rr6Var) {
        rr6Var.m11046b(this);
        this.f26576c.add(rr6Var);
        if (this.f26577d == null) {
            m9935c();
        }
    }

    /* renamed from: c */
    public final void m9935c() {
        rr6 rr6Var = (rr6) this.f26576c.poll();
        this.f26577d = rr6Var;
        if (rr6Var != null) {
            rr6Var.executeOnExecutor(this.f26575b, new Object[0]);
        }
    }
}
