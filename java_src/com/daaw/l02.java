package com.daaw;

import com.daaw.C1897k3;
import com.google.android.gms.common.ConnectionResult;
import java.util.Map;
/* loaded from: classes.dex */
public final class l02 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ ConnectionResult f16933p;

    /* renamed from: q */
    public final /* synthetic */ m02 f16934q;

    public l02(m02 m02Var, ConnectionResult connectionResult) {
        this.f16934q = m02Var;
        this.f16933p = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C2396o3 c2396o3;
        C1897k3.InterfaceC1906f interfaceC1906f;
        C1897k3.InterfaceC1906f interfaceC1906f2;
        C1897k3.InterfaceC1906f interfaceC1906f3;
        C1897k3.InterfaceC1906f interfaceC1906f4;
        m02 m02Var = this.f16934q;
        map = m02Var.f17976f.f34534A;
        c2396o3 = m02Var.f17972b;
        i02 i02Var = (i02) map.get(c2396o3);
        if (i02Var == null) {
            return;
        }
        if (!this.f16933p.m1205u()) {
            i02Var.m20265F(this.f16933p, null);
            return;
        }
        this.f16934q.f17975e = true;
        interfaceC1906f = this.f16934q.f17971a;
        if (interfaceC1906f.requiresSignIn()) {
            this.f16934q.m16306h();
            return;
        }
        try {
            m02 m02Var2 = this.f16934q;
            interfaceC1906f3 = m02Var2.f17971a;
            interfaceC1906f4 = m02Var2.f17971a;
            interfaceC1906f3.getRemoteService(null, interfaceC1906f4.mo9478a());
        } catch (SecurityException unused) {
            interfaceC1906f2 = this.f16934q.f17971a;
            interfaceC1906f2.disconnect("Failed to get service from broker.");
            i02Var.m20265F(new ConnectionResult(10), null);
        }
    }
}
