package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
/* loaded from: classes.dex */
public abstract class ip2 implements gq2, hq2 {
    public final int a;
    public iq2 b;
    public int c;
    public int d;
    public iw2 e;
    public long f;
    public boolean g = true;
    public boolean h;

    public ip2(int i) {
        this.a = i;
    }

    public final boolean c() {
        return this.g ? this.h : this.e.zze();
    }

    @Override // com.daaw.gq2
    public final void e() {
        az2.e(this.d == 1);
        this.d = 2;
        t();
    }

    @Override // com.daaw.gq2
    public final void f(int i) {
        this.c = i;
    }

    @Override // com.daaw.gq2
    public final void g(long j) {
        this.h = false;
        this.g = false;
        s(j, false);
    }

    @Override // com.daaw.gq2
    public final void i(zzatd[] zzatdVarArr, iw2 iw2Var, long j) {
        az2.e(!this.h);
        this.e = iw2Var;
        this.g = false;
        this.f = j;
        v(zzatdVarArr, j);
    }

    @Override // com.daaw.gq2
    public final void j(iq2 iq2Var, zzatd[] zzatdVarArr, iw2 iw2Var, long j, boolean z, long j2) {
        az2.e(this.d == 0);
        this.b = iq2Var;
        this.d = 1;
        r(z);
        i(zzatdVarArr, iw2Var, j2);
        s(j, z);
    }

    public final int l() {
        return this.c;
    }

    public final int m(cq2 cq2Var, bs2 bs2Var, boolean z) {
        int b = this.e.b(cq2Var, bs2Var, z);
        if (b == -4) {
            if (bs2Var.f()) {
                this.g = true;
                return this.h ? -4 : -3;
            }
            bs2Var.d += this.f;
        } else if (b == -5) {
            zzatd zzatdVar = cq2Var.a;
            long j = zzatdVar.L;
            if (j != Long.MAX_VALUE) {
                cq2Var.a = new zzatd(zzatdVar.p, zzatdVar.t, zzatdVar.u, zzatdVar.r, zzatdVar.q, zzatdVar.v, zzatdVar.y, zzatdVar.z, zzatdVar.A, zzatdVar.B, zzatdVar.C, zzatdVar.E, zzatdVar.D, zzatdVar.F, zzatdVar.G, zzatdVar.H, zzatdVar.I, zzatdVar.J, zzatdVar.K, zzatdVar.M, zzatdVar.N, zzatdVar.O, j + this.f, zzatdVar.w, zzatdVar.x, zzatdVar.s);
                return -5;
            }
        }
        return b;
    }

    public final iq2 p() {
        return this.b;
    }

    public abstract void q();

    public abstract void r(boolean z);

    public abstract void s(long j, boolean z);

    public abstract void t();

    public abstract void u();

    public void v(zzatd[] zzatdVarArr, long j) {
    }

    public final void w(long j) {
        this.e.a(j - this.f);
    }

    @Override // com.daaw.gq2
    public final boolean zzA() {
        return this.g;
    }

    @Override // com.daaw.gq2
    public final boolean zzB() {
        return this.h;
    }

    @Override // com.daaw.gq2
    public final int zzb() {
        return this.d;
    }

    @Override // com.daaw.gq2, com.daaw.hq2
    public final int zzc() {
        return this.a;
    }

    @Override // com.daaw.gq2
    public final hq2 zzf() {
        return this;
    }

    @Override // com.daaw.gq2
    public final iw2 zzh() {
        return this.e;
    }

    @Override // com.daaw.gq2
    public ez2 zzi() {
        return null;
    }

    @Override // com.daaw.gq2
    public final void zzj() {
        az2.e(this.d == 1);
        this.d = 0;
        this.e = null;
        this.h = false;
        q();
    }

    @Override // com.daaw.gq2
    public final void zzm() {
        this.e.zzc();
    }

    @Override // com.daaw.gq2
    public final void zzv() {
        this.h = true;
    }

    @Override // com.daaw.gq2
    public final void zzz() {
        az2.e(this.d == 2);
        this.d = 1;
        u();
    }
}
