package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class ir extends bz implements Executor {
    public static final ir r = new ir();
    public static final pl s;

    static {
        int d;
        op1 op1Var = op1.q;
        d = fj1.d("kotlinx.coroutines.io.parallelism", f31.a(64, dj1.a()), 0, 0, 12, null);
        s = op1Var.V(d);
    }

    @Override // com.daaw.pl
    public void T(nl nlVar, Runnable runnable) {
        s.T(nlVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        T(mw.p, runnable);
    }

    @Override // com.daaw.pl
    public String toString() {
        return "Dispatchers.IO";
    }
}
