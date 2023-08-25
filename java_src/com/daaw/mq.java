package com.daaw;

import android.os.SystemClock;
/* loaded from: classes.dex */
public class mq implements ag {
    public static final mq a = new mq();

    public static ag d() {
        return a;
    }

    @Override // com.daaw.ag
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.daaw.ag
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.daaw.ag
    public final long c() {
        return System.nanoTime();
    }
}
