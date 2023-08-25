package com.daaw;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public enum dp1 implements Executor {
    INSTANCE;
    
    @SuppressLint({"ThreadPoolCreation"})
    public static final Handler q = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        q.post(runnable);
    }
}
