package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class e08 {
    /* renamed from: a */
    public static Object m23802a(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: b */
    public static Object m23801b(Object obj) {
        Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }

    /* renamed from: c */
    public static void m23800c(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
