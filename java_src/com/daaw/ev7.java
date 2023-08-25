package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class ev7 {

    /* renamed from: a */
    public static final Class f8848a;

    /* renamed from: b */
    public static final tv7 f8849b;

    /* renamed from: c */
    public static final tv7 f8850c;

    /* renamed from: d */
    public static final tv7 f8851d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f8848a = cls;
        f8849b = m23164C(false);
        f8850c = m23164C(true);
        f8851d = new vv7();
    }

    /* renamed from: A */
    public static int m23166A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (qr7.m12256f(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m23165B(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11024k(i, list, z);
    }

    /* renamed from: C */
    public static tv7 m23164C(boolean z) {
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

    /* renamed from: D */
    public static int m23163D(List list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m23162E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m12257e = size * qr7.m12257e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m12257e += qr7.m12265E((yq7) list.get(i2));
        }
        return m12257e;
    }

    /* renamed from: F */
    public static int m23161F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m23160G(list) + (size * qr7.m12257e(i));
    }

    /* renamed from: G */
    public static int m23160G(List list) {
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
                i += qr7.m12263G(ms7Var.m15790e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qr7.m12263G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m23159H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (qr7.m12256f(i << 3) + 4);
    }

    /* renamed from: I */
    public static int m23158I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m23157J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (qr7.m12256f(i << 3) + 8);
    }

    /* renamed from: K */
    public static int m23156K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m23155L(int i, List list, cv7 cv7Var) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += qr7.m12264F(i, (xt7) list.get(i3), cv7Var);
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: M */
    public static int m23154M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m23153N(list) + (size * qr7.m12257e(i));
    }

    /* renamed from: N */
    public static int m23153N(List list) {
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
                i += qr7.m12263G(ms7Var.m15790e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qr7.m12263G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static int m23152O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m23151P(list) + (list.size() * qr7.m12257e(i));
    }

    /* renamed from: P */
    public static int m23151P(List list) {
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
                i += qr7.m12255g(mt7Var.m15769e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qr7.m12255g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m23150Q(int i, Object obj, cv7 cv7Var) {
        if (obj instanceof at7) {
            int m12256f = qr7.m12256f(i << 3);
            int m27033a = ((at7) obj).m27033a();
            return m12256f + qr7.m12256f(m27033a) + m27033a;
        }
        return qr7.m12256f(i << 3) + qr7.m12260b((xt7) obj, cv7Var);
    }

    /* renamed from: R */
    public static int m23149R(int i, List list, cv7 cv7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m12257e = qr7.m12257e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            m12257e += obj instanceof at7 ? qr7.m12262H((at7) obj) : qr7.m12260b((xt7) obj, cv7Var);
        }
        return m12257e;
    }

    /* renamed from: S */
    public static int m23148S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m23147T(list) + (size * qr7.m12257e(i));
    }

    /* renamed from: T */
    public static int m23147T(List list) {
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
                int m15790e = ms7Var.m15790e(i2);
                i += qr7.m12256f((m15790e >> 31) ^ (m15790e + m15790e));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += qr7.m12256f((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m23146U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m23145V(list) + (size * qr7.m12257e(i));
    }

    /* renamed from: V */
    public static int m23145V(List list) {
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
                long m15769e = mt7Var.m15769e(i2);
                i += qr7.m12255g((m15769e >> 63) ^ (m15769e + m15769e));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += qr7.m12255g((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static int m23144W(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m12257e = qr7.m12257e(i) * size;
        if (list instanceof ct7) {
            ct7 ct7Var = (ct7) list;
            while (i2 < size) {
                Object zzf = ct7Var.zzf(i2);
                m12257e += zzf instanceof yq7 ? qr7.m12265E((yq7) zzf) : qr7.m12258d((String) zzf);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                m12257e += obj instanceof yq7 ? qr7.m12265E((yq7) obj) : qr7.m12258d((String) obj);
                i2++;
            }
        }
        return m12257e;
    }

    /* renamed from: X */
    public static int m23143X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m23142Y(list) + (size * qr7.m12257e(i));
    }

    /* renamed from: Y */
    public static int m23142Y(List list) {
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
                i += qr7.m12256f(ms7Var.m15790e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qr7.m12256f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    public static int m23141Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m23139a0(list) + (size * qr7.m12257e(i));
    }

    /* renamed from: a */
    public static tv7 m23140a() {
        return f8850c;
    }

    /* renamed from: a0 */
    public static int m23139a0(List list) {
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
                i += qr7.m12255g(mt7Var.m15769e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qr7.m12255g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static tv7 m23138b() {
        return f8851d;
    }

    /* renamed from: b0 */
    public static tv7 m23137b0() {
        return f8849b;
    }

    /* renamed from: c */
    public static Object m23136c(Object obj, int i, List list, ps7 ps7Var, Object obj2, tv7 tv7Var) {
        if (ps7Var == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (ps7Var.mo3065a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = m23135d(obj, i, intValue, obj2, tv7Var);
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
                if (!ps7Var.mo3065a(intValue2)) {
                    obj2 = m23135d(obj, i, intValue2, obj2, tv7Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    /* renamed from: d */
    public static Object m23135d(Object obj, int i, int i2, Object obj2, tv7 tv7Var) {
        if (obj2 == null) {
            obj2 = tv7Var.mo6725c(obj);
        }
        tv7Var.mo6716l(obj2, i, i2);
        return obj2;
    }

    /* renamed from: e */
    public static void m23134e(wr7 wr7Var, Object obj, Object obj2) {
        wr7Var.mo4784a(obj2);
        throw null;
    }

    /* renamed from: f */
    public static void m23133f(tv7 tv7Var, Object obj, Object obj2) {
        tv7Var.mo6713o(obj, tv7Var.mo6723e(tv7Var.mo6724d(obj), tv7Var.mo6724d(obj2)));
    }

    /* renamed from: g */
    public static void m23132g(Class cls) {
        Class cls2;
        if (!ls7.class.isAssignableFrom(cls) && (cls2 = f8848a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static boolean m23131h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: i */
    public static void m23130i(st7 st7Var, Object obj, Object obj2, long j) {
        gw7.m21190D(obj, j, st7.m9883c(gw7.m21170p(obj, j), gw7.m21170p(obj2, j)));
    }

    /* renamed from: j */
    public static void m23129j(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11021n(i, list, z);
    }

    /* renamed from: k */
    public static void m23128k(int i, List list, rr7 rr7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11019p(i, list);
    }

    /* renamed from: l */
    public static void m23127l(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11017r(i, list, z);
    }

    /* renamed from: m */
    public static void m23126m(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11014u(i, list, z);
    }

    /* renamed from: n */
    public static void m23125n(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11012w(i, list, z);
    }

    /* renamed from: o */
    public static void m23124o(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11010y(i, list, z);
    }

    /* renamed from: p */
    public static void m23123p(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11045A(i, list, z);
    }

    /* renamed from: q */
    public static void m23122q(int i, List list, rr7 rr7Var, cv7 cv7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            rr7Var.m11044B(i, list.get(i2), cv7Var);
        }
    }

    /* renamed from: r */
    public static void m23121r(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11042D(i, list, z);
    }

    /* renamed from: s */
    public static void m23120s(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11040F(i, list, z);
    }

    /* renamed from: t */
    public static void m23119t(int i, List list, rr7 rr7Var, cv7 cv7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            rr7Var.m11039G(i, list.get(i2), cv7Var);
        }
    }

    /* renamed from: u */
    public static void m23118u(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11037I(i, list, z);
    }

    /* renamed from: v */
    public static void m23117v(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11035K(i, list, z);
    }

    /* renamed from: w */
    public static void m23116w(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11033b(i, list, z);
    }

    /* renamed from: x */
    public static void m23115x(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11031d(i, list, z);
    }

    /* renamed from: y */
    public static void m23114y(int i, List list, rr7 rr7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11028g(i, list);
    }

    /* renamed from: z */
    public static void m23113z(int i, List list, rr7 rr7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rr7Var.m11026i(i, list, z);
    }
}
