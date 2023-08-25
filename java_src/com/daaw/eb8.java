package com.daaw;

import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class eb8 implements Callable {
    public final /* synthetic */ zzq a;
    public final /* synthetic */ yb8 b;

    public eb8(yb8 yb8Var, zzq zzqVar) {
        this.b = yb8Var;
        this.a = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        cd2 V = this.b.V((String) ry0.j(this.a.p));
        vb2 vb2Var = vb2.ANALYTICS_STORAGE;
        if (V.i(vb2Var) && cd2.b(this.a.K).i(vb2Var)) {
            return this.b.S(this.a).e0();
        }
        this.b.i().v().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
