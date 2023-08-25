package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class wk4 implements qo8 {
    public final Executor a;
    public final hl b;
    public final dw8 c;

    public wk4(Executor executor, hl hlVar, dw8 dw8Var) {
        this.a = executor;
        this.b = hlVar;
        this.c = dw8Var;
    }

    @Override // com.daaw.qo8
    public final void a(rj1 rj1Var) {
        this.a.execute(new xr3(this, rj1Var));
    }
}
