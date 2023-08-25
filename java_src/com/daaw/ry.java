package com.daaw;
/* loaded from: classes.dex */
public final class ry implements g00<my> {

    /* loaded from: classes.dex */
    public static final class a {
        public static final ry a = new ry();
    }

    public static ry a() {
        return a.a;
    }

    public static my c() {
        return (my) qy0.c(ny.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public my get() {
        return c();
    }
}
