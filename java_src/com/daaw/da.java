package com.daaw;

import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes.dex */
public abstract class da {

    /* loaded from: classes.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static da a() {
        return new b8(a.FATAL_ERROR, -1L);
    }

    public static da d() {
        return new b8(a.INVALID_PAYLOAD, -1L);
    }

    public static da e(long j) {
        return new b8(a.OK, j);
    }

    public static da f() {
        return new b8(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
