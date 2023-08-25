package com.daaw;
/* loaded from: classes.dex */
public class ov0<F, S> {

    /* renamed from: a */
    public final F f22030a;

    /* renamed from: b */
    public final S f22031b;

    public ov0(F f, S s) {
        this.f22030a = f;
        this.f22031b = s;
    }

    /* renamed from: a */
    public static <A, B> ov0<A, B> m13911a(A a, B b) {
        return new ov0<>(a, b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ov0) {
            ov0 ov0Var = (ov0) obj;
            return pt0.m13160a(ov0Var.f22030a, this.f22030a) && pt0.m13160a(ov0Var.f22031b, this.f22031b);
        }
        return false;
    }

    public int hashCode() {
        F f = this.f22030a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f22031b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f22030a + " " + this.f22031b + "}";
    }
}
