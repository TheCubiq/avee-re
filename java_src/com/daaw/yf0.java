package com.daaw;

import com.daaw.jt1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class yf0 {

    /* renamed from: a */
    public final List<it1<?>> f33623a = new ArrayList();

    /* renamed from: a */
    public final <T extends ht1> void m3784a(di0<T> di0Var, z40<? super AbstractC1589hn, ? extends T> z40Var) {
        ug0.m8268f(di0Var, "clazz");
        ug0.m8268f(z40Var, "initializer");
        this.f33623a.add(new it1<>(bi0.m26166a(di0Var), z40Var));
    }

    /* renamed from: b */
    public final jt1.InterfaceC1864b m3783b() {
        Object[] array = this.f33623a.toArray(new it1[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        it1[] it1VarArr = (it1[]) array;
        return new xf0((it1[]) Arrays.copyOf(it1VarArr, it1VarArr.length));
    }
}
