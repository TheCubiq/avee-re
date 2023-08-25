package com.daaw;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class ia8 implements g78 {
    public final xp4 p;
    public boolean q;
    public long r;
    public long s;
    public pp3 t = pp3.d;

    public ia8(xp4 xp4Var) {
        this.p = xp4Var;
    }

    public final void a(long j) {
        this.r = j;
        if (this.q) {
            this.s = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.q) {
            return;
        }
        this.s = SystemClock.elapsedRealtime();
        this.q = true;
    }

    public final void c() {
        if (this.q) {
            a(zza());
            this.q = false;
        }
    }

    @Override // com.daaw.g78
    public final void l(pp3 pp3Var) {
        if (this.q) {
            a(zza());
        }
        this.t = pp3Var;
    }

    @Override // com.daaw.g78
    public final long zza() {
        long j = this.r;
        if (this.q) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.s;
            pp3 pp3Var = this.t;
            return j + (pp3Var.a == 1.0f ? it5.f0(elapsedRealtime) : pp3Var.a(elapsedRealtime));
        }
        return j;
    }

    @Override // com.daaw.g78
    public final pp3 zzc() {
        return this.t;
    }
}
