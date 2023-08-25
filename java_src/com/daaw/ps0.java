package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
/* loaded from: classes.dex */
public class ps0 extends pj<os0> {
    public static final String j = ll0.f("NetworkStateTracker");
    public final ConnectivityManager g;
    public b h;
    public a i;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            ll0.c().a(ps0.j, "Network broadcast received", new Throwable[0]);
            ps0 ps0Var = ps0.this;
            ps0Var.d(ps0Var.g());
        }
    }

    /* loaded from: classes.dex */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            ll0.c().a(ps0.j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            ps0 ps0Var = ps0.this;
            ps0Var.d(ps0Var.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            ll0.c().a(ps0.j, "Network connection lost", new Throwable[0]);
            ps0 ps0Var = ps0.this;
            ps0Var.d(ps0Var.g());
        }
    }

    public ps0(Context context, wj1 wj1Var) {
        super(context, wj1Var);
        this.g = (ConnectivityManager) this.b.getSystemService("connectivity");
        if (j()) {
            this.h = new b();
        } else {
            this.i = new a();
        }
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // com.daaw.pj
    public void e() {
        if (!j()) {
            ll0.c().a(j, "Registering broadcast receiver", new Throwable[0]);
            this.b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            ll0.c().a(j, "Registering network callback", new Throwable[0]);
            this.g.registerDefaultNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            ll0.c().b(j, "Received exception while registering network callback", e);
        }
    }

    @Override // com.daaw.pj
    public void f() {
        if (!j()) {
            ll0.c().a(j, "Unregistering broadcast receiver", new Throwable[0]);
            this.b.unregisterReceiver(this.i);
            return;
        }
        try {
            ll0.c().a(j, "Unregistering network callback", new Throwable[0]);
            this.g.unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            ll0.c().b(j, "Received exception while unregistering network callback", e);
        }
    }

    public os0 g() {
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        boolean z = true;
        return new os0(activeNetworkInfo != null && activeNetworkInfo.isConnected(), i(), gj.a(this.g), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : false);
    }

    @Override // com.daaw.pj
    /* renamed from: h */
    public os0 b() {
        return g();
    }

    public boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.g.getNetworkCapabilities(this.g.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e) {
            ll0.c().b(j, "Unable to validate active network", e);
            return false;
        }
    }
}
