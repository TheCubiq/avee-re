package com.daaw;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class fk8 implements Runnable {
    public final /* synthetic */ rj1 p;
    public final /* synthetic */ im8 q;

    public fk8(im8 im8Var, rj1 rj1Var) {
        this.q = im8Var;
        this.p = rj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ai1 ai1Var;
        try {
            ai1Var = this.q.b;
            rj1 a = ai1Var.a(this.p.k());
            if (a == null) {
                this.q.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = yj1.b;
            a.e(executor, this.q);
            a.d(executor, this.q);
            a.a(executor, this.q);
        } catch (n61 e) {
            if (e.getCause() instanceof Exception) {
                this.q.c((Exception) e.getCause());
            } else {
                this.q.c(e);
            }
        } catch (CancellationException unused) {
            this.q.b();
        } catch (Exception e2) {
            this.q.c(e2);
        }
    }
}
