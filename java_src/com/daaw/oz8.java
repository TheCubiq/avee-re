package com.daaw;
/* loaded from: classes.dex */
public final class oz8 {
    public static void a(long j, ik5 ik5Var, m42[] m42VarArr) {
        int i;
        while (true) {
            if (ik5Var.i() <= 1) {
                return;
            }
            int c = c(ik5Var);
            int c2 = c(ik5Var);
            int k = ik5Var.k() + c2;
            if (c2 == -1 || c2 > ik5Var.i()) {
                s95.e("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                k = ik5Var.l();
            } else if (c == 4 && c2 >= 8) {
                int s = ik5Var.s();
                int w = ik5Var.w();
                if (w == 49) {
                    i = ik5Var.m();
                    w = 49;
                } else {
                    i = 0;
                }
                int s2 = ik5Var.s();
                if (w == 47) {
                    ik5Var.g(1);
                    w = 47;
                }
                boolean z = s == 181 && (w == 49 || w == 47) && s2 == 3;
                if (w == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    b(j, ik5Var, m42VarArr);
                }
            }
            ik5Var.f(k);
        }
    }

    public static void b(long j, ik5 ik5Var, m42[] m42VarArr) {
        int s = ik5Var.s();
        if ((s & 64) != 0) {
            ik5Var.g(1);
            int i = (s & 31) * 3;
            int k = ik5Var.k();
            for (m42 m42Var : m42VarArr) {
                ik5Var.f(k);
                m42Var.c(ik5Var, i);
                if (j != -9223372036854775807L) {
                    m42Var.b(j, 1, i, 0, null);
                }
            }
        }
    }

    public static int c(ik5 ik5Var) {
        int i = 0;
        while (ik5Var.i() != 0) {
            int s = ik5Var.s();
            i += s;
            if (s != 255) {
                return i;
            }
        }
        return -1;
    }
}
