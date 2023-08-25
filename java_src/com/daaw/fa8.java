package com.daaw;
/* loaded from: classes2.dex */
public final class fa8 {
    public final ag a;
    public long b;

    public fa8(ag agVar) {
        ry0.j(agVar);
        this.a = agVar;
    }

    public final void a() {
        this.b = 0L;
    }

    public final void b() {
        this.b = this.a.b();
    }

    public final boolean c(long j) {
        return this.b == 0 || this.a.b() - this.b >= 3600000;
    }
}
