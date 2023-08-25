package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class x71 implements Executor {

    /* renamed from: p */
    public final Executor f32163p;

    /* renamed from: com.daaw.x71$a */
    /* loaded from: classes.dex */
    public static class RunnableC3512a implements Runnable {

        /* renamed from: p */
        public final Runnable f32164p;

        public RunnableC3512a(Runnable runnable) {
            this.f32164p = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f32164p.run();
            } catch (Exception e) {
                nl0.m15086d("Executor", "Background execution failure.", e);
            }
        }
    }

    public x71(Executor executor) {
        this.f32163p = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f32163p.execute(new RunnableC3512a(runnable));
    }
}
