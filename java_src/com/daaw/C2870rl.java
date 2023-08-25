package com.daaw;

import com.daaw.InterfaceC2739ql;
import java.util.List;
import java.util.ServiceLoader;
/* renamed from: com.daaw.rl */
/* loaded from: classes2.dex */
public final class C2870rl {

    /* renamed from: a */
    public static final List<InterfaceC2739ql> f25400a = lb1.m17064d(jb1.m18650a(ServiceLoader.load(InterfaceC2739ql.class, InterfaceC2739ql.class.getClassLoader()).iterator()));

    /* renamed from: a */
    public static final void m11206a(InterfaceC2307nl interfaceC2307nl, Throwable th) {
        for (InterfaceC2739ql interfaceC2739ql : f25400a) {
            try {
                interfaceC2739ql.handleException(interfaceC2307nl, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C2954sl.m10219b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    /* renamed from: b */
    public static final void m11205b() {
        InterfaceC2739ql.C2740a c2740a = InterfaceC2739ql.f24127c;
    }
}
