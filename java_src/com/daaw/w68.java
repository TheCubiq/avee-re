package com.daaw;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class w68 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ AtomicReference f30931p;

    /* renamed from: q */
    public final /* synthetic */ String f30932q;

    /* renamed from: r */
    public final /* synthetic */ String f30933r;

    /* renamed from: s */
    public final /* synthetic */ zzq f30934s;

    /* renamed from: t */
    public final /* synthetic */ x78 f30935t;

    public w68(x78 x78Var, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar) {
        this.f30935t = x78Var;
        this.f30931p = atomicReference;
        this.f30932q = str2;
        this.f30933r = str3;
        this.f30934s = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        x78 x78Var;
        ua5 ua5Var;
        AtomicReference atomicReference2;
        List mo8377G0;
        synchronized (this.f30931p) {
            try {
                x78Var = this.f30935t;
                ua5Var = x78Var.f32173d;
            } catch (RemoteException e) {
                this.f30935t.f25143a.mo3895i().m14160q().m20650d("(legacy) Failed to get conditional properties; remote exception", null, this.f30932q, e);
                this.f30931p.set(Collections.emptyList());
                atomicReference = this.f30931p;
            }
            if (ua5Var == null) {
                x78Var.f25143a.mo3895i().m14160q().m20650d("(legacy) Failed to get conditional properties; not connected to service", null, this.f30932q, this.f30933r);
                this.f30931p.set(Collections.emptyList());
                this.f30931p.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                ry0.m10830j(this.f30934s);
                atomicReference2 = this.f30931p;
                mo8377G0 = ua5Var.mo8366n1(this.f30932q, this.f30933r, this.f30934s);
            } else {
                atomicReference2 = this.f30931p;
                mo8377G0 = ua5Var.mo8377G0(null, this.f30932q, this.f30933r);
            }
            atomicReference2.set(mo8377G0);
            this.f30935t.m5479E();
            atomicReference = this.f30931p;
            atomicReference.notify();
        }
    }
}
