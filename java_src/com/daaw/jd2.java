package com.daaw;
/* loaded from: classes.dex */
public final class jd2 implements mz8 {

    /* renamed from: a */
    public final cr5 f15002a;

    /* renamed from: b */
    public final ik5 f15003b = new ik5();

    /* renamed from: c */
    public final int f15004c;

    public jd2(int i, cr5 cr5Var, int i2) {
        this.f15004c = i;
        this.f15002a = cr5Var;
    }

    @Override // com.daaw.mz8
    /* renamed from: a */
    public final lz8 mo9320a(k09 k09Var, long j) {
        int m7244a;
        int m7244a2;
        long j2;
        long zzf = k09Var.zzf();
        int min = (int) Math.min(112800L, k09Var.zzd() - zzf);
        this.f15003b.m19719c(min);
        ((rz8) k09Var).mo5661h(this.f15003b.m19714h(), 0, min, false);
        ik5 ik5Var = this.f15003b;
        int m19710l = ik5Var.m19710l();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (ik5Var.m19713i() >= 188 && (m7244a2 = (m7244a = vd2.m7244a(ik5Var.m19714h(), ik5Var.m19711k(), m19710l)) + 188) <= m19710l) {
            long m7243b = vd2.m7243b(ik5Var, m7244a, this.f15004c);
            if (m7243b != -9223372036854775807L) {
                long m25056b = this.f15002a.m25056b(m7243b);
                if (m25056b > j) {
                    if (j5 == -9223372036854775807L) {
                        return lz8.m16348d(m25056b, zzf);
                    }
                    j2 = zzf + j4;
                } else if (100000 + m25056b > j) {
                    j2 = zzf + m7244a;
                } else {
                    j4 = m7244a;
                    j5 = m25056b;
                }
                return lz8.m16347e(j2);
            }
            ik5Var.m19716f(m7244a2);
            j3 = m7244a2;
        }
        return j5 != -9223372036854775807L ? lz8.m16346f(j5, zzf + j3) : lz8.f17930d;
    }

    @Override // com.daaw.mz8
    public final void zzb() {
        ik5 ik5Var = this.f15003b;
        byte[] bArr = it5.f13996f;
        int length = bArr.length;
        ik5Var.m19718d(bArr, 0);
    }
}
