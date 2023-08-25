package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public abstract class nk7 implements i98, l98 {
    public boolean A;
    public final int p;
    public x98 r;
    public int s;
    public lh8 t;
    public int u;
    public mt8 v;
    public f92[] w;
    public long x;
    public boolean z;
    public final a78 q = new a78();
    public long y = Long.MIN_VALUE;

    public nk7(int i) {
        this.p = i;
    }

    public void A() {
    }

    public void B() {
    }

    public void C() {
    }

    public abstract void D(f92[] f92VarArr, long j, long j2);

    @Override // com.daaw.i98
    public final void b(long j) {
        q(j, false);
    }

    @Override // com.daaw.i98
    public final void d() {
        uo4.f(this.u == 2);
        this.u = 1;
        C();
    }

    @Override // com.daaw.i98
    public /* synthetic */ void e(float f, float f2) {
    }

    @Override // com.daaw.i98
    public final void f(f92[] f92VarArr, mt8 mt8Var, long j, long j2) {
        uo4.f(!this.z);
        this.v = mt8Var;
        if (this.y == Long.MIN_VALUE) {
            this.y = j;
        }
        this.w = f92VarArr;
        this.x = j2;
        D(f92VarArr, j, j2);
    }

    @Override // com.daaw.i98
    public final boolean g() {
        return this.z;
    }

    @Override // com.daaw.w88
    public void h(int i, Object obj) {
    }

    @Override // com.daaw.i98
    public final boolean j() {
        return this.y == Long.MIN_VALUE;
    }

    @Override // com.daaw.i98
    public final void k(int i, lh8 lh8Var) {
        this.s = i;
        this.t = lh8Var;
    }

    @Override // com.daaw.i98
    public final int m() {
        return this.u;
    }

    @Override // com.daaw.i98
    public final void n(x98 x98Var, f92[] f92VarArr, mt8 mt8Var, long j, boolean z, boolean z2, long j2, long j3) {
        uo4.f(this.u == 0);
        this.r = x98Var;
        this.u = 1;
        y(z, z2);
        f(f92VarArr, mt8Var, j2, j3);
        q(j, z);
    }

    public final boolean o() {
        if (j()) {
            return this.z;
        }
        mt8 mt8Var = this.v;
        Objects.requireNonNull(mt8Var);
        return mt8Var.zze();
    }

    public final f92[] p() {
        f92[] f92VarArr = this.w;
        Objects.requireNonNull(f92VarArr);
        return f92VarArr;
    }

    public final void q(long j, boolean z) {
        this.z = false;
        this.y = j;
        z(j, z);
    }

    public final int r(a78 a78Var, ma7 ma7Var, int i) {
        mt8 mt8Var = this.v;
        Objects.requireNonNull(mt8Var);
        int b = mt8Var.b(a78Var, ma7Var, i);
        if (b == -4) {
            if (ma7Var.g()) {
                this.y = Long.MIN_VALUE;
                return this.z ? -4 : -3;
            }
            long j = ma7Var.e + this.x;
            ma7Var.e = j;
            this.y = Math.max(this.y, j);
        } else if (b == -5) {
            f92 f92Var = a78Var.a;
            Objects.requireNonNull(f92Var);
            long j2 = f92Var.p;
            if (j2 != Long.MAX_VALUE) {
                b72 b2 = f92Var.b();
                b2.w(j2 + this.x);
                a78Var.a = b2.y();
                return -5;
            }
        }
        return b;
    }

    public final vu7 s(Throwable th, f92 f92Var, boolean z, int i) {
        int i2;
        if (f92Var != null && !this.A) {
            this.A = true;
            try {
                int c = c(f92Var) & 7;
                this.A = false;
                i2 = c;
            } catch (vu7 unused) {
                this.A = false;
            } catch (Throwable th2) {
                this.A = false;
                throw th2;
            }
            return vu7.b(th, a(), this.s, f92Var, i2, z, i);
        }
        i2 = 4;
        return vu7.b(th, a(), this.s, f92Var, i2, z, i);
    }

    public final int t(long j) {
        mt8 mt8Var = this.v;
        Objects.requireNonNull(mt8Var);
        return mt8Var.a(j - this.x);
    }

    public final a78 u() {
        a78 a78Var = this.q;
        a78Var.b = null;
        a78Var.a = null;
        return a78Var;
    }

    public final x98 v() {
        x98 x98Var = this.r;
        Objects.requireNonNull(x98Var);
        return x98Var;
    }

    public final lh8 w() {
        lh8 lh8Var = this.t;
        Objects.requireNonNull(lh8Var);
        return lh8Var;
    }

    public abstract void x();

    public void y(boolean z, boolean z2) {
    }

    public abstract void z(long j, boolean z);

    @Override // com.daaw.i98
    public final void zzA() {
        uo4.f(this.u == 0);
        a78 a78Var = this.q;
        a78Var.b = null;
        a78Var.a = null;
        A();
    }

    @Override // com.daaw.i98
    public final void zzC() {
        this.z = true;
    }

    @Override // com.daaw.i98
    public final void zzE() {
        uo4.f(this.u == 1);
        this.u = 2;
        B();
    }

    @Override // com.daaw.i98, com.daaw.l98
    public final int zzb() {
        return this.p;
    }

    public int zze() {
        return 0;
    }

    @Override // com.daaw.i98
    public final long zzf() {
        return this.y;
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
        return this.v;
    }

    @Override // com.daaw.i98
    public final void zzn() {
        uo4.f(this.u == 1);
        a78 a78Var = this.q;
        a78Var.b = null;
        a78Var.a = null;
        this.u = 0;
        this.v = null;
        this.w = null;
        this.z = false;
        x();
    }

    @Override // com.daaw.i98
    public final void zzr() {
        mt8 mt8Var = this.v;
        Objects.requireNonNull(mt8Var);
        mt8Var.zzd();
    }
}
