package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class vi1 implements InterfaceC3836zf {
    @Override // com.daaw.InterfaceC3836zf
    /* renamed from: b */
    public long mo2363b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.daaw.InterfaceC3836zf
    /* renamed from: c */
    public long mo2362c() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.daaw.InterfaceC3836zf
    /* renamed from: d */
    public u80 mo2361d(Looper looper, Handler.Callback callback) {
        return new xi1(new Handler(looper, callback));
    }
}
