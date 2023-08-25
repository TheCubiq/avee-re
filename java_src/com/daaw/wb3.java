package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class wb3 {
    public static final AtomicReference a = new AtomicReference();
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicBoolean c = new AtomicBoolean();

    public static ub3 a() {
        return (ub3) a.get();
    }

    public static vb3 b() {
        return (vb3) b.get();
    }

    public static void c(ub3 ub3Var) {
        a.set(ub3Var);
    }
}
