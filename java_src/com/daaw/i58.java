package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
/* loaded from: classes2.dex */
public final class i58 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzq f13285p;

    /* renamed from: q */
    public final /* synthetic */ ox3 f13286q;

    /* renamed from: r */
    public final /* synthetic */ x78 f13287r;

    public i58(x78 x78Var, zzq zzqVar, ox3 ox3Var) {
        this.f13287r = x78Var;
        this.f13285p = zzqVar;
        this.f13286q = ox3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        String str = null;
        try {
            try {
                if (this.f13287r.f25143a.m24053F().m17174p().m25423i(vb2.ANALYTICS_STORAGE)) {
                    x78 x78Var = this.f13287r;
                    ua5Var = x78Var.f32173d;
                    if (ua5Var == null) {
                        x78Var.f25143a.mo3895i().m14160q().m20653a("Failed to get app instance id");
                    } else {
                        ry0.m10830j(this.f13285p);
                        str = ua5Var.mo8363w0(this.f13285p);
                        if (str != null) {
                            this.f13287r.f25143a.m24050I().m13719C(str);
                            this.f13287r.f25143a.m24053F().f17005g.m20166b(str);
                        }
                        this.f13287r.m5479E();
                    }
                } else {
                    this.f13287r.f25143a.mo3895i().m14154x().m20653a("Analytics storage consent denied; will not get app instance id");
                    this.f13287r.f25143a.m24050I().m13719C(null);
                    this.f13287r.f25143a.m24053F().f17005g.m20166b(null);
                }
            } catch (RemoteException e) {
                this.f13287r.f25143a.mo3895i().m14160q().m20652b("Failed to get app instance id", e);
            }
        } finally {
            this.f13287r.f25143a.m24045N().m24505J(this.f13286q, null);
        }
    }
}
