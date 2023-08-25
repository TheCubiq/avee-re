package com.daaw;

import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class h37 implements Runnable {
    public final /* synthetic */ zzaw p;
    public final /* synthetic */ zzq q;
    public final /* synthetic */ ob7 r;

    public h37(ob7 ob7Var, zzaw zzawVar, zzq zzqVar) {
        this.r = ob7Var;
        this.p = zzawVar;
        this.q = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.r.h3(this.r.M(this.p, this.q), this.q);
    }
}
