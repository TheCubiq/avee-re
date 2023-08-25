package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
/* loaded from: classes.dex */
public abstract class ip2 implements gq2, hq2 {

    /* renamed from: a */
    public final int f13892a;

    /* renamed from: b */
    public iq2 f13893b;

    /* renamed from: c */
    public int f13894c;

    /* renamed from: d */
    public int f13895d;

    /* renamed from: e */
    public iw2 f13896e;

    /* renamed from: f */
    public long f13897f;

    /* renamed from: g */
    public boolean f13898g = true;

    /* renamed from: h */
    public boolean f13899h;

    public ip2(int i) {
        this.f13892a = i;
    }

    /* renamed from: c */
    public final boolean m19542c() {
        return this.f13898g ? this.f13899h : this.f13896e.zze();
    }

    @Override // com.daaw.gq2
    /* renamed from: e */
    public final void mo19541e() {
        az2.m26583e(this.f13895d == 1);
        this.f13895d = 2;
        mo9946t();
    }

    @Override // com.daaw.gq2
    /* renamed from: f */
    public final void mo19540f(int i) {
        this.f13894c = i;
    }

    @Override // com.daaw.gq2
    /* renamed from: g */
    public final void mo19539g(long j) {
        this.f13899h = false;
        this.f13898g = false;
        mo9947s(j, false);
    }

    @Override // com.daaw.gq2
    /* renamed from: i */
    public final void mo19538i(zzatd[] zzatdVarArr, iw2 iw2Var, long j) {
        az2.m26583e(!this.f13899h);
        this.f13896e = iw2Var;
        this.f13898g = false;
        this.f13897f = j;
        mo19533v(zzatdVarArr, j);
    }

    @Override // com.daaw.gq2
    /* renamed from: j */
    public final void mo19537j(iq2 iq2Var, zzatd[] zzatdVarArr, iw2 iw2Var, long j, boolean z, long j2) {
        az2.m26583e(this.f13895d == 0);
        this.f13893b = iq2Var;
        this.f13895d = 1;
        mo9948r(z);
        mo19538i(zzatdVarArr, iw2Var, j2);
        mo9947s(j, z);
    }

    /* renamed from: l */
    public final int m19536l() {
        return this.f13894c;
    }

    /* renamed from: m */
    public final int m19535m(cq2 cq2Var, bs2 bs2Var, boolean z) {
        int mo10877b = this.f13896e.mo10877b(cq2Var, bs2Var, z);
        if (mo10877b == -4) {
            if (bs2Var.m5833f()) {
                this.f13898g = true;
                return this.f13899h ? -4 : -3;
            }
            bs2Var.f5094d += this.f13897f;
        } else if (mo10877b == -5) {
            zzatd zzatdVar = cq2Var.f6080a;
            long j = zzatdVar.f36784L;
            if (j != Long.MAX_VALUE) {
                cq2Var.f6080a = new zzatd(zzatdVar.f36789p, zzatdVar.f36793t, zzatdVar.f36794u, zzatdVar.f36791r, zzatdVar.f36790q, zzatdVar.f36795v, zzatdVar.f36798y, zzatdVar.f36799z, zzatdVar.f36773A, zzatdVar.f36774B, zzatdVar.f36775C, zzatdVar.f36777E, zzatdVar.f36776D, zzatdVar.f36778F, zzatdVar.f36779G, zzatdVar.f36780H, zzatdVar.f36781I, zzatdVar.f36782J, zzatdVar.f36783K, zzatdVar.f36785M, zzatdVar.f36786N, zzatdVar.f36787O, j + this.f13897f, zzatdVar.f36796w, zzatdVar.f36797x, zzatdVar.f36792s);
                return -5;
            }
        }
        return mo10877b;
    }

    /* renamed from: p */
    public final iq2 m19534p() {
        return this.f13893b;
    }

    /* renamed from: q */
    public abstract void mo9949q();

    /* renamed from: r */
    public abstract void mo9948r(boolean z);

    /* renamed from: s */
    public abstract void mo9947s(long j, boolean z);

    /* renamed from: t */
    public abstract void mo9946t();

    /* renamed from: u */
    public abstract void mo9945u();

    /* renamed from: v */
    public void mo19533v(zzatd[] zzatdVarArr, long j) {
    }

    /* renamed from: w */
    public final void m19532w(long j) {
        this.f13896e.mo10878a(j - this.f13897f);
    }

    @Override // com.daaw.gq2
    public final boolean zzA() {
        return this.f13898g;
    }

    @Override // com.daaw.gq2
    public final boolean zzB() {
        return this.f13899h;
    }

    @Override // com.daaw.gq2
    public final int zzb() {
        return this.f13895d;
    }

    @Override // com.daaw.gq2, com.daaw.hq2
    public final int zzc() {
        return this.f13892a;
    }

    @Override // com.daaw.gq2
    public final hq2 zzf() {
        return this;
    }

    @Override // com.daaw.gq2
    public final iw2 zzh() {
        return this.f13896e;
    }

    @Override // com.daaw.gq2
    public ez2 zzi() {
        return null;
    }

    @Override // com.daaw.gq2
    public final void zzj() {
        az2.m26583e(this.f13895d == 1);
        this.f13895d = 0;
        this.f13896e = null;
        this.f13899h = false;
        mo9949q();
    }

    @Override // com.daaw.gq2
    public final void zzm() {
        this.f13896e.zzc();
    }

    @Override // com.daaw.gq2
    public final void zzv() {
        this.f13899h = true;
    }

    @Override // com.daaw.gq2
    public final void zzz() {
        az2.m26583e(this.f13895d == 2);
        this.f13895d = 1;
        mo9945u();
    }
}
