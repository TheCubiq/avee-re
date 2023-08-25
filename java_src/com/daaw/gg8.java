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
/* loaded from: classes2.dex */
public class gg8 extends AbstractMap {

    /* renamed from: p */
    public final int f11233p;

    /* renamed from: s */
    public boolean f11236s;

    /* renamed from: t */
    public volatile cg8 f11237t;

    /* renamed from: q */
    public List f11234q = Collections.emptyList();

    /* renamed from: r */
    public Map f11235r = Collections.emptyMap();

    /* renamed from: u */
    public Map f11238u = Collections.emptyMap();

    /* renamed from: a */
    public void mo16039a() {
        if (this.f11236s) {
            return;
        }
        this.f11235r = this.f11235r.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f11235r);
        this.f11238u = this.f11238u.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f11238u);
        this.f11236s = true;
    }

    /* renamed from: b */
    public final int m21655b() {
        return this.f11234q.size();
    }

    /* renamed from: c */
    public final Iterable m21654c() {
        return this.f11235r.isEmpty() ? sf8.m10383a() : this.f11235r.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m21643n();
        if (!this.f11234q.isEmpty()) {
            this.f11234q.clear();
        }
        if (this.f11235r.isEmpty()) {
            return;
        }
        this.f11235r.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m21646k(comparable) >= 0 || this.f11235r.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m21643n();
        int m21646k = m21646k(comparable);
        if (m21646k >= 0) {
            return ((uf8) this.f11234q.get(m21646k)).setValue(obj);
        }
        m21643n();
        if (this.f11234q.isEmpty() && !(this.f11234q instanceof ArrayList)) {
            this.f11234q = new ArrayList(this.f11233p);
        }
        int i = -(m21646k + 1);
        if (i >= this.f11233p) {
            return m21644m().put(comparable, obj);
        }
        int size = this.f11234q.size();
        int i2 = this.f11233p;
        if (size == i2) {
            uf8 uf8Var = (uf8) this.f11234q.remove(i2 - 1);
            m21644m().put(uf8Var.m8275a(), uf8Var.getValue());
        }
        this.f11234q.add(i, new uf8(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f11237t == null) {
            this.f11237t = new cg8(this, null);
        }
        return this.f11237t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object entrySet;
        Object entrySet2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof gg8) {
            gg8 gg8Var = (gg8) obj;
            int size = size();
            if (size != gg8Var.size()) {
                return false;
            }
            int m21655b = m21655b();
            if (m21655b == gg8Var.m21655b()) {
                for (int i = 0; i < m21655b; i++) {
                    if (!m21650g(i).equals(gg8Var.m21650g(i))) {
                        return false;
                    }
                }
                if (m21655b == size) {
                    return true;
                }
                entrySet = this.f11235r;
                entrySet2 = gg8Var.f11235r;
            } else {
                entrySet = entrySet();
                entrySet2 = gg8Var.entrySet();
            }
            return entrySet.equals(entrySet2);
        }
        return super.equals(obj);
    }

    /* renamed from: g */
    public final Map.Entry m21650g(int i) {
        return (Map.Entry) this.f11234q.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m21646k = m21646k(comparable);
        return m21646k >= 0 ? ((uf8) this.f11234q.get(m21646k)).getValue() : this.f11235r.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m21655b = m21655b();
        int i = 0;
        for (int i2 = 0; i2 < m21655b; i2++) {
            i += ((uf8) this.f11234q.get(i2)).hashCode();
        }
        return this.f11235r.size() > 0 ? i + this.f11235r.hashCode() : i;
    }

    /* renamed from: j */
    public final boolean m21647j() {
        return this.f11236s;
    }

    /* renamed from: k */
    public final int m21646k(Comparable comparable) {
        int size = this.f11234q.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((uf8) this.f11234q.get(size)).m8275a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((uf8) this.f11234q.get(i2)).m8275a());
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

    /* renamed from: l */
    public final Object m21645l(int i) {
        m21643n();
        Object value = ((uf8) this.f11234q.remove(i)).getValue();
        if (!this.f11235r.isEmpty()) {
            Iterator it = m21644m().entrySet().iterator();
            List list = this.f11234q;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new uf8(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    public final SortedMap m21644m() {
        m21643n();
        if (this.f11235r.isEmpty() && !(this.f11235r instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f11235r = treeMap;
            this.f11238u = treeMap.descendingMap();
        }
        return (SortedMap) this.f11235r;
    }

    /* renamed from: n */
    public final void m21643n() {
        if (this.f11236s) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m21643n();
        Comparable comparable = (Comparable) obj;
        int m21646k = m21646k(comparable);
        if (m21646k >= 0) {
            return m21645l(m21646k);
        }
        if (this.f11235r.isEmpty()) {
            return null;
        }
        return this.f11235r.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11234q.size() + this.f11235r.size();
    }
}
