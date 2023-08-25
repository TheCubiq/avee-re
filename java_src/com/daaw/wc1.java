package com.daaw;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.daaw.pa;
import com.daaw.y70;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
/* loaded from: classes2.dex */
public class wc1 extends t70<s12> implements o12 {
    public static final /* synthetic */ int L = 0;
    public final boolean H;
    public final xf I;
    public final Bundle J;
    public final Integer K;

    public wc1(Context context, Looper looper, boolean z, xf xfVar, Bundle bundle, y70.a aVar, y70.b bVar) {
        super(context, looper, 44, xfVar, aVar, bVar);
        this.H = true;
        this.I = xfVar;
        this.J = bundle;
        this.K = xfVar.g();
    }

    public static Bundle L(xf xfVar) {
        xfVar.f();
        Integer g = xfVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", xfVar.a());
        if (g != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g.intValue());
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
    public final void b(p12 p12Var) {
        ry0.k(p12Var, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.I.b();
            ((s12) getService()).g3(new zai(1, new zat(b, ((Integer) ry0.j(this.K)).intValue(), pa.DEFAULT_ACCOUNT.equals(b.name) ? yf1.a(getContext()).b() : null)), p12Var);
        } catch (RemoteException e) {
            try {
                p12Var.z0(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.daaw.o12
    public final void c() {
        connect(new pa.d());
    }

    @Override // com.daaw.pa
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof s12 ? (s12) queryLocalInterface : new s12(iBinder);
    }

    @Override // com.daaw.pa
    public final int getMinApkVersion() {
        return c80.a;
    }

    @Override // com.daaw.pa
    public final Bundle h() {
        if (!getContext().getPackageName().equals(this.I.d())) {
            this.J.putString("com.google.android.gms.signin.internal.realClientPackageName", this.I.d());
        }
        return this.J;
    }

    @Override // com.daaw.pa
    public final String k() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.daaw.pa
    public final String l() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.daaw.pa, com.daaw.k3.f
    public final boolean requiresSignIn() {
        return this.H;
    }
}
