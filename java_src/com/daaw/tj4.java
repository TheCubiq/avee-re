package com.daaw;

import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class tj4 implements wz7 {
    public final gj4 a;
    public final m08 b;

    public tj4(gj4 gj4Var, m08 m08Var) {
        this.a = gj4Var;
        this.b = m08Var;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new ly4((ol4) this.b.zzb(), z04.f));
        e08.b(singleton);
        return singleton;
    }
}
