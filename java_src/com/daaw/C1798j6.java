package com.daaw;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: com.daaw.j6 */
/* loaded from: classes.dex */
public final class C1798j6<E> implements Collection<E>, Set<E> {

    /* renamed from: t */
    public static final int[] f14434t = new int[0];

    /* renamed from: u */
    public static final Object[] f14435u = new Object[0];

    /* renamed from: v */
    public static Object[] f14436v;

    /* renamed from: w */
    public static int f14437w;

    /* renamed from: x */
    public static Object[] f14438x;

    /* renamed from: y */
    public static int f14439y;

    /* renamed from: p */
    public int[] f14440p;

    /* renamed from: q */
    public Object[] f14441q;

    /* renamed from: r */
    public int f14442r;

    /* renamed from: s */
    public ym0<E, E> f14443s;

    /* renamed from: com.daaw.j6$a */
    /* loaded from: classes.dex */
    public class C1799a extends ym0<E, E> {
        public C1799a() {
        }

        @Override // com.daaw.ym0
        /* renamed from: a */
        public void mo3535a() {
            C1798j6.this.clear();
        }

        @Override // com.daaw.ym0
        /* renamed from: b */
        public Object mo3534b(int i, int i2) {
            return C1798j6.this.f14441q[i];
        }

        @Override // com.daaw.ym0
        /* renamed from: c */
        public Map<E, E> mo3533c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // com.daaw.ym0
        /* renamed from: d */
        public int mo3532d() {
            return C1798j6.this.f14442r;
        }

        @Override // com.daaw.ym0
        /* renamed from: e */
        public int mo3531e(Object obj) {
            return C1798j6.this.indexOf(obj);
        }

        @Override // com.daaw.ym0
        /* renamed from: f */
        public int mo3530f(Object obj) {
            return C1798j6.this.indexOf(obj);
        }

        @Override // com.daaw.ym0
        /* renamed from: g */
        public void mo3529g(E e, E e2) {
            C1798j6.this.add(e);
        }

        @Override // com.daaw.ym0
        /* renamed from: h */
        public void mo3528h(int i) {
            C1798j6.this.m18788m(i);
        }

        @Override // com.daaw.ym0
        /* renamed from: i */
        public E mo3527i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C1798j6() {
        this(0);
    }

    public C1798j6(int i) {
        if (i == 0) {
            this.f14440p = f14434t;
            this.f14441q = f14435u;
        } else {
            m18794d(i);
        }
        this.f14442r = 0;
    }

    /* renamed from: f */
    public static void m18792f(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1798j6.class) {
                if (f14439y < 10) {
                    objArr[0] = f14438x;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f14438x = objArr;
                    f14439y++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C1798j6.class) {
                if (f14437w < 10) {
                    objArr[0] = f14436v;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f14436v = objArr;
                    f14437w++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int m18790j;
        if (e == null) {
            m18790j = m18789k();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m18790j = m18790j(e, hashCode);
        }
        if (m18790j >= 0) {
            return false;
        }
        int i2 = m18790j ^ (-1);
        int i3 = this.f14442r;
        int[] iArr = this.f14440p;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.f14441q;
            m18794d(i4);
            int[] iArr2 = this.f14440p;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f14441q, 0, objArr.length);
            }
            m18792f(iArr, objArr, this.f14442r);
        }
        int i5 = this.f14442r;
        if (i2 < i5) {
            int[] iArr3 = this.f14440p;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f14441q;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f14442r - i2);
        }
        this.f14440p[i2] = i;
        this.f14441q[i2] = e;
        this.f14442r++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m18793e(this.f14442r + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f14442r;
        if (i != 0) {
            m18792f(this.f14440p, this.f14441q, i);
            this.f14440p = f14434t;
            this.f14441q = f14435u;
            this.f14442r = 0;
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

    /* renamed from: d */
    public final void m18794d(int i) {
        if (i == 8) {
            synchronized (C1798j6.class) {
                Object[] objArr = f14438x;
                if (objArr != null) {
                    this.f14441q = objArr;
                    f14438x = (Object[]) objArr[0];
                    this.f14440p = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f14439y--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1798j6.class) {
                Object[] objArr2 = f14436v;
                if (objArr2 != null) {
                    this.f14441q = objArr2;
                    f14436v = (Object[]) objArr2[0];
                    this.f14440p = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f14437w--;
                    return;
                }
            }
        }
        this.f14440p = new int[i];
        this.f14441q = new Object[i];
    }

    /* renamed from: e */
    public void m18793e(int i) {
        int[] iArr = this.f14440p;
        if (iArr.length < i) {
            Object[] objArr = this.f14441q;
            m18794d(i);
            int i2 = this.f14442r;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f14440p, 0, i2);
                System.arraycopy(objArr, 0, this.f14441q, 0, this.f14442r);
            }
            m18792f(iArr, objArr, this.f14442r);
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
            for (int i = 0; i < this.f14442r; i++) {
                try {
                    if (!set.contains(m18787n(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final ym0<E, E> m18791h() {
        if (this.f14443s == null) {
            this.f14443s = new C1799a();
        }
        return this.f14443s;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f14440p;
        int i = this.f14442r;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m18789k() : m18790j(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f14442r <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m18791h().m3523m().iterator();
    }

    /* renamed from: j */
    public final int m18790j(Object obj, int i) {
        int i2 = this.f14442r;
        if (i2 == 0) {
            return -1;
        }
        int m25300a = C0957ck.m25300a(this.f14440p, i2, i);
        if (m25300a >= 0 && !obj.equals(this.f14441q[m25300a])) {
            int i3 = m25300a + 1;
            while (i3 < i2 && this.f14440p[i3] == i) {
                if (obj.equals(this.f14441q[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m25300a - 1; i4 >= 0 && this.f14440p[i4] == i; i4--) {
                if (obj.equals(this.f14441q[i4])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return m25300a;
    }

    /* renamed from: k */
    public final int m18789k() {
        int i = this.f14442r;
        if (i == 0) {
            return -1;
        }
        int m25300a = C0957ck.m25300a(this.f14440p, i, 0);
        if (m25300a >= 0 && this.f14441q[m25300a] != null) {
            int i2 = m25300a + 1;
            while (i2 < i && this.f14440p[i2] == 0) {
                if (this.f14441q[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m25300a - 1; i3 >= 0 && this.f14440p[i3] == 0; i3--) {
                if (this.f14441q[i3] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return m25300a;
    }

    /* renamed from: m */
    public E m18788m(int i) {
        Object[] objArr = this.f14441q;
        E e = (E) objArr[i];
        int i2 = this.f14442r;
        if (i2 <= 1) {
            m18792f(this.f14440p, objArr, i2);
            this.f14440p = f14434t;
            this.f14441q = f14435u;
            this.f14442r = 0;
        } else {
            int[] iArr = this.f14440p;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.f14442r = i3;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
                    Object[] objArr2 = this.f14441q;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f14442r - i);
                }
                this.f14441q[this.f14442r] = null;
            } else {
                m18794d(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.f14442r--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f14440p, 0, i);
                    System.arraycopy(objArr, 0, this.f14441q, 0, i);
                }
                int i5 = this.f14442r;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.f14440p, i, i5 - i);
                    System.arraycopy(objArr, i6, this.f14441q, i, this.f14442r - i);
                }
            }
        }
        return e;
    }

    /* renamed from: n */
    public E m18787n(int i) {
        return (E) this.f14441q[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m18788m(indexOf);
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
        for (int i = this.f14442r - 1; i >= 0; i--) {
            if (!collection.contains(this.f14441q[i])) {
                m18788m(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f14442r;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f14442r;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f14441q, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f14442r) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f14442r));
        }
        System.arraycopy(this.f14441q, 0, tArr, 0, this.f14442r);
        int length = tArr.length;
        int i = this.f14442r;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14442r * 14);
        sb.append('{');
        for (int i = 0; i < this.f14442r; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E m18787n = m18787n(i);
            if (m18787n != this) {
                sb.append(m18787n);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
