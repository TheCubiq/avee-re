package com.daaw;

import android.content.Context;
import com.daaw.tx0;
import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public class mx0 {

    /* loaded from: classes.dex */
    public static class a {
        public String a;
        public boolean b;
    }

    public static int a(zl0 zl0Var, a aVar, List<tx0> list) {
        Context e = dx0.e();
        zl0Var.d(true);
        for (tx0 tx0Var : list) {
            a51 a51Var = new a51();
            a51Var.e(h(tx0Var, aVar.a, aVar.b));
            if (e != null) {
                tx0.b j = tx0Var.j(e);
                a51Var.f(j.e);
                a51Var.d(j.f());
            }
            zl0Var.c().add(a51Var);
        }
        return list.size();
    }

    public static int b(bm0 bm0Var, a aVar, List<tx0> list) {
        for (tx0 tx0Var : list) {
            y41 y41Var = new y41();
            y41Var.d(h(tx0Var, aVar.a, aVar.b));
            bm0Var.c().add(y41Var);
        }
        return list.size();
    }

    public static int c(bv0 bv0Var, a aVar, List<tx0> list) {
        for (tx0 tx0Var : list) {
            bv0Var.c().add(h(tx0Var, aVar.a, aVar.b));
        }
        return list.size();
    }

    public static int d(dv0 dv0Var, a aVar, List<tx0> list) {
        for (tx0 tx0Var : list) {
            dv0Var.c().add(h(tx0Var, aVar.a, aVar.b));
        }
        return list.size();
    }

    public static int e(fv0 fv0Var, a aVar, List<tx0> list) {
        Context e = dx0.e();
        for (tx0 tx0Var : list) {
            a51 a51Var = new a51();
            a51Var.e(h(tx0Var, aVar.a, aVar.b));
            if (e != null) {
                tx0.b j = tx0Var.j(e);
                a51Var.f(j.e);
                a51Var.d(j.f());
            }
            fv0Var.c().add(a51Var);
        }
        return list.size();
    }

    public static int f(oe1 oe1Var, a aVar, List<tx0> list) {
        if (list == null || oe1Var == null) {
            return 0;
        }
        if (oe1Var instanceof bv0) {
            return c((bv0) oe1Var, aVar, list);
        }
        if (oe1Var instanceof hz1) {
            return g((hz1) oe1Var, aVar, list);
        }
        if (oe1Var instanceof fv0) {
            return e((fv0) oe1Var, aVar, list);
        }
        if (oe1Var instanceof bm0) {
            return b((bm0) oe1Var, aVar, list);
        }
        if (oe1Var instanceof dv0) {
            return d((dv0) oe1Var, aVar, list);
        }
        if (oe1Var instanceof zl0) {
            return a((zl0) oe1Var, aVar, list);
        }
        return 0;
    }

    public static int g(hz1 hz1Var, a aVar, List<tx0> list) {
        for (tx0 tx0Var : list) {
            ox oxVar = new ox();
            oxVar.c(h(tx0Var, aVar.a, aVar.b));
            hz1Var.c().add(oxVar);
        }
        return list.size();
    }

    public static String h(tx0 tx0Var, String str, boolean z) {
        String m = tx0Var.m();
        if (m.startsWith("file://") && m.length() > 7) {
            m = m.substring(7, m.length());
        }
        return (z && new File(m).exists()) ? cr1.o(m, str, "/") : m;
    }
}
