package com.daaw;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes2.dex */
public abstract class jf1 {
    /* renamed from: a */
    public static jf1 m18539a(long j, long j2, long j3) {
        return new C2699q9(j, j2, j3);
    }

    /* renamed from: e */
    public static jf1 m18538e() {
        return m18539a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* renamed from: b */
    public abstract long mo12699b();

    /* renamed from: c */
    public abstract long mo12698c();

    /* renamed from: d */
    public abstract long mo12697d();
}
