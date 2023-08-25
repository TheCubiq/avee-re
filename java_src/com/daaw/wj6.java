package com.daaw;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class wj6 {
    @GuardedBy("lock")
    public static rj1 a;
    @GuardedBy("lock")
    public static l5 b;
    public static final Object c = new Object();

    public static rj1 a(Context context) {
        rj1 rj1Var;
        b(context, false);
        synchronized (c) {
            rj1Var = a;
        }
        return rj1Var;
    }

    public static void b(Context context, boolean z) {
        synchronized (c) {
            if (b == null) {
                b = k5.a(context);
            }
            rj1 rj1Var = a;
            if (rj1Var == null || ((rj1Var.m() && !a.n()) || (z && a.m()))) {
                a = ((l5) ry0.k(b, "the appSetIdClient shouldn't be null")).a();
            }
        }
    }
}
