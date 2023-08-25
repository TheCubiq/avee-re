package com.daaw;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class nv0<A, B> implements Serializable {

    /* renamed from: p */
    public final A f20747p;

    /* renamed from: q */
    public final B f20748q;

    public nv0(A a, B b) {
        this.f20747p = a;
        this.f20748q = b;
    }

    /* renamed from: a */
    public final A m14779a() {
        return this.f20747p;
    }

    /* renamed from: b */
    public final B m14778b() {
        return this.f20748q;
    }

    /* renamed from: c */
    public final A m14777c() {
        return this.f20747p;
    }

    /* renamed from: d */
    public final B m14776d() {
        return this.f20748q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nv0) {
            nv0 nv0Var = (nv0) obj;
            return ug0.m8273a(this.f20747p, nv0Var.f20747p) && ug0.m8273a(this.f20748q, nv0Var.f20748q);
        }
        return false;
    }

    public int hashCode() {
        A a = this.f20747p;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f20748q;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f20747p + ", " + this.f20748q + ')';
    }
}
