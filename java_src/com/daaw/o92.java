package com.daaw;
/* loaded from: classes.dex */
public final class o92 implements m92 {
    public final int a;
    public final int b;
    public final ik5 c;

    public o92(b92 b92Var, f92 f92Var) {
        ik5 ik5Var = b92Var.b;
        this.c = ik5Var;
        ik5Var.f(12);
        int v = ik5Var.v();
        if ("audio/raw".equals(f92Var.l)) {
            int Y = it5.Y(f92Var.A, f92Var.y);
            if (v == 0 || v % Y != 0) {
                s95.e("AtomParsers", "Audio sample size mismatch. stsd sample size: " + Y + ", stsz sample size: " + v);
                v = Y;
            }
        }
        this.a = v == 0 ? -1 : v;
        this.b = ik5Var.v();
    }

    @Override // com.daaw.m92
    public final int zza() {
        return this.a;
    }

    @Override // com.daaw.m92
    public final int zzb() {
        return this.b;
    }

    @Override // com.daaw.m92
    public final int zzc() {
        int i = this.a;
        return i == -1 ? this.c.v() : i;
    }
}
