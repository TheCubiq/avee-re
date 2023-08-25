package com.daaw;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class je5 implements ServiceConnection {

    /* renamed from: a */
    public final int f15066a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC2527pa f15067b;

    public je5(AbstractC2527pa abstractC2527pa, int i) {
        this.f15067b = abstractC2527pa;
        this.f15066a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        AbstractC2527pa abstractC2527pa = this.f15067b;
        if (iBinder == null) {
            AbstractC2527pa.m13563D(abstractC2527pa, 16);
            return;
        }
        obj = abstractC2527pa.f22749n;
        synchronized (obj) {
            AbstractC2527pa abstractC2527pa2 = this.f15067b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            abstractC2527pa2.f22750o = (queryLocalInterface == null || !(queryLocalInterface instanceof ud0)) ? new e62(iBinder) : (ud0) queryLocalInterface;
        }
        this.f15067b.m13562E(0, null, this.f15066a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f15067b.f22749n;
        synchronized (obj) {
            this.f15067b.f22750o = null;
        }
        Handler handler = this.f15067b.f22747l;
        handler.sendMessage(handler.obtainMessage(6, this.f15066a, 1));
    }
}
