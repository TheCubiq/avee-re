package com.daaw;

import com.daaw.ql;
import java.util.List;
import java.util.ServiceLoader;
/* loaded from: classes2.dex */
public final class rl {
    public static final List<ql> a = lb1.d(jb1.a(ServiceLoader.load(ql.class, ql.class.getClassLoader()).iterator()));

    public static final void a(nl nlVar, Throwable th) {
        for (ql qlVar : a) {
            try {
                qlVar.handleException(nlVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, sl.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final void b() {
        ql.a aVar = ql.c;
    }
}
