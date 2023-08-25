package com.daaw;

import java.lang.Thread;
/* loaded from: classes2.dex */
public final class nk6 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ vn6 b;

    public nk6(vn6 vn6Var, String str) {
        this.b = vn6Var;
        ry0.j(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.a.i().q().b(this.a, th);
    }
}
