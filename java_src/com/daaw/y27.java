package com.daaw;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class y27 extends c37 {
    public final /* synthetic */ Comparator a;

    public y27(Comparator comparator) {
        this.a = comparator;
    }

    @Override // com.daaw.c37
    public final Map a() {
        return new TreeMap(this.a);
    }
}
