package com.daaw;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class ia8 implements g78 {

    /* renamed from: p */
    public final xp4 f13419p;

    /* renamed from: q */
    public boolean f13420q;

    /* renamed from: r */
    public long f13421r;

    /* renamed from: s */
    public long f13422s;

    /* renamed from: t */
    public pp3 f13423t = pp3.f23129d;

    public ia8(xp4 xp4Var) {
        this.f13419p = xp4Var;
    }

    /* renamed from: a */
    public final void m19996a(long j) {
        this.f13421r = j;
        if (this.f13420q) {
            this.f13422s = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void m19995b() {
        if (this.f13420q) {
            return;
        }
        this.f13422s = SystemClock.elapsedRealtime();
        this.f13420q = true;
    }

    /* renamed from: c */
    public final void m19994c() {
        if (this.f13420q) {
            m19996a(zza());
            this.f13420q = false;
        }
    }

    @Override // com.daaw.g78
    /* renamed from: l */
    public final void mo19439l(pp3 pp3Var) {
        if (this.f13420q) {
            m19996a(zza());
        }
        this.f13423t = pp3Var;
    }

    @Override // com.daaw.g78
    public final long zza() {
        long j = this.f13421r;
        if (this.f13420q) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f13422s;
            pp3 pp3Var = this.f13423t;
            return j + (pp3Var.f23131a == 1.0f ? it5.m19394f0(elapsedRealtime) : pp3Var.m13234a(elapsedRealtime));
        }
        return j;
    }

    @Override // com.daaw.g78
    public final pp3 zzc() {
        return this.f13423t;
    }
}
