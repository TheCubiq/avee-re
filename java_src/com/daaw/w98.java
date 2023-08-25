package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class w98 {
    public long a;
    public long b;
    public final hl2 c;
    public final /* synthetic */ ca8 d;

    public w98(ca8 ca8Var) {
        this.d = ca8Var;
        this.c = new k98(this, ca8Var.a);
        long b = ca8Var.a.b().b();
        this.a = b;
        this.b = b;
    }

    public final void a() {
        this.c.b();
        this.a = 0L;
        this.b = 0L;
    }

    public final void b(long j) {
        this.c.b();
    }

    public final void c(long j) {
        this.d.f();
        this.c.b();
        this.a = j;
        this.b = j;
    }

    public final boolean d(boolean z, boolean z2, long j) {
        this.d.f();
        this.d.g();
        rk8.b();
        if (!this.d.a.z().B(null, m75.f0) || this.d.a.n()) {
            this.d.a.F().o.b(this.d.a.b().a());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            this.d.a.i().v().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        this.d.a.i().v().b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        dd8.y(this.d.a.K().s(!this.d.a.z().D()), bundle, true);
        if (!z2) {
            this.d.a.I().u("auto", "_e", bundle);
        }
        this.a = j;
        this.c.b();
        this.c.d(3600000L);
        return true;
    }
}
