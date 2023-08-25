package com.daaw;

import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzatd;
import java.util.Objects;
/* loaded from: classes.dex */
public final class k03 {
    public final Handler a;
    public final l03 b;

    public k03(Handler handler, l03 l03Var) {
        Objects.requireNonNull(handler);
        this.a = handler;
        this.b = l03Var;
    }

    public final void b(String str, long j, long j2) {
        this.a.post(new e03(this, str, j, j2));
    }

    public final void c(as2 as2Var) {
        this.a.post(new j03(this, as2Var));
    }

    public final void d(int i, long j) {
        this.a.post(new g03(this, i, j));
    }

    public final void e(as2 as2Var) {
        this.a.post(new d03(this, as2Var));
    }

    public final void f(zzatd zzatdVar) {
        this.a.post(new f03(this, zzatdVar));
    }

    public final void g(Surface surface) {
        this.a.post(new i03(this, surface));
    }

    public final void h(int i, int i2, int i3, float f) {
        this.a.post(new h03(this, i, i2, i3, f));
    }
}
