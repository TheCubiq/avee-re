package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class kg extends jg {
    public static final <T> ArrayList<T> c(T... tArr) {
        ug0.f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new b6(tArr, true));
    }

    public static final <T> List<T> d() {
        return pw.p;
    }

    public static final <T> List<T> e(T... tArr) {
        ug0.f(tArr, "elements");
        return tArr.length > 0 ? n6.a(tArr) : d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> f(List<? extends T> list) {
        ug0.f(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : jg.b(list.get(0)) : d();
    }

    public static final void g() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
