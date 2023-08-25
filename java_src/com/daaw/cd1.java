package com.daaw;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes.dex */
public class cd1<K, V> {
    public static Object[] s;
    public static int t;
    public static Object[] u;
    public static int v;
    public int[] p;
    public Object[] q;
    public int r;

    public cd1() {
        this.p = ck.a;
        this.q = ck.c;
        this.r = 0;
    }

    public cd1(int i) {
        if (i == 0) {
            this.p = ck.a;
            this.q = ck.c;
        } else {
            a(i);
        }
        this.r = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cd1(cd1<K, V> cd1Var) {
        this();
        if (cd1Var != 0) {
            j(cd1Var);
        }
    }

    private void a(int i) {
        if (i == 8) {
            synchronized (cd1.class) {
                Object[] objArr = u;
                if (objArr != null) {
                    this.q = objArr;
                    u = (Object[]) objArr[0];
                    this.p = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    v--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cd1.class) {
                Object[] objArr2 = s;
                if (objArr2 != null) {
                    this.q = objArr2;
                    s = (Object[]) objArr2[0];
                    this.p = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    t--;
                    return;
                }
            }
        }
        this.p = new int[i];
        this.q = new Object[i << 1];
    }

    public static int b(int[] iArr, int i, int i2) {
        try {
            return ck.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (cd1.class) {
                if (v < 10) {
                    objArr[0] = u;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    u = objArr;
                    v++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cd1.class) {
                if (t < 10) {
                    objArr[0] = s;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    s = objArr;
                    t++;
                }
            }
        }
    }

    public void c(int i) {
        int i2 = this.r;
        int[] iArr = this.p;
        if (iArr.length < i) {
            Object[] objArr = this.q;
            a(i);
            if (this.r > 0) {
                System.arraycopy(iArr, 0, this.p, 0, i2);
                System.arraycopy(objArr, 0, this.q, 0, i2 << 1);
            }
            d(iArr, objArr, i2);
        }
        if (this.r != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.r;
        if (i > 0) {
            int[] iArr = this.p;
            Object[] objArr = this.q;
            this.p = ck.a;
            this.q = ck.c;
            this.r = 0;
            d(iArr, objArr, i);
        }
        if (this.r > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public int e(Object obj, int i) {
        int i2 = this.r;
        if (i2 == 0) {
            return -1;
        }
        int b = b(this.p, i2, i);
        if (b >= 0 && !obj.equals(this.q[b << 1])) {
            int i3 = b + 1;
            while (i3 < i2 && this.p[i3] == i) {
                if (obj.equals(this.q[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = b - 1; i4 >= 0 && this.p[i4] == i; i4--) {
                if (obj.equals(this.q[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return b;
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
            for (int i = 0; i < this.r; i++) {
                try {
                    K i2 = i(i);
                    V m = m(i);
                    Object obj2 = cd1Var.get(i2);
                    if (m == null) {
                        if (obj2 != null || !cd1Var.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
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
            for (int i3 = 0; i3 < this.r; i3++) {
                try {
                    K i4 = i(i3);
                    V m2 = m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public int g() {
        int i = this.r;
        if (i == 0) {
            return -1;
        }
        int b = b(this.p, i, 0);
        if (b >= 0 && this.q[b << 1] != null) {
            int i2 = b + 1;
            while (i2 < i && this.p[i2] == 0) {
                if (this.q[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = b - 1; i3 >= 0 && this.p[i3] == 0; i3--) {
                if (this.q[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return b;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v2) {
        int f = f(obj);
        return f >= 0 ? (V) this.q[(f << 1) + 1] : v2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(Object obj) {
        int i = this.r * 2;
        Object[] objArr = this.q;
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
        int[] iArr = this.p;
        Object[] objArr = this.q;
        int i = this.r;
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

    public K i(int i) {
        return (K) this.q[i << 1];
    }

    public boolean isEmpty() {
        return this.r <= 0;
    }

    public void j(cd1<? extends K, ? extends V> cd1Var) {
        int i = cd1Var.r;
        c(this.r + i);
        if (this.r != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(cd1Var.i(i2), cd1Var.m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(cd1Var.p, 0, this.p, 0, i);
            System.arraycopy(cd1Var.q, 0, this.q, 0, i << 1);
            this.r = i;
        }
    }

    public V k(int i) {
        Object[] objArr = this.q;
        int i2 = i << 1;
        V v2 = (V) objArr[i2 + 1];
        int i3 = this.r;
        int i4 = 0;
        if (i3 <= 1) {
            d(this.p, objArr, i3);
            this.p = ck.a;
            this.q = ck.c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.p;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.q;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.q;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.r) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.p, 0, i);
                    System.arraycopy(objArr, 0, this.q, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.p, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.q, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.r) {
            this.r = i4;
            return v2;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i, V v2) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.q;
        V v3 = (V) objArr[i2];
        objArr[i2] = v2;
        return v3;
    }

    public V m(int i) {
        return (V) this.q[(i << 1) + 1];
    }

    public V put(K k, V v2) {
        int i;
        int e;
        int i2 = this.r;
        if (k == null) {
            e = g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            e = e(k, hashCode);
        }
        if (e >= 0) {
            int i3 = (e << 1) + 1;
            Object[] objArr = this.q;
            V v3 = (V) objArr[i3];
            objArr[i3] = v2;
            return v3;
        }
        int i4 = e ^ (-1);
        int[] iArr = this.p;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.q;
            a(i5);
            if (i2 != this.r) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.p;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.q, 0, objArr2.length);
            }
            d(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.p;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.q;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.r - i4) << 1);
        }
        int i7 = this.r;
        if (i2 == i7) {
            int[] iArr4 = this.p;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.q;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v2;
                this.r = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v2) {
        V v3 = get(k);
        return v3 == null ? put(k, v2) : v3;
    }

    public V remove(Object obj) {
        int f = f(obj);
        if (f >= 0) {
            return k(f);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f = f(obj);
        if (f >= 0) {
            V m = m(f);
            if (obj2 == m || (obj2 != null && obj2.equals(m))) {
                k(f);
                return true;
            }
            return false;
        }
        return false;
    }

    public V replace(K k, V v2) {
        int f = f(k);
        if (f >= 0) {
            return l(f, v2);
        }
        return null;
    }

    public boolean replace(K k, V v2, V v3) {
        int f = f(k);
        if (f >= 0) {
            V m = m(f);
            if (m == v2 || (v2 != null && v2.equals(m))) {
                l(f, v3);
                return true;
            }
            return false;
        }
        return false;
    }

    public int size() {
        return this.r;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.r * 28);
        sb.append('{');
        for (int i = 0; i < this.r; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K i2 = i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m = m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
