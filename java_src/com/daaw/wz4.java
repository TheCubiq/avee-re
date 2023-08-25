package com.daaw;

import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class wz4 implements wz7 {
    public final sz4 a;
    public final m08 b;

    public wz4(sz4 sz4Var, m08 m08Var) {
        this.a = sz4Var;
        this.b = m08Var;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new ly4((ip4) this.b.zzb(), z04.f));
        e08.b(singleton);
        return singleton;
    }
}
