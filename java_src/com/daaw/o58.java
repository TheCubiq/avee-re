package com.daaw;

import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class o58 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ t38 f21072p;

    /* renamed from: q */
    public final /* synthetic */ x78 f21073q;

    public o58(x78 x78Var, t38 t38Var) {
        this.f21073q = x78Var;
        this.f21072p = t38Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.f21073q;
        ua5Var = x78Var.f32173d;
        if (ua5Var == null) {
            x78Var.f25143a.mo3895i().m14160q().m20653a("Failed to send current screen to service");
            return;
        }
        try {
            t38 t38Var = this.f21072p;
            if (t38Var == null) {
                ua5Var.mo8364u1(0L, null, null, x78Var.f25143a.mo3905d().getPackageName());
            } else {
                ua5Var.mo8364u1(t38Var.f26981c, t38Var.f26979a, t38Var.f26980b, x78Var.f25143a.mo3905d().getPackageName());
            }
            this.f21073q.m5479E();
        } catch (RemoteException e) {
            this.f21073q.f25143a.mo3895i().m14160q().m20652b("Failed to send current screen to the service", e);
        }
    }
}
