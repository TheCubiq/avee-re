package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class d97 {
    public final dn7 a;
    public final oh7 b;

    public d97(dn7 dn7Var) {
        this.a = dn7Var;
        this.b = oh7.b;
    }

    public static final d97 a(dn7 dn7Var) {
        if (dn7Var == null || dn7Var.L() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new d97(dn7Var);
    }

    public static final d97 b(w87 w87Var) {
        je7 je7Var = new je7(ff7.a(w87Var.a()));
        b97 b97Var = new b97();
        z87 z87Var = new z87(je7Var, null);
        z87Var.d();
        z87Var.e();
        b97Var.a(z87Var);
        return b97Var.b();
    }

    public final dn7 c() {
        return this.a;
    }

    public final Object d(Class cls) {
        Class e = w97.e(cls);
        if (e != null) {
            y97.b(this.a);
            n97 n97Var = new n97(e, null);
            n97Var.c(this.b);
            for (cn7 cn7Var : this.a.R()) {
                if (cn7Var.U() == 3) {
                    Object f = w97.f(cn7Var.M(), e);
                    if (cn7Var.L() == this.a.M()) {
                        n97Var.a(f, cn7Var);
                    } else {
                        n97Var.b(f, cn7Var);
                    }
                }
            }
            return w97.j(n97Var.d(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final String toString() {
        return y97.a(this.a).toString();
    }
}
