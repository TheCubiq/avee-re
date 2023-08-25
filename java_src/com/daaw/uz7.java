package com.daaw;
/* loaded from: classes.dex */
public final class uz7 implements wz7 {

    /* renamed from: a */
    public m08 f29700a;

    /* renamed from: a */
    public static void m7566a(m08 m08Var, m08 m08Var2) {
        uz7 uz7Var = (uz7) m08Var;
        if (uz7Var.f29700a != null) {
            throw new IllegalStateException();
        }
        uz7Var.f29700a = m08Var2;
    }

    @Override // com.daaw.m08
    public final Object zzb() {
        m08 m08Var = this.f29700a;
        if (m08Var != null) {
            return m08Var.zzb();
        }
        throw new IllegalStateException();
    }
}
