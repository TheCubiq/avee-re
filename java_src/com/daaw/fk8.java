package com.daaw;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class fk8 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ rj1 f9640p;

    /* renamed from: q */
    public final /* synthetic */ im8 f9641q;

    public fk8(im8 im8Var, rj1 rj1Var) {
        this.f9641q = im8Var;
        this.f9640p = rj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ai1 ai1Var;
        try {
            ai1Var = this.f9641q.f13797b;
            rj1 mo6209a = ai1Var.mo6209a(this.f9640p.mo11239k());
            if (mo6209a == null) {
                this.f9641q.mo5820c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = yj1.f33728b;
            mo6209a.mo11245e(executor, this.f9641q);
            mo6209a.mo11246d(executor, this.f9641q);
            mo6209a.mo11249a(executor, this.f9641q);
        } catch (n61 e) {
            if (e.getCause() instanceof Exception) {
                this.f9641q.mo5820c((Exception) e.getCause());
            } else {
                this.f9641q.mo5820c(e);
            }
        } catch (CancellationException unused) {
            this.f9641q.mo1920b();
        } catch (Exception e2) {
            this.f9641q.mo5820c(e2);
        }
    }
}
