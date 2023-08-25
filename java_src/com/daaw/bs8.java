package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class bs8 implements nr8, mr8 {

    /* renamed from: p */
    public final nr8 f5163p;

    /* renamed from: q */
    public final long f5164q;

    /* renamed from: r */
    public mr8 f5165r;

    public bs8(nr8 nr8Var, long j) {
        this.f5163p = nr8Var;
        this.f5164q = j;
    }

    @Override // com.daaw.nt8
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8518a(vt8 vt8Var) {
        nr8 nr8Var = (nr8) vt8Var;
        mr8 mr8Var = this.f5165r;
        Objects.requireNonNull(mr8Var);
        mr8Var.mo8518a(this);
    }

    @Override // com.daaw.nr8
    /* renamed from: b */
    public final long mo3304b(long j) {
        return this.f5163p.mo3304b(j - this.f5164q) + this.f5164q;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    /* renamed from: c */
    public final boolean mo3303c(long j) {
        return this.f5163p.mo3303c(j - this.f5164q);
    }

    @Override // com.daaw.mr8
    /* renamed from: d */
    public final void mo8512d(nr8 nr8Var) {
        mr8 mr8Var = this.f5165r;
        Objects.requireNonNull(mr8Var);
        mr8Var.mo8512d(this);
    }

    @Override // com.daaw.nr8
    /* renamed from: e */
    public final void mo3301e(long j, boolean z) {
        this.f5163p.mo3301e(j - this.f5164q, false);
    }

    @Override // com.daaw.nr8
    /* renamed from: g */
    public final void mo3299g(mr8 mr8Var, long j) {
        this.f5165r = mr8Var;
        this.f5163p.mo3299g(this, j - this.f5164q);
    }

    @Override // com.daaw.nr8
    /* renamed from: h */
    public final long mo3298h(long j, aa8 aa8Var) {
        return this.f5163p.mo3298h(j - this.f5164q, aa8Var) + this.f5164q;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    /* renamed from: j */
    public final void mo3296j(long j) {
        this.f5163p.mo3296j(j - this.f5164q);
    }

    @Override // com.daaw.nr8
    /* renamed from: k */
    public final long mo3295k(tv8[] tv8VarArr, boolean[] zArr, mt8[] mt8VarArr, boolean[] zArr2, long j) {
        mt8[] mt8VarArr2 = new mt8[mt8VarArr.length];
        int i = 0;
        while (true) {
            mt8 mt8Var = null;
            if (i >= mt8VarArr.length) {
                break;
            }
            cs8 cs8Var = (cs8) mt8VarArr[i];
            if (cs8Var != null) {
                mt8Var = cs8Var.m24985c();
            }
            mt8VarArr2[i] = mt8Var;
            i++;
        }
        long mo3295k = this.f5163p.mo3295k(tv8VarArr, zArr, mt8VarArr2, zArr2, j - this.f5164q);
        for (int i2 = 0; i2 < mt8VarArr.length; i2++) {
            mt8 mt8Var2 = mt8VarArr2[i2];
            if (mt8Var2 == null) {
                mt8VarArr[i2] = null;
            } else {
                mt8 mt8Var3 = mt8VarArr[i2];
                if (mt8Var3 == null || ((cs8) mt8Var3).m24985c() != mt8Var2) {
                    mt8VarArr[i2] = new cs8(mt8Var2, this.f5164q);
                }
            }
        }
        return mo3295k + this.f5164q;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzb() {
        long zzb = this.f5163p.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.f5164q;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzc() {
        long zzc = this.f5163p.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.f5164q;
    }

    @Override // com.daaw.nr8
    public final long zzd() {
        long zzd = this.f5163p.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.f5164q;
    }

    @Override // com.daaw.nr8
    public final au8 zzh() {
        return this.f5163p.zzh();
    }

    @Override // com.daaw.nr8
    public final void zzk() {
        this.f5163p.zzk();
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean zzp() {
        return this.f5163p.zzp();
    }
}
