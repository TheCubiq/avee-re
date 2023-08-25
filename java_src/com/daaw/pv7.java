package com.daaw;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class pv7 extends AbstractMap {
    public final int p;
    public boolean s;
    public volatile nv7 t;
    public List q = Collections.emptyList();
    public Map r = Collections.emptyMap();
    public Map u = Collections.emptyMap();

    public void a() {
        if (this.s) {
            return;
        }
        this.r = this.r.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.r);
        this.u = this.u.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.u);
        this.s = true;
    }

    public final int b() {
        return this.q.size();
    }

    public final Iterable c() {
        return this.r.isEmpty() ? iv7.a() : this.r.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        if (!this.q.isEmpty()) {
            this.q.clear();
        }
        if (this.r.isEmpty()) {
            return;
        }
        this.r.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return k(comparable) >= 0 || this.r.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        n();
        int k = k(comparable);
        if (k >= 0) {
            return ((jv7) this.q.get(k)).setValue(obj);
        }
        n();
        if (this.q.isEmpty() && !(this.q instanceof ArrayList)) {
            this.q = new ArrayList(this.p);
        }
        int i = -(k + 1);
        if (i >= this.p) {
            return m().put(comparable, obj);
        }
        int size = this.q.size();
        int i2 = this.p;
        if (size == i2) {
            jv7 jv7Var = (jv7) this.q.remove(i2 - 1);
            m().put(jv7Var.a(), jv7Var.getValue());
        }
        this.q.add(i, new jv7(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.t == null) {
            this.t = new nv7(this, null);
        }
        return this.t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object entrySet;
        Object entrySet2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof pv7) {
            pv7 pv7Var = (pv7) obj;
            int size = size();
            if (size != pv7Var.size()) {
                return false;
            }
            int b = b();
            if (b == pv7Var.b()) {
                for (int i = 0; i < b; i++) {
                    if (!g(i).equals(pv7Var.g(i))) {
                        return false;
                    }
                }
                if (b == size) {
                    return true;
                }
                entrySet = this.r;
                entrySet2 = pv7Var.r;
            } else {
                entrySet = entrySet();
                entrySet2 = pv7Var.entrySet();
            }
            return entrySet.equals(entrySet2);
        }
        return super.equals(obj);
    }

    public final Map.Entry g(int i) {
        return (Map.Entry) this.q.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k = k(comparable);
        return k >= 0 ? ((jv7) this.q.get(k)).getValue() : this.r.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b = b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((jv7) this.q.get(i2)).hashCode();
        }
        return this.r.size() > 0 ? i + this.r.hashCode() : i;
    }

    public final boolean j() {
        return this.s;
    }

    public final int k(Comparable comparable) {
        int size = this.q.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((jv7) this.q.get(size)).a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((jv7) this.q.get(i2)).a());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public final Object l(int i) {
        n();
        Object value = ((jv7) this.q.remove(i)).getValue();
        if (!this.r.isEmpty()) {
            Iterator it = m().entrySet().iterator();
            List list = this.q;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new jv7(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    public final SortedMap m() {
        n();
        if (this.r.isEmpty() && !(this.r instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.r = treeMap;
            this.u = treeMap.descendingMap();
        }
        return (SortedMap) this.r;
    }

    public final void n() {
        if (this.s) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        n();
        Comparable comparable = (Comparable) obj;
        int k = k(comparable);
        if (k >= 0) {
            return l(k);
        }
        if (this.r.isEmpty()) {
            return null;
        }
        return this.r.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.q.size() + this.r.size();
    }
}
