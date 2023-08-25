package com.daaw;
/* loaded from: classes.dex */
public final class jd2 implements mz8 {
    public final cr5 a;
    public final ik5 b = new ik5();
    public final int c;

    public jd2(int i, cr5 cr5Var, int i2) {
        this.c = i;
        this.a = cr5Var;
    }

    @Override // com.daaw.mz8
    public final lz8 a(k09 k09Var, long j) {
        int a;
        int a2;
        long j2;
        long zzf = k09Var.zzf();
        int min = (int) Math.min(112800L, k09Var.zzd() - zzf);
        this.b.c(min);
        ((rz8) k09Var).h(this.b.h(), 0, min, false);
        ik5 ik5Var = this.b;
        int l = ik5Var.l();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (ik5Var.i() >= 188 && (a2 = (a = vd2.a(ik5Var.h(), ik5Var.k(), l)) + 188) <= l) {
            long b = vd2.b(ik5Var, a, this.c);
            if (b != -9223372036854775807L) {
                long b2 = this.a.b(b);
                if (b2 > j) {
                    if (j5 == -9223372036854775807L) {
                        return lz8.d(b2, zzf);
                    }
                    j2 = zzf + j4;
                } else if (100000 + b2 > j) {
                    j2 = zzf + a;
                } else {
                    j4 = a;
                    j5 = b2;
                }
                return lz8.e(j2);
            }
            ik5Var.f(a2);
            j3 = a2;
        }
        return j5 != -9223372036854775807L ? lz8.f(j5, zzf + j3) : lz8.d;
    }

    @Override // com.daaw.mz8
    public final void zzb() {
        ik5 ik5Var = this.b;
        byte[] bArr = it5.f;
        int length = bArr.length;
        ik5Var.d(bArr, 0);
    }
}
