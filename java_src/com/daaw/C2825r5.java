package com.daaw;

import java.util.concurrent.Executor;
/* renamed from: com.daaw.r5 */
/* loaded from: classes.dex */
public class C2825r5 extends xj1 {

    /* renamed from: c */
    public static volatile C2825r5 f24856c;

    /* renamed from: d */
    public static final Executor f24857d = new ExecutorC2826a();

    /* renamed from: e */
    public static final Executor f24858e = new ExecutorC2827b();

    /* renamed from: a */
    public xj1 f24859a;

    /* renamed from: b */
    public xj1 f24860b;

    /* renamed from: com.daaw.r5$a */
    /* loaded from: classes.dex */
    public static class ExecutorC2826a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C2825r5.m11733e().mo1975c(runnable);
        }
    }

    /* renamed from: com.daaw.r5$b */
    /* loaded from: classes.dex */
    public static class ExecutorC2827b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C2825r5.m11733e().mo1977a(runnable);
        }
    }

    public C2825r5() {
        C3889zr c3889zr = new C3889zr();
        this.f24860b = c3889zr;
        this.f24859a = c3889zr;
    }

    /* renamed from: d */
    public static Executor m11734d() {
        return f24858e;
    }

    /* renamed from: e */
    public static C2825r5 m11733e() {
        if (f24856c != null) {
            return f24856c;
        }
        synchronized (C2825r5.class) {
            if (f24856c == null) {
                f24856c = new C2825r5();
            }
        }
        return f24856c;
    }

    @Override // com.daaw.xj1
    /* renamed from: a */
    public void mo1977a(Runnable runnable) {
        this.f24859a.mo1977a(runnable);
    }

    @Override // com.daaw.xj1
    /* renamed from: b */
    public boolean mo1976b() {
        return this.f24859a.mo1976b();
    }

    @Override // com.daaw.xj1
    /* renamed from: c */
    public void mo1975c(Runnable runnable) {
        this.f24859a.mo1975c(runnable);
    }
}
