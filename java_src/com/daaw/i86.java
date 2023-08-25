package com.daaw;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes2.dex */
public final class i86 {
    public final g86 a;

    public i86(g86 g86Var) {
        ry0.j(g86Var);
        this.a = g86Var;
    }

    public final void a(Context context, Intent intent) {
        dr6 H = dr6.H(context, null, null);
        om5 i = H.i();
        if (intent == null) {
            i.w().a("Receiver called with null intent");
            return;
        }
        H.a();
        String action = intent.getAction();
        i.v().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                i.w().a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        i.v().a("Starting wakeful intent.");
        this.a.a(context, className);
    }
}
