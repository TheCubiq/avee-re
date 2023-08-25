package com.daaw;
/* loaded from: classes.dex */
public class ov0<F, S> {
    public final F a;
    public final S b;

    public ov0(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public static <A, B> ov0<A, B> a(A a, B b) {
        return new ov0<>(a, b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ov0) {
            ov0 ov0Var = (ov0) obj;
            return pt0.a(ov0Var.a, this.a) && pt0.a(ov0Var.b, this.b);
        }
        return false;
    }

    public int hashCode() {
        F f = this.a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
