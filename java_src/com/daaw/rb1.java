package com.daaw;

import java.util.Set;
/* loaded from: classes2.dex */
public class rb1 extends qb1 {
    public static final <T> Set<T> b() {
        return tw.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> c(Set<? extends T> set) {
        ug0.f(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : qb1.a(set.iterator().next()) : b();
    }
}
