package com.daaw;

import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class k05 implements wz7 {
    public final m08 a;

    public k05(m08 m08Var) {
        this.a = m08Var;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new ly4((f15) this.a.zzb(), z04.f));
        e08.b(singleton);
        return singleton;
    }
}
