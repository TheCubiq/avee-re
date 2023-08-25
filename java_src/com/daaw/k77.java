package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class k77 extends z47 implements Runnable {

    /* renamed from: w */
    public final Runnable f15750w;

    public k77(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.f15750w = runnable;
    }

    @Override // com.daaw.c57
    /* renamed from: e */
    public final String mo7361e() {
        String valueOf = String.valueOf(this.f15750w);
        return "task=[" + valueOf + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f15750w.run();
        } catch (Error | RuntimeException e) {
            mo14485i(e);
            throw e;
        }
    }
}
