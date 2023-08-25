package com.daaw;
/* loaded from: classes.dex */
public final class gk0<L> {

    /* renamed from: a */
    public final L f11379a;

    /* renamed from: b */
    public final String f11380b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gk0) {
            gk0 gk0Var = (gk0) obj;
            return this.f11379a == gk0Var.f11379a && this.f11380b.equals(gk0Var.f11380b);
        }
        return false;
    }

    public int hashCode() {
        return (System.identityHashCode(this.f11379a) * 31) + this.f11380b.hashCode();
    }
}
