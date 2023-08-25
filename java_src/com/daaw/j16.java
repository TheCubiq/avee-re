package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class j16 {

    /* renamed from: a */
    public final AtomicBoolean f14181a = new AtomicBoolean(false);

    /* renamed from: a */
    public final void m19169a(boolean z) {
        this.f14181a.set(true);
    }

    /* renamed from: b */
    public final boolean m19168b() {
        return this.f14181a.get();
    }
}
