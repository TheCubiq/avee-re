package com.daaw;

import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class o58 implements Runnable {
    public final /* synthetic */ t38 p;
    public final /* synthetic */ x78 q;

    public o58(x78 x78Var, t38 t38Var) {
        this.q = x78Var;
        this.p = t38Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        x78 x78Var = this.q;
        ua5Var = x78Var.d;
        if (ua5Var == null) {
            x78Var.a.i().q().a("Failed to send current screen to service");
            return;
        }
        try {
            t38 t38Var = this.p;
            if (t38Var == null) {
                ua5Var.u1(0L, null, null, x78Var.a.d().getPackageName());
            } else {
                ua5Var.u1(t38Var.c, t38Var.a, t38Var.b, x78Var.a.d().getPackageName());
            }
            this.q.E();
        } catch (RemoteException e) {
            this.q.a.i().q().b("Failed to send current screen to the service", e);
        }
    }
}
