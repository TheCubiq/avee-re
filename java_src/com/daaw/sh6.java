package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class sh6 {
    public final ag a;
    public final Object b = new Object();
    @GuardedBy("lock")
    public volatile int d = 1;
    public volatile long c = 0;

    public sh6(ag agVar) {
        this.a = agVar;
    }

    public final void a() {
        f(2, 3);
    }

    public final void b(boolean z) {
        if (z) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            e();
            z = this.d == 3;
        }
        return z;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            e();
            z = this.d == 2;
        }
        return z;
    }

    public final void e() {
        long a = this.a.a();
        synchronized (this.b) {
            if (this.d == 3) {
                if (this.c + ((Long) zzba.zzc().b(g93.s5)).longValue() <= a) {
                    this.d = 1;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        e();
        long a = this.a.a();
        synchronized (this.b) {
            if (this.d != i) {
                return;
            }
            this.d = i2;
            if (this.d == 3) {
                this.c = a;
            }
        }
    }
}
