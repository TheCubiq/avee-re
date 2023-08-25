package com.daaw;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public final class p67 implements Runnable {
    public final Future p;
    public final o67 q;

    public p67(Future future, o67 o67Var) {
        this.p = future;
        this.q = o67Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable a;
        Future future = this.p;
        if ((future instanceof y77) && (a = z77.a((y77) future)) != null) {
            this.q.b(a);
            return;
        }
        try {
            this.q.a(s67.p(this.p));
        } catch (Error e) {
            e = e;
            this.q.b(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.q.b(e);
        } catch (ExecutionException e3) {
            this.q.b(e3.getCause());
        }
    }

    public final String toString() {
        iy6 a = jy6.a(this);
        a.a(this.q);
        return a.toString();
    }
}
