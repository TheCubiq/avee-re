package com.daaw;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
/* loaded from: classes.dex */
public final class wl2 {

    /* renamed from: a */
    public NetworkCapabilities f31317a;

    public wl2(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new vl2(this));
        } catch (RuntimeException unused) {
            synchronized (wl2.class) {
                this.f31317a = null;
            }
        }
    }

    /* renamed from: c */
    public static wl2 m6014c(Context context) {
        if (context != null) {
            return new wl2((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    /* renamed from: a */
    public final long m6016a() {
        synchronized (wl2.class) {
            NetworkCapabilities networkCapabilities = this.f31317a;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.f31317a.hasTransport(1)) {
                    return 1L;
                }
                if (this.f31317a.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    /* renamed from: b */
    public final NetworkCapabilities m6015b() {
        return this.f31317a;
    }
}
