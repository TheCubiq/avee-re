package com.daaw;

import android.os.Handler;
import android.util.Log;
import com.daaw.k3;
import com.daaw.pa;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class m02 implements pa.c, e12 {
    public final k3.f a;
    public final o3<?> b;
    public com.google.android.gms.common.internal.b c = null;
    public Set<Scope> d = null;
    public boolean e = false;
    public final /* synthetic */ z70 f;

    public m02(z70 z70Var, k3.f fVar, o3<?> o3Var) {
        this.f = z70Var;
        this.a = fVar;
        this.b = o3Var;
    }

    @Override // com.daaw.pa.c
    public final void a(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f.E;
        handler.post(new l02(this, connectionResult));
    }

    @Override // com.daaw.e12
    public final void b(ConnectionResult connectionResult) {
        Map map;
        map = this.f.A;
        i02 i02Var = (i02) map.get(this.b);
        if (i02Var != null) {
            i02Var.G(connectionResult);
        }
    }

    @Override // com.daaw.e12
    public final void c(com.google.android.gms.common.internal.b bVar, Set<Scope> set) {
        if (bVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new ConnectionResult(4));
            return;
        }
        this.c = bVar;
        this.d = set;
        h();
    }

    public final void h() {
        com.google.android.gms.common.internal.b bVar;
        if (!this.e || (bVar = this.c) == null) {
            return;
        }
        this.a.getRemoteService(bVar, this.d);
    }
}
