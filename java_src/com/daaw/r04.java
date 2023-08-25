package com.daaw;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class r04 extends ScheduledThreadPoolExecutor {
    public r04(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
