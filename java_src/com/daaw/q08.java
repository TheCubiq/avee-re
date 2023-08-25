package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzkw;
/* loaded from: classes2.dex */
public final class q08 implements Runnable {
    public final /* synthetic */ Bundle p;
    public final /* synthetic */ p28 q;

    public q08(p28 p28Var, Bundle bundle) {
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
        String f = ry0.f(bundle.getString("name"));
        if (!p28Var.a.n()) {
            p28Var.a.i().v().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            p28Var.a.L().s(new zzac(bundle.getString("app_id"), "", new zzkw(f, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), p28Var.a.N().w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
