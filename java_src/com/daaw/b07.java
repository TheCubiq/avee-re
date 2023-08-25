package com.daaw;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class b07 extends wz6 implements SortedSet {

    /* renamed from: r */
    public final /* synthetic */ g07 f4218r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b07(g07 g07Var, SortedMap sortedMap) {
        super(g07Var, sortedMap);
        this.f4218r = g07Var;
    }

    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator comparator() {
        return mo3018d().comparator();
    }

    /* renamed from: d */
    public SortedMap mo3018d() {
        return (SortedMap) this.f25818p;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo3018d().firstKey();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new b07(this.f4218r, mo3018d().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo3018d().lastKey();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new b07(this.f4218r, mo3018d().subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new b07(this.f4218r, mo3018d().tailMap(obj));
    }
}
