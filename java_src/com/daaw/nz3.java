package com.daaw;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class nz3 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ qz3 f20863a;

    public nz3(qz3 qz3Var) {
        this.f20863a = qz3Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.f20863a.f24672n;
        atomicBoolean.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.f20863a.f24672n;
        atomicBoolean.set(false);
    }
}
