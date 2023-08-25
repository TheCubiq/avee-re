package com.daaw;

import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class l37 implements Comparator {
    public static l37 b(Comparator comparator) {
        return comparator instanceof l37 ? (l37) comparator : new k17(comparator);
    }

    public static l37 c() {
        return j37.p;
    }

    public l37 a() {
        return new u37(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
