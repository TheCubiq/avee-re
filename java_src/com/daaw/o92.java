package com.daaw;
/* loaded from: classes.dex */
public final class o92 implements m92 {

    /* renamed from: a */
    public final int f21173a;

    /* renamed from: b */
    public final int f21174b;

    /* renamed from: c */
    public final ik5 f21175c;

    public o92(b92 b92Var, f92 f92Var) {
        ik5 ik5Var = b92Var.f4558b;
        this.f21175c = ik5Var;
        ik5Var.m19716f(12);
        int m19700v = ik5Var.m19700v();
        if ("audio/raw".equals(f92Var.f9275l)) {
            int m19407Y = it5.m19407Y(f92Var.f9258A, f92Var.f9288y);
            if (m19700v == 0 || m19700v % m19407Y != 0) {
                s95.m10493e("AtomParsers", "Audio sample size mismatch. stsd sample size: " + m19407Y + ", stsz sample size: " + m19700v);
                m19700v = m19407Y;
            }
        }
        this.f21173a = m19700v == 0 ? -1 : m19700v;
        this.f21174b = ik5Var.m19700v();
    }

    @Override // com.daaw.m92
    public final int zza() {
        return this.f21173a;
    }

    @Override // com.daaw.m92
    public final int zzb() {
        return this.f21174b;
    }

    @Override // com.daaw.m92
    public final int zzc() {
        int i = this.f21173a;
        return i == -1 ? this.f21175c.m19700v() : i;
    }
}
