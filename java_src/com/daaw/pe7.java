package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class pe7 {
    public static final pe7 b = new pe7();
    public static final oe7 c = new oe7(null);
    public final AtomicReference a = new AtomicReference();

    public static pe7 a() {
        return b;
    }

    public final qh7 b() {
        qh7 qh7Var = (qh7) this.a.get();
        return qh7Var == null ? c : qh7Var;
    }
}
