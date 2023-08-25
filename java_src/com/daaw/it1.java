package com.daaw;

import com.daaw.ht1;
/* loaded from: classes.dex */
public final class it1<T extends ht1> {
    public final Class<T> a;
    public final z40<hn, T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public it1(Class<T> cls, z40<? super hn, ? extends T> z40Var) {
        ug0.f(cls, "clazz");
        ug0.f(z40Var, "initializer");
        this.a = cls;
        this.b = z40Var;
    }

    public final Class<T> a() {
        return this.a;
    }

    public final z40<hn, T> b() {
        return this.b;
    }
}
