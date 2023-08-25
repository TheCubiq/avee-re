package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class wk4 implements qo8 {

    /* renamed from: a */
    public final Executor f31295a;

    /* renamed from: b */
    public final InterfaceC1587hl f31296b;

    /* renamed from: c */
    public final dw8 f31297c;

    public wk4(Executor executor, InterfaceC1587hl interfaceC1587hl, dw8 dw8Var) {
        this.f31295a = executor;
        this.f31296b = interfaceC1587hl;
        this.f31297c = dw8Var;
    }

    @Override // com.daaw.qo8
    /* renamed from: a */
    public final void mo5231a(rj1 rj1Var) {
        this.f31295a.execute(new xr3(this, rj1Var));
    }
}
