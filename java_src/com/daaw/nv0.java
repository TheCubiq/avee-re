package com.daaw;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class nv0<A, B> implements Serializable {
    public final A p;
    public final B q;

    public nv0(A a, B b) {
        this.p = a;
        this.q = b;
    }

    public final A a() {
        return this.p;
    }

    public final B b() {
        return this.q;
    }

    public final A c() {
        return this.p;
    }

    public final B d() {
        return this.q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nv0) {
            nv0 nv0Var = (nv0) obj;
            return ug0.a(this.p, nv0Var.p) && ug0.a(this.q, nv0Var.q);
        }
        return false;
    }

    public int hashCode() {
        A a = this.p;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.q;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.p + ", " + this.q + ')';
    }
}
