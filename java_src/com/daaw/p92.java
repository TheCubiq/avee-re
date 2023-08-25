package com.daaw;
/* loaded from: classes.dex */
public final class p92 implements m92 {

    /* renamed from: a */
    public final ik5 f22717a;

    /* renamed from: b */
    public final int f22718b;

    /* renamed from: c */
    public final int f22719c;

    /* renamed from: d */
    public int f22720d;

    /* renamed from: e */
    public int f22721e;

    public p92(b92 b92Var) {
        ik5 ik5Var = b92Var.f4558b;
        this.f22717a = ik5Var;
        ik5Var.m19716f(12);
        this.f22719c = ik5Var.m19700v() & 255;
        this.f22718b = ik5Var.m19700v();
    }

    @Override // com.daaw.m92
    public final int zza() {
        return -1;
    }

    @Override // com.daaw.m92
    public final int zzb() {
        return this.f22718b;
    }

    @Override // com.daaw.m92
    public final int zzc() {
        int i = this.f22719c;
        if (i == 8) {
            return this.f22717a.m19703s();
        }
        if (i == 16) {
            return this.f22717a.m19699w();
        }
        int i2 = this.f22720d;
        this.f22720d = i2 + 1;
        if (i2 % 2 == 0) {
            int m19703s = this.f22717a.m19703s();
            this.f22721e = m19703s;
            return (m19703s & 240) >> 4;
        }
        return this.f22721e & 15;
    }
}
