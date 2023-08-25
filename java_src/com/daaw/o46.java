package com.daaw;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
/* loaded from: classes2.dex */
public final class o46 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ wh3 f21040p;

    /* renamed from: q */
    public final /* synthetic */ ServiceConnection f21041q;

    /* renamed from: r */
    public final /* synthetic */ r56 f21042r;

    public o46(r56 r56Var, wh3 wh3Var, ServiceConnection serviceConnection) {
        this.f21042r = r56Var;
        this.f21040p = wh3Var;
        this.f21041q = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        hk5 m14160q;
        String str2;
        r56 r56Var = this.f21042r;
        u66 u66Var = r56Var.f24867b;
        str = r56Var.f24866a;
        wh3 wh3Var = this.f21040p;
        ServiceConnection serviceConnection = this.f21041q;
        u66Var.f28593a.mo3882r().mo6991f();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle mo6065x = wh3Var.mo6065x(bundle);
            if (mo6065x == null) {
                u66Var.f28593a.mo3895i().m14160q().m20653a("Install Referrer Service returned a null response");
            } else {
                bundle2 = mo6065x;
            }
        } catch (Exception e) {
            u66Var.f28593a.mo3895i().m14160q().m20652b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        u66Var.f28593a.mo3882r().mo6991f();
        dr6.m24026t();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                m14160q = u66Var.f28593a.mo3895i().m14155w();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    m14160q = u66Var.f28593a.mo3895i().m14160q();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    u66Var.f28593a.mo3895i().m14156v().m20652b("InstallReferrer API result", string);
                    Bundle m24463t0 = u66Var.f28593a.m24045N().m24463t0(Uri.parse("?".concat(string)));
                    if (m24463t0 == null) {
                        m14160q = u66Var.f28593a.mo3895i().m14160q();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = m24463t0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                m14160q = u66Var.f28593a.mo3895i().m14160q();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                m24463t0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == u66Var.f28593a.m24053F().f17004f.m4400a()) {
                            u66Var.f28593a.mo3895i().m14156v().m20653a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (u66Var.f28593a.m24031n()) {
                            u66Var.f28593a.m24053F().f17004f.m4399b(j);
                            u66Var.f28593a.mo3895i().m14156v().m20652b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            m24463t0.putString("_cis", "referrer API v2");
                            u66Var.f28593a.m24050I().m13684t("auto", "_cmp", m24463t0, str);
                        }
                    }
                }
            }
            m14160q.m20653a(str2);
        }
        C1291fj.m22614b().m22613c(u66Var.f28593a.mo3905d(), serviceConnection);
    }
}
