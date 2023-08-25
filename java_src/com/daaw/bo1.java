package com.daaw;
/* loaded from: classes2.dex */
public class bo1 {

    /* renamed from: a */
    public final String f5006a;

    /* renamed from: b */
    public final String f5007b;

    /* renamed from: c */
    public final StackTraceElement[] f5008c;

    /* renamed from: d */
    public final bo1 f5009d;

    public bo1(Throwable th, ef1 ef1Var) {
        this.f5006a = th.getLocalizedMessage();
        this.f5007b = th.getClass().getName();
        this.f5008c = ef1Var.mo9614a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f5009d = cause != null ? new bo1(cause, ef1Var) : null;
    }
}
