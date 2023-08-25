package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzkw;
/* loaded from: classes2.dex */
public final class q08 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ Bundle f23595p;

    /* renamed from: q */
    public final /* synthetic */ p28 f23596q;

    public q08(p28 p28Var, Bundle bundle) {
        this.f23596q = p28Var;
        this.f23595p = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p28 p28Var = this.f23596q;
        Bundle bundle = this.f23595p;
        p28Var.mo6991f();
        p28Var.m25515g();
        ry0.m10830j(bundle);
        String m10834f = ry0.m10834f(bundle.getString("name"));
        if (!p28Var.f25143a.m24031n()) {
            p28Var.f25143a.mo3895i().m14156v().m20653a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            p28Var.f25143a.m24047L().m5456s(new zzac(bundle.getString("app_id"), "", new zzkw(m10834f, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), p28Var.f25143a.m24045N().m24457w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
