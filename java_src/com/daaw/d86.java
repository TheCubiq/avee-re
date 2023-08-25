package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class d86<TResult, TContinuationResult> implements ku0<TContinuationResult>, gu0, zt0, qo8 {
    public final Executor a;
    public final hl b;
    public final dw8 c;

    public d86(Executor executor, hl hlVar, dw8 dw8Var) {
        this.a = executor;
        this.b = hlVar;
        this.c = dw8Var;
    }

    @Override // com.daaw.qo8
    public final void a(rj1 rj1Var) {
        this.a.execute(new ee5(this, rj1Var));
    }

    @Override // com.daaw.zt0
    public final void b() {
        this.c.s();
    }

    @Override // com.daaw.gu0
    public final void c(Exception exc) {
        this.c.q(exc);
    }

    @Override // com.daaw.ku0
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.c.r(tcontinuationresult);
    }
}
