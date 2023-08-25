package com.daaw;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class el8 {

    /* renamed from: a */
    public Exception f8568a;

    /* renamed from: b */
    public long f8569b;

    public el8(long j) {
    }

    /* renamed from: a */
    public final void m23381a() {
        this.f8568a = null;
    }

    /* renamed from: b */
    public final void m23380b(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f8568a == null) {
            this.f8568a = exc;
            this.f8569b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f8569b) {
            Exception exc2 = this.f8568a;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.f8568a;
            this.f8568a = null;
            throw exc3;
        }
    }
}
