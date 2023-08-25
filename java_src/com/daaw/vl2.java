package com.daaw;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* loaded from: classes.dex */
public final class vl2 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ wl2 a;

    public vl2(wl2 wl2Var) {
        this.a = wl2Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (wl2.class) {
            this.a.a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (wl2.class) {
            this.a.a = null;
        }
    }
}
