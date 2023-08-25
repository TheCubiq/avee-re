package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public class hd1<T> implements z41<T> {

    /* renamed from: a */
    public final T f12423a;

    public hd1(T t) {
        Objects.requireNonNull(t, "Data must not be null");
        this.f12423a = t;
    }

    @Override // com.daaw.z41
    /* renamed from: a */
    public final int mo2828a() {
        return 1;
    }

    @Override // com.daaw.z41
    /* renamed from: c */
    public void mo2827c() {
    }

    @Override // com.daaw.z41
    public final T get() {
        return this.f12423a;
    }
}
