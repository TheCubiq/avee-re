package com.daaw;

import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class l37 implements Comparator {
    /* renamed from: b */
    public static l37 m17167b(Comparator comparator) {
        return comparator instanceof l37 ? (l37) comparator : new k17(comparator);
    }

    /* renamed from: c */
    public static l37 m17166c() {
        return j37.f14219p;
    }

    /* renamed from: a */
    public l37 mo8593a() {
        return new u37(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
