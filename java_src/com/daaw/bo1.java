package com.daaw;
/* loaded from: classes2.dex */
public class bo1 {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final bo1 d;

    public bo1(Throwable th, ef1 ef1Var) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = ef1Var.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.d = cause != null ? new bo1(cause, ef1Var) : null;
    }
}
