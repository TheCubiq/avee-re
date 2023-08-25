package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class l05 implements wz7 {
    public final sz4 a;
    public final m08 b;

    public l05(sz4 sz4Var, m08 m08Var) {
        this.a = sz4Var;
        this.b = m08Var;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.a.d((Executor) this.b.zzb());
    }
}
