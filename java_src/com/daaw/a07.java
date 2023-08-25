package com.daaw;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class a07 extends tz6 implements SortedMap {
    @CheckForNull

    /* renamed from: t */
    public SortedSet f2686t;

    /* renamed from: u */
    public final /* synthetic */ g07 f2687u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a07(g07 g07Var, SortedMap sortedMap) {
        super(g07Var, sortedMap);
        this.f2687u = g07Var;
    }

    /* renamed from: c */
    public SortedMap mo4379c() {
        return (SortedMap) this.f28293r;
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator comparator() {
        return mo4379c().comparator();
    }

    /* renamed from: d */
    public SortedSet mo4378d() {
        return new b07(this.f2687u, mo4379c());
    }

    @Override // com.daaw.tz6, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: e */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f2686t;
        if (sortedSet == null) {
            SortedSet mo4378d = mo4378d();
            this.f2686t = mo4378d;
            return mo4378d;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo4379c().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new a07(this.f2687u, mo4379c().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo4379c().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new a07(this.f2687u, mo4379c().subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new a07(this.f2687u, mo4379c().tailMap(obj));
    }
}
