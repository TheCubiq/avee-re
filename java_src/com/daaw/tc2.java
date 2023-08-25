package com.daaw;
/* loaded from: classes.dex */
public final class tc2 implements mz8 {
    public final cr5 a;
    public final ik5 b = new ik5();

    public /* synthetic */ tc2(cr5 cr5Var, sc2 sc2Var) {
        this.a = cr5Var;
    }

    @Override // com.daaw.mz8
    public final lz8 a(k09 k09Var, long j) {
        int h;
        long j2;
        long zzf = k09Var.zzf();
        int min = (int) Math.min(20000L, k09Var.zzd() - zzf);
        this.b.c(min);
        ((rz8) k09Var).h(this.b.h(), 0, min, false);
        ik5 ik5Var = this.b;
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (ik5Var.i() >= 4) {
            if (uc2.h(ik5Var.h(), ik5Var.k()) != 442) {
                ik5Var.g(1);
            } else {
                ik5Var.g(4);
                long c = vc2.c(ik5Var);
                if (c != -9223372036854775807L) {
                    long b = this.a.b(c);
                    if (b > j) {
                        if (j3 == -9223372036854775807L) {
                            return lz8.d(b, zzf);
                        }
                        j2 = i2;
                    } else if (100000 + b > j) {
                        j2 = ik5Var.k();
                    } else {
                        i2 = ik5Var.k();
                        j3 = b;
                    }
                    return lz8.e(zzf + j2);
                }
                int l = ik5Var.l();
                if (ik5Var.i() >= 10) {
                    ik5Var.g(9);
                    int s = ik5Var.s() & 7;
                    if (ik5Var.i() >= s) {
                        ik5Var.g(s);
                        if (ik5Var.i() >= 4) {
                            if (uc2.h(ik5Var.h(), ik5Var.k()) == 443) {
                                ik5Var.g(4);
                                int w = ik5Var.w();
                                if (ik5Var.i() >= w) {
                                    ik5Var.g(w);
                                }
                            }
                            while (ik5Var.i() >= 4 && (h = uc2.h(ik5Var.h(), ik5Var.k())) != 442 && h != 441 && (h >>> 8) == 1) {
                                ik5Var.g(4);
                                if (ik5Var.i() >= 2) {
                                    ik5Var.f(Math.min(ik5Var.l(), ik5Var.k() + ik5Var.w()));
                                }
                            }
                            i = ik5Var.k();
                        }
                    }
                }
                ik5Var.f(l);
                i = ik5Var.k();
            }
        }
        return j3 != -9223372036854775807L ? lz8.f(j3, zzf + i) : lz8.d;
    }

    @Override // com.daaw.mz8
    public final void zzb() {
        ik5 ik5Var = this.b;
        byte[] bArr = it5.f;
        int length = bArr.length;
        ik5Var.d(bArr, 0);
    }
}
