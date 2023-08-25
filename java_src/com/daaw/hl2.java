package com.daaw;

import android.os.Handler;
/* loaded from: classes2.dex */
public abstract class hl2 {
    public static volatile Handler d;
    public final xe7 a;
    public final Runnable b;
    public volatile long c;

    public hl2(xe7 xe7Var) {
        ry0.j(xe7Var);
        this.a = xe7Var;
        this.b = new dk2(this, xe7Var);
    }

    public final void b() {
        this.c = 0L;
        f().removeCallbacks(this.b);
    }

    public abstract void c();

    public final void d(long j) {
        b();
        if (j >= 0) {
            this.c = this.a.b().a();
            if (f().postDelayed(this.b, j)) {
                return;
            }
            this.a.i().q().b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean e() {
        return this.c != 0;
    }

    public final Handler f() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (hl2.class) {
            if (d == null) {
                d = new np3(this.a.d().getMainLooper());
            }
            handler = d;
        }
        return handler;
    }
}
