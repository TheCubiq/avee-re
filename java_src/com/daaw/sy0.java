package com.daaw;

import java.util.Objects;
/* loaded from: classes2.dex */
public final class sy0 {
    /* renamed from: a */
    public static void m9735a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m9734b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m9733c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: d */
    public static void m9732d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
