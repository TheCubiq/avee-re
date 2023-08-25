package com.daaw;
/* loaded from: classes2.dex */
public final class i88 {

    /* renamed from: a */
    public final Object f13357a;

    /* renamed from: b */
    public final int f13358b;

    public i88(Object obj, int i) {
        this.f13357a = obj;
        this.f13358b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i88) {
            i88 i88Var = (i88) obj;
            return this.f13357a == i88Var.f13357a && this.f13358b == i88Var.f13358b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f13357a) * 65535) + this.f13358b;
    }
}
