package com.daaw;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class mb1 implements Executor {
    public final Executor q;
    public volatile Runnable s;
    public final ArrayDeque<a> p = new ArrayDeque<>();
    public final Object r = new Object();

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public final mb1 p;
        public final Runnable q;

        public a(mb1 mb1Var, Runnable runnable) {
            this.p = mb1Var;
            this.q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.q.run();
            } finally {
                this.p.b();
            }
        }
    }

    public mb1(Executor executor) {
        this.q = executor;
    }

    public boolean a() {
        boolean z;
        synchronized (this.r) {
            z = !this.p.isEmpty();
        }
        return z;
    }

    public void b() {
        synchronized (this.r) {
            a poll = this.p.poll();
            this.s = poll;
            if (poll != null) {
                this.q.execute(this.s);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.r) {
            this.p.add(new a(this, runnable));
            if (this.s == null) {
                b();
            }
        }
    }
}
