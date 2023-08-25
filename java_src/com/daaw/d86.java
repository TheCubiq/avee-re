package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class d86<TResult, TContinuationResult> implements ku0<TContinuationResult>, gu0, zt0, qo8 {

    /* renamed from: a */
    public final Executor f6611a;

    /* renamed from: b */
    public final InterfaceC1587hl f6612b;

    /* renamed from: c */
    public final dw8 f6613c;

    public d86(Executor executor, InterfaceC1587hl interfaceC1587hl, dw8 dw8Var) {
        this.f6611a = executor;
        this.f6612b = interfaceC1587hl;
        this.f6613c = dw8Var;
    }

    @Override // com.daaw.qo8
    /* renamed from: a */
    public final void mo5231a(rj1 rj1Var) {
        this.f6611a.execute(new ee5(this, rj1Var));
    }

    @Override // com.daaw.zt0
    /* renamed from: b */
    public final void mo1920b() {
        this.f6613c.m23854s();
    }

    @Override // com.daaw.gu0
    /* renamed from: c */
    public final void mo5820c(Exception exc) {
        this.f6613c.m23856q(exc);
    }

    @Override // com.daaw.ku0
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f6613c.m23855r(tcontinuationresult);
    }
}
