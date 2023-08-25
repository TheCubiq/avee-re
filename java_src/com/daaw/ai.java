package com.daaw;

import java.util.Set;
/* loaded from: classes2.dex */
public final /* synthetic */ class ai {
    public static Object a(bi biVar, i01 i01Var) {
        b01 g = biVar.g(i01Var);
        if (g == null) {
            return null;
        }
        return g.get();
    }

    public static Object b(bi biVar, Class cls) {
        return biVar.c(i01.b(cls));
    }

    public static es c(bi biVar, Class cls) {
        return biVar.h(i01.b(cls));
    }

    public static b01 d(bi biVar, Class cls) {
        return biVar.g(i01.b(cls));
    }

    public static Set e(bi biVar, i01 i01Var) {
        return (Set) biVar.b(i01Var).get();
    }

    public static Set f(bi biVar, Class cls) {
        return biVar.e(i01.b(cls));
    }
}
