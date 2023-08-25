package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class yz8 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ dw8 f34298p;

    /* renamed from: q */
    public final /* synthetic */ Callable f34299q;

    public yz8(dw8 dw8Var, Callable callable) {
        this.f34298p = dw8Var;
        this.f34299q = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f34298p.m23855r(this.f34299q.call());
        } catch (Exception e) {
            this.f34298p.m23856q(e);
        } catch (Throwable th) {
            this.f34298p.m23856q(new RuntimeException(th));
        }
    }
}
