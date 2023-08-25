package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.daaw.k3;
import com.daaw.y70;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
/* loaded from: classes.dex */
public final class f12 extends u02 implements y70.a, y70.b {
    public static final k3.a<? extends o12, xc1> w = k12.c;
    public final Context p;
    public final Handler q;
    public final k3.a<? extends o12, xc1> r;
    public final Set<Scope> s;
    public final xf t;
    public o12 u;
    public e12 v;

    public f12(Context context, Handler handler, xf xfVar) {
        k3.a<? extends o12, xc1> aVar = w;
        this.p = context;
        this.q = handler;
        this.t = (xf) ry0.k(xfVar, "ClientSettings must not be null");
        this.s = xfVar.e();
        this.r = aVar;
    }

    public static /* bridge */ /* synthetic */ void i3(f12 f12Var, zak zakVar) {
        ConnectionResult h = zakVar.h();
        if (h.u()) {
            zav zavVar = (zav) ry0.j(zakVar.q());
            h = zavVar.h();
            if (h.u()) {
                f12Var.v.c(zavVar.q(), f12Var.s);
                f12Var.u.disconnect();
            }
            String valueOf = String.valueOf(h);
            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
        }
        f12Var.v.b(h);
        f12Var.u.disconnect();
    }

    @Override // com.daaw.ej
    public final void D(int i) {
        this.u.disconnect();
    }

    @Override // com.daaw.du0
    public final void I(ConnectionResult connectionResult) {
        this.v.b(connectionResult);
    }

    @Override // com.daaw.ej
    public final void M(Bundle bundle) {
        this.u.b(this);
    }

    public final void j3(e12 e12Var) {
        o12 o12Var = this.u;
        if (o12Var != null) {
            o12Var.disconnect();
        }
        this.t.i(Integer.valueOf(System.identityHashCode(this)));
        k3.a<? extends o12, xc1> aVar = this.r;
        Context context = this.p;
        Looper looper = this.q.getLooper();
        xf xfVar = this.t;
        this.u = aVar.b(context, looper, xfVar, xfVar.f(), this, this);
        this.v = e12Var;
        Set<Scope> set = this.s;
        if (set == null || set.isEmpty()) {
            this.q.post(new c12(this));
        } else {
            this.u.c();
        }
    }

    public final void k3() {
        o12 o12Var = this.u;
        if (o12Var != null) {
            o12Var.disconnect();
        }
    }

    @Override // com.daaw.p12
    public final void z0(zak zakVar) {
        this.q.post(new d12(this, zakVar));
    }
}
