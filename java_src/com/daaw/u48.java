package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;
/* loaded from: classes2.dex */
public final class u48 implements Runnable {
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ zzq r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ ox3 t;
    public final /* synthetic */ x78 u;

    public u48(x78 x78Var, String str, String str2, zzq zzqVar, boolean z, ox3 ox3Var) {
        this.u = x78Var;
        this.p = str;
        this.q = str2;
        this.r = zzqVar;
        this.s = z;
        this.t = ox3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e;
        ua5 ua5Var;
        Bundle bundle2 = new Bundle();
        try {
            x78 x78Var = this.u;
            ua5Var = x78Var.d;
            if (ua5Var == null) {
                x78Var.a.i().q().c("Failed to get user properties; not connected to service", this.p, this.q);
                this.u.a.N().F(this.t, bundle2);
                return;
            }
            ry0.j(this.r);
            List<zzkw> a2 = ua5Var.a2(this.p, this.q, this.s, this.r);
            bundle = new Bundle();
            if (a2 != null) {
                for (zzkw zzkwVar : a2) {
                    String str = zzkwVar.t;
                    if (str != null) {
                        bundle.putString(zzkwVar.q, str);
                    } else {
                        Long l = zzkwVar.s;
                        if (l != null) {
                            bundle.putLong(zzkwVar.q, l.longValue());
                        } else {
                            Double d = zzkwVar.v;
                            if (d != null) {
                                bundle.putDouble(zzkwVar.q, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.u.E();
                    this.u.a.N().F(this.t, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    this.u.a.i().q().c("Failed to get user properties; remote exception", this.p, e);
                    this.u.a.N().F(this.t, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.u.a.N().F(this.t, bundle2);
                throw th;
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            this.u.a.N().F(this.t, bundle2);
            throw th;
        }
    }
}
