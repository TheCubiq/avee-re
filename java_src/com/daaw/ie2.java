package com.daaw;

import android.util.Pair;
/* loaded from: classes.dex */
public final class ie2 {
    /* renamed from: a */
    public static Pair m19885a(k09 k09Var) {
        k09Var.zzj();
        de2 m19882d = m19882d(1684108385, k09Var, new ik5(8));
        ((rz8) k09Var).m10811l(8, false);
        return Pair.create(Long.valueOf(k09Var.zzf()), Long.valueOf(m19882d.f6992b));
    }

    /* renamed from: b */
    public static ce2 m19884b(k09 k09Var) {
        byte[] bArr;
        ik5 ik5Var = new ik5(16);
        de2 m19882d = m19882d(1718449184, k09Var, ik5Var);
        uo4.m7872f(m19882d.f6992b >= 16);
        rz8 rz8Var = (rz8) k09Var;
        rz8Var.mo5661h(ik5Var.m19714h(), 0, 16, false);
        ik5Var.m19716f(0);
        int m19705q = ik5Var.m19705q();
        int m19705q2 = ik5Var.m19705q();
        int m19706p = ik5Var.m19706p();
        int m19706p2 = ik5Var.m19706p();
        int m19705q3 = ik5Var.m19705q();
        int m19705q4 = ik5Var.m19705q();
        int i = ((int) m19882d.f6992b) - 16;
        if (i > 0) {
            bArr = new byte[i];
            rz8Var.mo5661h(bArr, 0, i, false);
        } else {
            bArr = it5.f13996f;
        }
        byte[] bArr2 = bArr;
        ((rz8) k09Var).m10811l((int) (k09Var.zze() - k09Var.zzf()), false);
        return new ce2(m19705q, m19705q2, m19706p, m19706p2, m19705q3, m19705q4, bArr2);
    }

    /* renamed from: c */
    public static boolean m19883c(k09 k09Var) {
        ik5 ik5Var = new ik5(8);
        int i = de2.m24444a(k09Var, ik5Var).f6991a;
        if (i == 1380533830 || i == 1380333108) {
            ((rz8) k09Var).mo5661h(ik5Var.m19714h(), 0, 4, false);
            ik5Var.m19716f(0);
            int m19709m = ik5Var.m19709m();
            if (m19709m != 1463899717) {
                s95.m10496b("WavHeaderReader", "Unsupported form type: " + m19709m);
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static de2 m19882d(int i, k09 k09Var, ik5 ik5Var) {
        while (true) {
            de2 m24444a = de2.m24444a(k09Var, ik5Var);
            int i2 = m24444a.f6991a;
            if (i2 == i) {
                return m24444a;
            }
            s95.m10493e("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = m24444a.f6992b + 8;
            if (j > 2147483647L) {
                int i3 = m24444a.f6991a;
                throw dl3.m24265c("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            ((rz8) k09Var).m10811l((int) j, false);
        }
    }
}
