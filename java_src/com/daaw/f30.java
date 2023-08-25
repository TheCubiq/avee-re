package com.daaw;
/* loaded from: classes.dex */
public final class f30 {
    public static sn1 a(qn1<?> qn1Var) {
        if (qn1Var instanceof vn1) {
            return ((vn1) qn1Var).b();
        }
        throw new IllegalArgumentException("Expected instance of TransportImpl.");
    }

    public static void b(qn1<?> qn1Var, cz0 cz0Var) {
        xn1.c().e().u(a(qn1Var).f(cz0Var), 1);
    }
}
