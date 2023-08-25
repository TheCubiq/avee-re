package com.daaw;

import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class r77 extends TimeoutException {
    public /* synthetic */ r77(String str, q77 q77Var) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
