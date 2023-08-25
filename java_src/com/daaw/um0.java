package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class um0 {

    /* renamed from: a */
    public static final boolean f29183a = true;

    /* renamed from: a */
    public static final kq0 m8024a(Throwable th, String str) {
        if (f29183a) {
            return new kq0(th, str);
        }
        if (th == null) {
            m8021d();
            throw new mi0();
        }
        throw th;
    }

    /* renamed from: b */
    public static /* synthetic */ kq0 m8023b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m8024a(th, str);
    }

    /* renamed from: c */
    public static final boolean m8022c(rm0 rm0Var) {
        return rm0Var.mo11184W() instanceof kq0;
    }

    /* renamed from: d */
    public static final Void m8021d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final rm0 m8020e(sm0 sm0Var, List<? extends sm0> list) {
        try {
            return sm0Var.createDispatcher(list);
        } catch (Throwable th) {
            return m8024a(th, sm0Var.hintOnError());
        }
    }
}
