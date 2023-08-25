package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class wb3 {

    /* renamed from: a */
    public static final AtomicReference f31145a = new AtomicReference();

    /* renamed from: b */
    public static final AtomicReference f31146b = new AtomicReference();

    /* renamed from: c */
    public static final AtomicBoolean f31147c = new AtomicBoolean();

    /* renamed from: a */
    public static ub3 m6207a() {
        return (ub3) f31145a.get();
    }

    /* renamed from: b */
    public static vb3 m6206b() {
        return (vb3) f31146b.get();
    }

    /* renamed from: c */
    public static void m6205c(ub3 ub3Var) {
        f31145a.set(ub3Var);
    }
}
