package com.daaw;

import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes.dex */
public final class t37 extends l37 implements Serializable {

    /* renamed from: p */
    public static final t37 f26978p = new t37();

    @Override // com.daaw.l37
    /* renamed from: a */
    public final l37 mo8593a() {
        return j37.f14219p;
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
