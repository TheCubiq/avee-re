package com.daaw;
/* loaded from: classes.dex */
public final class gk0<L> {
    public final L a;
    public final String b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gk0) {
            gk0 gk0Var = (gk0) obj;
            return this.a == gk0Var.a && this.b.equals(gk0Var.b);
        }
        return false;
    }

    public int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
