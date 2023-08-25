package com.daaw;
/* loaded from: classes.dex */
public class at7 {
    public static final vr7 c = vr7.c;
    public volatile xt7 a;
    public volatile yq7 b;

    public final int a() {
        if (this.b != null) {
            return ((uq7) this.b).t.length;
        }
        if (this.a != null) {
            return this.a.i();
        }
        return 0;
    }

    public final yq7 b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            this.b = this.a == null ? yq7.q : this.a.d();
            return this.b;
        }
    }

    public final void c(xt7 xt7Var) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = xt7Var;
                    this.b = yq7.q;
                } catch (xs7 unused) {
                    this.a = xt7Var;
                    this.b = yq7.q;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof at7) {
            at7 at7Var = (at7) obj;
            xt7 xt7Var = this.a;
            xt7 xt7Var2 = at7Var.a;
            if (xt7Var == null && xt7Var2 == null) {
                return b().equals(at7Var.b());
            }
            if (xt7Var == null || xt7Var2 == null) {
                if (xt7Var != null) {
                    at7Var.c(xt7Var.c());
                    return xt7Var.equals(at7Var.a);
                }
                c(xt7Var2.c());
                return this.a.equals(xt7Var2);
            }
            return xt7Var.equals(xt7Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
