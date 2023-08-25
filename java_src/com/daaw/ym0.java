package com.daaw;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class ym0<K, V> {

    /* renamed from: a */
    public ym0<K, V>.C3719b f33797a;

    /* renamed from: b */
    public ym0<K, V>.C3720c f33798b;

    /* renamed from: c */
    public ym0<K, V>.C3722e f33799c;

    /* renamed from: com.daaw.ym0$a */
    /* loaded from: classes.dex */
    public final class C3718a<T> implements Iterator<T> {

        /* renamed from: p */
        public final int f33800p;

        /* renamed from: q */
        public int f33801q;

        /* renamed from: r */
        public int f33802r;

        /* renamed from: s */
        public boolean f33803s = false;

        public C3718a(int i) {
            this.f33800p = i;
            this.f33801q = ym0.this.mo3532d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33802r < this.f33801q;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) ym0.this.mo3534b(this.f33802r, this.f33800p);
                this.f33802r++;
                this.f33803s = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f33803s) {
                throw new IllegalStateException();
            }
            int i = this.f33802r - 1;
            this.f33802r = i;
            this.f33801q--;
            this.f33803s = false;
            ym0.this.mo3528h(i);
        }
    }

    /* renamed from: com.daaw.ym0$b */
    /* loaded from: classes.dex */
    public final class C3719b implements Set<Map.Entry<K, V>> {
        public C3719b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo3532d = ym0.this.mo3532d();
            for (Map.Entry<K, V> entry : collection) {
                ym0.this.mo3529g(entry.getKey(), entry.getValue());
            }
            return mo3532d != ym0.this.mo3532d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            ym0.this.mo3535a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int mo3531e = ym0.this.mo3531e(entry.getKey());
                if (mo3531e < 0) {
                    return false;
                }
                return C0957ck.m25298c(ym0.this.mo3534b(mo3531e, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: d */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return ym0.m3525k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo3532d = ym0.this.mo3532d() - 1; mo3532d >= 0; mo3532d--) {
                Object mo3534b = ym0.this.mo3534b(mo3532d, 0);
                Object mo3534b2 = ym0.this.mo3534b(mo3532d, 1);
                i += (mo3534b == null ? 0 : mo3534b.hashCode()) ^ (mo3534b2 == null ? 0 : mo3534b2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ym0.this.mo3532d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C3721d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return ym0.this.mo3532d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.daaw.ym0$c */
    /* loaded from: classes.dex */
    public final class C3720c implements Set<K> {
        public C3720c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            ym0.this.mo3535a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return ym0.this.mo3531e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return ym0.m3526j(ym0.this.mo3533c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return ym0.m3525k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo3532d = ym0.this.mo3532d() - 1; mo3532d >= 0; mo3532d--) {
                Object mo3534b = ym0.this.mo3534b(mo3532d, 0);
                i += mo3534b == null ? 0 : mo3534b.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ym0.this.mo3532d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C3718a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo3531e = ym0.this.mo3531e(obj);
            if (mo3531e >= 0) {
                ym0.this.mo3528h(mo3531e);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return ym0.m3521o(ym0.this.mo3533c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return ym0.m3520p(ym0.this.mo3533c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return ym0.this.mo3532d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return ym0.this.m3519q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ym0.this.m3518r(tArr, 0);
        }
    }

    /* renamed from: com.daaw.ym0$d */
    /* loaded from: classes.dex */
    public final class C3721d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: p */
        public int f33807p;

        /* renamed from: r */
        public boolean f33809r = false;

        /* renamed from: q */
        public int f33808q = -1;

        public C3721d() {
            this.f33807p = ym0.this.mo3532d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f33808q++;
                this.f33809r = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f33809r) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return C0957ck.m25298c(entry.getKey(), ym0.this.mo3534b(this.f33808q, 0)) && C0957ck.m25298c(entry.getValue(), ym0.this.mo3534b(this.f33808q, 1));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f33809r) {
                return (K) ym0.this.mo3534b(this.f33808q, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f33809r) {
                return (V) ym0.this.mo3534b(this.f33808q, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33808q < this.f33807p;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f33809r) {
                Object mo3534b = ym0.this.mo3534b(this.f33808q, 0);
                Object mo3534b2 = ym0.this.mo3534b(this.f33808q, 1);
                return (mo3534b == null ? 0 : mo3534b.hashCode()) ^ (mo3534b2 != null ? mo3534b2.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f33809r) {
                throw new IllegalStateException();
            }
            ym0.this.mo3528h(this.f33808q);
            this.f33808q--;
            this.f33807p--;
            this.f33809r = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f33809r) {
                return (V) ym0.this.mo3527i(this.f33808q, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: com.daaw.ym0$e */
    /* loaded from: classes.dex */
    public final class C3722e implements Collection<V> {
        public C3722e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            ym0.this.mo3535a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return ym0.this.mo3530f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return ym0.this.mo3532d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C3718a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo3530f = ym0.this.mo3530f(obj);
            if (mo3530f >= 0) {
                ym0.this.mo3528h(mo3530f);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo3532d = ym0.this.mo3532d();
            int i = 0;
            boolean z = false;
            while (i < mo3532d) {
                if (collection.contains(ym0.this.mo3534b(i, 1))) {
                    ym0.this.mo3528h(i);
                    i--;
                    mo3532d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo3532d = ym0.this.mo3532d();
            int i = 0;
            boolean z = false;
            while (i < mo3532d) {
                if (!collection.contains(ym0.this.mo3534b(i, 1))) {
                    ym0.this.mo3528h(i);
                    i--;
                    mo3532d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return ym0.this.mo3532d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return ym0.this.m3519q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ym0.this.m3518r(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m3526j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m3525k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m3521o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m3520p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public abstract void mo3535a();

    /* renamed from: b */
    public abstract Object mo3534b(int i, int i2);

    /* renamed from: c */
    public abstract Map<K, V> mo3533c();

    /* renamed from: d */
    public abstract int mo3532d();

    /* renamed from: e */
    public abstract int mo3531e(Object obj);

    /* renamed from: f */
    public abstract int mo3530f(Object obj);

    /* renamed from: g */
    public abstract void mo3529g(K k, V v);

    /* renamed from: h */
    public abstract void mo3528h(int i);

    /* renamed from: i */
    public abstract V mo3527i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> m3524l() {
        if (this.f33797a == null) {
            this.f33797a = new C3719b();
        }
        return this.f33797a;
    }

    /* renamed from: m */
    public Set<K> m3523m() {
        if (this.f33798b == null) {
            this.f33798b = new C3720c();
        }
        return this.f33798b;
    }

    /* renamed from: n */
    public Collection<V> m3522n() {
        if (this.f33799c == null) {
            this.f33799c = new C3722e();
        }
        return this.f33799c;
    }

    /* renamed from: q */
    public Object[] m3519q(int i) {
        int mo3532d = mo3532d();
        Object[] objArr = new Object[mo3532d];
        for (int i2 = 0; i2 < mo3532d; i2++) {
            objArr[i2] = mo3534b(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public <T> T[] m3518r(T[] tArr, int i) {
        int mo3532d = mo3532d();
        if (tArr.length < mo3532d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo3532d));
        }
        for (int i2 = 0; i2 < mo3532d; i2++) {
            tArr[i2] = mo3534b(i2, i);
        }
        if (tArr.length > mo3532d) {
            tArr[mo3532d] = null;
        }
        return tArr;
    }
}
