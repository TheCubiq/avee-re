package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class f58 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ AtomicReference f9141p;

    /* renamed from: q */
    public final /* synthetic */ zzq f9142q;

    /* renamed from: r */
    public final /* synthetic */ x78 f9143r;

    public f58(x78 x78Var, AtomicReference atomicReference, zzq zzqVar) {
        this.f9143r = x78Var;
        this.f9141p = atomicReference;
        this.f9142q = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        ua5 ua5Var;
        synchronized (this.f9141p) {
            try {
            } catch (RemoteException e) {
                this.f9143r.f25143a.mo3895i().m14160q().m20652b("Failed to get app instance id", e);
                atomicReference = this.f9141p;
            }
            if (!this.f9143r.f25143a.m24053F().m17174p().m25423i(vb2.ANALYTICS_STORAGE)) {
                this.f9143r.f25143a.mo3895i().m14154x().m20653a("Analytics storage consent denied; will not get app instance id");
                this.f9143r.f25143a.m24050I().m13719C(null);
                this.f9143r.f25143a.m24053F().f17005g.m20166b(null);
                this.f9141p.set(null);
                this.f9141p.notify();
                return;
            }
            x78 x78Var = this.f9143r;
            ua5Var = x78Var.f32173d;
            if (ua5Var == null) {
                x78Var.f25143a.mo3895i().m14160q().m20653a("Failed to get app instance id");
                this.f9141p.notify();
                return;
            }
            ry0.m10830j(this.f9142q);
            this.f9141p.set(ua5Var.mo8363w0(this.f9142q));
            String str = (String) this.f9141p.get();
            if (str != null) {
                this.f9143r.f25143a.m24050I().m13719C(str);
                this.f9143r.f25143a.m24053F().f17005g.m20166b(str);
            }
            this.f9143r.m5479E();
            atomicReference = this.f9141p;
            atomicReference.notify();
        }
    }
}
