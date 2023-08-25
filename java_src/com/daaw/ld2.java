package com.daaw;
/* loaded from: classes.dex */
public final class ld2 {

    /* renamed from: c */
    public boolean f17273c;

    /* renamed from: d */
    public boolean f17274d;

    /* renamed from: e */
    public boolean f17275e;

    /* renamed from: a */
    public final cr5 f17271a = new cr5(0);

    /* renamed from: f */
    public long f17276f = -9223372036854775807L;

    /* renamed from: g */
    public long f17277g = -9223372036854775807L;

    /* renamed from: h */
    public long f17278h = -9223372036854775807L;

    /* renamed from: b */
    public final ik5 f17272b = new ik5();

    public ld2(int i) {
    }

    /* renamed from: a */
    public final int m17046a(k09 k09Var, f42 f42Var, int i) {
        if (i <= 0) {
            m17042e(k09Var);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.f17275e) {
            long zzd = k09Var.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j2 = zzd - min;
            if (k09Var.zzf() != j2) {
                f42Var.f9093a = j2;
                return 1;
            }
            this.f17272b.m19719c(min);
            k09Var.zzj();
            ((rz8) k09Var).mo5661h(this.f17272b.m19714h(), 0, min, false);
            ik5 ik5Var = this.f17272b;
            int m19711k = ik5Var.m19711k();
            int m19710l = ik5Var.m19710l();
            int i2 = m19710l - 188;
            while (true) {
                if (i2 < m19711k) {
                    break;
                }
                byte[] m19714h = ik5Var.m19714h();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < m19711k || i5 >= m19710l || m19714h[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long m7243b = vd2.m7243b(ik5Var, i2, i);
                            if (m7243b != -9223372036854775807L) {
                                j = m7243b;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.f17277g = j;
            this.f17275e = true;
            return 0;
        } else if (this.f17277g == -9223372036854775807L) {
            m17042e(k09Var);
            return 0;
        } else if (this.f17274d) {
            long j3 = this.f17276f;
            if (j3 == -9223372036854775807L) {
                m17042e(k09Var);
                return 0;
            }
            long m25056b = this.f17271a.m25056b(this.f17277g) - this.f17271a.m25056b(j3);
            this.f17278h = m25056b;
            if (m25056b < 0) {
                s95.m10493e("TsDurationReader", "Invalid duration: " + m25056b + ". Using TIME_UNSET instead.");
                this.f17278h = -9223372036854775807L;
            }
            m17042e(k09Var);
            return 0;
        } else {
            int min2 = (int) Math.min(112800L, k09Var.zzd());
            if (k09Var.zzf() != 0) {
                f42Var.f9093a = 0L;
                return 1;
            }
            this.f17272b.m19719c(min2);
            k09Var.zzj();
            ((rz8) k09Var).mo5661h(this.f17272b.m19714h(), 0, min2, false);
            ik5 ik5Var2 = this.f17272b;
            int m19711k2 = ik5Var2.m19711k();
            int m19710l2 = ik5Var2.m19710l();
            while (true) {
                if (m19711k2 >= m19710l2) {
                    break;
                }
                if (ik5Var2.m19714h()[m19711k2] == 71) {
                    long m7243b2 = vd2.m7243b(ik5Var2, m19711k2, i);
                    if (m7243b2 != -9223372036854775807L) {
                        j = m7243b2;
                        break;
                    }
                }
                m19711k2++;
            }
            this.f17276f = j;
            this.f17274d = true;
            return 0;
        }
    }

    /* renamed from: b */
    public final long m17045b() {
        return this.f17278h;
    }

    /* renamed from: c */
    public final cr5 m17044c() {
        return this.f17271a;
    }

    /* renamed from: d */
    public final boolean m17043d() {
        return this.f17273c;
    }

    /* renamed from: e */
    public final int m17042e(k09 k09Var) {
        ik5 ik5Var = this.f17272b;
        byte[] bArr = it5.f13996f;
        int length = bArr.length;
        ik5Var.m19718d(bArr, 0);
        this.f17273c = true;
        k09Var.zzj();
        return 0;
    }
}
