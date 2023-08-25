package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class ze8 {

    /* renamed from: a */
    public static final Class f35009a;

    /* renamed from: b */
    public static final og8 f35010b;

    /* renamed from: c */
    public static final og8 f35011c;

    /* renamed from: d */
    public static final og8 f35012d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f35009a = cls;
        f35010b = m2415C(false);
        f35011c = m2415C(true);
        f35012d = new sg8();
    }

    /* renamed from: A */
    public static int m2417A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (w78.m6384a(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m2416B(pd8 pd8Var, Object obj, Object obj2, long j) {
        ih8.m19789x(obj, j, pd8.m13432b(ih8.m19802k(obj, j), ih8.m19802k(obj2, j)));
    }

    /* renamed from: C */
    public static og8 m2415C(boolean z) {
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

    /* renamed from: D */
    public static int m2414D(List list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m2413E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m6385D = size * w78.m6385D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m6385D += w78.m6361x((y68) list.get(i2));
        }
        return m6385D;
    }

    /* renamed from: F */
    public static int m2412F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m2411G(list) + (size * w78.m6385D(i));
    }

    /* renamed from: G */
    public static int m2411G(List list) {
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
                i += w78.m6359z(ma8Var.m16126e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += w78.m6359z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m2410H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (w78.m6384a(i << 3) + 4);
    }

    /* renamed from: I */
    public static int m2409I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m2408J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (w78.m6384a(i << 3) + 8);
    }

    /* renamed from: K */
    public static int m2407K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m2406L(int i, List list, ve8 ve8Var) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += w78.m6360y(i, (zd8) list.get(i3), ve8Var);
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: M */
    public static int m2405M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m2404N(list) + (size * w78.m6385D(i));
    }

    /* renamed from: N */
    public static int m2404N(List list) {
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
                i += w78.m6359z(ma8Var.m16126e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += w78.m6359z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static int m2403O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m2402P(list) + (list.size() * w78.m6385D(i));
    }

    /* renamed from: P */
    public static int m2402P(List list) {
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
                i += w78.m6383b(cd8Var.mo25416a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += w78.m6383b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m2401Q(int i, Object obj, ve8 ve8Var) {
        if (obj instanceof ub8) {
            int m6384a = w78.m6384a(i << 3);
            int m8343a = ((ub8) obj).m8343a();
            return m6384a + w78.m6384a(m8343a) + m8343a;
        }
        return w78.m6384a(i << 3) + w78.m6387B((zd8) obj, ve8Var);
    }

    /* renamed from: R */
    public static int m2400R(int i, List list, ve8 ve8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m6385D = w78.m6385D(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            m6385D += obj instanceof ub8 ? w78.m6388A((ub8) obj) : w78.m6387B((zd8) obj, ve8Var);
        }
        return m6385D;
    }

    /* renamed from: S */
    public static int m2399S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m2398T(list) + (size * w78.m6385D(i));
    }

    /* renamed from: T */
    public static int m2398T(List list) {
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
                int m16126e = ma8Var.m16126e(i2);
                i += w78.m6384a((m16126e >> 31) ^ (m16126e + m16126e));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += w78.m6384a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m2397U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m2396V(list) + (size * w78.m6385D(i));
    }

    /* renamed from: V */
    public static int m2396V(List list) {
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
                long mo25416a = cd8Var.mo25416a(i2);
                i += w78.m6383b((mo25416a >> 63) ^ (mo25416a + mo25416a));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += w78.m6383b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static int m2395W(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m6385D = w78.m6385D(i) * size;
        if (list instanceof ac8) {
            ac8 ac8Var = (ac8) list;
            while (i2 < size) {
                Object zzf = ac8Var.zzf(i2);
                m6385D += zzf instanceof y68 ? w78.m6361x((y68) zzf) : w78.m6386C((String) zzf);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                m6385D += obj instanceof y68 ? w78.m6361x((y68) obj) : w78.m6386C((String) obj);
                i2++;
            }
        }
        return m6385D;
    }

    /* renamed from: X */
    public static int m2394X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m2393Y(list) + (size * w78.m6385D(i));
    }

    /* renamed from: Y */
    public static int m2393Y(List list) {
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
                i += w78.m6384a(ma8Var.m16126e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += w78.m6384a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    public static int m2392Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m2390a0(list) + (size * w78.m6385D(i));
    }

    /* renamed from: a */
    public static og8 m2391a() {
        return f35011c;
    }

    /* renamed from: a0 */
    public static int m2390a0(List list) {
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
                i += w78.m6383b(cd8Var.mo25416a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += w78.m6383b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static og8 m2389b() {
        return f35012d;
    }

    /* renamed from: b0 */
    public static og8 m2388b0() {
        return f35010b;
    }

    /* renamed from: c */
    public static Object m2387c(Object obj, int i, List list, ua8 ua8Var, Object obj2, og8 og8Var) {
        Object obj3 = null;
        if (ua8Var == null) {
            return null;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (ua8Var.mo8358a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj3 = m2386d(obj, i, intValue, obj3, og8Var);
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
                if (!ua8Var.mo8358a(intValue2)) {
                    obj3 = m2386d(obj, i, intValue2, obj3, og8Var);
                    it.remove();
                }
            }
        }
        return obj3;
    }

    /* renamed from: d */
    public static Object m2386d(Object obj, int i, int i2, Object obj2, og8 og8Var) {
        if (obj2 == null) {
            obj2 = og8Var.mo10362c(obj);
        }
        og8Var.mo10359f(obj2, i, i2);
        return obj2;
    }

    /* renamed from: e */
    public static void m2385e(o88 o88Var, Object obj, Object obj2) {
        o88Var.mo11576a(obj2);
        throw null;
    }

    /* renamed from: f */
    public static void m2384f(og8 og8Var, Object obj, Object obj2) {
        og8Var.mo10357h(obj, og8Var.mo10360e(og8Var.mo10361d(obj), og8Var.mo10361d(obj2)));
    }

    /* renamed from: g */
    public static void m2383g(Class cls) {
        Class cls2;
        if (!ja8.class.isAssignableFrom(cls) && (cls2 = f35009a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static void m2382h(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2657l(i, list, z);
    }

    /* renamed from: i */
    public static void m2381i(int i, List list, ki8 ki8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2665d(i, list);
    }

    /* renamed from: j */
    public static void m2380j(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2675D(i, list, z);
    }

    /* renamed from: k */
    public static void m2379k(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2651r(i, list, z);
    }

    /* renamed from: l */
    public static void m2378l(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2654o(i, list, z);
    }

    /* renamed from: m */
    public static void m2377m(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2648u(i, list, z);
    }

    /* renamed from: n */
    public static void m2376n(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2672G(i, list, z);
    }

    /* renamed from: o */
    public static void m2375o(int i, List list, ki8 ki8Var, ve8 ve8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((z78) ki8Var).mo2674E(i, list.get(i2), ve8Var);
        }
    }

    /* renamed from: p */
    public static void m2374p(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2653p(i, list, z);
    }

    /* renamed from: q */
    public static void m2373q(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2678A(i, list, z);
    }

    /* renamed from: r */
    public static void m2372r(int i, List list, ki8 ki8Var, ve8 ve8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((z78) ki8Var).mo2664e(i, list.get(i2), ve8Var);
        }
    }

    /* renamed from: s */
    public static void m2371s(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2676C(i, list, z);
    }

    /* renamed from: t */
    public static void m2370t(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2666c(i, list, z);
    }

    /* renamed from: u */
    public static void m2369u(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2643z(i, list, z);
    }

    /* renamed from: v */
    public static void m2368v(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2671H(i, list, z);
    }

    /* renamed from: w */
    public static void m2367w(int i, List list, ki8 ki8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2650s(i, list);
    }

    /* renamed from: x */
    public static void m2366x(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2655n(i, list, z);
    }

    /* renamed from: y */
    public static void m2365y(int i, List list, ki8 ki8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ki8Var.mo2677B(i, list, z);
    }

    /* renamed from: z */
    public static boolean m2364z(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
