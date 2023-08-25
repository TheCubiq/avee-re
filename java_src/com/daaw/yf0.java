package com.daaw;

import com.daaw.jt1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class yf0 {
    public final List<it1<?>> a = new ArrayList();

    public final <T extends ht1> void a(di0<T> di0Var, z40<? super hn, ? extends T> z40Var) {
        ug0.f(di0Var, "clazz");
        ug0.f(z40Var, "initializer");
        this.a.add(new it1<>(bi0.a(di0Var), z40Var));
    }

    public final jt1.b b() {
        Object[] array = this.a.toArray(new it1[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        it1[] it1VarArr = (it1[]) array;
        return new xf0((it1[]) Arrays.copyOf(it1VarArr, it1VarArr.length));
    }
}
