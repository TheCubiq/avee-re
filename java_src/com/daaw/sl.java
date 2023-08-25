package com.daaw;
/* loaded from: classes2.dex */
public final class sl {
    public static final void a(nl nlVar, Throwable th) {
        try {
            ql qlVar = (ql) nlVar.get(ql.c);
            if (qlVar == null) {
                rl.a(nlVar, th);
            } else {
                qlVar.handleException(nlVar, th);
            }
        } catch (Throwable th2) {
            rl.a(nlVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        xy.a(runtimeException, th);
        return runtimeException;
    }
}
