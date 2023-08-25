package com.daaw;
/* loaded from: classes2.dex */
public final class cl1 {
    public static final cl1 a = new cl1();
    public static final ThreadLocal<dy> b = new ThreadLocal<>();

    public final dy a() {
        ThreadLocal<dy> threadLocal = b;
        dy dyVar = threadLocal.get();
        if (dyVar == null) {
            dy a2 = gy.a();
            threadLocal.set(a2);
            return a2;
        }
        return dyVar;
    }

    public final void b() {
        b.set(null);
    }

    public final void c(dy dyVar) {
        b.set(dyVar);
    }
}
