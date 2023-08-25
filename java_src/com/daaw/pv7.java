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

    /* renamed from: p */
    public final int f23418p;

    /* renamed from: s */
    public boolean f23421s;

    /* renamed from: t */
    public volatile nv7 f23422t;

    /* renamed from: q */
    public List f23419q = Collections.emptyList();

    /* renamed from: r */
    public Map f23420r = Collections.emptyMap();

    /* renamed from: u */
    public Map f23423u = Collections.emptyMap();

    /* renamed from: a */
    public void mo13015a() {
        if (this.f23421s) {
            return;
        }
        this.f23420r = this.f23420r.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f23420r);
        this.f23423u = this.f23423u.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f23423u);
        this.f23421s = true;
    }

    /* renamed from: b */
    public final int m13014b() {
        return this.f23419q.size();
    }

    /* renamed from: c */
    public final Iterable m13013c() {
        return this.f23420r.isEmpty() ? iv7.m19317a() : this.f23420r.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m13002n();
        if (!this.f23419q.isEmpty()) {
            this.f23419q.clear();
        }
        if (this.f23420r.isEmpty()) {
            return;
        }
        this.f23420r.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m13005k(comparable) >= 0 || this.f23420r.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m13002n();
        int m13005k = m13005k(comparable);
        if (m13005k >= 0) {
            return ((jv7) this.f23419q.get(m13005k)).setValue(obj);
        }
        m13002n();
        if (this.f23419q.isEmpty() && !(this.f23419q instanceof ArrayList)) {
            this.f23419q = new ArrayList(this.f23418p);
        }
        int i = -(m13005k + 1);
        if (i >= this.f23418p) {
            return m13003m().put(comparable, obj);
        }
        int size = this.f23419q.size();
        int i2 = this.f23418p;
        if (size == i2) {
            jv7 jv7Var = (jv7) this.f23419q.remove(i2 - 1);
            m13003m().put(jv7Var.m18212a(), jv7Var.getValue());
        }
        this.f23419q.add(i, new jv7(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f23422t == null) {
            this.f23422t = new nv7(this, null);
        }
        return this.f23422t;
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
            int m13014b = m13014b();
            if (m13014b == pv7Var.m13014b()) {
                for (int i = 0; i < m13014b; i++) {
                    if (!m13009g(i).equals(pv7Var.m13009g(i))) {
                        return false;
                    }
                }
                if (m13014b == size) {
                    return true;
                }
                entrySet = this.f23420r;
                entrySet2 = pv7Var.f23420r;
            } else {
                entrySet = entrySet();
                entrySet2 = pv7Var.entrySet();
            }
            return entrySet.equals(entrySet2);
        }
        return super.equals(obj);
    }

    /* renamed from: g */
    public final Map.Entry m13009g(int i) {
        return (Map.Entry) this.f23419q.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m13005k = m13005k(comparable);
        return m13005k >= 0 ? ((jv7) this.f23419q.get(m13005k)).getValue() : this.f23420r.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m13014b = m13014b();
        int i = 0;
        for (int i2 = 0; i2 < m13014b; i2++) {
            i += ((jv7) this.f23419q.get(i2)).hashCode();
        }
        return this.f23420r.size() > 0 ? i + this.f23420r.hashCode() : i;
    }

    /* renamed from: j */
    public final boolean m13006j() {
        return this.f23421s;
    }

    /* renamed from: k */
    public final int m13005k(Comparable comparable) {
        int size = this.f23419q.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((jv7) this.f23419q.get(size)).m18212a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((jv7) this.f23419q.get(i2)).m18212a());
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
    public final Object m13004l(int i) {
        m13002n();
        Object value = ((jv7) this.f23419q.remove(i)).getValue();
        if (!this.f23420r.isEmpty()) {
            Iterator it = m13003m().entrySet().iterator();
            List list = this.f23419q;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new jv7(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    public final SortedMap m13003m() {
        m13002n();
        if (this.f23420r.isEmpty() && !(this.f23420r instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f23420r = treeMap;
            this.f23423u = treeMap.descendingMap();
        }
        return (SortedMap) this.f23420r;
    }

    /* renamed from: n */
    public final void m13002n() {
        if (this.f23421s) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m13002n();
        Comparable comparable = (Comparable) obj;
        int m13005k = m13005k(comparable);
        if (m13005k >= 0) {
            return m13004l(m13005k);
        }
        if (this.f23420r.isEmpty()) {
            return null;
        }
        return this.f23420r.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f23419q.size() + this.f23420r.size();
    }
}
