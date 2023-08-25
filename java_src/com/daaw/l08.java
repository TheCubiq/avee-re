package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class l08 implements m08 {
    public static final Object c = new Object();
    public volatile m08 a;
    public volatile Object b = c;

    public l08(m08 m08Var) {
        this.a = m08Var;
    }

    public static m08 a(m08 m08Var) {
        if ((m08Var instanceof l08) || (m08Var instanceof vz7)) {
            return m08Var;
        }
        Objects.requireNonNull(m08Var);
        return new l08(m08Var);
    }

    @Override // com.daaw.m08
    public final Object zzb() {
        Object obj = this.b;
        if (obj == c) {
            m08 m08Var = this.a;
            if (m08Var == null) {
                return this.b;
            }
            Object zzb = m08Var.zzb();
            this.b = zzb;
            this.a = null;
            return zzb;
        }
        return obj;
    }
}
