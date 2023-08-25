package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class jl5 implements xp4 {
    @Override // com.daaw.xp4
    /* renamed from: a */
    public final vz4 mo4854a(Looper looper, Handler.Callback callback) {
        return new wo5(new Handler(looper, callback));
    }

    @Override // com.daaw.xp4
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }
}
