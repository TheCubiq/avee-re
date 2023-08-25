package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class ou7 {
    public static double a(double d) {
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

    public static int b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        double d2 = d > 0.0d ? 1 : -1;
        double floor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return (int) ((d2 * floor) % 4.294967296E9d);
    }

    public static int c(w07 w07Var) {
        int b = b(w07Var.d("runtime.counter").zzh().doubleValue() + 1.0d);
        if (b <= 1000000) {
            w07Var.g("runtime.counter", new tb2(Double.valueOf(b)));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static long d(double d) {
        return b(d) & 4294967295L;
    }

    public static db3 e(String str) {
        db3 db3Var = null;
        if (str != null && !str.isEmpty()) {
            db3Var = db3.a(Integer.parseInt(str));
        }
        if (db3Var != null) {
            return db3Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object f(gl2 gl2Var) {
        if (gl2.h.equals(gl2Var)) {
            return null;
        }
        if (gl2.g.equals(gl2Var)) {
            return "";
        }
        if (gl2Var instanceof th2) {
            return g((th2) gl2Var);
        }
        if (!(gl2Var instanceof z72)) {
            return !gl2Var.zzh().isNaN() ? gl2Var.zzh() : gl2Var.zzi();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((z72) gl2Var).iterator();
        while (it.hasNext()) {
            Object f = f((gl2) it.next());
            if (f != null) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    public static Map g(th2 th2Var) {
        HashMap hashMap = new HashMap();
        for (String str : th2Var.a()) {
            Object f = f(th2Var.f(str));
            if (f != null) {
                hashMap.put(str, f);
            }
        }
        return hashMap;
    }

    public static void h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static boolean k(gl2 gl2Var) {
        if (gl2Var == null) {
            return false;
        }
        Double zzh = gl2Var.zzh();
        return !zzh.isNaN() && zzh.doubleValue() >= 0.0d && zzh.equals(Double.valueOf(Math.floor(zzh.doubleValue())));
    }

    public static boolean l(gl2 gl2Var, gl2 gl2Var2) {
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
