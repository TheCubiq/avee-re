package com.daaw;
/* loaded from: classes.dex */
public final class tc2 implements mz8 {

    /* renamed from: a */
    public final cr5 f27372a;

    /* renamed from: b */
    public final ik5 f27373b = new ik5();

    public /* synthetic */ tc2(cr5 cr5Var, sc2 sc2Var) {
        this.f27372a = cr5Var;
    }

    @Override // com.daaw.mz8
    /* renamed from: a */
    public final lz8 mo9320a(k09 k09Var, long j) {
        int m8321h;
        long j2;
        long zzf = k09Var.zzf();
        int min = (int) Math.min(20000L, k09Var.zzd() - zzf);
        this.f27373b.m19719c(min);
        ((rz8) k09Var).mo5661h(this.f27373b.m19714h(), 0, min, false);
        ik5 ik5Var = this.f27373b;
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (ik5Var.m19713i() >= 4) {
            if (uc2.m8321h(ik5Var.m19714h(), ik5Var.m19711k()) != 442) {
                ik5Var.m19715g(1);
            } else {
                ik5Var.m19715g(4);
                long m7281c = vc2.m7281c(ik5Var);
                if (m7281c != -9223372036854775807L) {
                    long m25056b = this.f27372a.m25056b(m7281c);
                    if (m25056b > j) {
                        if (j3 == -9223372036854775807L) {
                            return lz8.m16348d(m25056b, zzf);
                        }
                        j2 = i2;
                    } else if (100000 + m25056b > j) {
                        j2 = ik5Var.m19711k();
                    } else {
                        i2 = ik5Var.m19711k();
                        j3 = m25056b;
                    }
                    return lz8.m16347e(zzf + j2);
                }
                int m19710l = ik5Var.m19710l();
                if (ik5Var.m19713i() >= 10) {
                    ik5Var.m19715g(9);
                    int m19703s = ik5Var.m19703s() & 7;
                    if (ik5Var.m19713i() >= m19703s) {
                        ik5Var.m19715g(m19703s);
                        if (ik5Var.m19713i() >= 4) {
                            if (uc2.m8321h(ik5Var.m19714h(), ik5Var.m19711k()) == 443) {
                                ik5Var.m19715g(4);
                                int m19699w = ik5Var.m19699w();
                                if (ik5Var.m19713i() >= m19699w) {
                                    ik5Var.m19715g(m19699w);
                                }
                            }
                            while (ik5Var.m19713i() >= 4 && (m8321h = uc2.m8321h(ik5Var.m19714h(), ik5Var.m19711k())) != 442 && m8321h != 441 && (m8321h >>> 8) == 1) {
                                ik5Var.m19715g(4);
                                if (ik5Var.m19713i() >= 2) {
                                    ik5Var.m19716f(Math.min(ik5Var.m19710l(), ik5Var.m19711k() + ik5Var.m19699w()));
                                }
                            }
                            i = ik5Var.m19711k();
                        }
                    }
                }
                ik5Var.m19716f(m19710l);
                i = ik5Var.m19711k();
            }
        }
        return j3 != -9223372036854775807L ? lz8.m16346f(j3, zzf + i) : lz8.f17930d;
    }

    @Override // com.daaw.mz8
    public final void zzb() {
        ik5 ik5Var = this.f27373b;
        byte[] bArr = it5.f13996f;
        int length = bArr.length;
        ik5Var.m19718d(bArr, 0);
    }
}
