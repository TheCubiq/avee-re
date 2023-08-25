package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class ev7 {
    public static final Class a;
    public static final tv7 b;
    public static final tv7 c;
    public static final tv7 d;

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
        d = new vv7();
    }

    public static int A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (qr7.f(i << 3) + 1);
    }

    public static void B(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.k(i, list, z);
    }

    public static tv7 C(boolean z) {
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
            return (tv7) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
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
        int e = size * qr7.e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += qr7.E((yq7) list.get(i2));
        }
        return e;
    }

    public static int F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * qr7.e(i));
    }

    public static int G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ms7) {
            ms7 ms7Var = (ms7) list;
            i = 0;
            while (i2 < size) {
                i += qr7.G(ms7Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qr7.G(((Integer) list.get(i2)).intValue());
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
        return size * (qr7.f(i << 3) + 4);
    }

    public static int I(List list) {
        return list.size() * 4;
    }

    public static int J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (qr7.f(i << 3) + 8);
    }

    public static int K(List list) {
        return list.size() * 8;
    }

    public static int L(int i, List list, cv7 cv7Var) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += qr7.F(i, (xt7) list.get(i3), cv7Var);
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
        return N(list) + (size * qr7.e(i));
    }

    public static int N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ms7) {
            ms7 ms7Var = (ms7) list;
            i = 0;
            while (i2 < size) {
                i += qr7.G(ms7Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qr7.G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + (list.size() * qr7.e(i));
    }

    public static int P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof mt7) {
            mt7 mt7Var = (mt7) list;
            i = 0;
            while (i2 < size) {
                i += qr7.g(mt7Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qr7.g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int Q(int i, Object obj, cv7 cv7Var) {
        if (obj instanceof at7) {
            int f = qr7.f(i << 3);
            int a2 = ((at7) obj).a();
            return f + qr7.f(a2) + a2;
        }
        return qr7.f(i << 3) + qr7.b((xt7) obj, cv7Var);
    }

    public static int R(int i, List list, cv7 cv7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = qr7.e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e += obj instanceof at7 ? qr7.H((at7) obj) : qr7.b((xt7) obj, cv7Var);
        }
        return e;
    }

    public static int S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * qr7.e(i));
    }

    public static int T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ms7) {
            ms7 ms7Var = (ms7) list;
            i = 0;
            while (i2 < size) {
                int e = ms7Var.e(i2);
                i += qr7.f((e >> 31) ^ (e + e));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += qr7.f((intValue >> 31) ^ (intValue + intValue));
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
        return V(list) + (size * qr7.e(i));
    }

    public static int V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof mt7) {
            mt7 mt7Var = (mt7) list;
            i = 0;
            while (i2 < size) {
                long e = mt7Var.e(i2);
                i += qr7.g((e >> 63) ^ (e + e));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += qr7.g((longValue >> 63) ^ (longValue + longValue));
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
        int e = qr7.e(i) * size;
        if (list instanceof ct7) {
            ct7 ct7Var = (ct7) list;
            while (i2 < size) {
                Object zzf = ct7Var.zzf(i2);
                e += zzf instanceof yq7 ? qr7.E((yq7) zzf) : qr7.d((String) zzf);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e += obj instanceof yq7 ? qr7.E((yq7) obj) : qr7.d((String) obj);
                i2++;
            }
        }
        return e;
    }

    public static int X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + (size * qr7.e(i));
    }

    public static int Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ms7) {
            ms7 ms7Var = (ms7) list;
            i = 0;
            while (i2 < size) {
                i += qr7.f(ms7Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qr7.f(((Integer) list.get(i2)).intValue());
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
        return a0(list) + (size * qr7.e(i));
    }

    public static tv7 a() {
        return c;
    }

    public static int a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof mt7) {
            mt7 mt7Var = (mt7) list;
            i = 0;
            while (i2 < size) {
                i += qr7.g(mt7Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qr7.g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static tv7 b() {
        return d;
    }

    public static tv7 b0() {
        return b;
    }

    public static Object c(Object obj, int i, List list, ps7 ps7Var, Object obj2, tv7 tv7Var) {
        if (ps7Var == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (ps7Var.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = d(obj, i, intValue, obj2, tv7Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!ps7Var.a(intValue2)) {
                    obj2 = d(obj, i, intValue2, obj2, tv7Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object d(Object obj, int i, int i2, Object obj2, tv7 tv7Var) {
        if (obj2 == null) {
            obj2 = tv7Var.c(obj);
        }
        tv7Var.l(obj2, i, i2);
        return obj2;
    }

    public static void e(wr7 wr7Var, Object obj, Object obj2) {
        wr7Var.a(obj2);
        throw null;
    }

    public static void f(tv7 tv7Var, Object obj, Object obj2) {
        tv7Var.o(obj, tv7Var.e(tv7Var.d(obj), tv7Var.d(obj2)));
    }

    public static void g(Class cls) {
        Class cls2;
        if (!ls7.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void i(st7 st7Var, Object obj, Object obj2, long j) {
        gw7.D(obj, j, st7.c(gw7.p(obj, j), gw7.p(obj2, j)));
    }

    public static void j(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.n(i, list, z);
    }

    public static void k(int i, List list, rr7 rr7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.p(i, list);
    }

    public static void l(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.r(i, list, z);
    }

    public static void m(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.u(i, list, z);
    }

    public static void n(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.w(i, list, z);
    }

    public static void o(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.y(i, list, z);
    }

    public static void p(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.A(i, list, z);
    }

    public static void q(int i, List list, rr7 rr7Var, cv7 cv7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            rr7Var.B(i, list.get(i2), cv7Var);
        }
    }

    public static void r(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.D(i, list, z);
    }

    public static void s(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.F(i, list, z);
    }

    public static void t(int i, List list, rr7 rr7Var, cv7 cv7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            rr7Var.G(i, list.get(i2), cv7Var);
        }
    }

    public static void u(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.I(i, list, z);
    }

    public static void v(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.K(i, list, z);
    }

    public static void w(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.b(i, list, z);
    }

    public static void x(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.d(i, list, z);
    }

    public static void y(int i, List list, rr7 rr7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.g(i, list);
    }

    public static void z(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.i(i, list, z);
    }
}
