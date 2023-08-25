package com.daaw;
/* loaded from: classes.dex */
public final class ur7 {

    /* renamed from: a */
    public final Object f29492a;

    /* renamed from: b */
    public final int f29493b;

    public ur7(Object obj, int i) {
        this.f29492a = obj;
        this.f29493b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ur7) {
            ur7 ur7Var = (ur7) obj;
            return this.f29492a == ur7Var.f29492a && this.f29493b == ur7Var.f29493b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f29492a) * 65535) + this.f29493b;
    }
}
