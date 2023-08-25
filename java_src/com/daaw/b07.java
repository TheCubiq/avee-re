package com.daaw;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class b07 extends wz6 implements SortedSet {
    public final /* synthetic */ g07 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b07(g07 g07Var, SortedMap sortedMap) {
        super(g07Var, sortedMap);
        this.r = g07Var;
    }

    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.p;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return d().firstKey();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new b07(this.r, d().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return d().lastKey();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new b07(this.r, d().subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new b07(this.r, d().tailMap(obj));
    }
}
