package com.daaw;
/* loaded from: classes.dex */
public final class rt2 implements pt2 {
    public final int a;
    public final int b;
    public final iz2 c;

    public rt2(mt2 mt2Var) {
        iz2 iz2Var = mt2Var.P0;
        this.c = iz2Var;
        iz2Var.v(12);
        this.a = iz2Var.i();
        this.b = iz2Var.i();
    }

    @Override // com.daaw.pt2
    public final int zza() {
        return this.b;
    }

    @Override // com.daaw.pt2
    public final int zzb() {
        int i = this.a;
        return i == 0 ? this.c.i() : i;
    }

    @Override // com.daaw.pt2
    public final boolean zzc() {
        return this.a != 0;
    }
}
