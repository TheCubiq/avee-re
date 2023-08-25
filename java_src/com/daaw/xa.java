package com.daaw;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
/* loaded from: classes.dex */
public abstract class xa implements a41, b41 {
    public final int p;
    public c41 q;
    public int r;
    public int s;
    public d81 t;
    public Format[] u;
    public long v;
    public boolean w = true;
    public boolean x;

    public xa(int i) {
        this.p = i;
    }

    public static boolean I(yu<?> yuVar, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (yuVar == null) {
            return false;
        }
        return yuVar.d(drmInitData);
    }

    public abstract void A();

    public void B(boolean z) {
    }

    public abstract void C(long j, boolean z);

    public void D() {
    }

    public void E() {
    }

    public void F(Format[] formatArr, long j) {
    }

    public final int G(k30 k30Var, gq gqVar, boolean z) {
        int j = this.t.j(k30Var, gqVar, z);
        if (j == -4) {
            if (gqVar.j()) {
                this.w = true;
                return this.x ? -4 : -3;
            }
            gqVar.s += this.v;
        } else if (j == -5) {
            Format format = k30Var.a;
            long j2 = format.L;
            if (j2 != Long.MAX_VALUE) {
                k30Var.a = format.l(j2 + this.v);
            }
        }
        return j;
    }

    public int H(long j) {
        return this.t.n(j - this.v);
    }

    @Override // com.daaw.a41
    public final d81 b() {
        return this.t;
    }

    @Override // com.daaw.a41
    public final void e(int i) {
        this.r = i;
    }

    @Override // com.daaw.a41
    public final void g() {
        s6.f(this.s == 1);
        this.s = 0;
        this.t = null;
        this.u = null;
        this.x = false;
        A();
    }

    @Override // com.daaw.a41
    public final int getState() {
        return this.s;
    }

    @Override // com.daaw.a41, com.daaw.b41
    public final int i() {
        return this.p;
    }

    @Override // com.daaw.a41
    public final boolean j() {
        return this.w;
    }

    @Override // com.daaw.a41
    public final void k(c41 c41Var, Format[] formatArr, d81 d81Var, long j, boolean z, long j2) {
        s6.f(this.s == 0);
        this.q = c41Var;
        this.s = 1;
        B(z);
        m(formatArr, d81Var, j2);
        C(j, z);
    }

    @Override // com.daaw.a41
    public final void l() {
        this.x = true;
    }

    @Override // com.daaw.a41
    public final void m(Format[] formatArr, d81 d81Var, long j) {
        s6.f(!this.x);
        this.t = d81Var;
        this.w = false;
        this.u = formatArr;
        this.v = j;
        F(formatArr, j);
    }

    @Override // com.daaw.a41
    public final b41 n() {
        return this;
    }

    public int p() {
        return 0;
    }

    @Override // com.daaw.fx0.b
    public void r(int i, Object obj) {
    }

    @Override // com.daaw.a41
    public final void s() {
        this.t.a();
    }

    @Override // com.daaw.a41
    public final void start() {
        s6.f(this.s == 1);
        this.s = 2;
        D();
    }

    @Override // com.daaw.a41
    public final void stop() {
        s6.f(this.s == 2);
        this.s = 1;
        E();
    }

    @Override // com.daaw.a41
    public final void t(long j) {
        this.x = false;
        this.w = false;
        C(j, false);
    }

    @Override // com.daaw.a41
    public final boolean u() {
        return this.x;
    }

    @Override // com.daaw.a41
    public ao0 v() {
        return null;
    }

    public final c41 w() {
        return this.q;
    }

    public final int x() {
        return this.r;
    }

    public final Format[] y() {
        return this.u;
    }

    public final boolean z() {
        return this.w ? this.x : this.t.d();
    }
}
