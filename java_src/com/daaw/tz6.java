package com.daaw;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class tz6 extends u27 {

    /* renamed from: r */
    public final transient Map f28293r;

    /* renamed from: s */
    public final /* synthetic */ g07 f28294s;

    public tz6(g07 g07Var, Map map) {
        this.f28294s = g07Var;
        this.f28293r = map;
    }

    @Override // com.daaw.u27
    /* renamed from: a */
    public final Set mo8608a() {
        return new rz6(this);
    }

    /* renamed from: b */
    public final Map.Entry m8661b(Map.Entry entry) {
        Object key = entry.getKey();
        return new u17(key, this.f28294s.mo15650j(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f28293r;
        g07 g07Var = this.f28294s;
        map = g07Var.f10130s;
        if (map2 == map) {
            g07Var.zzr();
        } else {
            l27.m17193b(new sz6(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map map = this.f28293r;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.f28293r.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final /* bridge */ /* synthetic */ Object get(@CheckForNull Object obj) {
        Collection collection = (Collection) v27.m7540a(this.f28293r, obj);
        if (collection == null) {
            return null;
        }
        return this.f28294s.mo15650j(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f28293r.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        return this.f28294s.m19176g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.f28293r.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection mo22115h = this.f28294s.mo22115h();
        mo22115h.addAll(collection);
        g07.m22111n(this.f28294s, collection.size());
        collection.clear();
        return mo22115h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f28293r.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f28293r.toString();
    }
}
