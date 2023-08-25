package com.daaw;
/* loaded from: classes.dex */
public final class z17 {
    public final Object a;
    public final Object b;
    public final Object c;

    public z17(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.a + "=" + this.b + " and " + this.a + "=" + this.c);
    }
}
