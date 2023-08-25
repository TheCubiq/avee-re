package com.daaw;

import com.daaw.k3;
import com.google.android.gms.common.ConnectionResult;
import java.util.Map;
/* loaded from: classes.dex */
public final class l02 implements Runnable {
    public final /* synthetic */ ConnectionResult p;
    public final /* synthetic */ m02 q;

    public l02(m02 m02Var, ConnectionResult connectionResult) {
        this.q = m02Var;
        this.p = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        o3 o3Var;
        k3.f fVar;
        k3.f fVar2;
        k3.f fVar3;
        k3.f fVar4;
        m02 m02Var = this.q;
        map = m02Var.f.A;
        o3Var = m02Var.b;
        i02 i02Var = (i02) map.get(o3Var);
        if (i02Var == null) {
            return;
        }
        if (!this.p.u()) {
            i02Var.F(this.p, null);
            return;
        }
        this.q.e = true;
        fVar = this.q.a;
        if (fVar.requiresSignIn()) {
            this.q.h();
            return;
        }
        try {
            m02 m02Var2 = this.q;
            fVar3 = m02Var2.a;
            fVar4 = m02Var2.a;
            fVar3.getRemoteService(null, fVar4.a());
        } catch (SecurityException unused) {
            fVar2 = this.q.a;
            fVar2.disconnect("Failed to get service from broker.");
            i02Var.F(new ConnectionResult(10), null);
        }
    }
}
