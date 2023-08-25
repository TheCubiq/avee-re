package com.daaw;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class v71<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> p;
    public c<K, V> q;
    public WeakHashMap<f<K, V>, Boolean> r = new WeakHashMap<>();
    public int s = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // com.daaw.v71.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.s;
        }

        @Override // com.daaw.v71.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.r;
        }
    }

    /* loaded from: classes.dex */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // com.daaw.v71.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.r;
        }

        @Override // com.daaw.v71.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.s;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {
        public final K p;
        public final V q;
        public c<K, V> r;
        public c<K, V> s;

        public c(K k, V v) {
            this.p = k;
            this.q = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.p.equals(cVar.p) && this.q.equals(cVar.q);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.p;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.q;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.p.hashCode() ^ this.q.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.p + "=" + this.q;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> p;
        public boolean q = true;

        public d() {
        }

        @Override // com.daaw.v71.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.p;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.s;
                this.p = cVar3;
                this.q = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.q) {
                this.q = false;
                cVar = v71.this.p;
            } else {
                c<K, V> cVar2 = this.p;
                cVar = cVar2 != null ? cVar2.r : null;
            }
            this.p = cVar;
            return this.p;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.q) {
                return v71.this.p != null;
            }
            c<K, V> cVar = this.p;
            return (cVar == null || cVar.r == null) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> p;
        public c<K, V> q;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.p = cVar2;
            this.q = cVar;
        }

        @Override // com.daaw.v71.f
        public void a(c<K, V> cVar) {
            if (this.p == cVar && cVar == this.q) {
                this.q = null;
                this.p = null;
            }
            c<K, V> cVar2 = this.p;
            if (cVar2 == cVar) {
                this.p = b(cVar2);
            }
            if (this.q == cVar) {
                this.q = e();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.q;
            this.q = e();
            return cVar;
        }

        public final c<K, V> e() {
            c<K, V> cVar = this.q;
            c<K, V> cVar2 = this.p;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.q != null;
        }
    }

    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> d() {
        return this.p;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.q, this.p);
        this.r.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public c<K, V> e(K k) {
        c<K, V> cVar = this.p;
        while (cVar != null && !cVar.p.equals(k)) {
            cVar = cVar.r;
        }
        return cVar;
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

    public v71<K, V>.d f() {
        v71<K, V>.d dVar = new d();
        this.r.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> h() {
        return this.q;
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
        a aVar = new a(this.p, this.q);
        this.r.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public c<K, V> j(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.s++;
        c<K, V> cVar2 = this.q;
        if (cVar2 == null) {
            this.p = cVar;
        } else {
            cVar2.r = cVar;
            cVar.s = cVar2;
        }
        this.q = cVar;
        return cVar;
    }

    public V k(K k, V v) {
        c<K, V> e2 = e(k);
        if (e2 != null) {
            return e2.q;
        }
        j(k, v);
        return null;
    }

    public V m(K k) {
        c<K, V> e2 = e(k);
        if (e2 == null) {
            return null;
        }
        this.s--;
        if (!this.r.isEmpty()) {
            for (f<K, V> fVar : this.r.keySet()) {
                fVar.a(e2);
            }
        }
        c<K, V> cVar = e2.s;
        c<K, V> cVar2 = e2.r;
        if (cVar != null) {
            cVar.r = cVar2;
        } else {
            this.p = cVar2;
        }
        c<K, V> cVar3 = e2.r;
        if (cVar3 != null) {
            cVar3.s = cVar;
        } else {
            this.q = cVar;
        }
        e2.r = null;
        e2.s = null;
        return e2.q;
    }

    public int size() {
        return this.s;
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
