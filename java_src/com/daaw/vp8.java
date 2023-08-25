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

    /* renamed from: f */
    public final HashMap f30428f = new HashMap();

    /* renamed from: g */
    public final Context f30429g;

    /* renamed from: h */
    public volatile Handler f30430h;

    /* renamed from: i */
    public final ko8 f30431i;

    /* renamed from: j */
    public final C1291fj f30432j;

    /* renamed from: k */
    public final long f30433k;

    /* renamed from: l */
    public final long f30434l;

    public vp8(Context context, Looper looper) {
        ko8 ko8Var = new ko8(this, null);
        this.f30431i = ko8Var;
        this.f30429g = context.getApplicationContext();
        this.f30430h = new a38(looper, ko8Var);
        this.f30432j = C1291fj.m22614b();
        this.f30433k = 5000L;
        this.f30434l = 300000L;
    }

    @Override // com.daaw.u70
    /* renamed from: d */
    public final void mo6941d(rh8 rh8Var, ServiceConnection serviceConnection, String str) {
        ry0.m10829k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f30428f) {
            zj8 zj8Var = (zj8) this.f30428f.get(rh8Var);
            if (zj8Var == null) {
                String obj = rh8Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (!zj8Var.m2185h(serviceConnection)) {
                String obj2 = rh8Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            } else {
                zj8Var.m2187f(serviceConnection, str);
                if (zj8Var.m2184i()) {
                    this.f30430h.sendMessageDelayed(this.f30430h.obtainMessage(0, rh8Var), this.f30433k);
                }
            }
        }
    }

    @Override // com.daaw.u70
    /* renamed from: f */
    public final boolean mo6940f(rh8 rh8Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean m2183j;
        ry0.m10829k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f30428f) {
            zj8 zj8Var = (zj8) this.f30428f.get(rh8Var);
            if (zj8Var == null) {
                zj8Var = new zj8(this, rh8Var);
                zj8Var.m2189d(serviceConnection, serviceConnection, str);
                zj8Var.m2188e(str, executor);
                this.f30428f.put(rh8Var, zj8Var);
            } else {
                this.f30430h.removeMessages(0, rh8Var);
                if (zj8Var.m2185h(serviceConnection)) {
                    String obj = rh8Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
                zj8Var.m2189d(serviceConnection, serviceConnection, str);
                int m2192a = zj8Var.m2192a();
                if (m2192a == 1) {
                    serviceConnection.onServiceConnected(zj8Var.m2191b(), zj8Var.m2190c());
                } else if (m2192a == 2) {
                    zj8Var.m2188e(str, executor);
                }
            }
            m2183j = zj8Var.m2183j();
        }
        return m2183j;
    }
}
