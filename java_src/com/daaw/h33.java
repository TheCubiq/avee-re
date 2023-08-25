package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbei;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class h33 {

    /* renamed from: a */
    public ScheduledFuture f11997a = null;

    /* renamed from: b */
    public final Runnable f11998b = new d33(this);

    /* renamed from: c */
    public final Object f11999c = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    public j33 f12000d;
    @GuardedBy("lock")

    /* renamed from: e */
    public Context f12001e;
    @GuardedBy("lock")

    /* renamed from: f */
    public l33 f12002f;

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ void m21048h(h33 h33Var) {
        synchronized (h33Var.f11999c) {
            j33 j33Var = h33Var.f12000d;
            if (j33Var == null) {
                return;
            }
            if (j33Var.isConnected() || h33Var.f12000d.isConnecting()) {
                h33Var.f12000d.disconnect();
            }
            h33Var.f12000d = null;
            h33Var.f12002f = null;
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: a */
    public final long m21055a(zzbei zzbeiVar) {
        synchronized (this.f11999c) {
            if (this.f12002f == null) {
                return -2L;
            }
            if (this.f12000d.m19157J()) {
                try {
                    return this.f12002f.m17179h3(zzbeiVar);
                } catch (RemoteException e) {
                    k04.zzh("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    /* renamed from: b */
    public final zzbef m21054b(zzbei zzbeiVar) {
        synchronized (this.f11999c) {
            if (this.f12002f == null) {
                return new zzbef();
            }
            try {
                if (this.f12000d.m19157J()) {
                    return this.f12002f.m17177j3(zzbeiVar);
                }
                return this.f12002f.m17178i3(zzbeiVar);
            } catch (RemoteException e) {
                k04.zzh("Unable to call into cache service.", e);
                return new zzbef();
            }
        }
    }

    /* renamed from: d */
    public final synchronized j33 m21052d(AbstractC2527pa.InterfaceC2528a interfaceC2528a, AbstractC2527pa.InterfaceC2529b interfaceC2529b) {
        return new j33(this.f12001e, zzt.zzt().zzb(), interfaceC2528a, interfaceC2529b);
    }

    /* renamed from: i */
    public final void m21047i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f11999c) {
            if (this.f12001e != null) {
                return;
            }
            this.f12001e = context.getApplicationContext();
            if (((Boolean) zzba.zzc().m23658b(g93.f10445I3)).booleanValue()) {
                m21044l();
            } else {
                if (((Boolean) zzba.zzc().m23658b(g93.f10435H3)).booleanValue()) {
                    zzt.zzb().m15598c(new e33(this));
                }
            }
        }
    }

    /* renamed from: j */
    public final void m21046j() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10455J3)).booleanValue()) {
            synchronized (this.f11999c) {
                m21044l();
                ScheduledFuture scheduledFuture = this.f11997a;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f11997a = z04.f34308d.schedule(this.f11998b, ((Long) zzba.zzc().m23658b(g93.f10465K3)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: l */
    public final void m21044l() {
        synchronized (this.f11999c) {
            if (this.f12001e != null && this.f12000d == null) {
                j33 m21052d = m21052d(new f33(this), new g33(this));
                this.f12000d = m21052d;
                m21052d.checkAvailabilityAndConnect();
            }
        }
    }
}
