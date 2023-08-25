package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class bs8 implements nr8, mr8 {
    public final nr8 p;
    public final long q;
    public mr8 r;

    public bs8(nr8 nr8Var, long j) {
        this.p = nr8Var;
        this.q = j;
    }

    @Override // com.daaw.nt8
    public final /* bridge */ /* synthetic */ void a(vt8 vt8Var) {
        nr8 nr8Var = (nr8) vt8Var;
        mr8 mr8Var = this.r;
        Objects.requireNonNull(mr8Var);
        mr8Var.a(this);
    }

    @Override // com.daaw.nr8
    public final long b(long j) {
        return this.p.b(j - this.q) + this.q;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean c(long j) {
        return this.p.c(j - this.q);
    }

    @Override // com.daaw.mr8
    public final void d(nr8 nr8Var) {
        mr8 mr8Var = this.r;
        Objects.requireNonNull(mr8Var);
        mr8Var.d(this);
    }

    @Override // com.daaw.nr8
    public final void e(long j, boolean z) {
        this.p.e(j - this.q, false);
    }

    @Override // com.daaw.nr8
    public final void g(mr8 mr8Var, long j) {
        this.r = mr8Var;
        this.p.g(this, j - this.q);
    }

    @Override // com.daaw.nr8
    public final long h(long j, aa8 aa8Var) {
        return this.p.h(j - this.q, aa8Var) + this.q;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final void j(long j) {
        this.p.j(j - this.q);
    }

    @Override // com.daaw.nr8
    public final long k(tv8[] tv8VarArr, boolean[] zArr, mt8[] mt8VarArr, boolean[] zArr2, long j) {
        mt8[] mt8VarArr2 = new mt8[mt8VarArr.length];
        int i = 0;
        while (true) {
            mt8 mt8Var = null;
            if (i >= mt8VarArr.length) {
                break;
            }
            cs8 cs8Var = (cs8) mt8VarArr[i];
            if (cs8Var != null) {
                mt8Var = cs8Var.c();
            }
            mt8VarArr2[i] = mt8Var;
            i++;
        }
        long k = this.p.k(tv8VarArr, zArr, mt8VarArr2, zArr2, j - this.q);
        for (int i2 = 0; i2 < mt8VarArr.length; i2++) {
            mt8 mt8Var2 = mt8VarArr2[i2];
            if (mt8Var2 == null) {
                mt8VarArr[i2] = null;
            } else {
                mt8 mt8Var3 = mt8VarArr[i2];
                if (mt8Var3 == null || ((cs8) mt8Var3).c() != mt8Var2) {
                    mt8VarArr[i2] = new cs8(mt8Var2, this.q);
                }
            }
        }
        return k + this.q;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzb() {
        long zzb = this.p.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.q;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzc() {
        long zzc = this.p.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.q;
    }

    @Override // com.daaw.nr8
    public final long zzd() {
        long zzd = this.p.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.q;
    }

    @Override // com.daaw.nr8
    public final au8 zzh() {
        return this.p.zzh();
    }

    @Override // com.daaw.nr8
    public final void zzk() {
        this.p.zzk();
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean zzp() {
        return this.p.zzp();
    }
}
