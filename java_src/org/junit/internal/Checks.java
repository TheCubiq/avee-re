package org.junit.internal;
/* loaded from: classes2.dex */
public final class Checks {
    private Checks() {
    }

    public static <T> T notNull(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static <T> T notNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
