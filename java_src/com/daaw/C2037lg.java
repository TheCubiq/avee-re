package com.daaw;

import java.util.Collection;
/* renamed from: com.daaw.lg */
/* loaded from: classes2.dex */
public class C2037lg extends C1946kg {
    /* renamed from: h */
    public static final <T> int m16966h(Iterable<? extends T> iterable, int i) {
        ug0.m8268f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
