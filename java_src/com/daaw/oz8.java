package com.daaw;
/* loaded from: classes.dex */
public final class oz8 {
    /* renamed from: a */
    public static void m13792a(long j, ik5 ik5Var, m42[] m42VarArr) {
        int i;
        while (true) {
            if (ik5Var.m19713i() <= 1) {
                return;
            }
            int m13790c = m13790c(ik5Var);
            int m13790c2 = m13790c(ik5Var);
            int m19711k = ik5Var.m19711k() + m13790c2;
            if (m13790c2 == -1 || m13790c2 > ik5Var.m19713i()) {
                s95.m10493e("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                m19711k = ik5Var.m19710l();
            } else if (m13790c == 4 && m13790c2 >= 8) {
                int m19703s = ik5Var.m19703s();
                int m19699w = ik5Var.m19699w();
                if (m19699w == 49) {
                    i = ik5Var.m19709m();
                    m19699w = 49;
                } else {
                    i = 0;
                }
                int m19703s2 = ik5Var.m19703s();
                if (m19699w == 47) {
                    ik5Var.m19715g(1);
                    m19699w = 47;
                }
                boolean z = m19703s == 181 && (m19699w == 49 || m19699w == 47) && m19703s2 == 3;
                if (m19699w == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    m13791b(j, ik5Var, m42VarArr);
                }
            }
            ik5Var.m19716f(m19711k);
        }
    }

    /* renamed from: b */
    public static void m13791b(long j, ik5 ik5Var, m42[] m42VarArr) {
        int m19703s = ik5Var.m19703s();
        if ((m19703s & 64) != 0) {
            ik5Var.m19715g(1);
            int i = (m19703s & 31) * 3;
            int m19711k = ik5Var.m19711k();
            for (m42 m42Var : m42VarArr) {
                ik5Var.m19716f(m19711k);
                m42Var.mo16221c(ik5Var, i);
                if (j != -9223372036854775807L) {
                    m42Var.mo16222b(j, 1, i, 0, null);
                }
            }
        }
    }

    /* renamed from: c */
    public static int m13790c(ik5 ik5Var) {
        int i = 0;
        while (ik5Var.m19713i() != 0) {
            int m19703s = ik5Var.m19703s();
            i += m19703s;
            if (m19703s != 255) {
                return i;
            }
        }
        return -1;
    }
}
