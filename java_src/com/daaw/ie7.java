package com.daaw;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class ie7 extends m87 {
    public final ef7 a;

    public ie7(ef7 ef7Var, @Nullable x97 x97Var) {
        int i = fe7.b[ef7Var.b().ordinal()];
        this.a = ef7Var;
    }

    @Override // com.daaw.m87
    public final l97 a() {
        ef7 ef7Var = this.a;
        return new he7(ef7Var.f(), ef7Var.c(), null);
    }
}
