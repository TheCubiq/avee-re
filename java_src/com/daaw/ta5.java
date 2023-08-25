package com.daaw;

import android.app.Activity;
import android.os.Bundle;
/* loaded from: classes2.dex */
public final class ta5 extends l75 {
    public final /* synthetic */ Bundle t;
    public final /* synthetic */ Activity u;
    public final /* synthetic */ dj5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta5(dj5 dj5Var, Bundle bundle, Activity activity) {
        super(dj5Var.p, true);
        this.v = dj5Var;
        this.t = bundle;
        this.u = activity;
    }

    @Override // com.daaw.l75
    public final void a() {
        Bundle bundle;
        ju3 ju3Var;
        if (this.t != null) {
            bundle = new Bundle();
            if (this.t.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.t.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ju3Var = this.v.p.i;
        ((ju3) ry0.j(ju3Var)).onActivityCreated(nt0.g3(this.u), bundle, this.q);
    }
}
