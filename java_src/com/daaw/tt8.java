package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class tt8 implements Executor {
    public final Handler p = new c32(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.p.post(runnable);
    }
}
