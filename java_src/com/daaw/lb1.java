package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes2.dex */
public class lb1 extends kb1 {
    public static final <T, C extends Collection<? super T>> C c(eb1<? extends T> eb1Var, C c) {
        ug0.f(eb1Var, "<this>");
        ug0.f(c, "destination");
        for (T t : eb1Var) {
            c.add(t);
        }
        return c;
    }

    public static final <T> List<T> d(eb1<? extends T> eb1Var) {
        ug0.f(eb1Var, "<this>");
        return kg.f(e(eb1Var));
    }

    public static final <T> List<T> e(eb1<? extends T> eb1Var) {
        ug0.f(eb1Var, "<this>");
        return (List) c(eb1Var, new ArrayList());
    }
}
