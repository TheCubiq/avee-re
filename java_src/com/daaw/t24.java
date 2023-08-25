package com.daaw;

import android.os.Looper;
/* loaded from: classes.dex */
public final class t24 implements Runnable {
    public t24(v24 v24Var) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
