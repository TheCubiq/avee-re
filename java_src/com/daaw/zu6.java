package com.daaw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public interface zu6 {
    ExecutorService a(int i);

    ExecutorService b(int i, ThreadFactory threadFactory, int i2);

    ExecutorService c(ThreadFactory threadFactory, int i);
}
