package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class yz8 implements Runnable {
    public final /* synthetic */ dw8 p;
    public final /* synthetic */ Callable q;

    public yz8(dw8 dw8Var, Callable callable) {
        this.p = dw8Var;
        this.q = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.p.r(this.q.call());
        } catch (Exception e) {
            this.p.q(e);
        } catch (Throwable th) {
            this.p.q(new RuntimeException(th));
        }
    }
}
