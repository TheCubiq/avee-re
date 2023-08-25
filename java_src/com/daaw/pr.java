package com.daaw;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public class pr implements m61 {
    public final Handler a = q80.a(Looper.getMainLooper());

    @Override // com.daaw.m61
    public void a(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }

    @Override // com.daaw.m61
    public void b(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }
}
