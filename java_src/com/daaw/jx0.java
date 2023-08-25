package com.daaw;

import java.io.File;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public class jx0 {

    /* loaded from: classes.dex */
    public static class a {
        public String a;
    }

    public static tx0 a(long j, String str, a aVar) {
        return new tx0(j, c(str, aVar.a));
    }

    public static tx0 b(long j, String str, String str2, String str3, a aVar) {
        return new tx0(j, c(str, aVar.a), str2, str3);
    }

    public static String c(String str, String str2) {
        String e;
        if (!str.startsWith("/") && !str.startsWith("\\")) {
            if (!str.startsWith("..")) {
                return (str.contains(":") || (e = e(str, str2)) == null) ? d(str, str2) : e;
            }
            String e2 = e(str, str2);
            return e2 == null ? d(str, str2) : e2;
        }
        return d(str, str2);
    }

    public static String d(String str, String str2) {
        return str;
    }

    public static String e(String str, String str2) {
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

    public static int f(zl0 zl0Var, a aVar, List<tx0> list) {
        zl0Var.d(true);
        List<a51> c = zl0Var.c();
        for (a51 a51Var : c) {
            list.add(b(-1L, a51Var.b(), a51Var.c(), null, aVar));
        }
        return c.size();
    }

    public static int g(bm0 bm0Var, a aVar, List<tx0> list) {
        List<y41> c = bm0Var.c();
        for (y41 y41Var : c) {
            list.add(b(-1L, y41Var.a(), null, y41Var.b(), aVar));
        }
        return c.size();
    }

    public static int h(bv0 bv0Var, a aVar, List<tx0> list) {
        List<String> c = bv0Var.c();
        for (String str : c) {
            list.add(a(-1L, br1.l(str), aVar));
        }
        return c.size();
    }

    public static int i(dv0 dv0Var, a aVar, List<tx0> list) {
        List<String> c = dv0Var.c();
        for (String str : c) {
            list.add(a(-1L, str, aVar));
        }
        return c.size();
    }

    public static int j(fv0 fv0Var, a aVar, List<tx0> list) {
        List<a51> c = fv0Var.c();
        for (a51 a51Var : c) {
            list.add(b(-1L, a51Var.b(), a51Var.c(), null, aVar));
        }
        return c.size();
    }

    public static int k(oe1 oe1Var, a aVar, List<tx0> list) {
        if (oe1Var == null) {
            return 0;
        }
        if (oe1Var instanceof bv0) {
            return h((bv0) oe1Var, aVar, list);
        }
        if (oe1Var instanceof hz1) {
            return l((hz1) oe1Var, aVar, list);
        }
        if (oe1Var instanceof fv0) {
            return j((fv0) oe1Var, aVar, list);
        }
        if (oe1Var instanceof bm0) {
            return g((bm0) oe1Var, aVar, list);
        }
        if (oe1Var instanceof dv0) {
            return i((dv0) oe1Var, aVar, list);
        }
        if (oe1Var instanceof zl0) {
            return f((zl0) oe1Var, aVar, list);
        }
        return 0;
    }

    public static int l(hz1 hz1Var, a aVar, List<tx0> list) {
        List<ox> c = hz1Var.c();
        for (ox oxVar : c) {
            list.add(a(-1L, oxVar.a(), aVar));
        }
        return c.size();
    }
}
