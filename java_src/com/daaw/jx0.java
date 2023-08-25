package com.daaw;

import java.io.File;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public class jx0 {

    /* renamed from: com.daaw.jx0$a */
    /* loaded from: classes.dex */
    public static class C1887a {

        /* renamed from: a */
        public String f15491a;
    }

    /* renamed from: a */
    public static tx0 m18192a(long j, String str, C1887a c1887a) {
        return new tx0(j, m18190c(str, c1887a.f15491a));
    }

    /* renamed from: b */
    public static tx0 m18191b(long j, String str, String str2, String str3, C1887a c1887a) {
        return new tx0(j, m18190c(str, c1887a.f15491a), str2, str3);
    }

    /* renamed from: c */
    public static String m18190c(String str, String str2) {
        String m18188e;
        if (!str.startsWith("/") && !str.startsWith("\\")) {
            if (!str.startsWith("..")) {
                return (str.contains(":") || (m18188e = m18188e(str, str2)) == null) ? m18189d(str, str2) : m18188e;
            }
            String m18188e2 = m18188e(str, str2);
            return m18188e2 == null ? m18189d(str, str2) : m18188e2;
        }
        return m18189d(str, str2);
    }

    /* renamed from: d */
    public static String m18189d(String str, String str2) {
        return str;
    }

    /* renamed from: e */
    public static String m18188e(String str, String str2) {
        File parentFile;
        File file = new File(str2);
        if (!file.isDirectory() && (parentFile = file.getParentFile()) != null) {
            file = parentFile;
        }
        File file2 = new File(file, str);
        if (file2.exists()) {
            try {
                return file2.getCanonicalPath();
            } catch (IOException unused) {
                return file2.getAbsolutePath();
            }
        }
        return null;
    }

    /* renamed from: f */
    public static int m18187f(zl0 zl0Var, C1887a c1887a, List<tx0> list) {
        zl0Var.m2134d(true);
        List<a51> m2135c = zl0Var.m2135c();
        for (a51 a51Var : m2135c) {
            list.add(m18191b(-1L, a51Var.m27608b(), a51Var.m27607c(), null, c1887a));
        }
        return m2135c.size();
    }

    /* renamed from: g */
    public static int m18186g(bm0 bm0Var, C1887a c1887a, List<tx0> list) {
        List<y41> m25999c = bm0Var.m25999c();
        for (y41 y41Var : m25999c) {
            list.add(m18191b(-1L, y41Var.m4135a(), null, y41Var.m4134b(), c1887a));
        }
        return m25999c.size();
    }

    /* renamed from: h */
    public static int m18185h(bv0 bv0Var, C1887a c1887a, List<tx0> list) {
        List<String> m25808c = bv0Var.m25808c();
        for (String str : m25808c) {
            list.add(m18192a(-1L, br1.m25897l(str), c1887a));
        }
        return m25808c.size();
    }

    /* renamed from: i */
    public static int m18184i(dv0 dv0Var, C1887a c1887a, List<tx0> list) {
        List<String> m23931c = dv0Var.m23931c();
        for (String str : m23931c) {
            list.add(m18192a(-1L, str, c1887a));
        }
        return m23931c.size();
    }

    /* renamed from: j */
    public static int m18183j(fv0 fv0Var, C1887a c1887a, List<tx0> list) {
        List<a51> m22252c = fv0Var.m22252c();
        for (a51 a51Var : m22252c) {
            list.add(m18191b(-1L, a51Var.m27608b(), a51Var.m27607c(), null, c1887a));
        }
        return m22252c.size();
    }

    /* renamed from: k */
    public static int m18182k(oe1 oe1Var, C1887a c1887a, List<tx0> list) {
        if (oe1Var == null) {
            return 0;
        }
        if (oe1Var instanceof bv0) {
            return m18185h((bv0) oe1Var, c1887a, list);
        }
        if (oe1Var instanceof hz1) {
            return m18181l((hz1) oe1Var, c1887a, list);
        }
        if (oe1Var instanceof fv0) {
            return m18183j((fv0) oe1Var, c1887a, list);
        }
        if (oe1Var instanceof bm0) {
            return m18186g((bm0) oe1Var, c1887a, list);
        }
        if (oe1Var instanceof dv0) {
            return m18184i((dv0) oe1Var, c1887a, list);
        }
        if (oe1Var instanceof zl0) {
            return m18187f((zl0) oe1Var, c1887a, list);
        }
        return 0;
    }

    /* renamed from: l */
    public static int m18181l(hz1 hz1Var, C1887a c1887a, List<tx0> list) {
        List<C2486ox> m20321c = hz1Var.m20321c();
        for (C2486ox c2486ox : m20321c) {
            list.add(m18192a(-1L, c2486ox.m13901a(), c1887a));
        }
        return m20321c.size();
    }
}
