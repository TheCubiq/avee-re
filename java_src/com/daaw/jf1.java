package com.daaw;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes2.dex */
public abstract class jf1 {
    public static jf1 a(long j, long j2, long j3) {
        return new q9(j, j2, j3);
    }

    public static jf1 e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
