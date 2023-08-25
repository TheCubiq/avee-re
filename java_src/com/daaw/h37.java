package com.daaw;

import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class h37 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzaw f12006p;

    /* renamed from: q */
    public final /* synthetic */ zzq f12007q;

    /* renamed from: r */
    public final /* synthetic */ ob7 f12008r;

    public h37(ob7 ob7Var, zzaw zzawVar, zzq zzqVar) {
        this.f12008r = ob7Var;
        this.f12006p = zzawVar;
        this.f12007q = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12008r.m14408h3(this.f12008r.m14410M(this.f12006p, this.f12007q), this.f12007q);
    }
}
