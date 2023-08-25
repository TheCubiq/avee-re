package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class i58 implements Runnable {
    public final /* synthetic */ zzq p;
    public final /* synthetic */ ox3 q;
    public final /* synthetic */ x78 r;

    public i58(x78 x78Var, zzq zzqVar, ox3 ox3Var) {
        this.r = x78Var;
        this.p = zzqVar;
        this.q = ox3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        String str = null;
        try {
            try {
                if (this.r.a.F().p().i(vb2.ANALYTICS_STORAGE)) {
                    x78 x78Var = this.r;
                    ua5Var = x78Var.d;
                    if (ua5Var == null) {
                        x78Var.a.i().q().a("Failed to get app instance id");
                    } else {
                        ry0.j(this.p);
                        str = ua5Var.w0(this.p);
                        if (str != null) {
                            this.r.a.I().C(str);
                            this.r.a.F().g.b(str);
                        }
                        this.r.E();
                    }
                } else {
                    this.r.a.i().x().a("Analytics storage consent denied; will not get app instance id");
                    this.r.a.I().C(null);
                    this.r.a.F().g.b(null);
                }
            } catch (RemoteException e) {
                this.r.a.i().q().b("Failed to get app instance id", e);
            }
        } finally {
            this.r.a.N().J(this.q, null);
        }
    }
}
