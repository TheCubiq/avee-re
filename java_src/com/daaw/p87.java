package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public class p87 implements n87 {
    public final ee7 a;
    public final Class b;

    public p87(ee7 ee7Var, Class cls) {
        if (!ee7Var.j().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", ee7Var.toString(), cls.getName()));
        }
        this.a = ee7Var;
        this.b = cls;
    }

    @Override // com.daaw.n87
    public final Object a(xt7 xt7Var) {
        String concat = "Expected proto of type ".concat(this.a.h().getName());
        if (this.a.h().isInstance(xt7Var)) {
            return f(xt7Var);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.daaw.n87
    public final Object b(yq7 yq7Var) {
        try {
            return f(this.a.c(yq7Var));
        } catch (xs7 e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.a.h().getName()), e);
        }
    }

    @Override // com.daaw.n87
    public final nm7 c(yq7 yq7Var) {
        try {
            xt7 a = e().a(yq7Var);
            km7 L = nm7.L();
            L.t(this.a.d());
            L.u(a.d());
            L.s(this.a.b());
            return (nm7) L.n();
        } catch (xs7 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.daaw.n87
    public final xt7 d(yq7 yq7Var) {
        try {
            return e().a(yq7Var);
        } catch (xs7 e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.a.a().e().getName()), e);
        }
    }

    public final o87 e() {
        return new o87(this.a.a());
    }

    public final Object f(xt7 xt7Var) {
        if (Void.class.equals(this.b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.a.e(xt7Var);
        return this.a.i(xt7Var, this.b);
    }

    @Override // com.daaw.n87
    public final Class zzc() {
        return this.b;
    }

    @Override // com.daaw.n87
    public final String zzf() {
        return this.a.d();
    }
}
