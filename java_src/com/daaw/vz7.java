package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class vz7 implements m08, qz7 {
    public static final Object c = new Object();
    public volatile m08 a;
    public volatile Object b = c;

    public vz7(m08 m08Var) {
        this.a = m08Var;
    }

    public static qz7 a(m08 m08Var) {
        if (m08Var instanceof qz7) {
            return (qz7) m08Var;
        }
        Objects.requireNonNull(m08Var);
        return new vz7(m08Var);
    }

    public static m08 b(m08 m08Var) {
        Objects.requireNonNull(m08Var);
        return m08Var instanceof vz7 ? m08Var : new vz7(m08Var);
    }

    @Override // com.daaw.m08
    public final Object zzb() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj2) {
                    obj = this.a.zzb();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            }
        }
        return obj;
    }
}
