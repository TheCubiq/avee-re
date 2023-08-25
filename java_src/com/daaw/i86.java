package com.daaw;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes2.dex */
public final class i86 {

    /* renamed from: a */
    public final g86 f13355a;

    public i86(g86 g86Var) {
        ry0.m10830j(g86Var);
        this.f13355a = g86Var;
    }

    /* renamed from: a */
    public final void m20028a(Context context, Intent intent) {
        dr6 m24051H = dr6.m24051H(context, null, null);
        om5 mo3895i = m24051H.mo3895i();
        if (intent == null) {
            mo3895i.m14155w().m20653a("Receiver called with null intent");
            return;
        }
        m24051H.mo3911a();
        String action = intent.getAction();
        mo3895i.m14156v().m20652b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                mo3895i.m14155w().m20653a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        mo3895i.m14156v().m20653a("Starting wakeful intent.");
        this.f13355a.mo1085a(context, className);
    }
}
