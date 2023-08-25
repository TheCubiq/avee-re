package com.daaw;
/* loaded from: classes.dex */
public final class vc2 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final cr5 a = new cr5(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final ik5 b = new ik5();

    public static long c(ik5 ik5Var) {
        int k = ik5Var.k();
        if (ik5Var.i() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ik5Var.b(bArr, 0, 9);
        ik5Var.f(k);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            long j = bArr[0];
            byte b = bArr[1];
            long j2 = bArr[2];
            return ((bArr[3] & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((b & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((bArr[4] & 248) >> 3);
        }
        return -9223372036854775807L;
    }

    public static final int g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int a(k09 k09Var, f42 f42Var) {
        long j = -9223372036854775807L;
        if (!this.e) {
            long zzd = k09Var.zzd();
            int min = (int) Math.min(20000L, zzd);
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
            int l = ik5Var.l() - 4;
            while (true) {
                if (l < k) {
                    break;
                }
                if (g(ik5Var.h(), l) == 442) {
                    ik5Var.f(l + 4);
                    long c = c(ik5Var);
                    if (c != -9223372036854775807L) {
                        j = c;
                        break;
                    }
                }
                l--;
            }
            this.g = j;
            this.e = true;
            return 0;
        } else if (this.g == -9223372036854775807L) {
            f(k09Var);
            return 0;
        } else if (this.d) {
            long j3 = this.f;
            if (j3 == -9223372036854775807L) {
                f(k09Var);
                return 0;
            }
            long b = this.a.b(this.g) - this.a.b(j3);
            this.h = b;
            if (b < 0) {
                s95.e("PsDurationReader", "Invalid duration: " + b + ". Using TIME_UNSET instead.");
                this.h = -9223372036854775807L;
            }
            f(k09Var);
            return 0;
        } else {
            int min2 = (int) Math.min(20000L, k09Var.zzd());
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
                if (k2 >= l2 - 3) {
                    break;
                }
                if (g(ik5Var2.h(), k2) == 442) {
                    ik5Var2.f(k2 + 4);
                    long c2 = c(ik5Var2);
                    if (c2 != -9223372036854775807L) {
                        j = c2;
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

    public final cr5 d() {
        return this.a;
    }

    public final boolean e() {
        return this.c;
    }

    public final int f(k09 k09Var) {
        ik5 ik5Var = this.b;
        byte[] bArr = it5.f;
        int length = bArr.length;
        ik5Var.d(bArr, 0);
        this.c = true;
        k09Var.zzj();
        return 0;
    }
}
