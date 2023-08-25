package com.daaw;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class c78 implements Runnable {
    public final /* synthetic */ AtomicReference p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ zzq s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ x78 u;

    public c78(x78 x78Var, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar, boolean z) {
        this.u = x78Var;
        this.p = atomicReference;
        this.q = str2;
        this.r = str3;
        this.s = zzqVar;
        this.t = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        x78 x78Var;
        ua5 ua5Var;
        AtomicReference atomicReference2;
        List h0;
        synchronized (this.p) {
            try {
                x78Var = this.u;
                ua5Var = x78Var.d;
            } catch (RemoteException e) {
                this.u.a.i().q().d("(legacy) Failed to get user properties; remote exception", null, this.q, e);
                this.p.set(Collections.emptyList());
                atomicReference = this.p;
            }
            if (ua5Var == null) {
                x78Var.a.i().q().d("(legacy) Failed to get user properties; not connected to service", null, this.q, this.r);
                this.p.set(Collections.emptyList());
                this.p.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                ry0.j(this.s);
                atomicReference2 = this.p;
                h0 = ua5Var.a2(this.q, this.r, this.t, this.s);
            } else {
                atomicReference2 = this.p;
                h0 = ua5Var.h0(null, this.q, this.r, this.t);
            }
            atomicReference2.set(h0);
            this.u.E();
            atomicReference = this.p;
            atomicReference.notify();
        }
    }
}
