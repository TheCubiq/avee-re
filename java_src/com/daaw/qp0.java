package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class qp0 implements g00<pp0> {
    public final a01<Context> a;
    public final a01<fn> b;

    public qp0(a01<Context> a01Var, a01<fn> a01Var2) {
        this.a = a01Var;
        this.b = a01Var2;
    }

    public static qp0 a(a01<Context> a01Var, a01<fn> a01Var2) {
        return new qp0(a01Var, a01Var2);
    }

    public static pp0 c(Context context, Object obj) {
        return new pp0(context, (fn) obj);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public pp0 get() {
        return c(this.a.get(), this.b.get());
    }
}
