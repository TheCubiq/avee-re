package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class ee5 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ rj1 f8413p;

    /* renamed from: q */
    public final /* synthetic */ d86 f8414q;

    public ee5(d86 d86Var, rj1 rj1Var) {
        this.f8414q = d86Var;
        this.f8413p = rj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dw8 dw8Var;
        dw8 dw8Var2;
        dw8 dw8Var3;
        InterfaceC1587hl interfaceC1587hl;
        try {
            interfaceC1587hl = this.f8414q.f6612b;
            rj1 rj1Var = (rj1) interfaceC1587hl.mo2139a(this.f8413p);
            if (rj1Var == null) {
                this.f8414q.mo5820c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = yj1.f33728b;
            rj1Var.mo11245e(executor, this.f8414q);
            rj1Var.mo11246d(executor, this.f8414q);
            rj1Var.mo11249a(executor, this.f8414q);
        } catch (n61 e) {
            if (e.getCause() instanceof Exception) {
                dw8Var3 = this.f8414q.f6613c;
                dw8Var3.m23856q((Exception) e.getCause());
                return;
            }
            dw8Var2 = this.f8414q.f6613c;
            dw8Var2.m23856q(e);
        } catch (Exception e2) {
            dw8Var = this.f8414q.f6613c;
            dw8Var.m23856q(e2);
        }
    }
}
