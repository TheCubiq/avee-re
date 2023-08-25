package com.daaw;
/* loaded from: classes2.dex */
public final class xu8 {

    /* renamed from: a */
    public final Object f32967a;

    /* renamed from: b */
    public final Object f32968b;

    /* renamed from: c */
    public final Object f32969c;

    public xu8(Object obj, Object obj2, Object obj3) {
        this.f32967a = obj;
        this.f32968b = obj2;
        this.f32969c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m4497a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f32967a + "=" + this.f32968b + " and " + this.f32967a + "=" + this.f32969c);
    }
}
