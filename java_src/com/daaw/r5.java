package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class r5 extends xj1 {
    public static volatile r5 c;
    public static final Executor d = new a();
    public static final Executor e = new b();
    public xj1 a;
    public xj1 b;

    /* loaded from: classes.dex */
    public static class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            r5.e().c(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            r5.e().a(runnable);
        }
    }

    public r5() {
        zr zrVar = new zr();
        this.b = zrVar;
        this.a = zrVar;
    }

    public static Executor d() {
        return e;
    }

    public static r5 e() {
        if (c != null) {
            return c;
        }
        synchronized (r5.class) {
            if (c == null) {
                c = new r5();
            }
        }
        return c;
    }

    @Override // com.daaw.xj1
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // com.daaw.xj1
    public boolean b() {
        return this.a.b();
    }

    @Override // com.daaw.xj1
    public void c(Runnable runnable) {
        this.a.c(runnable);
    }
}
