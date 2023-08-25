package com.daaw;
/* loaded from: classes2.dex */
public abstract class qz0 extends AbstractC1940kd implements gi0 {
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
            return m17790f().equals(qz0Var.m17790f()) && m17791e().equals(qz0Var.m17791e()) && m17789g().equals(qz0Var.m17789g()) && ug0.m8273a(m17792d(), qz0Var.m17792d());
        } else if (obj instanceof gi0) {
            return obj.equals(m17793b());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((m17790f().hashCode() * 31) + m17791e().hashCode()) * 31) + m17789g().hashCode();
    }

    public String toString() {
        ci0 m17793b = m17793b();
        if (m17793b != this) {
            return m17793b.toString();
        }
        return "property " + m17791e() + " (Kotlin reflection is not available)";
    }
}
