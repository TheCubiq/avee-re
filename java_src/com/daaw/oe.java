package com.daaw;
/* loaded from: classes.dex */
public final class oe {
    public static final int a = sq1.v("GA94");
    public static final int b = sq1.v("DTG1");

    public static void a(long j, rv0 rv0Var, sm1[] sm1VarArr) {
        while (rv0Var.a() > 1) {
            int b2 = b(rv0Var);
            int b3 = b(rv0Var);
            int c = rv0Var.c() + b3;
            if (b3 == -1 || b3 > rv0Var.a()) {
                c = rv0Var.d();
            } else if (b2 == 4 && b3 >= 8) {
                int x = rv0Var.x();
                int D = rv0Var.D();
                int i = D == 49 ? rv0Var.i() : 0;
                int x2 = rv0Var.x();
                if (D == 47) {
                    rv0Var.K(1);
                }
                boolean z = x == 181 && (D == 49 || D == 47) && x2 == 3;
                if (D == 49) {
                    z &= i == a || i == b;
                }
                if (z) {
                    rv0Var.K(1);
                    int x3 = (rv0Var.x() & 31) * 3;
                    int c2 = rv0Var.c();
                    for (sm1 sm1Var : sm1VarArr) {
                        rv0Var.J(c2);
                        sm1Var.c(rv0Var, x3);
                        sm1Var.a(j, 1, x3, 0, null);
                    }
                }
            }
            rv0Var.J(c);
        }
    }

    public static int b(rv0 rv0Var) {
        int i = 0;
        while (rv0Var.a() != 0) {
            int x = rv0Var.x();
            i += x;
            if (x != 255) {
                return i;
            }
        }
        return -1;
    }
}
