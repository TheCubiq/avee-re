package com.daaw;

import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class br8 implements nr8, mr8 {
    public final pr8 p;
    public final long q;
    public rr8 r;
    public nr8 s;
    public mr8 t;
    public long u = -9223372036854775807L;
    public final nw8 v;

    public br8(pr8 pr8Var, nw8 nw8Var, long j, byte[] bArr) {
        this.p = pr8Var;
        this.v = nw8Var;
        this.q = j;
    }

    @Override // com.daaw.nt8
    public final /* bridge */ /* synthetic */ void a(vt8 vt8Var) {
        nr8 nr8Var = (nr8) vt8Var;
        mr8 mr8Var = this.t;
        int i = it5.a;
        mr8Var.a(this);
    }

    @Override // com.daaw.nr8
    public final long b(long j) {
        nr8 nr8Var = this.s;
        int i = it5.a;
        return nr8Var.b(j);
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean c(long j) {
        nr8 nr8Var = this.s;
        return nr8Var != null && nr8Var.c(j);
    }

    @Override // com.daaw.mr8
    public final void d(nr8 nr8Var) {
        mr8 mr8Var = this.t;
        int i = it5.a;
        mr8Var.d(this);
    }

    @Override // com.daaw.nr8
    public final void e(long j, boolean z) {
        nr8 nr8Var = this.s;
        int i = it5.a;
        nr8Var.e(j, false);
    }

    public final long f() {
        return this.u;
    }

    @Override // com.daaw.nr8
    public final void g(mr8 mr8Var, long j) {
        this.t = mr8Var;
        nr8 nr8Var = this.s;
        if (nr8Var != null) {
            nr8Var.g(this, p(this.q));
        }
    }

    @Override // com.daaw.nr8
    public final long h(long j, aa8 aa8Var) {
        nr8 nr8Var = this.s;
        int i = it5.a;
        return nr8Var.h(j, aa8Var);
    }

    public final long i() {
        return this.q;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final void j(long j) {
        nr8 nr8Var = this.s;
        int i = it5.a;
        nr8Var.j(j);
    }

    @Override // com.daaw.nr8
    public final long k(tv8[] tv8VarArr, boolean[] zArr, mt8[] mt8VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.u;
        if (j3 == -9223372036854775807L || j != this.q) {
            j2 = j;
        } else {
            this.u = -9223372036854775807L;
            j2 = j3;
        }
        nr8 nr8Var = this.s;
        int i = it5.a;
        return nr8Var.k(tv8VarArr, zArr, mt8VarArr, zArr2, j2);
    }

    public final void l(pr8 pr8Var) {
        long p = p(this.q);
        rr8 rr8Var = this.r;
        Objects.requireNonNull(rr8Var);
        nr8 k = rr8Var.k(pr8Var, this.v, p);
        this.s = k;
        if (this.t != null) {
            k.g(this, p);
        }
    }

    public final void m(long j) {
        this.u = j;
    }

    public final void n() {
        nr8 nr8Var = this.s;
        if (nr8Var != null) {
            rr8 rr8Var = this.r;
            Objects.requireNonNull(rr8Var);
            rr8Var.l(nr8Var);
        }
    }

    public final void o(rr8 rr8Var) {
        uo4.f(this.r == null);
        this.r = rr8Var;
    }

    public final long p(long j) {
        long j2 = this.u;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzb() {
        nr8 nr8Var = this.s;
        int i = it5.a;
        return nr8Var.zzb();
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzc() {
        nr8 nr8Var = this.s;
        int i = it5.a;
        return nr8Var.zzc();
    }

    @Override // com.daaw.nr8
    public final long zzd() {
        nr8 nr8Var = this.s;
        int i = it5.a;
        return nr8Var.zzd();
    }

    @Override // com.daaw.nr8
    public final au8 zzh() {
        nr8 nr8Var = this.s;
        int i = it5.a;
        return nr8Var.zzh();
    }

    @Override // com.daaw.nr8
    public final void zzk() {
        try {
            nr8 nr8Var = this.s;
            if (nr8Var != null) {
                nr8Var.zzk();
                return;
            }
            rr8 rr8Var = this.r;
            if (rr8Var != null) {
                rr8Var.e();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean zzp() {
        nr8 nr8Var = this.s;
        return nr8Var != null && nr8Var.zzp();
    }
}
