package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class az implements g00<Executor> {

    /* loaded from: classes.dex */
    public static final class a {
        public static final az a = new az();
    }

    public static az a() {
        return a.a;
    }

    public static Executor b() {
        return (Executor) qy0.c(zy.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.a01
    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
