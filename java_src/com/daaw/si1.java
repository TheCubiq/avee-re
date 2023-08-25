package com.daaw;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class si1<T> implements wi0<T>, Serializable {
    public x40<? extends T> p;
    public volatile Object q;
    public final Object r;

    public si1(x40<? extends T> x40Var, Object obj) {
        ug0.f(x40Var, "initializer");
        this.p = x40Var;
        this.q = cp1.a;
        this.r = obj == null ? this : obj;
    }

    public /* synthetic */ si1(x40 x40Var, Object obj, int i, pq pqVar) {
        this(x40Var, (i & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.q != cp1.a;
    }

    @Override // com.daaw.wi0
    public T getValue() {
        T t;
        T t2 = (T) this.q;
        cp1 cp1Var = cp1.a;
        if (t2 != cp1Var) {
            return t2;
        }
        synchronized (this.r) {
            t = (T) this.q;
            if (t == cp1Var) {
                x40<? extends T> x40Var = this.p;
                ug0.c(x40Var);
                t = x40Var.a();
                this.q = t;
                this.p = null;
            }
        }
        return t;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
