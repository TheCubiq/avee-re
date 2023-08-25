package com.daaw;
/* loaded from: classes.dex */
public final class rt2 implements pt2 {

    /* renamed from: a */
    public final int f25586a;

    /* renamed from: b */
    public final int f25587b;

    /* renamed from: c */
    public final iz2 f25588c;

    public rt2(mt2 mt2Var) {
        iz2 iz2Var = mt2Var.f19141P0;
        this.f25588c = iz2Var;
        iz2Var.m19225v(12);
        this.f25586a = iz2Var.m19238i();
        this.f25587b = iz2Var.m19238i();
    }

    @Override // com.daaw.pt2
    public final int zza() {
        return this.f25587b;
    }

    @Override // com.daaw.pt2
    public final int zzb() {
        int i = this.f25586a;
        return i == 0 ? this.f25588c.m19238i() : i;
    }

    @Override // com.daaw.pt2
    public final boolean zzc() {
        return this.f25586a != 0;
    }
}
