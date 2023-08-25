package com.daaw;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class vp8 extends u70 {
    @GuardedBy("connectionStatus")
    public final HashMap f = new HashMap();
    public final Context g;
    public volatile Handler h;
    public final ko8 i;
    public final fj j;
    public final long k;
    public final long l;

    public vp8(Context context, Looper looper) {
        ko8 ko8Var = new ko8(this, null);
        this.i = ko8Var;
        this.g = context.getApplicationContext();
        this.h = new a38(looper, ko8Var);
        this.j = fj.b();
        this.k = 5000L;
        this.l = 300000L;
    }

    @Override // com.daaw.u70
    public final void d(rh8 rh8Var, ServiceConnection serviceConnection, String str) {
        ry0.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            zj8 zj8Var = (zj8) this.f.get(rh8Var);
            if (zj8Var == null) {
                String obj = rh8Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (!zj8Var.h(serviceConnection)) {
                String obj2 = rh8Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            } else {
                zj8Var.f(serviceConnection, str);
                if (zj8Var.i()) {
                    this.h.sendMessageDelayed(this.h.obtainMessage(0, rh8Var), this.k);
                }
            }
        }
    }

    @Override // com.daaw.u70
    public final boolean f(rh8 rh8Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j;
        ry0.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            zj8 zj8Var = (zj8) this.f.get(rh8Var);
            if (zj8Var == null) {
                zj8Var = new zj8(this, rh8Var);
                zj8Var.d(serviceConnection, serviceConnection, str);
                zj8Var.e(str, executor);
                this.f.put(rh8Var, zj8Var);
            } else {
                this.h.removeMessages(0, rh8Var);
                if (zj8Var.h(serviceConnection)) {
                    String obj = rh8Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
                zj8Var.d(serviceConnection, serviceConnection, str);
                int a = zj8Var.a();
                if (a == 1) {
                    serviceConnection.onServiceConnected(zj8Var.b(), zj8Var.c());
                } else if (a == 2) {
                    zj8Var.e(str, executor);
                }
            }
            j = zj8Var.j();
        }
        return j;
    }
}
