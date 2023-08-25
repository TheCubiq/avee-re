package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.daaw.pa;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbei;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class h33 {
    public ScheduledFuture a = null;
    public final Runnable b = new d33(this);
    public final Object c = new Object();
    @GuardedBy("lock")
    public j33 d;
    @GuardedBy("lock")
    public Context e;
    @GuardedBy("lock")
    public l33 f;

    public static /* bridge */ /* synthetic */ void h(h33 h33Var) {
        synchronized (h33Var.c) {
            j33 j33Var = h33Var.d;
            if (j33Var == null) {
                return;
            }
            if (j33Var.isConnected() || h33Var.d.isConnecting()) {
                h33Var.d.disconnect();
            }
            h33Var.d = null;
            h33Var.f = null;
            Binder.flushPendingCommands();
        }
    }

    public final long a(zzbei zzbeiVar) {
        synchronized (this.c) {
            if (this.f == null) {
                return -2L;
            }
            if (this.d.J()) {
                try {
                    return this.f.h3(zzbeiVar);
                } catch (RemoteException e) {
                    k04.zzh("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    public final zzbef b(zzbei zzbeiVar) {
        synchronized (this.c) {
            if (this.f == null) {
                return new zzbef();
            }
            try {
                if (this.d.J()) {
                    return this.f.j3(zzbeiVar);
                }
                return this.f.i3(zzbeiVar);
            } catch (RemoteException e) {
                k04.zzh("Unable to call into cache service.", e);
                return new zzbef();
            }
        }
    }

    public final synchronized j33 d(pa.a aVar, pa.b bVar) {
        return new j33(this.e, zzt.zzt().zzb(), aVar, bVar);
    }

    public final void i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.c) {
            if (this.e != null) {
                return;
            }
            this.e = context.getApplicationContext();
            if (((Boolean) zzba.zzc().b(g93.I3)).booleanValue()) {
                l();
            } else {
                if (((Boolean) zzba.zzc().b(g93.H3)).booleanValue()) {
                    zzt.zzb().c(new e33(this));
                }
            }
        }
    }

    public final void j() {
        if (((Boolean) zzba.zzc().b(g93.J3)).booleanValue()) {
            synchronized (this.c) {
                l();
                ScheduledFuture scheduledFuture = this.a;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.a = z04.d.schedule(this.b, ((Long) zzba.zzc().b(g93.K3)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void l() {
        synchronized (this.c) {
            if (this.e != null && this.d == null) {
                j33 d = d(new f33(this), new g33(this));
                this.d = d;
                d.checkAvailabilityAndConnect();
            }
        }
    }
}
