package org.junit.runners.model;
/* loaded from: classes2.dex */
public interface RunnerScheduler {
    void finished();

    void schedule(Runnable runnable);
}
