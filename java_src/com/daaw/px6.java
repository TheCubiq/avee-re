package com.daaw;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* loaded from: classes.dex */
public final class px6 implements ServiceConnection {
    public final /* synthetic */ qx6 a;

    public /* synthetic */ px6(qx6 qx6Var, ox6 ox6Var) {
        this.a = qx6Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qx6.f(this.a).d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.c().post(new mx6(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        qx6.f(this.a).d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.c().post(new nx6(this));
    }
}
