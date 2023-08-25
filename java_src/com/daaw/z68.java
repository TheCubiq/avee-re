package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class z68 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f34501p;

    /* renamed from: q */
    public final /* synthetic */ String f34502q;

    /* renamed from: r */
    public final /* synthetic */ zzq f34503r;

    /* renamed from: s */
    public final /* synthetic */ ox3 f34504s;

    /* renamed from: t */
    public final /* synthetic */ x78 f34505t;

    public z68(x78 x78Var, String str, String str2, zzq zzqVar, ox3 ox3Var) {
        this.f34505t = x78Var;
        this.f34501p = str;
        this.f34502q = str2;
        this.f34503r = zzqVar;
        this.f34504s = ox3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                x78 x78Var = this.f34505t;
                ua5Var = x78Var.f32173d;
                if (ua5Var == null) {
                    x78Var.f25143a.mo3895i().m14160q().m20651c("Failed to get conditional properties; not connected to service", this.f34501p, this.f34502q);
                } else {
                    ry0.m10830j(this.f34503r);
                    arrayList = dd8.m24460v(ua5Var.mo8366n1(this.f34501p, this.f34502q, this.f34503r));
                    this.f34505t.m5479E();
                }
            } catch (RemoteException e) {
                this.f34505t.f25143a.mo3895i().m14160q().m20650d("Failed to get conditional properties; remote exception", this.f34501p, this.f34502q, e);
            }
        } finally {
            this.f34505t.f25143a.m24045N().m24510E(this.f34504s, arrayList);
        }
    }
}
