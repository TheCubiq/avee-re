package com.daaw;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class lz2 implements ez2 {
    public boolean a;
    public long b;
    public long c;
    public fq2 d = fq2.d;

    public final void a(long j) {
        this.b = j;
        if (this.a) {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.a) {
            return;
        }
        this.c = SystemClock.elapsedRealtime();
        this.a = true;
    }

    public final void c() {
        if (this.a) {
            a(h());
            this.a = false;
        }
    }

    public final void d(ez2 ez2Var) {
        a(ez2Var.h());
        this.d = ez2Var.n();
    }

    @Override // com.daaw.ez2
    public final long h() {
        long j = this.b;
        if (this.a) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
            fq2 fq2Var = this.d;
            return j + (fq2Var.a == 1.0f ? jp2.a(elapsedRealtime) : fq2Var.a(elapsedRealtime));
        }
        return j;
    }

    @Override // com.daaw.ez2
    public final fq2 n() {
        throw null;
    }

    @Override // com.daaw.ez2
    public final fq2 o(fq2 fq2Var) {
        if (this.a) {
            a(h());
        }
        this.d = fq2Var;
        return fq2Var;
    }
}
