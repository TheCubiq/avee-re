package com.daaw;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class mb1 implements Executor {

    /* renamed from: q */
    public final Executor f18755q;

    /* renamed from: s */
    public volatile Runnable f18757s;

    /* renamed from: p */
    public final ArrayDeque<RunnableC2165a> f18754p = new ArrayDeque<>();

    /* renamed from: r */
    public final Object f18756r = new Object();

    /* renamed from: com.daaw.mb1$a */
    /* loaded from: classes.dex */
    public static class RunnableC2165a implements Runnable {

        /* renamed from: p */
        public final mb1 f18758p;

        /* renamed from: q */
        public final Runnable f18759q;

        public RunnableC2165a(mb1 mb1Var, Runnable runnable) {
            this.f18758p = mb1Var;
            this.f18759q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f18759q.run();
            } finally {
                this.f18758p.m16114b();
            }
        }
    }

    public mb1(Executor executor) {
        this.f18755q = executor;
    }

    /* renamed from: a */
    public boolean m16115a() {
        boolean z;
        synchronized (this.f18756r) {
            z = !this.f18754p.isEmpty();
        }
        return z;
    }

    /* renamed from: b */
    public void m16114b() {
        synchronized (this.f18756r) {
            RunnableC2165a poll = this.f18754p.poll();
            this.f18757s = poll;
            if (poll != null) {
                this.f18755q.execute(this.f18757s);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f18756r) {
            this.f18754p.add(new RunnableC2165a(this, runnable));
            if (this.f18757s == null) {
                m16114b();
            }
        }
    }
}
