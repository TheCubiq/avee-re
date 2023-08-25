package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class x71 implements Executor {
    public final Executor p;

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public final Runnable p;

        public a(Runnable runnable) {
            this.p = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.p.run();
            } catch (Exception e) {
                nl0.d("Executor", "Background execution failure.", e);
            }
        }
    }

    public x71(Executor executor) {
        this.p = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.p.execute(new a(runnable));
    }
}
