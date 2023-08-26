package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public interface Clock {
    public static final Clock DEFAULT = new SystemClock();

    HandlerWrapper createHandler(Looper looper, Handler.Callback callback);

    long elapsedRealtime();

    void sleep(long j);

    long uptimeMillis();
}
