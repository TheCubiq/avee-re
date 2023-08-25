package com.daaw;

import java.util.concurrent.Executor;
/* renamed from: com.daaw.ir */
/* loaded from: classes2.dex */
public final class ExecutorC1748ir extends AbstractC0898bz implements Executor {

    /* renamed from: r */
    public static final ExecutorC1748ir f13933r = new ExecutorC1748ir();

    /* renamed from: s */
    public static final AbstractC2557pl f13934s;

    static {
        int m22604d;
        op1 op1Var = op1.f21794q;
        m22604d = fj1.m22604d("kotlinx.coroutines.io.parallelism", f31.m22948a(64, dj1.m24356a()), 0, 0, 12, null);
        f13934s = op1Var.m13313V(m22604d);
    }

    @Override // com.daaw.AbstractC2557pl
    /* renamed from: T */
    public void mo5048T(InterfaceC2307nl interfaceC2307nl, Runnable runnable) {
        f13934s.mo5048T(interfaceC2307nl, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo5048T(C2215mw.f19172p, runnable);
    }

    @Override // com.daaw.AbstractC2557pl
    public String toString() {
        return "Dispatchers.IO";
    }
}
