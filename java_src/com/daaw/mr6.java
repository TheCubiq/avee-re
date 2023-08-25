package com.daaw;

import android.os.Handler;
/* loaded from: classes.dex */
public final class mr6 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = pr6.k;
        if (handler != null) {
            handler2 = pr6.k;
            runnable = pr6.l;
            handler2.post(runnable);
            handler3 = pr6.k;
            runnable2 = pr6.m;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
