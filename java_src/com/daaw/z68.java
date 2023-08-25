package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class z68 implements Runnable {
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ zzq r;
    public final /* synthetic */ ox3 s;
    public final /* synthetic */ x78 t;

    public z68(x78 x78Var, String str, String str2, zzq zzqVar, ox3 ox3Var) {
        this.t = x78Var;
        this.p = str;
        this.q = str2;
        this.r = zzqVar;
        this.s = ox3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                x78 x78Var = this.t;
                ua5Var = x78Var.d;
                if (ua5Var == null) {
                    x78Var.a.i().q().c("Failed to get conditional properties; not connected to service", this.p, this.q);
                } else {
                    ry0.j(this.r);
                    arrayList = dd8.v(ua5Var.n1(this.p, this.q, this.r));
                    this.t.E();
                }
            } catch (RemoteException e) {
                this.t.a.i().q().d("Failed to get conditional properties; remote exception", this.p, this.q, e);
            }
        } finally {
            this.t.a.N().E(this.s, arrayList);
        }
    }
}
