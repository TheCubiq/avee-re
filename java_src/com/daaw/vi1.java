package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class vi1 implements zf {
    @Override // com.daaw.zf
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.daaw.zf
    public long c() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.daaw.zf
    public u80 d(Looper looper, Handler.Callback callback) {
        return new xi1(new Handler(looper, callback));
    }
}
