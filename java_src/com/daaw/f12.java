package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.daaw.C1897k3;
import com.daaw.y70;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
/* loaded from: classes.dex */
public final class f12 extends u02 implements y70.InterfaceC3675a, y70.InterfaceC3676b {

    /* renamed from: w */
    public static final C1897k3.AbstractC1898a<? extends o12, xc1> f8995w = k12.f15587c;

    /* renamed from: p */
    public final Context f8996p;

    /* renamed from: q */
    public final Handler f8997q;

    /* renamed from: r */
    public final C1897k3.AbstractC1898a<? extends o12, xc1> f8998r;

    /* renamed from: s */
    public final Set<Scope> f8999s;

    /* renamed from: t */
    public final C3536xf f9000t;

    /* renamed from: u */
    public o12 f9001u;

    /* renamed from: v */
    public e12 f9002v;

    public f12(Context context, Handler handler, C3536xf c3536xf) {
        C1897k3.AbstractC1898a<? extends o12, xc1> abstractC1898a = f8995w;
        this.f8996p = context;
        this.f8997q = handler;
        this.f9000t = (C3536xf) ry0.m10829k(c3536xf, "ClientSettings must not be null");
        this.f8999s = c3536xf.m5163e();
        this.f8998r = abstractC1898a;
    }

    /* renamed from: i3 */
    public static /* bridge */ /* synthetic */ void m22969i3(f12 f12Var, zak zakVar) {
        ConnectionResult m1072h = zakVar.m1072h();
        if (m1072h.m1205u()) {
            zav zavVar = (zav) ry0.m10830j(zakVar.m1071q());
            m1072h = zavVar.m1155h();
            if (m1072h.m1205u()) {
                f12Var.f9002v.mo16311c(zavVar.m1154q(), f12Var.f8999s);
                f12Var.f9001u.disconnect();
            }
            String valueOf = String.valueOf(m1072h);
            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
        }
        f12Var.f9002v.mo16312b(m1072h);
        f12Var.f9001u.disconnect();
    }

    @Override // com.daaw.InterfaceC1192ej
    /* renamed from: D */
    public final void mo20267D(int i) {
        this.f9001u.disconnect();
    }

    @Override // com.daaw.du0
    /* renamed from: I */
    public final void mo20262I(ConnectionResult connectionResult) {
        this.f9002v.mo16312b(connectionResult);
    }

    @Override // com.daaw.InterfaceC1192ej
    /* renamed from: M */
    public final void mo20258M(Bundle bundle) {
        this.f9001u.mo6179b(this);
    }

    /* renamed from: j3 */
    public final void m22968j3(e12 e12Var) {
        o12 o12Var = this.f9001u;
        if (o12Var != null) {
            o12Var.disconnect();
        }
        this.f9000t.m5159i(Integer.valueOf(System.identityHashCode(this)));
        C1897k3.AbstractC1898a<? extends o12, xc1> abstractC1898a = this.f8998r;
        Context context = this.f8996p;
        Looper looper = this.f8997q.getLooper();
        C3536xf c3536xf = this.f9000t;
        this.f9001u = abstractC1898a.mo1753b(context, looper, c3536xf, c3536xf.m5162f(), this, this);
        this.f9002v = e12Var;
        Set<Scope> set = this.f8999s;
        if (set == null || set.isEmpty()) {
            this.f8997q.post(new c12(this));
        } else {
            this.f9001u.mo6178c();
        }
    }

    /* renamed from: k3 */
    public final void m22967k3() {
        o12 o12Var = this.f9001u;
        if (o12Var != null) {
            o12Var.disconnect();
        }
    }

    @Override // com.daaw.p12
    /* renamed from: z0 */
    public final void mo13769z0(zak zakVar) {
        this.f8997q.post(new d12(this, zakVar));
    }
}
