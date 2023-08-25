package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public interface f77<V> extends Future<V> {
    void f(Runnable runnable, Executor executor);
}
