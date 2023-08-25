package com.daaw;
/* loaded from: classes.dex */
public final class ld2 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final cr5 a = new cr5(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final ik5 b = new ik5();

    public ld2(int i) {
    }

    public final int a(k09 k09Var, f42 f42Var, int i) {
        if (i <= 0) {
            e(k09Var);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.e) {
            long zzd = k09Var.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j2 = zzd - min;
            if (k09Var.zzf() != j2) {
                f42Var.a = j2;
                return 1;
            }
            this.b.c(min);
            k09Var.zzj();
            ((rz8) k09Var).h(this.b.h(), 0, min, false);
            ik5 ik5Var = this.b;
            int k = ik5Var.k();
            int l = ik5Var.l();
            int i2 = l - 188;
            while (true) {
                if (i2 < k) {
                    break;
                }
                byte[] h = ik5Var.h();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < k || i5 >= l || h[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long b = vd2.b(ik5Var, i2, i);
                            if (b != -9223372036854775807L) {
                                j = b;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.g = j;
            this.e = true;
            return 0;
        } else if (this.g == -9223372036854775807L) {
            e(k09Var);
            return 0;
        } else if (this.d) {
            long j3 = this.f;
            if (j3 == -9223372036854775807L) {
                e(k09Var);
                return 0;
            }
            long b2 = this.a.b(this.g) - this.a.b(j3);
            this.h = b2;
            if (b2 < 0) {
                s95.e("TsDurationReader", "Invalid duration: " + b2 + ". Using TIME_UNSET instead.");
                this.h = -9223372036854775807L;
            }
            e(k09Var);
            return 0;
        } else {
            int min2 = (int) Math.min(112800L, k09Var.zzd());
            if (k09Var.zzf() != 0) {
                f42Var.a = 0L;
                return 1;
            }
            this.b.c(min2);
            k09Var.zzj();
            ((rz8) k09Var).h(this.b.h(), 0, min2, false);
            ik5 ik5Var2 = this.b;
            int k2 = ik5Var2.k();
            int l2 = ik5Var2.l();
            while (true) {
                if (k2 >= l2) {
                    break;
                }
                if (ik5Var2.h()[k2] == 71) {
                    long b3 = vd2.b(ik5Var2, k2, i);
                    if (b3 != -9223372036854775807L) {
                        j = b3;
                        break;
                    }
                }
                k2++;
            }
            this.f = j;
            this.d = true;
            return 0;
        }
    }

    public final long b() {
        return this.h;
    }

    public final cr5 c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }

    public final int e(k09 k09Var) {
        ik5 ik5Var = this.b;
        byte[] bArr = it5.f;
        int length = bArr.length;
        ik5Var.d(bArr, 0);
        this.c = true;
        k09Var.zzj();
        return 0;
    }
}
