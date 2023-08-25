package com.daaw;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* loaded from: classes.dex */
public final class px6 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ qx6 f23516a;

    public /* synthetic */ px6(qx6 qx6Var, ox6 ox6Var) {
        this.f23516a = qx6Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qx6.m11965f(this.f23516a).m24909d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f23516a.m11968c().post(new mx6(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        qx6.m11965f(this.f23516a).m24909d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f23516a.m11968c().post(new nx6(this));
    }
}
