package com.daaw;
/* loaded from: classes.dex */
public final class st2 implements pt2 {
    public final iz2 a;
    public final int b;
    public final int c;
    public int d;
    public int e;

    public st2(mt2 mt2Var) {
        iz2 iz2Var = mt2Var.P0;
        this.a = iz2Var;
        iz2Var.v(12);
        this.c = iz2Var.i() & 255;
        this.b = iz2Var.i();
    }

    @Override // com.daaw.pt2
    public final int zza() {
        return this.b;
    }

    @Override // com.daaw.pt2
    public final int zzb() {
        int i = this.c;
        if (i == 8) {
            return this.a.g();
        }
        if (i == 16) {
            return this.a.j();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 == 0) {
            int g = this.a.g();
            this.e = g;
            return (g & 240) >> 4;
        }
        return this.e & 15;
    }

    @Override // com.daaw.pt2
    public final boolean zzc() {
        return false;
    }
}
