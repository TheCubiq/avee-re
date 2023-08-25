package com.daaw;

import java.util.Set;
/* loaded from: classes.dex */
public final class g05 implements wz7 {
    public final sz4 a;
    public final m08 b;

    public g05(sz4 sz4Var, m08 m08Var) {
        this.a = sz4Var;
        this.b = m08Var;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set f = this.a.f((ip4) this.b.zzb());
        e08.b(f);
        return f;
    }
}
