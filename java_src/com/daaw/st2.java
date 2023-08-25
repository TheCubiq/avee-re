package com.daaw;
/* loaded from: classes.dex */
public final class st2 implements pt2 {

    /* renamed from: a */
    public final iz2 f26633a;

    /* renamed from: b */
    public final int f26634b;

    /* renamed from: c */
    public final int f26635c;

    /* renamed from: d */
    public int f26636d;

    /* renamed from: e */
    public int f26637e;

    public st2(mt2 mt2Var) {
        iz2 iz2Var = mt2Var.f19141P0;
        this.f26633a = iz2Var;
        iz2Var.m19225v(12);
        this.f26635c = iz2Var.m19238i() & 255;
        this.f26634b = iz2Var.m19238i();
    }

    @Override // com.daaw.pt2
    public final int zza() {
        return this.f26634b;
    }

    @Override // com.daaw.pt2
    public final int zzb() {
        int i = this.f26635c;
        if (i == 8) {
            return this.f26633a.m19240g();
        }
        if (i == 16) {
            return this.f26633a.m19237j();
        }
        int i2 = this.f26636d;
        this.f26636d = i2 + 1;
        if (i2 % 2 == 0) {
            int m19240g = this.f26633a.m19240g();
            this.f26637e = m19240g;
            return (m19240g & 240) >> 4;
        }
        return this.f26637e & 15;
    }

    @Override // com.daaw.pt2
    public final boolean zzc() {
        return false;
    }
}
