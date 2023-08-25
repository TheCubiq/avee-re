package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public abstract class nk7 implements i98, l98 {

    /* renamed from: A */
    public boolean f20202A;

    /* renamed from: p */
    public final int f20203p;

    /* renamed from: r */
    public x98 f20205r;

    /* renamed from: s */
    public int f20206s;

    /* renamed from: t */
    public lh8 f20207t;

    /* renamed from: u */
    public int f20208u;

    /* renamed from: v */
    public mt8 f20209v;

    /* renamed from: w */
    public f92[] f20210w;

    /* renamed from: x */
    public long f20211x;

    /* renamed from: z */
    public boolean f20213z;

    /* renamed from: q */
    public final a78 f20204q = new a78();

    /* renamed from: y */
    public long f20212y = Long.MIN_VALUE;

    public nk7(int i) {
        this.f20203p = i;
    }

    /* renamed from: A */
    public void mo9777A() {
    }

    /* renamed from: B */
    public void mo9775B() {
    }

    /* renamed from: C */
    public void mo9773C() {
    }

    /* renamed from: D */
    public abstract void mo15114D(f92[] f92VarArr, long j, long j2);

    @Override // com.daaw.i98
    /* renamed from: b */
    public final void mo15113b(long j) {
        m15103q(j, false);
    }

    @Override // com.daaw.i98
    /* renamed from: d */
    public final void mo15112d() {
        uo4.m7872f(this.f20208u == 2);
        this.f20208u = 1;
        mo9773C();
    }

    @Override // com.daaw.i98
    /* renamed from: e */
    public /* synthetic */ void mo9749e(float f, float f2) {
    }

    @Override // com.daaw.i98
    /* renamed from: f */
    public final void mo15111f(f92[] f92VarArr, mt8 mt8Var, long j, long j2) {
        uo4.m7872f(!this.f20213z);
        this.f20209v = mt8Var;
        if (this.f20212y == Long.MIN_VALUE) {
            this.f20212y = j;
        }
        this.f20210w = f92VarArr;
        this.f20211x = j2;
        mo15114D(f92VarArr, j, j2);
    }

    @Override // com.daaw.i98
    /* renamed from: g */
    public final boolean mo15110g() {
        return this.f20213z;
    }

    @Override // com.daaw.w88
    /* renamed from: h */
    public void mo6337h(int i, Object obj) {
    }

    @Override // com.daaw.i98
    /* renamed from: j */
    public final boolean mo15109j() {
        return this.f20212y == Long.MIN_VALUE;
    }

    @Override // com.daaw.i98
    /* renamed from: k */
    public final void mo15108k(int i, lh8 lh8Var) {
        this.f20206s = i;
        this.f20207t = lh8Var;
    }

    @Override // com.daaw.i98
    /* renamed from: m */
    public final int mo15107m() {
        return this.f20208u;
    }

    @Override // com.daaw.i98
    /* renamed from: n */
    public final void mo15106n(x98 x98Var, f92[] f92VarArr, mt8 mt8Var, long j, boolean z, boolean z2, long j2, long j3) {
        uo4.m7872f(this.f20208u == 0);
        this.f20205r = x98Var;
        this.f20208u = 1;
        mo9740y(z, z2);
        mo15111f(f92VarArr, mt8Var, j2, j3);
        m15103q(j, z);
    }

    /* renamed from: o */
    public final boolean m15105o() {
        if (mo15109j()) {
            return this.f20213z;
        }
        mt8 mt8Var = this.f20209v;
        Objects.requireNonNull(mt8Var);
        return mt8Var.zze();
    }

    /* renamed from: p */
    public final f92[] m15104p() {
        f92[] f92VarArr = this.f20210w;
        Objects.requireNonNull(f92VarArr);
        return f92VarArr;
    }

    /* renamed from: q */
    public final void m15103q(long j, boolean z) {
        this.f20213z = false;
        this.f20212y = j;
        mo9738z(j, z);
    }

    /* renamed from: r */
    public final int m15102r(a78 a78Var, ma7 ma7Var, int i) {
        mt8 mt8Var = this.f20209v;
        Objects.requireNonNull(mt8Var);
        int mo6811b = mt8Var.mo6811b(a78Var, ma7Var, i);
        if (mo6811b == -4) {
            if (ma7Var.m20159g()) {
                this.f20212y = Long.MIN_VALUE;
                return this.f20213z ? -4 : -3;
            }
            long j = ma7Var.f18730e + this.f20211x;
            ma7Var.f18730e = j;
            this.f20212y = Math.max(this.f20212y, j);
        } else if (mo6811b == -5) {
            f92 f92Var = a78Var.f2960a;
            Objects.requireNonNull(f92Var);
            long j2 = f92Var.f9279p;
            if (j2 != Long.MAX_VALUE) {
                b72 m22830b = f92Var.m22830b();
                m22830b.m26368w(j2 + this.f20211x);
                a78Var.f2960a = m22830b.m26366y();
                return -5;
            }
        }
        return mo6811b;
    }

    /* renamed from: s */
    public final vu7 m15101s(Throwable th, f92 f92Var, boolean z, int i) {
        int i2;
        if (f92Var != null && !this.f20202A) {
            this.f20202A = true;
            try {
                int mo17079c = mo17079c(f92Var) & 7;
                this.f20202A = false;
                i2 = mo17079c;
            } catch (vu7 unused) {
                this.f20202A = false;
            } catch (Throwable th2) {
                this.f20202A = false;
                throw th2;
            }
            return vu7.m6773b(th, mo9751a(), this.f20206s, f92Var, i2, z, i);
        }
        i2 = 4;
        return vu7.m6773b(th, mo9751a(), this.f20206s, f92Var, i2, z, i);
    }

    /* renamed from: t */
    public final int m15100t(long j) {
        mt8 mt8Var = this.f20209v;
        Objects.requireNonNull(mt8Var);
        return mt8Var.mo6812a(j - this.f20211x);
    }

    /* renamed from: u */
    public final a78 m15099u() {
        a78 a78Var = this.f20204q;
        a78Var.f2961b = null;
        a78Var.f2960a = null;
        return a78Var;
    }

    /* renamed from: v */
    public final x98 m15098v() {
        x98 x98Var = this.f20205r;
        Objects.requireNonNull(x98Var);
        return x98Var;
    }

    /* renamed from: w */
    public final lh8 m15097w() {
        lh8 lh8Var = this.f20207t;
        Objects.requireNonNull(lh8Var);
        return lh8Var;
    }

    /* renamed from: x */
    public abstract void mo9742x();

    /* renamed from: y */
    public void mo9740y(boolean z, boolean z2) {
    }

    /* renamed from: z */
    public abstract void mo9738z(long j, boolean z);

    @Override // com.daaw.i98
    public final void zzA() {
        uo4.m7872f(this.f20208u == 0);
        a78 a78Var = this.f20204q;
        a78Var.f2961b = null;
        a78Var.f2960a = null;
        mo9777A();
    }

    @Override // com.daaw.i98
    public final void zzC() {
        this.f20213z = true;
    }

    @Override // com.daaw.i98
    public final void zzE() {
        uo4.m7872f(this.f20208u == 1);
        this.f20208u = 2;
        mo9775B();
    }

    @Override // com.daaw.i98, com.daaw.l98
    public final int zzb() {
        return this.f20203p;
    }

    public int zze() {
        return 0;
    }

    @Override // com.daaw.i98
    public final long zzf() {
        return this.f20212y;
    }

    @Override // com.daaw.i98
    public g78 zzi() {
        return null;
    }

    @Override // com.daaw.i98
    public final l98 zzj() {
        return this;
    }

    @Override // com.daaw.i98
    public final mt8 zzm() {
        return this.f20209v;
    }

    @Override // com.daaw.i98
    public final void zzn() {
        uo4.m7872f(this.f20208u == 1);
        a78 a78Var = this.f20204q;
        a78Var.f2961b = null;
        a78Var.f2960a = null;
        this.f20208u = 0;
        this.f20209v = null;
        this.f20210w = null;
        this.f20213z = false;
        mo9742x();
    }

    @Override // com.daaw.i98
    public final void zzr() {
        mt8 mt8Var = this.f20209v;
        Objects.requireNonNull(mt8Var);
        mt8Var.zzd();
    }
}
