package com.daaw;

import android.app.Activity;
import android.os.Bundle;
/* loaded from: classes2.dex */
public final class ta5 extends l75 {

    /* renamed from: t */
    public final /* synthetic */ Bundle f27161t;

    /* renamed from: u */
    public final /* synthetic */ Activity f27162u;

    /* renamed from: v */
    public final /* synthetic */ dj5 f27163v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta5(dj5 dj5Var, Bundle bundle, Activity activity) {
        super(dj5Var.f7199p, true);
        this.f27163v = dj5Var;
        this.f27161t = bundle;
        this.f27162u = activity;
    }

    @Override // com.daaw.l75
    /* renamed from: a */
    public final void mo2297a() {
        Bundle bundle;
        ju3 ju3Var;
        if (this.f27161t != null) {
            bundle = new Bundle();
            if (this.f27161t.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f27161t.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ju3Var = this.f27163v.f7199p.f11397i;
        ((ju3) ry0.m10830j(ju3Var)).onActivityCreated(nt0.m14830g3(this.f27162u), bundle, this.f17104q);
    }
}
