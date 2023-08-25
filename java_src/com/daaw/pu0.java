package com.daaw;
/* loaded from: classes2.dex */
public abstract class pu0 {
    public abstract e7<?> a();

    public final boolean b(pu0 pu0Var) {
        e7<?> a;
        e7<?> a2 = a();
        return (a2 == null || (a = pu0Var.a()) == null || a2.f() >= a.f()) ? false : true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return aq.a(this) + '@' + aq.b(this);
    }
}
