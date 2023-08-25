package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class f58 implements Runnable {
    public final /* synthetic */ AtomicReference p;
    public final /* synthetic */ zzq q;
    public final /* synthetic */ x78 r;

    public f58(x78 x78Var, AtomicReference atomicReference, zzq zzqVar) {
        this.r = x78Var;
        this.p = atomicReference;
        this.q = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        ua5 ua5Var;
        synchronized (this.p) {
            try {
            } catch (RemoteException e) {
                this.r.a.i().q().b("Failed to get app instance id", e);
                atomicReference = this.p;
            }
            if (!this.r.a.F().p().i(vb2.ANALYTICS_STORAGE)) {
                this.r.a.i().x().a("Analytics storage consent denied; will not get app instance id");
                this.r.a.I().C(null);
                this.r.a.F().g.b(null);
                this.p.set(null);
                this.p.notify();
                return;
            }
            x78 x78Var = this.r;
            ua5Var = x78Var.d;
            if (ua5Var == null) {
                x78Var.a.i().q().a("Failed to get app instance id");
                this.p.notify();
                return;
            }
            ry0.j(this.q);
            this.p.set(ua5Var.w0(this.q));
            String str = (String) this.p.get();
            if (str != null) {
                this.r.a.I().C(str);
                this.r.a.F().g.b(str);
            }
            this.r.E();
            atomicReference = this.p;
            atomicReference.notify();
        }
    }
}
