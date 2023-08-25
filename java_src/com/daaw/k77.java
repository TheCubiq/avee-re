package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class k77 extends z47 implements Runnable {
    public final Runnable w;

    public k77(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.w = runnable;
    }

    @Override // com.daaw.c57
    public final String e() {
        String valueOf = String.valueOf(this.w);
        return "task=[" + valueOf + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.w.run();
        } catch (Error | RuntimeException e) {
            i(e);
            throw e;
        }
    }
}
