package com.daaw;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class zm1 implements Executor {

    /* renamed from: p */
    public final Executor f35216p;

    /* renamed from: q */
    public final ArrayDeque<Runnable> f35217q = new ArrayDeque<>();

    /* renamed from: r */
    public Runnable f35218r;

    /* renamed from: com.daaw.zm1$a */
    /* loaded from: classes.dex */
    public class RunnableC3879a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ Runnable f35219p;

        public RunnableC3879a(Runnable runnable) {
            this.f35219p = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f35219p.run();
            } finally {
                zm1.this.m2115a();
            }
        }
    }

    public zm1(Executor executor) {
        this.f35216p = executor;
    }

    /* renamed from: a */
    public synchronized void m2115a() {
        Runnable poll = this.f35217q.poll();
        this.f35218r = poll;
        if (poll != null) {
            this.f35216p.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f35217q.offer(new RunnableC3879a(runnable));
        if (this.f35218r == null) {
            m2115a();
        }
    }
}
