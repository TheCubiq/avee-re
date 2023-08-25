package com.daaw;
/* loaded from: classes.dex */
public final class oy implements g00<String> {

    /* loaded from: classes.dex */
    public static final class a {
        public static final oy a = new oy();
    }

    public static oy a() {
        return a.a;
    }

    public static String b() {
        return (String) qy0.c(ny.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.a01
    /* renamed from: c */
    public String get() {
        return b();
    }
}
