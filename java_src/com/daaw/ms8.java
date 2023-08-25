package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class ms8 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
