package com.daaw;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class fu0 {
    public final AtomicInteger a = new AtomicInteger();
    public final AtomicInteger b = new AtomicInteger();

    public void a() {
        this.b.getAndIncrement();
    }

    public void b() {
        this.a.getAndIncrement();
    }

    public void c() {
        this.b.set(0);
    }
}
