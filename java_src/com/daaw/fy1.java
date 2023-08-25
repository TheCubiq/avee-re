package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class fy1 implements wj1 {

    /* renamed from: a */
    public final mb1 f10091a;

    /* renamed from: b */
    public final Handler f10092b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Executor f10093c = new ExecutorC1345a();

    /* renamed from: com.daaw.fy1$a */
    /* loaded from: classes.dex */
    public class ExecutorC1345a implements Executor {
        public ExecutorC1345a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            fy1.this.m22135d(runnable);
        }
    }

    public fy1(Executor executor) {
        this.f10091a = new mb1(executor);
    }

    @Override // com.daaw.wj1
    /* renamed from: a */
    public Executor mo6052a() {
        return this.f10093c;
    }

    @Override // com.daaw.wj1
    /* renamed from: b */
    public void mo6051b(Runnable runnable) {
        this.f10091a.execute(runnable);
    }

    @Override // com.daaw.wj1
    /* renamed from: c */
    public mb1 mo6050c() {
        return this.f10091a;
    }

    /* renamed from: d */
    public void m22135d(Runnable runnable) {
        this.f10092b.post(runnable);
    }
}
