package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class fy1 implements wj1 {
    public final mb1 a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Executor c = new a();

    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            fy1.this.d(runnable);
        }
    }

    public fy1(Executor executor) {
        this.a = new mb1(executor);
    }

    @Override // com.daaw.wj1
    public Executor a() {
        return this.c;
    }

    @Override // com.daaw.wj1
    public void b(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // com.daaw.wj1
    public mb1 c() {
        return this.a;
    }

    public void d(Runnable runnable) {
        this.b.post(runnable);
    }
}
