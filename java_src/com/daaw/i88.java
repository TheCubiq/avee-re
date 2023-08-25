package com.daaw;
/* loaded from: classes2.dex */
public final class i88 {
    public final Object a;
    public final int b;

    public i88(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i88) {
            i88 i88Var = (i88) obj;
            return this.a == i88Var.a && this.b == i88Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
