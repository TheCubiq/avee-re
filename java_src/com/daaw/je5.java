package com.daaw;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class je5 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ pa b;

    public je5(pa paVar, int i) {
        this.b = paVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        pa paVar = this.b;
        if (iBinder == null) {
            pa.D(paVar, 16);
            return;
        }
        obj = paVar.n;
        synchronized (obj) {
            pa paVar2 = this.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            paVar2.o = (queryLocalInterface == null || !(queryLocalInterface instanceof ud0)) ? new e62(iBinder) : (ud0) queryLocalInterface;
        }
        this.b.E(0, null, this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.b.n;
        synchronized (obj) {
            this.b.o = null;
        }
        Handler handler = this.b.l;
        handler.sendMessage(handler.obtainMessage(6, this.a, 1));
    }
}
