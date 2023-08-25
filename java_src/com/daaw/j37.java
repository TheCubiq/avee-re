package com.daaw;

import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes.dex */
public final class j37 extends l37 implements Serializable {
    public static final j37 p = new j37();

    @Override // com.daaw.l37
    public final l37 a() {
        return t37.p;
    }

    @Override // com.daaw.l37, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
