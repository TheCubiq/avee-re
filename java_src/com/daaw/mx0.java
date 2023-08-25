package com.daaw;

import android.content.Context;
import com.daaw.tx0;
import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public class mx0 {

    /* renamed from: com.daaw.mx0$a */
    /* loaded from: classes.dex */
    public static class C2218a {

        /* renamed from: a */
        public String f19221a;

        /* renamed from: b */
        public boolean f19222b;
    }

    /* renamed from: a */
    public static int m15730a(zl0 zl0Var, C2218a c2218a, List<tx0> list) {
        Context m23837e = dx0.m23837e();
        zl0Var.m2134d(true);
        for (tx0 tx0Var : list) {
            a51 a51Var = new a51();
            a51Var.m27605e(m15723h(tx0Var, c2218a.f19221a, c2218a.f19222b));
            if (m23837e != null) {
                tx0.C3143b m8742j = tx0Var.m8742j(m23837e);
                a51Var.m27604f(m8742j.f28207e);
                a51Var.m27606d(m8742j.m8727f());
            }
            zl0Var.m2135c().add(a51Var);
        }
        return list.size();
    }

    /* renamed from: b */
    public static int m15729b(bm0 bm0Var, C2218a c2218a, List<tx0> list) {
        for (tx0 tx0Var : list) {
            y41 y41Var = new y41();
            y41Var.m4132d(m15723h(tx0Var, c2218a.f19221a, c2218a.f19222b));
            bm0Var.m25999c().add(y41Var);
        }
        return list.size();
    }

    /* renamed from: c */
    public static int m15728c(bv0 bv0Var, C2218a c2218a, List<tx0> list) {
        for (tx0 tx0Var : list) {
            bv0Var.m25808c().add(m15723h(tx0Var, c2218a.f19221a, c2218a.f19222b));
        }
        return list.size();
    }

    /* renamed from: d */
    public static int m15727d(dv0 dv0Var, C2218a c2218a, List<tx0> list) {
        for (tx0 tx0Var : list) {
            dv0Var.m23931c().add(m15723h(tx0Var, c2218a.f19221a, c2218a.f19222b));
        }
        return list.size();
    }

    /* renamed from: e */
    public static int m15726e(fv0 fv0Var, C2218a c2218a, List<tx0> list) {
        Context m23837e = dx0.m23837e();
        for (tx0 tx0Var : list) {
            a51 a51Var = new a51();
            a51Var.m27605e(m15723h(tx0Var, c2218a.f19221a, c2218a.f19222b));
            if (m23837e != null) {
                tx0.C3143b m8742j = tx0Var.m8742j(m23837e);
                a51Var.m27604f(m8742j.f28207e);
                a51Var.m27606d(m8742j.m8727f());
            }
            fv0Var.m22252c().add(a51Var);
        }
        return list.size();
    }

    /* renamed from: f */
    public static int m15725f(oe1 oe1Var, C2218a c2218a, List<tx0> list) {
        if (list == null || oe1Var == null) {
            return 0;
        }
        if (oe1Var instanceof bv0) {
            return m15728c((bv0) oe1Var, c2218a, list);
        }
        if (oe1Var instanceof hz1) {
            return m15724g((hz1) oe1Var, c2218a, list);
        }
        if (oe1Var instanceof fv0) {
            return m15726e((fv0) oe1Var, c2218a, list);
        }
        if (oe1Var instanceof bm0) {
            return m15729b((bm0) oe1Var, c2218a, list);
        }
        if (oe1Var instanceof dv0) {
            return m15727d((dv0) oe1Var, c2218a, list);
        }
        if (oe1Var instanceof zl0) {
            return m15730a((zl0) oe1Var, c2218a, list);
        }
        return 0;
    }

    /* renamed from: g */
    public static int m15724g(hz1 hz1Var, C2218a c2218a, List<tx0> list) {
        for (tx0 tx0Var : list) {
            C2486ox c2486ox = new C2486ox();
            c2486ox.m13899c(m15723h(tx0Var, c2218a.f19221a, c2218a.f19222b));
            hz1Var.m20321c().add(c2486ox);
        }
        return list.size();
    }

    /* renamed from: h */
    public static String m15723h(tx0 tx0Var, String str, boolean z) {
        String m8739m = tx0Var.m8739m();
        if (m8739m.startsWith("file://") && m8739m.length() > 7) {
            m8739m = m8739m.substring(7, m8739m.length());
        }
        return (z && new File(m8739m).exists()) ? cr1.m25065o(m8739m, str, "/") : m8739m;
    }
}
