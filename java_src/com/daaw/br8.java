package com.daaw;

import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class br8 implements nr8, mr8 {

    /* renamed from: p */
    public final pr8 f5081p;

    /* renamed from: q */
    public final long f5082q;

    /* renamed from: r */
    public rr8 f5083r;

    /* renamed from: s */
    public nr8 f5084s;

    /* renamed from: t */
    public mr8 f5085t;

    /* renamed from: u */
    public long f5086u = -9223372036854775807L;

    /* renamed from: v */
    public final nw8 f5087v;

    public br8(pr8 pr8Var, nw8 nw8Var, long j, byte[] bArr) {
        this.f5081p = pr8Var;
        this.f5087v = nw8Var;
        this.f5082q = j;
    }

    @Override // com.daaw.nt8
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8518a(vt8 vt8Var) {
        nr8 nr8Var = (nr8) vt8Var;
        mr8 mr8Var = this.f5085t;
        int i = it5.f13991a;
        mr8Var.mo8518a(this);
    }

    @Override // com.daaw.nr8
    /* renamed from: b */
    public final long mo3304b(long j) {
        nr8 nr8Var = this.f5084s;
        int i = it5.f13991a;
        return nr8Var.mo3304b(j);
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    /* renamed from: c */
    public final boolean mo3303c(long j) {
        nr8 nr8Var = this.f5084s;
        return nr8Var != null && nr8Var.mo3303c(j);
    }

    @Override // com.daaw.mr8
    /* renamed from: d */
    public final void mo8512d(nr8 nr8Var) {
        mr8 mr8Var = this.f5085t;
        int i = it5.f13991a;
        mr8Var.mo8512d(this);
    }

    @Override // com.daaw.nr8
    /* renamed from: e */
    public final void mo3301e(long j, boolean z) {
        nr8 nr8Var = this.f5084s;
        int i = it5.f13991a;
        nr8Var.mo3301e(j, false);
    }

    /* renamed from: f */
    public final long m25871f() {
        return this.f5086u;
    }

    @Override // com.daaw.nr8
    /* renamed from: g */
    public final void mo3299g(mr8 mr8Var, long j) {
        this.f5085t = mr8Var;
        nr8 nr8Var = this.f5084s;
        if (nr8Var != null) {
            nr8Var.mo3299g(this, m25865p(this.f5082q));
        }
    }

    @Override // com.daaw.nr8
    /* renamed from: h */
    public final long mo3298h(long j, aa8 aa8Var) {
        nr8 nr8Var = this.f5084s;
        int i = it5.f13991a;
        return nr8Var.mo3298h(j, aa8Var);
    }

    /* renamed from: i */
    public final long m25870i() {
        return this.f5082q;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    /* renamed from: j */
    public final void mo3296j(long j) {
        nr8 nr8Var = this.f5084s;
        int i = it5.f13991a;
        nr8Var.mo3296j(j);
    }

    @Override // com.daaw.nr8
    /* renamed from: k */
    public final long mo3295k(tv8[] tv8VarArr, boolean[] zArr, mt8[] mt8VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f5086u;
        if (j3 == -9223372036854775807L || j != this.f5082q) {
            j2 = j;
        } else {
            this.f5086u = -9223372036854775807L;
            j2 = j3;
        }
        nr8 nr8Var = this.f5084s;
        int i = it5.f13991a;
        return nr8Var.mo3295k(tv8VarArr, zArr, mt8VarArr, zArr2, j2);
    }

    /* renamed from: l */
    public final void m25869l(pr8 pr8Var) {
        long m25865p = m25865p(this.f5082q);
        rr8 rr8Var = this.f5083r;
        Objects.requireNonNull(rr8Var);
        nr8 mo11000k = rr8Var.mo11000k(pr8Var, this.f5087v, m25865p);
        this.f5084s = mo11000k;
        if (this.f5085t != null) {
            mo11000k.mo3299g(this, m25865p);
        }
    }

    /* renamed from: m */
    public final void m25868m(long j) {
        this.f5086u = j;
    }

    /* renamed from: n */
    public final void m25867n() {
        nr8 nr8Var = this.f5084s;
        if (nr8Var != null) {
            rr8 rr8Var = this.f5083r;
            Objects.requireNonNull(rr8Var);
            rr8Var.mo10999l(nr8Var);
        }
    }

    /* renamed from: o */
    public final void m25866o(rr8 rr8Var) {
        uo4.m7872f(this.f5083r == null);
        this.f5083r = rr8Var;
    }

    /* renamed from: p */
    public final long m25865p(long j) {
        long j2 = this.f5086u;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzb() {
        nr8 nr8Var = this.f5084s;
        int i = it5.f13991a;
        return nr8Var.zzb();
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzc() {
        nr8 nr8Var = this.f5084s;
        int i = it5.f13991a;
        return nr8Var.zzc();
    }

    @Override // com.daaw.nr8
    public final long zzd() {
        nr8 nr8Var = this.f5084s;
        int i = it5.f13991a;
        return nr8Var.zzd();
    }

    @Override // com.daaw.nr8
    public final au8 zzh() {
        nr8 nr8Var = this.f5084s;
        int i = it5.f13991a;
        return nr8Var.zzh();
    }

    @Override // com.daaw.nr8
    public final void zzk() {
        try {
            nr8 nr8Var = this.f5084s;
            if (nr8Var != null) {
                nr8Var.zzk();
                return;
            }
            rr8 rr8Var = this.f5083r;
            if (rr8Var != null) {
                rr8Var.mo9983e();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean zzp() {
        nr8 nr8Var = this.f5084s;
        return nr8Var != null && nr8Var.zzp();
    }
}
