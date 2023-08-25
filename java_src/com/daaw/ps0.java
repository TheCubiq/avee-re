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
public class ps0 extends AbstractC2554pj<os0> {

    /* renamed from: j */
    public static final String f23225j = ll0.m16883f("NetworkStateTracker");

    /* renamed from: g */
    public final ConnectivityManager f23226g;

    /* renamed from: h */
    public C2584b f23227h;

    /* renamed from: i */
    public C2583a f23228i;

    /* renamed from: com.daaw.ps0$a */
    /* loaded from: classes.dex */
    public class C2583a extends BroadcastReceiver {
        public C2583a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            ll0.m16885c().mo16882a(ps0.f23225j, "Network broadcast received", new Throwable[0]);
            ps0 ps0Var = ps0.this;
            ps0Var.m13334d(ps0Var.m13182g());
        }
    }

    /* renamed from: com.daaw.ps0$b */
    /* loaded from: classes.dex */
    public class C2584b extends ConnectivityManager.NetworkCallback {
        public C2584b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            ll0.m16885c().mo16882a(ps0.f23225j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            ps0 ps0Var = ps0.this;
            ps0Var.m13334d(ps0Var.m13182g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            ll0.m16885c().mo16882a(ps0.f23225j, "Network connection lost", new Throwable[0]);
            ps0 ps0Var = ps0.this;
            ps0Var.m13334d(ps0Var.m13182g());
        }
    }

    public ps0(Context context, wj1 wj1Var) {
        super(context, wj1Var);
        this.f23226g = (ConnectivityManager) this.f22982b.getSystemService("connectivity");
        if (m13179j()) {
            this.f23227h = new C2584b();
        } else {
            this.f23228i = new C2583a();
        }
    }

    /* renamed from: j */
    public static boolean m13179j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // com.daaw.AbstractC2554pj
    /* renamed from: e */
    public void mo12628e() {
        if (!m13179j()) {
            ll0.m16885c().mo16882a(f23225j, "Registering broadcast receiver", new Throwable[0]);
            this.f22982b.registerReceiver(this.f23228i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            ll0.m16885c().mo16882a(f23225j, "Registering network callback", new Throwable[0]);
            this.f23226g.registerDefaultNetworkCallback(this.f23227h);
        } catch (IllegalArgumentException | SecurityException e) {
            ll0.m16885c().mo16881b(f23225j, "Received exception while registering network callback", e);
        }
    }

    @Override // com.daaw.AbstractC2554pj
    /* renamed from: f */
    public void mo12627f() {
        if (!m13179j()) {
            ll0.m16885c().mo16882a(f23225j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f22982b.unregisterReceiver(this.f23228i);
            return;
        }
        try {
            ll0.m16885c().mo16882a(f23225j, "Unregistering network callback", new Throwable[0]);
            this.f23226g.unregisterNetworkCallback(this.f23227h);
        } catch (IllegalArgumentException | SecurityException e) {
            ll0.m16885c().mo16881b(f23225j, "Received exception while unregistering network callback", e);
        }
    }

    /* renamed from: g */
    public os0 m13182g() {
        NetworkInfo activeNetworkInfo = this.f23226g.getActiveNetworkInfo();
        boolean z = true;
        return new os0(activeNetworkInfo != null && activeNetworkInfo.isConnected(), m13180i(), C1424gj.m21568a(this.f23226g), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : false);
    }

    @Override // com.daaw.AbstractC2554pj
    /* renamed from: h */
    public os0 mo13183b() {
        return m13182g();
    }

    /* renamed from: i */
    public boolean m13180i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f23226g.getNetworkCapabilities(this.f23226g.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e) {
            ll0.m16885c().mo16881b(f23225j, "Unable to validate active network", e);
            return false;
        }
    }
}
