package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class im8<TResult, TContinuationResult> implements ku0<TContinuationResult>, gu0, zt0, qo8 {

    /* renamed from: a */
    public final Executor f13796a;

    /* renamed from: b */
    public final ai1 f13797b;

    /* renamed from: c */
    public final dw8 f13798c;

    public im8(Executor executor, ai1 ai1Var, dw8 dw8Var) {
        this.f13796a = executor;
        this.f13797b = ai1Var;
        this.f13798c = dw8Var;
    }

    @Override // com.daaw.qo8
    /* renamed from: a */
    public final void mo5231a(rj1 rj1Var) {
        this.f13796a.execute(new fk8(this, rj1Var));
    }

    @Override // com.daaw.zt0
    /* renamed from: b */
    public final void mo1920b() {
        this.f13798c.m23854s();
    }

    @Override // com.daaw.gu0
    /* renamed from: c */
    public final void mo5820c(Exception exc) {
        this.f13798c.m23856q(exc);
    }

    @Override // com.daaw.ku0
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f13798c.m23855r(tcontinuationresult);
    }
}
