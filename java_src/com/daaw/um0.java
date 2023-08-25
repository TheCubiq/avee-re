package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class um0 {
    public static final boolean a = true;

    public static final kq0 a(Throwable th, String str) {
        if (a) {
            return new kq0(th, str);
        }
        if (th == null) {
            d();
            throw new mi0();
        }
        throw th;
    }

    public static /* synthetic */ kq0 b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(rm0 rm0Var) {
        return rm0Var.W() instanceof kq0;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final rm0 e(sm0 sm0Var, List<? extends sm0> list) {
        try {
            return sm0Var.createDispatcher(list);
        } catch (Throwable th) {
            return a(th, sm0Var.hintOnError());
        }
    }
}
