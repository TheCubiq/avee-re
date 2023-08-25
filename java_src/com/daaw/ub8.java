package com.daaw;
/* loaded from: classes2.dex */
public class ub8 {
    public static final l88 c = l88.c;
    public volatile zd8 a;
    public volatile y68 b;

    public final int a() {
        if (this.b != null) {
            return ((p68) this.b).t.length;
        }
        if (this.a != null) {
            return this.a.c();
        }
        return 0;
    }

    public final y68 b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            this.b = this.a == null ? y68.q : this.a.zzbs();
            return this.b;
        }
    }

    public final void c(zd8 zd8Var) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = zd8Var;
                    this.b = y68.q;
                } catch (mb8 unused) {
                    this.a = zd8Var;
                    this.b = y68.q;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ub8) {
            ub8 ub8Var = (ub8) obj;
            zd8 zd8Var = this.a;
            zd8 zd8Var2 = ub8Var.a;
            if (zd8Var == null && zd8Var2 == null) {
                return b().equals(ub8Var.b());
            }
            if (zd8Var == null || zd8Var2 == null) {
                if (zd8Var != null) {
                    ub8Var.c(zd8Var.d());
                    return zd8Var.equals(ub8Var.a);
                }
                c(zd8Var2.d());
                return this.a.equals(zd8Var2);
            }
            return zd8Var.equals(zd8Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
