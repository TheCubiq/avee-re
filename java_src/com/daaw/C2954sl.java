package com.daaw;
/* renamed from: com.daaw.sl */
/* loaded from: classes2.dex */
public final class C2954sl {
    /* renamed from: a */
    public static final void m10220a(InterfaceC2307nl interfaceC2307nl, Throwable th) {
        try {
            InterfaceC2739ql interfaceC2739ql = (InterfaceC2739ql) interfaceC2307nl.get(InterfaceC2739ql.f24127c);
            if (interfaceC2739ql == null) {
                C2870rl.m11206a(interfaceC2307nl, th);
            } else {
                interfaceC2739ql.handleException(interfaceC2307nl, th);
            }
        } catch (Throwable th2) {
            C2870rl.m11206a(interfaceC2307nl, m10219b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m10219b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C3651xy.m4411a(runtimeException, th);
        return runtimeException;
    }
}
