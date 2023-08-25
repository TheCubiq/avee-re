package com.daaw;
/* loaded from: classes.dex */
public final class p92 implements m92 {
    public final ik5 a;
    public final int b;
    public final int c;
    public int d;
    public int e;

    public p92(b92 b92Var) {
        ik5 ik5Var = b92Var.b;
        this.a = ik5Var;
        ik5Var.f(12);
        this.c = ik5Var.v() & 255;
        this.b = ik5Var.v();
    }

    @Override // com.daaw.m92
    public final int zza() {
        return -1;
    }

    @Override // com.daaw.m92
    public final int zzb() {
        return this.b;
    }

    @Override // com.daaw.m92
    public final int zzc() {
        int i = this.c;
        if (i == 8) {
            return this.a.s();
        }
        if (i == 16) {
            return this.a.w();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 == 0) {
            int s = this.a.s();
            this.e = s;
            return (s & 240) >> 4;
        }
        return this.e & 15;
    }
}
