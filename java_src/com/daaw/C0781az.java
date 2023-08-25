package com.daaw;

import java.util.concurrent.Executor;
/* renamed from: com.daaw.az */
/* loaded from: classes.dex */
public final class C0781az implements g00<Executor> {

    /* renamed from: com.daaw.az$a */
    /* loaded from: classes.dex */
    public static final class C0782a {

        /* renamed from: a */
        public static final C0781az f4113a = new C0781az();
    }

    /* renamed from: a */
    public static C0781az m26597a() {
        return C0782a.f4113a;
    }

    /* renamed from: b */
    public static Executor m26596b() {
        return (Executor) qy0.m11939c(AbstractC3915zy.m1794a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.a01
    /* renamed from: c */
    public Executor get() {
        return m26596b();
    }
}
