package com.daaw;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* loaded from: classes.dex */
public final class uz1 extends p22 {

    /* renamed from: u */
    public final C1798j6<C2396o3<?>> f29665u;

    /* renamed from: v */
    public final z70 f29666v;

    public uz1(pj0 pj0Var, z70 z70Var, w70 w70Var) {
        super(pj0Var, w70Var);
        this.f29665u = new C1798j6<>();
        this.f29666v = z70Var;
        this.f36613p.mo13333b("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: u */
    public static void m7568u(Activity activity, z70 z70Var, C2396o3<?> c2396o3) {
        pj0 m1181c = LifecycleCallback.m1181c(activity);
        uz1 uz1Var = (uz1) m1181c.mo13332e("ConnectionlessLifecycleHelper", uz1.class);
        if (uz1Var == null) {
            uz1Var = new uz1(m1181c, z70Var, w70.m6477m());
        }
        ry0.m10829k(c2396o3, "ApiKey cannot be null");
        uz1Var.f29665u.add(c2396o3);
        z70Var.m2757c(uz1Var);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: h */
    public final void mo1176h() {
        super.mo1176h();
        m7567v();
    }

    @Override // com.daaw.p22, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public final void mo1174j() {
        super.mo1174j();
        m7567v();
    }

    @Override // com.daaw.p22, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public final void mo1173k() {
        super.mo1173k();
        this.f29666v.m2756d(this);
    }

    @Override // com.daaw.p22
    /* renamed from: m */
    public final void mo7571m(ConnectionResult connectionResult, int i) {
        this.f29666v.m2760F(connectionResult, i);
    }

    @Override // com.daaw.p22
    /* renamed from: n */
    public final void mo7570n() {
        this.f29666v.m2759a();
    }

    /* renamed from: t */
    public final C1798j6<C2396o3<?>> m7569t() {
        return this.f29665u;
    }

    /* renamed from: v */
    public final void m7567v() {
        if (this.f29665u.isEmpty()) {
            return;
        }
        this.f29666v.m2757c(this);
    }
}
