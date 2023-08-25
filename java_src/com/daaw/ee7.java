package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class ee7 {

    /* renamed from: a */
    public final Class f8422a;

    /* renamed from: b */
    public final Map f8423b;

    /* renamed from: c */
    public final Class f8424c;

    @SafeVarargs
    public ee7(Class cls, cf7... cf7VarArr) {
        this.f8422a = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            cf7 cf7Var = cf7VarArr[i];
            if (hashMap.containsKey(cf7Var.m25395b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cf7Var.m25395b().getCanonicalName())));
            }
            hashMap.put(cf7Var.m25395b(), cf7Var);
        }
        this.f8424c = cf7VarArr[0].m25395b();
        this.f8423b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public de7 mo5331a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: b */
    public abstract mm7 mo5330b();

    /* renamed from: c */
    public abstract xt7 mo5329c(yq7 yq7Var);

    /* renamed from: d */
    public abstract String mo5328d();

    /* renamed from: e */
    public abstract void mo5327e(xt7 xt7Var);

    /* renamed from: f */
    public int mo11546f() {
        return 1;
    }

    /* renamed from: g */
    public final Class m23536g() {
        return this.f8424c;
    }

    /* renamed from: h */
    public final Class m23535h() {
        return this.f8422a;
    }

    /* renamed from: i */
    public final Object m23534i(xt7 xt7Var, Class cls) {
        cf7 cf7Var = (cf7) this.f8423b.get(cls);
        if (cf7Var != null) {
            return cf7Var.mo2495a(xt7Var);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    /* renamed from: j */
    public final Set m23533j() {
        return this.f8423b.keySet();
    }
}
