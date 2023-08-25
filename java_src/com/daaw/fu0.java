package com.daaw;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class fu0 {

    /* renamed from: a */
    public final AtomicInteger f9957a = new AtomicInteger();

    /* renamed from: b */
    public final AtomicInteger f9958b = new AtomicInteger();

    /* renamed from: a */
    public void m22265a() {
        this.f9958b.getAndIncrement();
    }

    /* renamed from: b */
    public void m22264b() {
        this.f9957a.getAndIncrement();
    }

    /* renamed from: c */
    public void m22263c() {
        this.f9958b.set(0);
    }
}
