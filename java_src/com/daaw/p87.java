package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public class p87 implements n87 {

    /* renamed from: a */
    public final ee7 f22704a;

    /* renamed from: b */
    public final Class f22705b;

    public p87(ee7 ee7Var, Class cls) {
        if (!ee7Var.m23533j().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", ee7Var.toString(), cls.getName()));
        }
        this.f22704a = ee7Var;
        this.f22705b = cls;
    }

    @Override // com.daaw.n87
    /* renamed from: a */
    public final Object mo13587a(xt7 xt7Var) {
        String concat = "Expected proto of type ".concat(this.f22704a.m23535h().getName());
        if (this.f22704a.m23535h().isInstance(xt7Var)) {
            return m13582f(xt7Var);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.daaw.n87
    /* renamed from: b */
    public final Object mo13586b(yq7 yq7Var) {
        try {
            return m13582f(this.f22704a.mo5329c(yq7Var));
        } catch (xs7 e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f22704a.m23535h().getName()), e);
        }
    }

    @Override // com.daaw.n87
    /* renamed from: c */
    public final nm7 mo13585c(yq7 yq7Var) {
        try {
            xt7 m14444a = m13583e().m14444a(yq7Var);
            km7 m15034L = nm7.m15034L();
            m15034L.m17662t(this.f22704a.mo5328d());
            m15034L.m17661u(m14444a.mo4514d());
            m15034L.m17663s(this.f22704a.mo5330b());
            return (nm7) m15034L.m22315n();
        } catch (xs7 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.daaw.n87
    /* renamed from: d */
    public final xt7 mo13584d(yq7 yq7Var) {
        try {
            return m13583e().m14444a(yq7Var);
        } catch (xs7 e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f22704a.mo5331a().m24441e().getName()), e);
        }
    }

    /* renamed from: e */
    public final o87 m13583e() {
        return new o87(this.f22704a.mo5331a());
    }

    /* renamed from: f */
    public final Object m13582f(xt7 xt7Var) {
        if (Void.class.equals(this.f22705b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f22704a.mo5327e(xt7Var);
        return this.f22704a.m23534i(xt7Var, this.f22705b);
    }

    @Override // com.daaw.n87
    public final Class zzc() {
        return this.f22705b;
    }

    @Override // com.daaw.n87
    public final String zzf() {
        return this.f22704a.mo5328d();
    }
}
