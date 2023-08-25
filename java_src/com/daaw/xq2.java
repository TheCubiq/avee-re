package com.daaw;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzatd;
import java.util.Objects;
/* loaded from: classes.dex */
public final class xq2 {
    public final Handler a;
    public final dr2 b;

    public xq2(Handler handler, dr2 dr2Var) {
        Objects.requireNonNull(handler);
        this.a = handler;
        this.b = dr2Var;
    }

    public final void b(int i) {
        this.a.post(new wq2(this, i));
    }

    public final void c(int i, long j, long j2) {
        this.a.post(new uq2(this, i, j, j2));
    }

    public final void d(String str, long j, long j2) {
        this.a.post(new sq2(this, str, j, j2));
    }

    public final void e(as2 as2Var) {
        this.a.post(new vq2(this, as2Var));
    }

    public final void f(as2 as2Var) {
        this.a.post(new rq2(this, as2Var));
    }

    public final void g(zzatd zzatdVar) {
        this.a.post(new tq2(this, zzatdVar));
    }
}
