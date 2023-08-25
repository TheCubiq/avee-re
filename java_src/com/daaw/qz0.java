package com.daaw;
/* loaded from: classes2.dex */
public abstract class qz0 extends kd implements gi0 {
    public qz0() {
    }

    public qz0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qz0) {
            qz0 qz0Var = (qz0) obj;
            return f().equals(qz0Var.f()) && e().equals(qz0Var.e()) && g().equals(qz0Var.g()) && ug0.a(d(), qz0Var.d());
        } else if (obj instanceof gi0) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((f().hashCode() * 31) + e().hashCode()) * 31) + g().hashCode();
    }

    public String toString() {
        ci0 b = b();
        if (b != this) {
            return b.toString();
        }
        return "property " + e() + " (Kotlin reflection is not available)";
    }
}
