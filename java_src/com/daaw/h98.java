package com.daaw;

import android.os.Handler;
/* loaded from: classes2.dex */
public final class h98 {
    public e98 a;
    public final /* synthetic */ ca8 b;

    public h98(ca8 ca8Var) {
        this.b = ca8Var;
    }

    public final void a(long j) {
        Handler handler;
        this.a = new e98(this, this.b.a.b().a(), j);
        handler = this.b.c;
        handler.postDelayed(this.a, 2000L);
    }

    public final void b() {
        Handler handler;
        this.b.f();
        e98 e98Var = this.a;
        if (e98Var != null) {
            handler = this.b.c;
            handler.removeCallbacks(e98Var);
        }
        this.b.a.F().r.a(false);
    }
}
