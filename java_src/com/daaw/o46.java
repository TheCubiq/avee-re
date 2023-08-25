package com.daaw;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
/* loaded from: classes2.dex */
public final class o46 implements Runnable {
    public final /* synthetic */ wh3 p;
    public final /* synthetic */ ServiceConnection q;
    public final /* synthetic */ r56 r;

    public o46(r56 r56Var, wh3 wh3Var, ServiceConnection serviceConnection) {
        this.r = r56Var;
        this.p = wh3Var;
        this.q = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        hk5 q;
        String str2;
        r56 r56Var = this.r;
        u66 u66Var = r56Var.b;
        str = r56Var.a;
        wh3 wh3Var = this.p;
        ServiceConnection serviceConnection = this.q;
        u66Var.a.r().f();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle x = wh3Var.x(bundle);
            if (x == null) {
                u66Var.a.i().q().a("Install Referrer Service returned a null response");
            } else {
                bundle2 = x;
            }
        } catch (Exception e) {
            u66Var.a.i().q().b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        u66Var.a.r().f();
        dr6.t();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                q = u66Var.a.i().w();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    q = u66Var.a.i().q();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    u66Var.a.i().v().b("InstallReferrer API result", string);
                    Bundle t0 = u66Var.a.N().t0(Uri.parse("?".concat(string)));
                    if (t0 == null) {
                        q = u66Var.a.i().q();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = t0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                q = u66Var.a.i().q();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                t0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == u66Var.a.F().f.a()) {
                            u66Var.a.i().v().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (u66Var.a.n()) {
                            u66Var.a.F().f.b(j);
                            u66Var.a.i().v().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            t0.putString("_cis", "referrer API v2");
                            u66Var.a.I().t("auto", "_cmp", t0, str);
                        }
                    }
                }
            }
            q.a(str2);
        }
        fj.b().c(u66Var.a.d(), serviceConnection);
    }
}
