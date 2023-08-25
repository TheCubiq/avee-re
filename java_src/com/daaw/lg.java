package com.daaw;

import java.util.Collection;
/* loaded from: classes2.dex */
public class lg extends kg {
    public static final <T> int h(Iterable<? extends T> iterable, int i) {
        ug0.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
