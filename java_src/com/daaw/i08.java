package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
/* loaded from: classes2.dex */
public final class i08 implements Runnable {
    public final /* synthetic */ Bundle p;
    public final /* synthetic */ p28 q;

    public i08(p28 p28Var, Bundle bundle) {
        this.q = p28Var;
        this.p = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p28 p28Var = this.q;
        Bundle bundle = this.p;
        p28Var.f();
        p28Var.g();
        ry0.j(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        ry0.f(string);
        ry0.f(string2);
        ry0.j(bundle.get("value"));
        if (!p28Var.a.n()) {
            p28Var.a.i().v().a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkw zzkwVar = new zzkw(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzaw w0 = p28Var.a.N().w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            p28Var.a.L().s(new zzac(bundle.getString("app_id"), string2, zzkwVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), p28Var.a.N().w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), w0, bundle.getLong("time_to_live"), p28Var.a.N().w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
