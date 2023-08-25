package com.daaw;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* loaded from: classes2.dex */
public final class ht5 extends pa8 {
    public ht5(yb8 yb8Var) {
        super(yb8Var);
    }

    @Override // com.daaw.pa8
    public final boolean k() {
        return false;
    }

    public final boolean l() {
        g();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.d().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
