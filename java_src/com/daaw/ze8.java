package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class ze8 {
    public static final Class a;
    public static final og8 b;
    public static final og8 c;
    public static final og8 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = C(false);
        c = C(true);
        d = new sg8();
    }

    public static int A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (w78.a(i << 3) + 1);
    }

    public static void B(pd8 pd8Var, Object obj, Object obj2, long j) {
        ih8.x(obj, j, pd8.b(ih8.k(obj, j), ih8.k(obj2, j)));
    }

    public static og8 C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (og8) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int D(List list) {
        return list.size();
    }

    public static int E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * w78.D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            D += w78.x((y68) list.get(i2));
        }
        return D;
    }

    public static int F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * w78.D(i));
    }

    public static int G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ma8) {
            ma8 ma8Var = (ma8) list;
            i = 0;
            while (i2 < size) {
                i += w78.z(ma8Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += w78.z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (w78.a(i << 3) + 4);
    }

    public static int I(List list) {
        return list.size() * 4;
    }

    public static int J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (w78.a(i << 3) + 8);
    }

    public static int K(List list) {
        return list.size() * 8;
    }

    public static int L(int i, List list, ve8 ve8Var) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += w78.y(i, (zd8) list.get(i3), ve8Var);
            }
            return i2;
        }
        return 0;
    }

    public static int M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * w78.D(i));
    }

    public static int N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ma8) {
            ma8 ma8Var = (ma8) list;
            i = 0;
            while (i2 < size) {
                i += w78.z(ma8Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += w78.z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + (list.size() * w78.D(i));
    }

    public static int P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cd8) {
            cd8 cd8Var = (cd8) list;
            i = 0;
            while (i2 < size) {
                i += w78.b(cd8Var.a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += w78.b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int Q(int i, Object obj, ve8 ve8Var) {
        if (obj instanceof ub8) {
            int a2 = w78.a(i << 3);
            int a3 = ((ub8) obj).a();
            return a2 + w78.a(a3) + a3;
        }
        return w78.a(i << 3) + w78.B((zd8) obj, ve8Var);
    }

    public static int R(int i, List list, ve8 ve8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = w78.D(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            D += obj instanceof ub8 ? w78.A((ub8) obj) : w78.B((zd8) obj, ve8Var);
        }
        return D;
    }

    public static int S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * w78.D(i));
    }

    public static int T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ma8) {
            ma8 ma8Var = (ma8) list;
            i = 0;
            while (i2 < size) {
                int e = ma8Var.e(i2);
                i += w78.a((e >> 31) ^ (e + e));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += w78.a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return V(list) + (size * w78.D(i));
    }

    public static int V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cd8) {
            cd8 cd8Var = (cd8) list;
            i = 0;
            while (i2 < size) {
                long a2 = cd8Var.a(i2);
                i += w78.b((a2 >> 63) ^ (a2 + a2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += w78.b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int W(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int D = w78.D(i) * size;
        if (list instanceof ac8) {
            ac8 ac8Var = (ac8) list;
            while (i2 < size) {
                Object zzf = ac8Var.zzf(i2);
                D += zzf instanceof y68 ? w78.x((y68) zzf) : w78.C((String) zzf);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                D += obj instanceof y68 ? w78.x((y68) obj) : w78.C((String) obj);
                i2++;
            }
        }
        return D;
    }

    public static int X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + (size * w78.D(i));
    }

    public static int Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ma8) {
            ma8 ma8Var = (ma8) list;
            i = 0;
            while (i2 < size) {
                i += w78.a(ma8Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += w78.a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a0(list) + (size * w78.D(i));
    }

    public static og8 a() {
        return c;
    }

    public static int a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cd8) {
            cd8 cd8Var = (cd8) list;
            i = 0;
            while (i2 < size) {
                i += w78.b(cd8Var.a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += w78.b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static og8 b() {
        return d;
    }

    public static og8 b0() {
        return b;
    }

    public static Object c(Object obj, int i, List list, ua8 ua8Var, Object obj2, og8 og8Var) {
        Object obj3 = null;
        if (ua8Var == null) {
            return null;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (ua8Var.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj3 = d(obj, i, intValue, obj3, og8Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj3;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!ua8Var.a(intValue2)) {
                    obj3 = d(obj, i, intValue2, obj3, og8Var);
                    it.remove();
                }
            }
        }
        return obj3;
    }

    public static Object d(Object obj, int i, int i2, Object obj2, og8 og8Var) {
        if (obj2 == null) {
            obj2 = og8Var.c(obj);
        }
        og8Var.f(obj2, i, i2);
        return obj2;
    }

    public static void e(o88 o88Var, Object obj, Object obj2) {
        o88Var.a(obj2);
        throw null;
    }

    public static void f(og8 og8Var, Object obj, Object obj2) {
        og8Var.h(obj, og8Var.e(og8Var.d(obj), og8Var.d(obj2)));
    }

    public static void g(Class cls) {
        Class cls2;
        if (!ja8.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void h(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.l(i, list, z);
    }

    public static void i(int i, List list, ki8 ki8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.d(i, list);
    }

    public static void j(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.D(i, list, z);
    }

    public static void k(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.r(i, list, z);
    }

    public static void l(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.o(i, list, z);
    }

    public static void m(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.u(i, list, z);
    }

    public static void n(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.G(i, list, z);
    }

    public static void o(int i, List list, ki8 ki8Var, ve8 ve8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((z78) ki8Var).E(i, list.get(i2), ve8Var);
        }
    }

    public static void p(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.p(i, list, z);
    }

    public static void q(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.A(i, list, z);
    }

    public static void r(int i, List list, ki8 ki8Var, ve8 ve8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((z78) ki8Var).e(i, list.get(i2), ve8Var);
        }
    }

    public static void s(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.C(i, list, z);
    }

    public static void t(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.c(i, list, z);
    }

    public static void u(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.z(i, list, z);
    }

    public static void v(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.H(i, list, z);
    }

    public static void w(int i, List list, ki8 ki8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.s(i, list);
    }

    public static void x(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.n(i, list, z);
    }

    public static void y(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.B(i, list, z);
    }

    public static boolean z(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
