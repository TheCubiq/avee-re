package com.daaw;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* loaded from: classes2.dex */
public final class ht5 extends pa8 {
    public ht5(yb8 yb8Var) {
        super(yb8Var);
    }

    @Override // com.daaw.pa8
    /* renamed from: k */
    public final boolean mo8149k() {
        return false;
    }

    /* renamed from: l */
    public final boolean m20430l() {
        m13533g();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f25143a.mo3905d().getSystemService("connectivity");
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
