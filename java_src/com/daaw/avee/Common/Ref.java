package com.daaw.avee.Common;
/* loaded from: classes.dex */
public class Ref<T> {
    public T obj;

    public Ref(T t) {
        this.obj = t;
    }

    public Ref<T> Drop() {
        Ref<T> ref = new Ref<>(this.obj);
        this.obj = null;
        return ref;
    }
}
