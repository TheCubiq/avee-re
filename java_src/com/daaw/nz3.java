package com.daaw;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class nz3 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ qz3 a;

    public nz3(qz3 qz3Var) {
        this.a = qz3Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.a.n;
        atomicBoolean.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.a.n;
        atomicBoolean.set(false);
    }
}
