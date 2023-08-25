package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes2.dex */
public class lb1 extends kb1 {
    /* renamed from: c */
    public static final <T, C extends Collection<? super T>> C m17065c(eb1<? extends T> eb1Var, C c) {
        ug0.m8268f(eb1Var, "<this>");
        ug0.m8268f(c, "destination");
        for (T t : eb1Var) {
            c.add(t);
        }
        return c;
    }

    /* renamed from: d */
    public static final <T> List<T> m17064d(eb1<? extends T> eb1Var) {
        ug0.m8268f(eb1Var, "<this>");
        return C1946kg.m17759f(m17063e(eb1Var));
    }

    /* renamed from: e */
    public static final <T> List<T> m17063e(eb1<? extends T> eb1Var) {
        ug0.m8268f(eb1Var, "<this>");
        return (List) m17065c(eb1Var, new ArrayList());
    }
}
