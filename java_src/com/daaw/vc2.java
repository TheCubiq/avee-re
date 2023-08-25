package com.daaw;
/* loaded from: classes.dex */
public final class vc2 {

    /* renamed from: c */
    public boolean f30127c;

    /* renamed from: d */
    public boolean f30128d;

    /* renamed from: e */
    public boolean f30129e;

    /* renamed from: a */
    public final cr5 f30125a = new cr5(0);

    /* renamed from: f */
    public long f30130f = -9223372036854775807L;

    /* renamed from: g */
    public long f30131g = -9223372036854775807L;

    /* renamed from: h */
    public long f30132h = -9223372036854775807L;

    /* renamed from: b */
    public final ik5 f30126b = new ik5();

    /* renamed from: c */
    public static long m7281c(ik5 ik5Var) {
        int m19711k = ik5Var.m19711k();
        if (ik5Var.m19713i() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ik5Var.m19720b(bArr, 0, 9);
        ik5Var.m19716f(m19711k);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            long j = bArr[0];
            byte b = bArr[1];
            long j2 = bArr[2];
            return ((bArr[3] & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((b & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((bArr[4] & 248) >> 3);
        }
        return -9223372036854775807L;
    }

    /* renamed from: g */
    public static final int m7277g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public final int m7283a(k09 k09Var, f42 f42Var) {
        long j = -9223372036854775807L;
        if (!this.f30129e) {
            long zzd = k09Var.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j2 = zzd - min;
            if (k09Var.zzf() != j2) {
                f42Var.f9093a = j2;
                return 1;
            }
            this.f30126b.m19719c(min);
            k09Var.zzj();
            ((rz8) k09Var).mo5661h(this.f30126b.m19714h(), 0, min, false);
            ik5 ik5Var = this.f30126b;
            int m19711k = ik5Var.m19711k();
            int m19710l = ik5Var.m19710l() - 4;
            while (true) {
                if (m19710l < m19711k) {
                    break;
                }
                if (m7277g(ik5Var.m19714h(), m19710l) == 442) {
                    ik5Var.m19716f(m19710l + 4);
                    long m7281c = m7281c(ik5Var);
                    if (m7281c != -9223372036854775807L) {
                        j = m7281c;
                        break;
                    }
                }
                m19710l--;
            }
            this.f30131g = j;
            this.f30129e = true;
            return 0;
        } else if (this.f30131g == -9223372036854775807L) {
            m7278f(k09Var);
            return 0;
        } else if (this.f30128d) {
            long j3 = this.f30130f;
            if (j3 == -9223372036854775807L) {
                m7278f(k09Var);
                return 0;
            }
            long m25056b = this.f30125a.m25056b(this.f30131g) - this.f30125a.m25056b(j3);
            this.f30132h = m25056b;
            if (m25056b < 0) {
                s95.m10493e("PsDurationReader", "Invalid duration: " + m25056b + ". Using TIME_UNSET instead.");
                this.f30132h = -9223372036854775807L;
            }
            m7278f(k09Var);
            return 0;
        } else {
            int min2 = (int) Math.min(20000L, k09Var.zzd());
            if (k09Var.zzf() != 0) {
                f42Var.f9093a = 0L;
                return 1;
            }
            this.f30126b.m19719c(min2);
            k09Var.zzj();
            ((rz8) k09Var).mo5661h(this.f30126b.m19714h(), 0, min2, false);
            ik5 ik5Var2 = this.f30126b;
            int m19711k2 = ik5Var2.m19711k();
            int m19710l2 = ik5Var2.m19710l();
            while (true) {
                if (m19711k2 >= m19710l2 - 3) {
                    break;
                }
                if (m7277g(ik5Var2.m19714h(), m19711k2) == 442) {
                    ik5Var2.m19716f(m19711k2 + 4);
                    long m7281c2 = m7281c(ik5Var2);
                    if (m7281c2 != -9223372036854775807L) {
                        j = m7281c2;
                        break;
                    }
                }
                m19711k2++;
            }
            this.f30130f = j;
            this.f30128d = true;
            return 0;
        }
    }

    /* renamed from: b */
    public final long m7282b() {
        return this.f30132h;
    }

    /* renamed from: d */
    public final cr5 m7280d() {
        return this.f30125a;
    }

    /* renamed from: e */
    public final boolean m7279e() {
        return this.f30127c;
    }

    /* renamed from: f */
    public final int m7278f(k09 k09Var) {
        ik5 ik5Var = this.f30126b;
        byte[] bArr = it5.f13996f;
        int length = bArr.length;
        ik5Var.m19718d(bArr, 0);
        this.f30127c = true;
        k09Var.zzj();
        return 0;
    }
}
