package com.daaw;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* loaded from: classes.dex */
public final class uz1 extends p22 {
    public final j6<o3<?>> u;
    public final z70 v;

    public uz1(pj0 pj0Var, z70 z70Var, w70 w70Var) {
        super(pj0Var, w70Var);
        this.u = new j6<>();
        this.v = z70Var;
        this.p.b("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, z70 z70Var, o3<?> o3Var) {
        pj0 c = LifecycleCallback.c(activity);
        uz1 uz1Var = (uz1) c.e("ConnectionlessLifecycleHelper", uz1.class);
        if (uz1Var == null) {
            uz1Var = new uz1(c, z70Var, w70.m());
        }
        ry0.k(o3Var, "ApiKey cannot be null");
        uz1Var.u.add(o3Var);
        z70Var.c(uz1Var);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.daaw.p22, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.daaw.p22, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.v.d(this);
    }

    @Override // com.daaw.p22
    public final void m(ConnectionResult connectionResult, int i) {
        this.v.F(connectionResult, i);
    }

    @Override // com.daaw.p22
    public final void n() {
        this.v.a();
    }

    public final j6<o3<?>> t() {
        return this.u;
    }

    public final void v() {
        if (this.u.isEmpty()) {
            return;
        }
        this.v.c(this);
    }
}
