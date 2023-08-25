package com.daaw;
/* loaded from: classes.dex */
public final class ur7 {
    public final Object a;
    public final int b;

    public ur7(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ur7) {
            ur7 ur7Var = (ur7) obj;
            return this.a == ur7Var.a && this.b == ur7Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
