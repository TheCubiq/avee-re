package com.google.android.gms.ads.internal;

import android.os.Handler;
/* loaded from: classes.dex */
public final class zzbn {
    private final Handler mHandler;

    public zzbn(Handler handler) {
        this.mHandler = handler;
    }

    public final boolean postDelayed(Runnable runnable, long j) {
        return this.mHandler.postDelayed(runnable, j);
    }

    public final void removeCallbacks(Runnable runnable) {
        this.mHandler.removeCallbacks(runnable);
    }
}
