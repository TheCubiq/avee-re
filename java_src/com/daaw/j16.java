package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class j16 {
    public final AtomicBoolean a = new AtomicBoolean(false);

    public final void a(boolean z) {
        this.a.set(true);
    }

    public final boolean b() {
        return this.a.get();
    }
}
