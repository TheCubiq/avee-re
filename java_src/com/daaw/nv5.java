package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes2.dex */
public final class nv5 extends BroadcastReceiver {

    /* renamed from: d */
    public static final String f20755d = nv5.class.getName();

    /* renamed from: a */
    public final yb8 f20756a;

    /* renamed from: b */
    public boolean f20757b;

    /* renamed from: c */
    public boolean f20758c;

    public nv5(yb8 yb8Var) {
        ry0.m10830j(yb8Var);
        this.f20756a = yb8Var;
    }

    /* renamed from: b */
    public final void m14774b() {
        this.f20756a.m3903e();
        this.f20756a.mo3882r().mo6991f();
        if (this.f20757b) {
            return;
        }
        this.f20756a.mo3905d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f20758c = this.f20756a.m3913Y().m20430l();
        this.f20756a.mo3895i().m14156v().m20652b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f20758c));
        this.f20757b = true;
    }

    /* renamed from: c */
    public final void m14773c() {
        this.f20756a.m3903e();
        this.f20756a.mo3882r().mo6991f();
        this.f20756a.mo3882r().mo6991f();
        if (this.f20757b) {
            this.f20756a.mo3895i().m14156v().m20653a("Unregistering connectivity change receiver");
            this.f20757b = false;
            this.f20758c = false;
            try {
                this.f20756a.mo3905d().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f20756a.mo3895i().m14160q().m20652b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f20756a.m3903e();
        String action = intent.getAction();
        this.f20756a.mo3895i().m14156v().m20652b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f20756a.mo3895i().m14155w().m20652b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean m20430l = this.f20756a.m3913Y().m20430l();
        if (this.f20758c != m20430l) {
            this.f20758c = m20430l;
            this.f20756a.mo3882r().m6978z(new ku5(this, m20430l));
        }
    }
}
