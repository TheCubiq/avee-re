package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public interface g77 extends ExecutorService {
    f77 M(Callable callable);

    f77 P(Runnable runnable);
}
