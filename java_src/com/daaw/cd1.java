package com.daaw;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes.dex */
public class cd1<K, V> {

    /* renamed from: s */
    public static Object[] f5733s;

    /* renamed from: t */
    public static int f5734t;

    /* renamed from: u */
    public static Object[] f5735u;

    /* renamed from: v */
    public static int f5736v;

    /* renamed from: p */
    public int[] f5737p;

    /* renamed from: q */
    public Object[] f5738q;

    /* renamed from: r */
    public int f5739r;

    public cd1() {
        this.f5737p = C0957ck.f5884a;
        this.f5738q = C0957ck.f5886c;
        this.f5739r = 0;
    }

    public cd1(int i) {
        if (i == 0) {
            this.f5737p = C0957ck.f5884a;
            this.f5738q = C0957ck.f5886c;
        } else {
            m25444a(i);
        }
        this.f5739r = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cd1(cd1<K, V> cd1Var) {
        this();
        if (cd1Var != 0) {
            m25435j(cd1Var);
        }
    }

    /* renamed from: a */
    private void m25444a(int i) {
        if (i == 8) {
            synchronized (cd1.class) {
                Object[] objArr = f5735u;
                if (objArr != null) {
                    this.f5738q = objArr;
                    f5735u = (Object[]) objArr[0];
                    this.f5737p = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f5736v--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cd1.class) {
                Object[] objArr2 = f5733s;
                if (objArr2 != null) {
                    this.f5738q = objArr2;
                    f5733s = (Object[]) objArr2[0];
                    this.f5737p = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f5734t--;
                    return;
                }
            }
        }
        this.f5737p = new int[i];
        this.f5738q = new Object[i << 1];
    }

    /* renamed from: b */
    public static int m25443b(int[] iArr, int i, int i2) {
        try {
            return C0957ck.m25300a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    public static void m25441d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (cd1.class) {
                if (f5736v < 10) {
                    objArr[0] = f5735u;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f5735u = objArr;
                    f5736v++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cd1.class) {
                if (f5734t < 10) {
                    objArr[0] = f5733s;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f5733s = objArr;
                    f5734t++;
                }
            }
        }
    }

    /* renamed from: c */
    public void m25442c(int i) {
        int i2 = this.f5739r;
        int[] iArr = this.f5737p;
        if (iArr.length < i) {
            Object[] objArr = this.f5738q;
            m25444a(i);
            if (this.f5739r > 0) {
                System.arraycopy(iArr, 0, this.f5737p, 0, i2);
                System.arraycopy(objArr, 0, this.f5738q, 0, i2 << 1);
            }
            m25441d(iArr, objArr, i2);
        }
        if (this.f5739r != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f5739r;
        if (i > 0) {
            int[] iArr = this.f5737p;
            Object[] objArr = this.f5738q;
            this.f5737p = C0957ck.f5884a;
            this.f5738q = C0957ck.f5886c;
            this.f5739r = 0;
            m25441d(iArr, objArr, i);
        }
        if (this.f5739r > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m25439f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m25437h(obj) >= 0;
    }

    /* renamed from: e */
    public int m25440e(Object obj, int i) {
        int i2 = this.f5739r;
        if (i2 == 0) {
            return -1;
        }
        int m25443b = m25443b(this.f5737p, i2, i);
        if (m25443b >= 0 && !obj.equals(this.f5738q[m25443b << 1])) {
            int i3 = m25443b + 1;
            while (i3 < i2 && this.f5737p[i3] == i) {
                if (obj.equals(this.f5738q[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m25443b - 1; i4 >= 0 && this.f5737p[i4] == i; i4--) {
                if (obj.equals(this.f5738q[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return m25443b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cd1) {
            cd1 cd1Var = (cd1) obj;
            if (size() != cd1Var.size()) {
                return false;
            }
            for (int i = 0; i < this.f5739r; i++) {
                try {
                    K m25436i = m25436i(i);
                    V m25432m = m25432m(i);
                    Object obj2 = cd1Var.get(m25436i);
                    if (m25432m == null) {
                        if (obj2 != null || !cd1Var.containsKey(m25436i)) {
                            return false;
                        }
                    } else if (!m25432m.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f5739r; i2++) {
                try {
                    K m25436i2 = m25436i(i2);
                    V m25432m2 = m25432m(i2);
                    Object obj3 = map.get(m25436i2);
                    if (m25432m2 == null) {
                        if (obj3 != null || !map.containsKey(m25436i2)) {
                            return false;
                        }
                    } else if (!m25432m2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m25439f(Object obj) {
        return obj == null ? m25438g() : m25440e(obj, obj.hashCode());
    }

    /* renamed from: g */
    public int m25438g() {
        int i = this.f5739r;
        if (i == 0) {
            return -1;
        }
        int m25443b = m25443b(this.f5737p, i, 0);
        if (m25443b >= 0 && this.f5738q[m25443b << 1] != null) {
            int i2 = m25443b + 1;
            while (i2 < i && this.f5737p[i2] == 0) {
                if (this.f5738q[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m25443b - 1; i3 >= 0 && this.f5737p[i3] == 0; i3--) {
                if (this.f5738q[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return m25443b;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int m25439f = m25439f(obj);
        return m25439f >= 0 ? (V) this.f5738q[(m25439f << 1) + 1] : v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m25437h(Object obj) {
        int i = this.f5739r * 2;
        Object[] objArr = this.f5738q;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f5737p;
        Object[] objArr = this.f5738q;
        int i = this.f5739r;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public K m25436i(int i) {
        return (K) this.f5738q[i << 1];
    }

    public boolean isEmpty() {
        return this.f5739r <= 0;
    }

    /* renamed from: j */
    public void m25435j(cd1<? extends K, ? extends V> cd1Var) {
        int i = cd1Var.f5739r;
        m25442c(this.f5739r + i);
        if (this.f5739r != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(cd1Var.m25436i(i2), cd1Var.m25432m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(cd1Var.f5737p, 0, this.f5737p, 0, i);
            System.arraycopy(cd1Var.f5738q, 0, this.f5738q, 0, i << 1);
            this.f5739r = i;
        }
    }

    /* renamed from: k */
    public V m25434k(int i) {
        Object[] objArr = this.f5738q;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f5739r;
        int i4 = 0;
        if (i3 <= 1) {
            m25441d(this.f5737p, objArr, i3);
            this.f5737p = C0957ck.f5884a;
            this.f5738q = C0957ck.f5886c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f5737p;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f5738q;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f5738q;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m25444a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f5739r) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f5737p, 0, i);
                    System.arraycopy(objArr, 0, this.f5738q, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f5737p, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f5738q, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.f5739r) {
            this.f5739r = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: l */
    public V m25433l(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f5738q;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: m */
    public V m25432m(int i) {
        return (V) this.f5738q[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int m25440e;
        int i2 = this.f5739r;
        if (k == null) {
            m25440e = m25438g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m25440e = m25440e(k, hashCode);
        }
        if (m25440e >= 0) {
            int i3 = (m25440e << 1) + 1;
            Object[] objArr = this.f5738q;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = m25440e ^ (-1);
        int[] iArr = this.f5737p;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.f5738q;
            m25444a(i5);
            if (i2 != this.f5739r) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f5737p;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f5738q, 0, objArr2.length);
            }
            m25441d(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f5737p;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f5738q;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f5739r - i4) << 1);
        }
        int i7 = this.f5739r;
        if (i2 == i7) {
            int[] iArr4 = this.f5737p;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f5738q;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f5739r = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int m25439f = m25439f(obj);
        if (m25439f >= 0) {
            return m25434k(m25439f);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int m25439f = m25439f(obj);
        if (m25439f >= 0) {
            V m25432m = m25432m(m25439f);
            if (obj2 == m25432m || (obj2 != null && obj2.equals(m25432m))) {
                m25434k(m25439f);
                return true;
            }
            return false;
        }
        return false;
    }

    public V replace(K k, V v) {
        int m25439f = m25439f(k);
        if (m25439f >= 0) {
            return m25433l(m25439f, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int m25439f = m25439f(k);
        if (m25439f >= 0) {
            V m25432m = m25432m(m25439f);
            if (m25432m == v || (v != null && v.equals(m25432m))) {
                m25433l(m25439f, v2);
                return true;
            }
            return false;
        }
        return false;
    }

    public int size() {
        return this.f5739r;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5739r * 28);
        sb.append('{');
        for (int i = 0; i < this.f5739r; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K m25436i = m25436i(i);
            if (m25436i != this) {
                sb.append(m25436i);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m25432m = m25432m(i);
            if (m25432m != this) {
                sb.append(m25432m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
