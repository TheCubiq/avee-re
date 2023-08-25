package com.daaw;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class lz2 implements ez2 {

    /* renamed from: a */
    public boolean f17918a;

    /* renamed from: b */
    public long f17919b;

    /* renamed from: c */
    public long f17920c;

    /* renamed from: d */
    public fq2 f17921d = fq2.f9781d;

    /* renamed from: a */
    public final void m16362a(long j) {
        this.f17919b = j;
        if (this.f17918a) {
            this.f17920c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void m16361b() {
        if (this.f17918a) {
            return;
        }
        this.f17920c = SystemClock.elapsedRealtime();
        this.f17918a = true;
    }

    /* renamed from: c */
    public final void m16360c() {
        if (this.f17918a) {
            m16362a(mo9952h());
            this.f17918a = false;
        }
    }

    /* renamed from: d */
    public final void m16359d(ez2 ez2Var) {
        m16362a(ez2Var.mo9952h());
        this.f17921d = ez2Var.mo9951n();
    }

    @Override // com.daaw.ez2
    /* renamed from: h */
    public final long mo9952h() {
        long j = this.f17919b;
        if (this.f17918a) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f17920c;
            fq2 fq2Var = this.f17921d;
            return j + (fq2Var.f9782a == 1.0f ? jp2.m18345a(elapsedRealtime) : fq2Var.m22414a(elapsedRealtime));
        }
        return j;
    }

    @Override // com.daaw.ez2
    /* renamed from: n */
    public final fq2 mo9951n() {
        throw null;
    }

    @Override // com.daaw.ez2
    /* renamed from: o */
    public final fq2 mo9950o(fq2 fq2Var) {
        if (this.f17918a) {
            m16362a(mo9952h());
        }
        this.f17921d = fq2Var;
        return fq2Var;
    }
}
