package com.daaw;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class tz6 extends u27 {
    public final transient Map r;
    public final /* synthetic */ g07 s;

    public tz6(g07 g07Var, Map map) {
        this.s = g07Var;
        this.r = map;
    }

    @Override // com.daaw.u27
    public final Set a() {
        return new rz6(this);
    }

    public final Map.Entry b(Map.Entry entry) {
        Object key = entry.getKey();
        return new u17(key, this.s.j(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.r;
        g07 g07Var = this.s;
        map = g07Var.s;
        if (map2 == map) {
            g07Var.zzr();
        } else {
            l27.b(new sz6(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map map = this.r;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.r.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final /* bridge */ /* synthetic */ Object get(@CheckForNull Object obj) {
        Collection collection = (Collection) v27.a(this.r, obj);
        if (collection == null) {
            return null;
        }
        return this.s.j(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.r.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        return this.s.g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.r.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection h = this.s.h();
        h.addAll(collection);
        g07.n(this.s, collection.size());
        collection.clear();
        return h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.r.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.r.toString();
    }
}
