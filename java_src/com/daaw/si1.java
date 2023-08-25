package com.daaw;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class si1<T> implements wi0<T>, Serializable {

    /* renamed from: p */
    public x40<? extends T> f26266p;

    /* renamed from: q */
    public volatile Object f26267q;

    /* renamed from: r */
    public final Object f26268r;

    public si1(x40<? extends T> x40Var, Object obj) {
        ug0.m8268f(x40Var, "initializer");
        this.f26266p = x40Var;
        this.f26267q = cp1.f6065a;
        this.f26268r = obj == null ? this : obj;
    }

    public /* synthetic */ si1(x40 x40Var, Object obj, int i, C2575pq c2575pq) {
        this(x40Var, (i & 2) != 0 ? null : obj);
    }

    /* renamed from: a */
    public boolean m10333a() {
        return this.f26267q != cp1.f6065a;
    }

    @Override // com.daaw.wi0
    public T getValue() {
        T t;
        T t2 = (T) this.f26267q;
        cp1 cp1Var = cp1.f6065a;
        if (t2 != cp1Var) {
            return t2;
        }
        synchronized (this.f26268r) {
            t = (T) this.f26267q;
            if (t == cp1Var) {
                x40<? extends T> x40Var = this.f26266p;
                ug0.m8271c(x40Var);
                t = x40Var.mo5541a();
                this.f26267q = t;
                this.f26266p = null;
            }
        }
        return t;
    }

    public String toString() {
        return m10333a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
