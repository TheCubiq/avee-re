package com.daaw;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class v71<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: p */
    public C3310c<K, V> f29976p;

    /* renamed from: q */
    public C3310c<K, V> f29977q;

    /* renamed from: r */
    public WeakHashMap<InterfaceC3313f<K, V>, Boolean> f29978r = new WeakHashMap<>();

    /* renamed from: s */
    public int f29979s = 0;

    /* renamed from: com.daaw.v71$a */
    /* loaded from: classes.dex */
    public static class C3308a<K, V> extends AbstractC3312e<K, V> {
        public C3308a(C3310c<K, V> c3310c, C3310c<K, V> c3310c2) {
            super(c3310c, c3310c2);
        }

        @Override // com.daaw.v71.AbstractC3312e
        /* renamed from: b */
        public C3310c<K, V> mo7367b(C3310c<K, V> c3310c) {
            return c3310c.f29983s;
        }

        @Override // com.daaw.v71.AbstractC3312e
        /* renamed from: c */
        public C3310c<K, V> mo7366c(C3310c<K, V> c3310c) {
            return c3310c.f29982r;
        }
    }

    /* renamed from: com.daaw.v71$b */
    /* loaded from: classes.dex */
    public static class C3309b<K, V> extends AbstractC3312e<K, V> {
        public C3309b(C3310c<K, V> c3310c, C3310c<K, V> c3310c2) {
            super(c3310c, c3310c2);
        }

        @Override // com.daaw.v71.AbstractC3312e
        /* renamed from: b */
        public C3310c<K, V> mo7367b(C3310c<K, V> c3310c) {
            return c3310c.f29982r;
        }

        @Override // com.daaw.v71.AbstractC3312e
        /* renamed from: c */
        public C3310c<K, V> mo7366c(C3310c<K, V> c3310c) {
            return c3310c.f29983s;
        }
    }

    /* renamed from: com.daaw.v71$c */
    /* loaded from: classes.dex */
    public static class C3310c<K, V> implements Map.Entry<K, V> {

        /* renamed from: p */
        public final K f29980p;

        /* renamed from: q */
        public final V f29981q;

        /* renamed from: r */
        public C3310c<K, V> f29982r;

        /* renamed from: s */
        public C3310c<K, V> f29983s;

        public C3310c(K k, V v) {
            this.f29980p = k;
            this.f29981q = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C3310c) {
                C3310c c3310c = (C3310c) obj;
                return this.f29980p.equals(c3310c.f29980p) && this.f29981q.equals(c3310c.f29981q);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f29980p;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f29981q;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f29980p.hashCode() ^ this.f29981q.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f29980p + "=" + this.f29981q;
        }
    }

    /* renamed from: com.daaw.v71$d */
    /* loaded from: classes.dex */
    public class C3311d implements Iterator<Map.Entry<K, V>>, InterfaceC3313f<K, V> {

        /* renamed from: p */
        public C3310c<K, V> f29984p;

        /* renamed from: q */
        public boolean f29985q = true;

        public C3311d() {
        }

        @Override // com.daaw.v71.InterfaceC3313f
        /* renamed from: a */
        public void mo7363a(C3310c<K, V> c3310c) {
            C3310c<K, V> c3310c2 = this.f29984p;
            if (c3310c == c3310c2) {
                C3310c<K, V> c3310c3 = c3310c2.f29983s;
                this.f29984p = c3310c3;
                this.f29985q = c3310c3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            C3310c<K, V> c3310c;
            if (this.f29985q) {
                this.f29985q = false;
                c3310c = v71.this.f29976p;
            } else {
                C3310c<K, V> c3310c2 = this.f29984p;
                c3310c = c3310c2 != null ? c3310c2.f29982r : null;
            }
            this.f29984p = c3310c;
            return this.f29984p;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f29985q) {
                return v71.this.f29976p != null;
            }
            C3310c<K, V> c3310c = this.f29984p;
            return (c3310c == null || c3310c.f29982r == null) ? false : true;
        }
    }

    /* renamed from: com.daaw.v71$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3312e<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC3313f<K, V> {

        /* renamed from: p */
        public C3310c<K, V> f29987p;

        /* renamed from: q */
        public C3310c<K, V> f29988q;

        public AbstractC3312e(C3310c<K, V> c3310c, C3310c<K, V> c3310c2) {
            this.f29987p = c3310c2;
            this.f29988q = c3310c;
        }

        @Override // com.daaw.v71.InterfaceC3313f
        /* renamed from: a */
        public void mo7363a(C3310c<K, V> c3310c) {
            if (this.f29987p == c3310c && c3310c == this.f29988q) {
                this.f29988q = null;
                this.f29987p = null;
            }
            C3310c<K, V> c3310c2 = this.f29987p;
            if (c3310c2 == c3310c) {
                this.f29987p = mo7367b(c3310c2);
            }
            if (this.f29988q == c3310c) {
                this.f29988q = m7364e();
            }
        }

        /* renamed from: b */
        public abstract C3310c<K, V> mo7367b(C3310c<K, V> c3310c);

        /* renamed from: c */
        public abstract C3310c<K, V> mo7366c(C3310c<K, V> c3310c);

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            C3310c<K, V> c3310c = this.f29988q;
            this.f29988q = m7364e();
            return c3310c;
        }

        /* renamed from: e */
        public final C3310c<K, V> m7364e() {
            C3310c<K, V> c3310c = this.f29988q;
            C3310c<K, V> c3310c2 = this.f29987p;
            if (c3310c == c3310c2 || c3310c2 == null) {
                return null;
            }
            return mo7366c(c3310c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29988q != null;
        }
    }

    /* renamed from: com.daaw.v71$f */
    /* loaded from: classes.dex */
    public interface InterfaceC3313f<K, V> {
        /* renamed from: a */
        void mo7363a(C3310c<K, V> c3310c);
    }

    /* renamed from: d */
    public Map.Entry<K, V> m7375d() {
        return this.f29976p;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C3309b c3309b = new C3309b(this.f29977q, this.f29976p);
        this.f29978r.put(c3309b, Boolean.FALSE);
        return c3309b;
    }

    /* renamed from: e */
    public C3310c<K, V> mo7374e(K k) {
        C3310c<K, V> c3310c = this.f29976p;
        while (c3310c != null && !c3310c.f29980p.equals(k)) {
            c3310c = c3310c.f29982r;
        }
        return c3310c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v71) {
            v71 v71Var = (v71) obj;
            if (size() != v71Var.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = v71Var.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    /* renamed from: f */
    public v71<K, V>.C3311d m7373f() {
        v71<K, V>.C3311d c3311d = new C3311d();
        this.f29978r.put(c3311d, Boolean.FALSE);
        return c3311d;
    }

    /* renamed from: h */
    public Map.Entry<K, V> m7372h() {
        return this.f29977q;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C3308a c3308a = new C3308a(this.f29976p, this.f29977q);
        this.f29978r.put(c3308a, Boolean.FALSE);
        return c3308a;
    }

    /* renamed from: j */
    public C3310c<K, V> m7371j(K k, V v) {
        C3310c<K, V> c3310c = new C3310c<>(k, v);
        this.f29979s++;
        C3310c<K, V> c3310c2 = this.f29977q;
        if (c3310c2 == null) {
            this.f29976p = c3310c;
        } else {
            c3310c2.f29982r = c3310c;
            c3310c.f29983s = c3310c2;
        }
        this.f29977q = c3310c;
        return c3310c;
    }

    /* renamed from: k */
    public V mo7370k(K k, V v) {
        C3310c<K, V> mo7374e = mo7374e(k);
        if (mo7374e != null) {
            return mo7374e.f29981q;
        }
        m7371j(k, v);
        return null;
    }

    /* renamed from: m */
    public V mo7369m(K k) {
        C3310c<K, V> mo7374e = mo7374e(k);
        if (mo7374e == null) {
            return null;
        }
        this.f29979s--;
        if (!this.f29978r.isEmpty()) {
            for (InterfaceC3313f<K, V> interfaceC3313f : this.f29978r.keySet()) {
                interfaceC3313f.mo7363a(mo7374e);
            }
        }
        C3310c<K, V> c3310c = mo7374e.f29983s;
        C3310c<K, V> c3310c2 = mo7374e.f29982r;
        if (c3310c != null) {
            c3310c.f29982r = c3310c2;
        } else {
            this.f29976p = c3310c2;
        }
        C3310c<K, V> c3310c3 = mo7374e.f29982r;
        if (c3310c3 != null) {
            c3310c3.f29983s = c3310c;
        } else {
            this.f29977q = c3310c;
        }
        mo7374e.f29982r = null;
        mo7374e.f29983s = null;
        return mo7374e.f29981q;
    }

    public int size() {
        return this.f29979s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
