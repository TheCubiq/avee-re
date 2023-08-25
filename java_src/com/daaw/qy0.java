package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class qy0 {
    /* renamed from: a */
    public static <T> void m11941a(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m11940b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m11939c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
