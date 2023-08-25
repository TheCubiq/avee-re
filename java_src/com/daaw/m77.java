package com.daaw;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class m77 {
    public static g77 a(ExecutorService executorService) {
        if (executorService instanceof g77) {
            return (g77) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new l77((ScheduledExecutorService) executorService) : new i77(executorService);
    }

    public static Executor b() {
        return g67.INSTANCE;
    }

    public static Executor c(Executor executor, c57 c57Var) {
        Objects.requireNonNull(executor);
        return executor == g67.INSTANCE ? executor : new h77(executor, c57Var);
    }
}
