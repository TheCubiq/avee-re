package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class tt8 implements Executor {

    /* renamed from: p */
    public final Handler f28065p = new c32(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f28065p.post(runnable);
    }
}
