package com.daaw;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes2.dex */
public final class ca8 extends c86 {
    public Handler c;
    public final z98 d;
    public final w98 e;
    public final h98 f;

    public ca8(dr6 dr6Var) {
        super(dr6Var);
        this.d = new z98(this);
        this.e = new w98(this);
        this.f = new h98(this);
    }

    public static /* bridge */ /* synthetic */ void p(ca8 ca8Var, long j) {
        ca8Var.f();
        ca8Var.s();
        ca8Var.a.i().v().b("Activity paused, time", Long.valueOf(j));
        ca8Var.f.a(j);
        if (ca8Var.a.z().D()) {
            ca8Var.e.b(j);
        }
    }

    public static /* bridge */ /* synthetic */ void q(ca8 ca8Var, long j) {
        ca8Var.f();
        ca8Var.s();
        ca8Var.a.i().v().b("Activity resumed, time", Long.valueOf(j));
        if (ca8Var.a.z().D() || ca8Var.a.F().r.b()) {
            ca8Var.e.c(j);
        }
        ca8Var.f.b();
        z98 z98Var = ca8Var.d;
        z98Var.a.f();
        if (z98Var.a.a.n()) {
            z98Var.b(z98Var.a.a.b().a(), false);
        }
    }

    @Override // com.daaw.c86
    public final boolean m() {
        return false;
    }

    public final void s() {
        f();
        if (this.c == null) {
            this.c = new np3(Looper.getMainLooper());
        }
    }
}
