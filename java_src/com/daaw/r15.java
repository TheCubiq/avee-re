package com.daaw;

import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class r15 implements wz7 {

    /* renamed from: a */
    public final m08 f24731a;

    public r15(m08 m08Var) {
        this.f24731a = m08Var;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((o15) this.f24731a).m14651a().m8598e() != null ? Collections.singleton("banner") : Collections.emptySet();
        e08.m23801b(singleton);
        return singleton;
    }
}
