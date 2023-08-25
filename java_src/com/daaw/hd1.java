package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public class hd1<T> implements z41<T> {
    public final T a;

    public hd1(T t) {
        Objects.requireNonNull(t, "Data must not be null");
        this.a = t;
    }

    @Override // com.daaw.z41
    public final int a() {
        return 1;
    }

    @Override // com.daaw.z41
    public void c() {
    }

    @Override // com.daaw.z41
    public final T get() {
        return this.a;
    }
}
