package com.daaw;
/* loaded from: classes.dex */
public final class kg0<T> implements g00<T> {
    public static final kg0<Object> b = new kg0<>(null);
    public final T a;

    public kg0(T t) {
        this.a = t;
    }

    public static <T> g00<T> a(T t) {
        return new kg0(qy0.c(t, "instance cannot be null"));
    }

    @Override // com.daaw.a01
    public T get() {
        return this.a;
    }
}
