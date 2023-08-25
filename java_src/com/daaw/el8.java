package com.daaw;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class el8 {
    public Exception a;
    public long b;

    public el8(long j) {
    }

    public final void a() {
        this.a = null;
    }

    public final void b(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
            this.b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.b) {
            Exception exc2 = this.a;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.a;
            this.a = null;
            throw exc3;
        }
    }
}
