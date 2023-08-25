package com.daaw;

import android.util.Pair;
/* loaded from: classes.dex */
public final class ie2 {
    public static Pair a(k09 k09Var) {
        k09Var.zzj();
        de2 d = d(1684108385, k09Var, new ik5(8));
        ((rz8) k09Var).l(8, false);
        return Pair.create(Long.valueOf(k09Var.zzf()), Long.valueOf(d.b));
    }

    public static ce2 b(k09 k09Var) {
        byte[] bArr;
        ik5 ik5Var = new ik5(16);
        de2 d = d(1718449184, k09Var, ik5Var);
        uo4.f(d.b >= 16);
        rz8 rz8Var = (rz8) k09Var;
        rz8Var.h(ik5Var.h(), 0, 16, false);
        ik5Var.f(0);
        int q = ik5Var.q();
        int q2 = ik5Var.q();
        int p = ik5Var.p();
        int p2 = ik5Var.p();
        int q3 = ik5Var.q();
        int q4 = ik5Var.q();
        int i = ((int) d.b) - 16;
        if (i > 0) {
            bArr = new byte[i];
            rz8Var.h(bArr, 0, i, false);
        } else {
            bArr = it5.f;
        }
        byte[] bArr2 = bArr;
        ((rz8) k09Var).l((int) (k09Var.zze() - k09Var.zzf()), false);
        return new ce2(q, q2, p, p2, q3, q4, bArr2);
    }

    public static boolean c(k09 k09Var) {
        ik5 ik5Var = new ik5(8);
        int i = de2.a(k09Var, ik5Var).a;
        if (i == 1380533830 || i == 1380333108) {
            ((rz8) k09Var).h(ik5Var.h(), 0, 4, false);
            ik5Var.f(0);
            int m = ik5Var.m();
            if (m != 1463899717) {
                s95.b("WavHeaderReader", "Unsupported form type: " + m);
                return false;
            }
            return true;
        }
        return false;
    }

    public static de2 d(int i, k09 k09Var, ik5 ik5Var) {
        while (true) {
            de2 a = de2.a(k09Var, ik5Var);
            int i2 = a.a;
            if (i2 == i) {
                return a;
            }
            s95.e("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = a.b + 8;
            if (j > 2147483647L) {
                int i3 = a.a;
                throw dl3.c("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            ((rz8) k09Var).l((int) j, false);
        }
    }
}
