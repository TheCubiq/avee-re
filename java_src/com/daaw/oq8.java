package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class oq8 implements nr8, mr8 {

    /* renamed from: p */
    public final nr8 f21840p;

    /* renamed from: q */
    public mr8 f21841q;

    /* renamed from: r */
    public nq8[] f21842r = new nq8[0];

    /* renamed from: s */
    public long f21843s = 0;

    /* renamed from: t */
    public long f21844t;

    public oq8(nr8 nr8Var, boolean z, long j, long j2) {
        this.f21840p = nr8Var;
        this.f21844t = j2;
    }

    @Override // com.daaw.nt8
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8518a(vt8 vt8Var) {
        nr8 nr8Var = (nr8) vt8Var;
        mr8 mr8Var = this.f21841q;
        Objects.requireNonNull(mr8Var);
        mr8Var.mo8518a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r0 > r8) goto L18;
     */
    @Override // com.daaw.nr8
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo3304b(long j) {
        nq8[] nq8VarArr;
        this.f21843s = -9223372036854775807L;
        boolean z = false;
        for (nq8 nq8Var : this.f21842r) {
            if (nq8Var != null) {
                nq8Var.m14871c();
            }
        }
        long mo3304b = this.f21840p.mo3304b(j);
        if (mo3304b != j) {
            if (mo3304b >= 0) {
                long j2 = this.f21844t;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            uo4.m7872f(z);
            return mo3304b;
        }
        z = true;
        uo4.m7872f(z);
        return mo3304b;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    /* renamed from: c */
    public final boolean mo3303c(long j) {
        return this.f21840p.mo3303c(j);
    }

    @Override // com.daaw.mr8
    /* renamed from: d */
    public final void mo8512d(nr8 nr8Var) {
        mr8 mr8Var = this.f21841q;
        Objects.requireNonNull(mr8Var);
        mr8Var.mo8512d(this);
    }

    @Override // com.daaw.nr8
    /* renamed from: e */
    public final void mo3301e(long j, boolean z) {
        this.f21840p.mo3301e(j, false);
    }

    /* renamed from: f */
    public final void m14066f(long j, long j2) {
        this.f21844t = j2;
    }

    @Override // com.daaw.nr8
    /* renamed from: g */
    public final void mo3299g(mr8 mr8Var, long j) {
        this.f21841q = mr8Var;
        this.f21840p.mo3299g(this, j);
    }

    @Override // com.daaw.nr8
    /* renamed from: h */
    public final long mo3298h(long j, aa8 aa8Var) {
        if (j != 0) {
            long m19402b0 = it5.m19402b0(aa8Var.f3028a, 0L, j);
            long j2 = aa8Var.f3029b;
            long j3 = this.f21844t;
            long m19402b02 = it5.m19402b0(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
            if (m19402b0 != aa8Var.f3028a || m19402b02 != aa8Var.f3029b) {
                aa8Var = new aa8(m19402b0, m19402b02);
            }
            return this.f21840p.mo3298h(j, aa8Var);
        }
        return 0L;
    }

    /* renamed from: i */
    public final boolean m14065i() {
        return this.f21843s != -9223372036854775807L;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    /* renamed from: j */
    public final void mo3296j(long j) {
        this.f21840p.mo3296j(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r4 > r7) goto L24;
     */
    @Override // com.daaw.nr8
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo3295k(tv8[] tv8VarArr, boolean[] zArr, mt8[] mt8VarArr, boolean[] zArr2, long j) {
        int length = mt8VarArr.length;
        this.f21842r = new nq8[length];
        mt8[] mt8VarArr2 = new mt8[length];
        int i = 0;
        while (true) {
            mt8 mt8Var = null;
            if (i >= mt8VarArr.length) {
                break;
            }
            nq8[] nq8VarArr = this.f21842r;
            nq8 nq8Var = (nq8) mt8VarArr[i];
            nq8VarArr[i] = nq8Var;
            if (nq8Var != null) {
                mt8Var = nq8Var.f20580a;
            }
            mt8VarArr2[i] = mt8Var;
            i++;
        }
        long mo3295k = this.f21840p.mo3295k(tv8VarArr, zArr, mt8VarArr2, zArr2, j);
        long j2 = (m14065i() && j == 0) ? 0L : j;
        this.f21843s = -9223372036854775807L;
        boolean z = true;
        if (mo3295k != j2) {
            if (mo3295k >= 0) {
                long j3 = this.f21844t;
                if (j3 != Long.MIN_VALUE) {
                }
            }
            z = false;
        }
        uo4.m7872f(z);
        for (int i2 = 0; i2 < mt8VarArr.length; i2++) {
            mt8 mt8Var2 = mt8VarArr2[i2];
            if (mt8Var2 == null) {
                this.f21842r[i2] = null;
            } else {
                nq8[] nq8VarArr2 = this.f21842r;
                nq8 nq8Var2 = nq8VarArr2[i2];
                if (nq8Var2 == null || nq8Var2.f20580a != mt8Var2) {
                    nq8VarArr2[i2] = new nq8(this, mt8Var2);
                }
            }
            mt8VarArr[i2] = this.f21842r[i2];
        }
        return mo3295k;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzb() {
        long zzb = this.f21840p.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j = this.f21844t;
            if (j == Long.MIN_VALUE || zzb < j) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzc() {
        long zzc = this.f21840p.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j = this.f21844t;
            if (j == Long.MIN_VALUE || zzc < j) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.daaw.nr8
    public final long zzd() {
        if (m14065i()) {
            long j = this.f21843s;
            this.f21843s = -9223372036854775807L;
            long zzd = zzd();
            return zzd != -9223372036854775807L ? zzd : j;
        }
        long zzd2 = this.f21840p.zzd();
        if (zzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        uo4.m7872f(zzd2 >= 0);
        long j2 = this.f21844t;
        uo4.m7872f((j2 == Long.MIN_VALUE || zzd2 <= j2) ? true : true);
        return zzd2;
    }

    @Override // com.daaw.nr8
    public final au8 zzh() {
        return this.f21840p.zzh();
    }

    @Override // com.daaw.nr8
    public final void zzk() {
        this.f21840p.zzk();
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean zzp() {
        return this.f21840p.zzp();
    }
}
