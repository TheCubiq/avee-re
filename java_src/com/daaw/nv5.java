package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes2.dex */
public final class nv5 extends BroadcastReceiver {
    public static final String d = nv5.class.getName();
    public final yb8 a;
    public boolean b;
    public boolean c;

    public nv5(yb8 yb8Var) {
        ry0.j(yb8Var);
        this.a = yb8Var;
    }

    public final void b() {
        this.a.e();
        this.a.r().f();
        if (this.b) {
            return;
        }
        this.a.d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.c = this.a.Y().l();
        this.a.i().v().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.c));
        this.b = true;
    }

    public final void c() {
        this.a.e();
        this.a.r().f();
        this.a.r().f();
        if (this.b) {
            this.a.i().v().a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                this.a.d().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.i().q().b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.e();
        String action = intent.getAction();
        this.a.i().v().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.a.i().w().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean l = this.a.Y().l();
        if (this.c != l) {
            this.c = l;
            this.a.r().z(new ku5(this, l));
        }
    }
}
