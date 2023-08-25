package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class qp0 implements g00<pp0> {

    /* renamed from: a */
    public final a01<Context> f24228a;

    /* renamed from: b */
    public final a01<C1307fn> f24229b;

    public qp0(a01<Context> a01Var, a01<C1307fn> a01Var2) {
        this.f24228a = a01Var;
        this.f24229b = a01Var2;
    }

    /* renamed from: a */
    public static qp0 m12304a(a01<Context> a01Var, a01<C1307fn> a01Var2) {
        return new qp0(a01Var, a01Var2);
    }

    /* renamed from: c */
    public static pp0 m12302c(Context context, Object obj) {
        return new pp0(context, (C1307fn) obj);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public pp0 get() {
        return m12302c(this.f24228a.get(), this.f24229b.get());
    }
}
