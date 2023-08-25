package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;
/* loaded from: classes2.dex */
public final class u48 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f28550p;

    /* renamed from: q */
    public final /* synthetic */ String f28551q;

    /* renamed from: r */
    public final /* synthetic */ zzq f28552r;

    /* renamed from: s */
    public final /* synthetic */ boolean f28553s;

    /* renamed from: t */
    public final /* synthetic */ ox3 f28554t;

    /* renamed from: u */
    public final /* synthetic */ x78 f28555u;

    public u48(x78 x78Var, String str, String str2, zzq zzqVar, boolean z, ox3 ox3Var) {
        this.f28555u = x78Var;
        this.f28550p = str;
        this.f28551q = str2;
        this.f28552r = zzqVar;
        this.f28553s = z;
        this.f28554t = ox3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e;
        ua5 ua5Var;
        Bundle bundle2 = new Bundle();
        try {
            x78 x78Var = this.f28555u;
            ua5Var = x78Var.f32173d;
            if (ua5Var == null) {
                x78Var.f25143a.mo3895i().m14160q().m20651c("Failed to get user properties; not connected to service", this.f28550p, this.f28551q);
                this.f28555u.f25143a.m24045N().m24509F(this.f28554t, bundle2);
                return;
            }
            ry0.m10830j(this.f28552r);
            List<zzkw> mo8374a2 = ua5Var.mo8374a2(this.f28550p, this.f28551q, this.f28553s, this.f28552r);
            bundle = new Bundle();
            if (mo8374a2 != null) {
                for (zzkw zzkwVar : mo8374a2) {
                    String str = zzkwVar.f37076t;
                    if (str != null) {
                        bundle.putString(zzkwVar.f37073q, str);
                    } else {
                        Long l = zzkwVar.f37075s;
                        if (l != null) {
                            bundle.putLong(zzkwVar.f37073q, l.longValue());
                        } else {
                            Double d = zzkwVar.f37078v;
                            if (d != null) {
                                bundle.putDouble(zzkwVar.f37073q, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.f28555u.m5479E();
                    this.f28555u.f25143a.m24045N().m24509F(this.f28554t, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    this.f28555u.f25143a.mo3895i().m14160q().m20651c("Failed to get user properties; remote exception", this.f28550p, e);
                    this.f28555u.f25143a.m24045N().m24509F(this.f28554t, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.f28555u.f25143a.m24045N().m24509F(this.f28554t, bundle2);
                throw th;
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            this.f28555u.f25143a.m24045N().m24509F(this.f28554t, bundle2);
            throw th;
        }
    }
}
