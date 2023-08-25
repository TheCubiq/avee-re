package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class ee5 implements Runnable {
    public final /* synthetic */ rj1 p;
    public final /* synthetic */ d86 q;

    public ee5(d86 d86Var, rj1 rj1Var) {
        this.q = d86Var;
        this.p = rj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dw8 dw8Var;
        dw8 dw8Var2;
        dw8 dw8Var3;
        hl hlVar;
        try {
            hlVar = this.q.b;
            rj1 rj1Var = (rj1) hlVar.a(this.p);
            if (rj1Var == null) {
                this.q.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = yj1.b;
            rj1Var.e(executor, this.q);
            rj1Var.d(executor, this.q);
            rj1Var.a(executor, this.q);
        } catch (n61 e) {
            if (e.getCause() instanceof Exception) {
                dw8Var3 = this.q.c;
                dw8Var3.q((Exception) e.getCause());
                return;
            }
            dw8Var2 = this.q.c;
            dw8Var2.q(e);
        } catch (Exception e2) {
            dw8Var = this.q.c;
            dw8Var.q(e2);
        }
    }
}
