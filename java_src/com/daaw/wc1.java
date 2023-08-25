package com.daaw;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.daaw.AbstractC2527pa;
import com.daaw.y70;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
/* loaded from: classes2.dex */
public class wc1 extends t70<s12> implements o12 {

    /* renamed from: L */
    public static final /* synthetic */ int f31155L = 0;

    /* renamed from: H */
    public final boolean f31156H;

    /* renamed from: I */
    public final C3536xf f31157I;

    /* renamed from: J */
    public final Bundle f31158J;

    /* renamed from: K */
    public final Integer f31159K;

    public wc1(Context context, Looper looper, boolean z, C3536xf c3536xf, Bundle bundle, y70.InterfaceC3675a interfaceC3675a, y70.InterfaceC3676b interfaceC3676b) {
        super(context, looper, 44, c3536xf, interfaceC3675a, interfaceC3676b);
        this.f31156H = true;
        this.f31157I = c3536xf;
        this.f31158J = bundle;
        this.f31159K = c3536xf.m5161g();
    }

    /* renamed from: L */
    public static Bundle m6180L(C3536xf c3536xf) {
        c3536xf.m5162f();
        Integer m5161g = c3536xf.m5161g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c3536xf.m5167a());
        if (m5161g != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m5161g.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.daaw.o12
    /* renamed from: b */
    public final void mo6179b(p12 p12Var) {
        ry0.m10829k(p12Var, "Expecting a valid ISignInCallbacks");
        try {
            Account m5166b = this.f31157I.m5166b();
            ((s12) getService()).m10764g3(new zai(1, new zat(m5166b, ((Integer) ry0.m10830j(this.f31159K)).intValue(), AbstractC2527pa.DEFAULT_ACCOUNT.equals(m5166b.name) ? yf1.m3782a(getContext()).m3781b() : null)), p12Var);
        } catch (RemoteException e) {
            try {
                p12Var.mo13769z0(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.daaw.o12
    /* renamed from: c */
    public final void mo6178c() {
        connect(new AbstractC2527pa.C2531d());
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: e */
    public final /* synthetic */ IInterface mo6177e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof s12 ? (s12) queryLocalInterface : new s12(iBinder);
    }

    @Override // com.daaw.AbstractC2527pa
    public final int getMinApkVersion() {
        return c80.f5613a;
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: h */
    public final Bundle mo6176h() {
        if (!getContext().getPackageName().equals(this.f31157I.m5164d())) {
            this.f31158J.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f31157I.m5164d());
        }
        return this.f31158J;
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: k */
    public final String mo6175k() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: l */
    public final String mo6174l() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.daaw.AbstractC2527pa, com.daaw.C1897k3.InterfaceC1906f
    public final boolean requiresSignIn() {
        return this.f31156H;
    }
}
