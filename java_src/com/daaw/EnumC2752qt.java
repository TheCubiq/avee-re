package com.daaw;

import java.util.concurrent.Executor;
/* renamed from: com.daaw.qt */
/* loaded from: classes.dex */
public enum EnumC2752qt implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
