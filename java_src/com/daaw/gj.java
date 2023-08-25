package com.daaw;

import android.net.ConnectivityManager;
/* loaded from: classes.dex */
public final class gj {

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        return a.a(connectivityManager);
    }
}
