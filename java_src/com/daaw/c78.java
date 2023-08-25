package com.daaw;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class c78 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ AtomicReference f5606p;

    /* renamed from: q */
    public final /* synthetic */ String f5607q;

    /* renamed from: r */
    public final /* synthetic */ String f5608r;

    /* renamed from: s */
    public final /* synthetic */ zzq f5609s;

    /* renamed from: t */
    public final /* synthetic */ boolean f5610t;

    /* renamed from: u */
    public final /* synthetic */ x78 f5611u;

    public c78(x78 x78Var, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar, boolean z) {
        this.f5611u = x78Var;
        this.f5606p = atomicReference;
        this.f5607q = str2;
        this.f5608r = str3;
        this.f5609s = zzqVar;
        this.f5610t = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        x78 x78Var;
        ua5 ua5Var;
        AtomicReference atomicReference2;
        List mo8372h0;
        synchronized (this.f5606p) {
            try {
                x78Var = this.f5611u;
                ua5Var = x78Var.f32173d;
            } catch (RemoteException e) {
                this.f5611u.f25143a.mo3895i().m14160q().m20650d("(legacy) Failed to get user properties; remote exception", null, this.f5607q, e);
                this.f5606p.set(Collections.emptyList());
                atomicReference = this.f5606p;
            }
            if (ua5Var == null) {
                x78Var.f25143a.mo3895i().m14160q().m20650d("(legacy) Failed to get user properties; not connected to service", null, this.f5607q, this.f5608r);
                this.f5606p.set(Collections.emptyList());
                this.f5606p.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                ry0.m10830j(this.f5609s);
                atomicReference2 = this.f5606p;
                mo8372h0 = ua5Var.mo8374a2(this.f5607q, this.f5608r, this.f5610t, this.f5609s);
            } else {
                atomicReference2 = this.f5606p;
                mo8372h0 = ua5Var.mo8372h0(null, this.f5607q, this.f5608r, this.f5610t);
            }
            atomicReference2.set(mo8372h0);
            this.f5611u.m5479E();
            atomicReference = this.f5606p;
            atomicReference.notify();
        }
    }
}
