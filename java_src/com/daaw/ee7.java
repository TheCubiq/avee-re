package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class ee7 {
    public final Class a;
    public final Map b;
    public final Class c;

    @SafeVarargs
    public ee7(Class cls, cf7... cf7VarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            cf7 cf7Var = cf7VarArr[i];
            if (hashMap.containsKey(cf7Var.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cf7Var.b().getCanonicalName())));
            }
            hashMap.put(cf7Var.b(), cf7Var);
        }
        this.c = cf7VarArr[0].b();
        this.b = Collections.unmodifiableMap(hashMap);
    }

    public de7 a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract mm7 b();

    public abstract xt7 c(yq7 yq7Var);

    public abstract String d();

    public abstract void e(xt7 xt7Var);

    public int f() {
        return 1;
    }

    public final Class g() {
        return this.c;
    }

    public final Class h() {
        return this.a;
    }

    public final Object i(xt7 xt7Var, Class cls) {
        cf7 cf7Var = (cf7) this.b.get(cls);
        if (cf7Var != null) {
            return cf7Var.a(xt7Var);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    public final Set j() {
        return this.b.keySet();
    }
}
