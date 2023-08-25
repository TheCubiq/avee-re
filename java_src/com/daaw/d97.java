package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class d97 {

    /* renamed from: a */
    public final dn7 f6648a;

    /* renamed from: b */
    public final oh7 f6649b;

    public d97(dn7 dn7Var) {
        this.f6648a = dn7Var;
        this.f6649b = oh7.f21564b;
    }

    /* renamed from: a */
    public static final d97 m24591a(dn7 dn7Var) {
        if (dn7Var == null || dn7Var.m24207L() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new d97(dn7Var);
    }

    /* renamed from: b */
    public static final d97 m24590b(w87 w87Var) {
        je7 je7Var = new je7(ff7.m22691a(w87Var.m6342a()));
        b97 b97Var = new b97();
        z87 z87Var = new z87(je7Var, null);
        z87Var.m2617d();
        z87Var.m2616e();
        b97Var.m26322a(z87Var);
        return b97Var.m26321b();
    }

    /* renamed from: c */
    public final dn7 m24589c() {
        return this.f6648a;
    }

    /* renamed from: d */
    public final Object m24588d(Class cls) {
        Class m6294e = w97.m6294e(cls);
        if (m6294e != null) {
            y97.m3981b(this.f6648a);
            n97 n97Var = new n97(m6294e, null);
            n97Var.m15376c(this.f6649b);
            for (cn7 cn7Var : this.f6648a.m24201R()) {
                if (cn7Var.m25196U() == 3) {
                    Object m6293f = w97.m6293f(cn7Var.m25204M(), m6294e);
                    if (cn7Var.m25205L() == this.f6648a.m24206M()) {
                        n97Var.m15378a(m6293f, cn7Var);
                    } else {
                        n97Var.m15377b(m6293f, cn7Var);
                    }
                }
            }
            return w97.m6289j(n97Var.m15375d(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final String toString() {
        return y97.m3982a(this.f6648a).toString();
    }
}
