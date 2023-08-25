package com.daaw;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class wj6 {
    @GuardedBy("lock")

    /* renamed from: a */
    public static rj1 f31276a;
    @GuardedBy("lock")

    /* renamed from: b */
    public static InterfaceC2013l5 f31277b;

    /* renamed from: c */
    public static final Object f31278c = new Object();

    /* renamed from: a */
    public static rj1 m6045a(Context context) {
        rj1 rj1Var;
        m6044b(context, false);
        synchronized (f31278c) {
            rj1Var = f31276a;
        }
        return rj1Var;
    }

    /* renamed from: b */
    public static void m6044b(Context context, boolean z) {
        synchronized (f31278c) {
            if (f31277b == null) {
                f31277b = C1912k5.m18047a(context);
            }
            rj1 rj1Var = f31276a;
            if (rj1Var == null || ((rj1Var.mo11237m() && !f31276a.mo11236n()) || (z && f31276a.mo11237m()))) {
                f31276a = ((InterfaceC2013l5) ry0.m10829k(f31277b, "the appSetIdClient shouldn't be null")).mo3453a();
            }
        }
    }
}
