package com.daaw;

import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes.dex */
public final class t37 extends l37 implements Serializable {
    public static final t37 p = new t37();

    @Override // com.daaw.l37
    public final l37 a() {
        return j37.p;
    }

    @Override // com.daaw.l37, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
