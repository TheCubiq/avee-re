package com.daaw;
/* renamed from: com.daaw.oe */
/* loaded from: classes.dex */
public final class C2432oe {

    /* renamed from: a */
    public static final int f21512a = sq1.m9994v("GA94");

    /* renamed from: b */
    public static final int f21513b = sq1.m9994v("DTG1");

    /* renamed from: a */
    public static void m14327a(long j, rv0 rv0Var, sm1[] sm1VarArr) {
        while (rv0Var.m10919a() > 1) {
            int m14326b = m14326b(rv0Var);
            int m14326b2 = m14326b(rv0Var);
            int m10917c = rv0Var.m10917c() + m14326b2;
            if (m14326b2 == -1 || m14326b2 > rv0Var.m10919a()) {
                m10917c = rv0Var.m10916d();
            } else if (m14326b == 4 && m14326b2 >= 8) {
                int m10896x = rv0Var.m10896x();
                int m10927D = rv0Var.m10927D();
                int m10911i = m10927D == 49 ? rv0Var.m10911i() : 0;
                int m10896x2 = rv0Var.m10896x();
                if (m10927D == 47) {
                    rv0Var.m10920K(1);
                }
                boolean z = m10896x == 181 && (m10927D == 49 || m10927D == 47) && m10896x2 == 3;
                if (m10927D == 49) {
                    z &= m10911i == f21512a || m10911i == f21513b;
                }
                if (z) {
                    rv0Var.m10920K(1);
                    int m10896x3 = (rv0Var.m10896x() & 31) * 3;
                    int m10917c2 = rv0Var.m10917c();
                    for (sm1 sm1Var : sm1VarArr) {
                        rv0Var.m10921J(m10917c2);
                        sm1Var.mo10157c(rv0Var, m10896x3);
                        sm1Var.mo10159a(j, 1, m10896x3, 0, null);
                    }
                }
            }
            rv0Var.m10921J(m10917c);
        }
    }

    /* renamed from: b */
    public static int m14326b(rv0 rv0Var) {
        int i = 0;
        while (rv0Var.m10919a() != 0) {
            int m10896x = rv0Var.m10896x();
            i += m10896x;
            if (m10896x != 255) {
                return i;
            }
        }
        return -1;
    }
}
