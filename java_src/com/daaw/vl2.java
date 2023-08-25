package com.daaw;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* loaded from: classes.dex */
public final class vl2 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ wl2 f30298a;

    public vl2(wl2 wl2Var) {
        this.f30298a = wl2Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (wl2.class) {
            this.f30298a.f31317a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (wl2.class) {
            this.f30298a.f31317a = null;
        }
    }
}
