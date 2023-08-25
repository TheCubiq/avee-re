package com.daaw;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class j6<E> implements Collection<E>, Set<E> {
    public static final int[] t = new int[0];
    public static final Object[] u = new Object[0];
    public static Object[] v;
    public static int w;
    public static Object[] x;
    public static int y;
    public int[] p;
    public Object[] q;
    public int r;
    public ym0<E, E> s;

    /* loaded from: classes.dex */
    public class a extends ym0<E, E> {
        public a() {
        }

        @Override // com.daaw.ym0
        public void a() {
            j6.this.clear();
        }

        @Override // com.daaw.ym0
        public Object b(int i, int i2) {
            return j6.this.q[i];
        }

        @Override // com.daaw.ym0
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // com.daaw.ym0
        public int d() {
            return j6.this.r;
        }

        @Override // com.daaw.ym0
        public int e(Object obj) {
            return j6.this.indexOf(obj);
        }

        @Override // com.daaw.ym0
        public int f(Object obj) {
            return j6.this.indexOf(obj);
        }

        @Override // com.daaw.ym0
        public void g(E e, E e2) {
            j6.this.add(e);
        }

        @Override // com.daaw.ym0
        public void h(int i) {
            j6.this.m(i);
        }

        @Override // com.daaw.ym0
        public E i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public j6() {
        this(0);
    }

    public j6(int i) {
        if (i == 0) {
            this.p = t;
            this.q = u;
        } else {
            d(i);
        }
        this.r = 0;
    }

    public static void f(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (j6.class) {
                if (y < 10) {
                    objArr[0] = x;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    x = objArr;
                    y++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (j6.class) {
                if (w < 10) {
                    objArr[0] = v;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    v = objArr;
                    w++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int j;
        if (e == null) {
            j = k();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            j = j(e, hashCode);
        }
        if (j >= 0) {
            return false;
        }
        int i2 = j ^ (-1);
        int i3 = this.r;
        int[] iArr = this.p;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.q;
            d(i4);
            int[] iArr2 = this.p;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.q, 0, objArr.length);
            }
            f(iArr, objArr, this.r);
        }
        int i5 = this.r;
        if (i2 < i5) {
            int[] iArr3 = this.p;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.q;
            System.arraycopy(objArr2, i2, objArr2, i6, this.r - i2);
        }
        this.p[i2] = i;
        this.q[i2] = e;
        this.r++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        e(this.r + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.r;
        if (i != 0) {
            f(this.p, this.q, i);
            this.p = t;
            this.q = u;
            this.r = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i) {
        if (i == 8) {
            synchronized (j6.class) {
                Object[] objArr = x;
                if (objArr != null) {
                    this.q = objArr;
                    x = (Object[]) objArr[0];
                    this.p = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    y--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (j6.class) {
                Object[] objArr2 = v;
                if (objArr2 != null) {
                    this.q = objArr2;
                    v = (Object[]) objArr2[0];
                    this.p = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    w--;
                    return;
                }
            }
        }
        this.p = new int[i];
        this.q = new Object[i];
    }

    public void e(int i) {
        int[] iArr = this.p;
        if (iArr.length < i) {
            Object[] objArr = this.q;
            d(i);
            int i2 = this.r;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.p, 0, i2);
                System.arraycopy(objArr, 0, this.q, 0, this.r);
            }
            f(iArr, objArr, this.r);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.r; i++) {
                try {
                    if (!set.contains(n(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final ym0<E, E> h() {
        if (this.s == null) {
            this.s = new a();
        }
        return this.s;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.p;
        int i = this.r;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? k() : j(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.r <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return h().m().iterator();
    }

    public final int j(Object obj, int i) {
        int i2 = this.r;
        if (i2 == 0) {
            return -1;
        }
        int a2 = ck.a(this.p, i2, i);
        if (a2 >= 0 && !obj.equals(this.q[a2])) {
            int i3 = a2 + 1;
            while (i3 < i2 && this.p[i3] == i) {
                if (obj.equals(this.q[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.p[i4] == i; i4--) {
                if (obj.equals(this.q[i4])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return a2;
    }

    public final int k() {
        int i = this.r;
        if (i == 0) {
            return -1;
        }
        int a2 = ck.a(this.p, i, 0);
        if (a2 >= 0 && this.q[a2] != null) {
            int i2 = a2 + 1;
            while (i2 < i && this.p[i2] == 0) {
                if (this.q[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = a2 - 1; i3 >= 0 && this.p[i3] == 0; i3--) {
                if (this.q[i3] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return a2;
    }

    public E m(int i) {
        Object[] objArr = this.q;
        E e = (E) objArr[i];
        int i2 = this.r;
        if (i2 <= 1) {
            f(this.p, objArr, i2);
            this.p = t;
            this.q = u;
            this.r = 0;
        } else {
            int[] iArr = this.p;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.r = i3;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
                    Object[] objArr2 = this.q;
                    System.arraycopy(objArr2, i4, objArr2, i, this.r - i);
                }
                this.q[this.r] = null;
            } else {
                d(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.r--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.p, 0, i);
                    System.arraycopy(objArr, 0, this.q, 0, i);
                }
                int i5 = this.r;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.p, i, i5 - i);
                    System.arraycopy(objArr, i6, this.q, i, this.r - i);
                }
            }
        }
        return e;
    }

    public E n(int i) {
        return (E) this.q[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.r - 1; i >= 0; i--) {
            if (!collection.contains(this.q[i])) {
                m(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.r;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.r;
        Object[] objArr = new Object[i];
        System.arraycopy(this.q, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.r) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.r));
        }
        System.arraycopy(this.q, 0, tArr, 0, this.r);
        int length = tArr.length;
        int i = this.r;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.r * 14);
        sb.append('{');
        for (int i = 0; i < this.r; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E n = n(i);
            if (n != this) {
                sb.append(n);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
