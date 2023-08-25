package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class xz6 extends a07 implements NavigableMap {

    /* renamed from: v */
    public final /* synthetic */ g07 f33140v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz6(g07 g07Var, NavigableMap navigableMap) {
        super(g07Var, navigableMap);
        this.f33140v = g07Var;
    }

    @Override // com.daaw.a07
    /* renamed from: c */
    public final /* synthetic */ SortedMap mo4379c() {
        return (NavigableMap) ((SortedMap) this.f28293r);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f28293r)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return m8661b(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f28293r)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new xz6(this.f33140v, ((NavigableMap) ((SortedMap) this.f28293r)).descendingMap());
    }

    @Override // com.daaw.a07
    /* renamed from: e */
    public final /* synthetic */ SortedSet mo4377e() {
        return (NavigableSet) super.keySet();
    }

    @CheckForNull
    /* renamed from: f */
    public final Map.Entry m4376f(Iterator it) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Collection mo22115h = this.f33140v.mo22115h();
            mo22115h.addAll((Collection) entry.getValue());
            it.remove();
            return new u17(entry.getKey(), this.f33140v.mo15651i(mo22115h));
        }
        return null;
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f28293r)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return m8661b(firstEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f28293r)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return m8661b(floorEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f28293r)).floorKey(obj);
    }

    @Override // com.daaw.a07
    /* renamed from: g */
    public final NavigableSet mo4378d() {
        return new yz6(this.f33140v, (NavigableMap) ((SortedMap) this.f28293r));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new xz6(this.f33140v, ((NavigableMap) ((SortedMap) this.f28293r)).headMap(obj, z));
    }

    @Override // com.daaw.a07, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f28293r)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return m8661b(higherEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f28293r)).higherKey(obj);
    }

    @Override // com.daaw.a07, com.daaw.tz6, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f28293r)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return m8661b(lastEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f28293r)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return m8661b(lowerEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f28293r)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry pollFirstEntry() {
        return m4376f(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry pollLastEntry() {
        return m4376f(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new xz6(this.f33140v, ((NavigableMap) ((SortedMap) this.f28293r)).subMap(obj, z, obj2, z2));
    }

    @Override // com.daaw.a07, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new xz6(this.f33140v, ((NavigableMap) ((SortedMap) this.f28293r)).tailMap(obj, z));
    }

    @Override // com.daaw.a07, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
