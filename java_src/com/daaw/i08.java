package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
/* loaded from: classes2.dex */
public final class i08 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ Bundle f13145p;

    /* renamed from: q */
    public final /* synthetic */ p28 f13146q;

    public i08(p28 p28Var, Bundle bundle) {
        this.f13146q = p28Var;
        this.f13145p = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p28 p28Var = this.f13146q;
        Bundle bundle = this.f13145p;
        p28Var.mo6991f();
        p28Var.m25515g();
        ry0.m10830j(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        ry0.m10834f(string);
        ry0.m10834f(string2);
        ry0.m10830j(bundle.get("value"));
        if (!p28Var.f25143a.m24031n()) {
            p28Var.f25143a.mo3895i().m14156v().m20653a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkw zzkwVar = new zzkw(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzaw m24457w0 = p28Var.f25143a.m24045N().m24457w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            p28Var.f25143a.m24047L().m5456s(new zzac(bundle.getString("app_id"), string2, zzkwVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), p28Var.f25143a.m24045N().m24457w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), m24457w0, bundle.getLong("time_to_live"), p28Var.f25143a.m24045N().m24457w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
