package com.daaw;

import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class r15 implements wz7 {
    public final m08 a;

    public r15(m08 m08Var) {
        this.a = m08Var;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((o15) this.a).a().e() != null ? Collections.singleton("banner") : Collections.emptySet();
        e08.b(singleton);
        return singleton;
    }
}
