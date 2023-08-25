package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class z38 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ Bundle f34429p;

    /* renamed from: q */
    public final /* synthetic */ t38 f34430q;

    /* renamed from: r */
    public final /* synthetic */ t38 f34431r;

    /* renamed from: s */
    public final /* synthetic */ long f34432s;

    /* renamed from: t */
    public final /* synthetic */ r48 f34433t;

    public z38(r48 r48Var, Bundle bundle, t38 t38Var, t38 t38Var2, long j) {
        this.f34433t = r48Var;
        this.f34429p = bundle;
        this.f34430q = t38Var;
        this.f34431r = t38Var2;
        this.f34432s = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r48.m11738w(this.f34433t, this.f34429p, this.f34430q, this.f34431r, this.f34432s);
    }
}
