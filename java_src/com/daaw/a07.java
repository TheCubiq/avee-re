package com.daaw;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class a07 extends tz6 implements SortedMap {
    @CheckForNull
    public SortedSet t;
    public final /* synthetic */ g07 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a07(g07 g07Var, SortedMap sortedMap) {
        super(g07Var, sortedMap);
        this.u = g07Var;
    }

    public SortedMap c() {
        return (SortedMap) this.r;
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator comparator() {
        return c().comparator();
    }

    public SortedSet d() {
        return new b07(this.u, c());
    }

    @Override // com.daaw.tz6, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: e */
    public SortedSet keySet() {
        SortedSet sortedSet = this.t;
        if (sortedSet == null) {
            SortedSet d = d();
            this.t = d;
            return d;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return c().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new a07(this.u, c().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return c().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new a07(this.u, c().subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new a07(this.u, c().tailMap(obj));
    }
}
