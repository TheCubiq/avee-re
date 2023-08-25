package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class l08 implements m08 {

    /* renamed from: c */
    public static final Object f16941c = new Object();

    /* renamed from: a */
    public volatile m08 f16942a;

    /* renamed from: b */
    public volatile Object f16943b = f16941c;

    public l08(m08 m08Var) {
        this.f16942a = m08Var;
    }

    /* renamed from: a */
    public static m08 m17224a(m08 m08Var) {
        if ((m08Var instanceof l08) || (m08Var instanceof vz7)) {
            return m08Var;
        }
        Objects.requireNonNull(m08Var);
        return new l08(m08Var);
    }

    @Override // com.daaw.m08
    public final Object zzb() {
        Object obj = this.f16943b;
        if (obj == f16941c) {
            m08 m08Var = this.f16942a;
            if (m08Var == null) {
                return this.f16943b;
            }
            Object zzb = m08Var.zzb();
            this.f16943b = zzb;
            this.f16942a = null;
            return zzb;
        }
        return obj;
    }
}
