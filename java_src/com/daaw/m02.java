package com.daaw;

import android.os.Handler;
import android.util.Log;
import com.daaw.AbstractC2527pa;
import com.daaw.C1897k3;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC3989b;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class m02 implements AbstractC2527pa.InterfaceC2530c, e12 {

    /* renamed from: a */
    public final C1897k3.InterfaceC1906f f17971a;

    /* renamed from: b */
    public final C2396o3<?> f17972b;

    /* renamed from: c */
    public InterfaceC3989b f17973c = null;

    /* renamed from: d */
    public Set<Scope> f17974d = null;

    /* renamed from: e */
    public boolean f17975e = false;

    /* renamed from: f */
    public final /* synthetic */ z70 f17976f;

    public m02(z70 z70Var, C1897k3.InterfaceC1906f interfaceC1906f, C2396o3<?> c2396o3) {
        this.f17976f = z70Var;
        this.f17971a = interfaceC1906f;
        this.f17972b = c2396o3;
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2530c
    /* renamed from: a */
    public final void mo13540a(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f17976f.f34538E;
        handler.post(new l02(this, connectionResult));
    }

    @Override // com.daaw.e12
    /* renamed from: b */
    public final void mo16312b(ConnectionResult connectionResult) {
        Map map;
        map = this.f17976f.f34534A;
        i02 i02Var = (i02) map.get(this.f17972b);
        if (i02Var != null) {
            i02Var.m20264G(connectionResult);
        }
    }

    @Override // com.daaw.e12
    /* renamed from: c */
    public final void mo16311c(InterfaceC3989b interfaceC3989b, Set<Scope> set) {
        if (interfaceC3989b == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo16312b(new ConnectionResult(4));
            return;
        }
        this.f17973c = interfaceC3989b;
        this.f17974d = set;
        m16306h();
    }

    /* renamed from: h */
    public final void m16306h() {
        InterfaceC3989b interfaceC3989b;
        if (!this.f17975e || (interfaceC3989b = this.f17973c) == null) {
            return;
        }
        this.f17971a.getRemoteService(interfaceC3989b, this.f17974d);
    }
}
