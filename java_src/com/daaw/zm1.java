package com.daaw;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class zm1 implements Executor {
    public final Executor p;
    public final ArrayDeque<Runnable> q = new ArrayDeque<>();
    public Runnable r;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Runnable p;

        public a(Runnable runnable) {
            this.p = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.p.run();
            } finally {
                zm1.this.a();
            }
        }
    }

    public zm1(Executor executor) {
        this.p = executor;
    }

    public synchronized void a() {
        Runnable poll = this.q.poll();
        this.r = poll;
        if (poll != null) {
            this.p.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.q.offer(new a(runnable));
        if (this.r == null) {
            a();
        }
    }
}
