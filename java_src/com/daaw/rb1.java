package com.daaw;

import java.util.Set;
/* loaded from: classes2.dex */
public class rb1 extends qb1 {
    /* renamed from: b */
    public static final <T> Set<T> m11457b() {
        return C3139tw.f28177p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <T> Set<T> m11456c(Set<? extends T> set) {
        ug0.m8268f(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : qb1.m12641a(set.iterator().next()) : m11457b();
    }
}
