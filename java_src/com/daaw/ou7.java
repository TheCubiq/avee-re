package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class ou7 {
    /* renamed from: a */
    public static double m13923a(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        double d2 = d > 0.0d ? 1 : -1;
        double floor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return d2 * floor;
    }

    /* renamed from: b */
    public static int m13922b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        double d2 = d > 0.0d ? 1 : -1;
        double floor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return (int) ((d2 * floor) % 4.294967296E9d);
    }

    /* renamed from: c */
    public static int m13921c(w07 w07Var) {
        int m13922b = m13922b(w07Var.m6606d("runtime.counter").zzh().doubleValue() + 1.0d);
        if (m13922b <= 1000000) {
            w07Var.m6603g("runtime.counter", new tb2(Double.valueOf(m13922b)));
            return m13922b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m13920d(double d) {
        return m13922b(d) & 4294967295L;
    }

    /* renamed from: e */
    public static db3 m13919e(String str) {
        db3 db3Var = null;
        if (str != null && !str.isEmpty()) {
            db3Var = db3.m24569a(Integer.parseInt(str));
        }
        if (db3Var != null) {
            return db3Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    /* renamed from: f */
    public static Object m13918f(gl2 gl2Var) {
        if (gl2.f11421h.equals(gl2Var)) {
            return null;
        }
        if (gl2.f11420g.equals(gl2Var)) {
            return "";
        }
        if (gl2Var instanceof th2) {
            return m13917g((th2) gl2Var);
        }
        if (!(gl2Var instanceof z72)) {
            return !gl2Var.zzh().isNaN() ? gl2Var.zzh() : gl2Var.zzi();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((z72) gl2Var).iterator();
        while (it.hasNext()) {
            Object m13918f = m13918f((gl2) it.next());
            if (m13918f != null) {
                arrayList.add(m13918f);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static Map m13917g(th2 th2Var) {
        HashMap hashMap = new HashMap();
        for (String str : th2Var.m9113a()) {
            Object m13918f = m13918f(th2Var.mo2706f(str));
            if (m13918f != null) {
                hashMap.put(str, m13918f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m13916h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: i */
    public static void m13915i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: j */
    public static void m13914j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: k */
    public static boolean m13913k(gl2 gl2Var) {
        if (gl2Var == null) {
            return false;
        }
        Double zzh = gl2Var.zzh();
        return !zzh.isNaN() && zzh.doubleValue() >= 0.0d && zzh.equals(Double.valueOf(Math.floor(zzh.doubleValue())));
    }

    /* renamed from: l */
    public static boolean m13912l(gl2 gl2Var, gl2 gl2Var2) {
        if (gl2Var.getClass().equals(gl2Var2.getClass())) {
            if ((gl2Var instanceof br2) || (gl2Var instanceof xi2)) {
                return true;
            }
            if (!(gl2Var instanceof tb2)) {
                return gl2Var instanceof wp2 ? gl2Var.zzi().equals(gl2Var2.zzi()) : gl2Var instanceof g92 ? gl2Var.zzg().equals(gl2Var2.zzg()) : gl2Var == gl2Var2;
            } else if (Double.isNaN(gl2Var.zzh().doubleValue()) || Double.isNaN(gl2Var2.zzh().doubleValue())) {
                return false;
            } else {
                return gl2Var.zzh().equals(gl2Var2.zzh());
            }
        }
        return false;
    }
}
