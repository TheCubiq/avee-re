package com.daaw;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public final class p67 implements Runnable {

    /* renamed from: p */
    public final Future f22645p;

    /* renamed from: q */
    public final o67 f22646q;

    public p67(Future future, o67 o67Var) {
        this.f22645p = future;
        this.f22646q = o67Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable m2679a;
        Future future = this.f22645p;
        if ((future instanceof y77) && (m2679a = z77.m2679a((y77) future)) != null) {
            this.f22646q.mo2150b(m2679a);
            return;
        }
        try {
            this.f22646q.mo2151a(s67.m10627p(this.f22645p));
        } catch (Error e) {
            e = e;
            this.f22646q.mo2150b(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.f22646q.mo2150b(e);
        } catch (ExecutionException e3) {
            this.f22646q.mo2150b(e3.getCause());
        }
    }

    public final String toString() {
        iy6 m18170a = jy6.m18170a(this);
        m18170a.m19259a(this.f22646q);
        return m18170a.toString();
    }
}
