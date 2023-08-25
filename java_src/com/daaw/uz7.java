package com.daaw;
/* loaded from: classes.dex */
public final class uz7 implements wz7 {
    public m08 a;

    public static void a(m08 m08Var, m08 m08Var2) {
        uz7 uz7Var = (uz7) m08Var;
        if (uz7Var.a != null) {
            throw new IllegalStateException();
        }
        uz7Var.a = m08Var2;
    }

    @Override // com.daaw.m08
    public final Object zzb() {
        m08 m08Var = this.a;
        if (m08Var != null) {
            return m08Var.zzb();
        }
        throw new IllegalStateException();
    }
}
