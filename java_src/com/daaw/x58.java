package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzaw;
/* loaded from: classes2.dex */
public final class x58 implements Runnable {
    public final /* synthetic */ zzaw p;
    public final /* synthetic */ String q;
    public final /* synthetic */ ox3 r;
    public final /* synthetic */ x78 s;

    public x58(x78 x78Var, zzaw zzawVar, String str, ox3 ox3Var) {
        this.s = x78Var;
        this.p = zzawVar;
        this.q = str;
        this.r = ox3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        byte[] bArr = null;
        try {
            try {
                x78 x78Var = this.s;
                ua5Var = x78Var.d;
                if (ua5Var == null) {
                    x78Var.a.i().q().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = ua5Var.m0(this.p, this.q);
                    this.s.E();
                }
            } catch (RemoteException e) {
                this.s.a.i().q().b("Failed to send event to the service to bundle", e);
            }
        } finally {
            this.s.a.N().G(this.r, bArr);
        }
    }
}
