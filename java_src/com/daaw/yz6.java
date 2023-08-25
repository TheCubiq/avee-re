package com.daaw;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class yz6 extends b07 implements NavigableSet {

    /* renamed from: s */
    public final /* synthetic */ g07 f34297s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz6(g07 g07Var, NavigableMap navigableMap) {
        super(g07Var, navigableMap);
        this.f34297s = g07Var;
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f25818p)).ceilingKey(obj);
    }

    @Override // com.daaw.b07
    /* renamed from: d */
    public final /* synthetic */ SortedMap mo3018d() {
        return (NavigableMap) ((SortedMap) this.f25818p);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new yz6(this.f34297s, ((NavigableMap) ((SortedMap) this.f25818p)).descendingMap());
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f25818p)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new yz6(this.f34297s, ((NavigableMap) ((SortedMap) this.f25818p)).headMap(obj, z));
    }

    @Override // com.daaw.b07, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f25818p)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f25818p)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object pollFirst() {
        return l27.m17194a(iterator());
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object pollLast() {
        return l27.m17194a(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new yz6(this.f34297s, ((NavigableMap) ((SortedMap) this.f25818p)).subMap(obj, z, obj2, z2));
    }

    @Override // com.daaw.b07, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new yz6(this.f34297s, ((NavigableMap) ((SortedMap) this.f25818p)).tailMap(obj, z));
    }

    @Override // com.daaw.b07, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
