package com.daaw;
/* loaded from: classes.dex */
public final class z17 {

    /* renamed from: a */
    public final Object f34339a;

    /* renamed from: b */
    public final Object f34340b;

    /* renamed from: c */
    public final Object f34341c;

    public z17(Object obj, Object obj2, Object obj3) {
        this.f34339a = obj;
        this.f34340b = obj2;
        this.f34341c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m2981a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f34339a + "=" + this.f34340b + " and " + this.f34339a + "=" + this.f34341c);
    }
}
