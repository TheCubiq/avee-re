package com.daaw;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
/* loaded from: classes.dex */
public final class wl2 {
    public NetworkCapabilities a;

    public wl2(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new vl2(this));
        } catch (RuntimeException unused) {
            synchronized (wl2.class) {
                this.a = null;
            }
        }
    }

    public static wl2 c(Context context) {
        if (context != null) {
            return new wl2((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long a() {
        synchronized (wl2.class) {
            NetworkCapabilities networkCapabilities = this.a;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.a.hasTransport(1)) {
                    return 1L;
                }
                if (this.a.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities b() {
        return this.a;
    }
}
