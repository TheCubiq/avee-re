package com.daaw;

import java.lang.Thread;
/* loaded from: classes2.dex */
public final class nk6 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f20200a;

    /* renamed from: b */
    public final /* synthetic */ vn6 f20201b;

    public nk6(vn6 vn6Var, String str) {
        this.f20201b = vn6Var;
        ry0.m10830j(str);
        this.f20200a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f20201b.f25143a.mo3895i().m14160q().m20652b(this.f20200a, th);
    }
}
