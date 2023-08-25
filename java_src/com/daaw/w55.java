package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class w55 implements wz7 {
    public final p55 a;
    public final m08 b;
    public final m08 c;

    public w55(p55 p55Var, m08 m08Var, m08 m08Var2) {
        this.a = p55Var;
        this.b = m08Var;
        this.c = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ly4(((f95) this.b).zzb(), (Executor) this.c.zzb());
    }
}
