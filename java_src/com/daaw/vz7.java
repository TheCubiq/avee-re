package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class vz7 implements m08, qz7 {

    /* renamed from: c */
    public static final Object f30732c = new Object();

    /* renamed from: a */
    public volatile m08 f30733a;

    /* renamed from: b */
    public volatile Object f30734b = f30732c;

    public vz7(m08 m08Var) {
        this.f30733a = m08Var;
    }

    /* renamed from: a */
    public static qz7 m6639a(m08 m08Var) {
        if (m08Var instanceof qz7) {
            return (qz7) m08Var;
        }
        Objects.requireNonNull(m08Var);
        return new vz7(m08Var);
    }

    /* renamed from: b */
    public static m08 m6638b(m08 m08Var) {
        Objects.requireNonNull(m08Var);
        return m08Var instanceof vz7 ? m08Var : new vz7(m08Var);
    }

    @Override // com.daaw.m08
    public final Object zzb() {
        Object obj = this.f30734b;
        Object obj2 = f30732c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f30734b;
                if (obj == obj2) {
                    obj = this.f30733a.zzb();
                    Object obj3 = this.f30734b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f30734b = obj;
                    this.f30733a = null;
                }
            }
        }
        return obj;
    }
}
