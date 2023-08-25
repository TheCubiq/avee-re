package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class e98 implements Runnable {
    public final long p;
    public final long q;
    public final /* synthetic */ h98 r;

    public e98(h98 h98Var, long j, long j2) {
        this.r = h98Var;
        this.p = j;
        this.q = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.r.b.a.r().z(new Runnable() { // from class: com.daaw.b98
            @Override // java.lang.Runnable
            public final void run() {
                e98 e98Var = e98.this;
                h98 h98Var = e98Var.r;
                long j = e98Var.p;
                long j2 = e98Var.q;
                h98Var.b.f();
                h98Var.b.a.i().p().a("Application going to the background");
                h98Var.b.a.F().r.a(true);
                Bundle bundle = new Bundle();
                if (!h98Var.b.a.z().D()) {
                    h98Var.b.e.b(j2);
                    h98Var.b.e.d(false, false, j2);
                }
                h98Var.b.a.I().v("auto", "_ab", j, bundle);
            }
        });
    }
}
