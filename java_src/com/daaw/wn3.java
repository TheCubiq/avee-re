package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
/* loaded from: classes.dex */
public final class wn3 implements MediationAdLoadCallback {
    public final /* synthetic */ gn3 a;
    public final /* synthetic */ Adapter b;
    public final /* synthetic */ do3 c;

    public wn3(do3 do3Var, gn3 gn3Var, Adapter adapter) {
        this.c = do3Var;
        this.a = gn3Var;
        this.b = adapter;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.b.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            k04.zze(canonicalName + "failed to load mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            this.a.q0(adError.zza());
            this.a.j0(adError.getCode(), adError.getMessage());
            this.a.c(adError.getCode());
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.c.x = (MediationInterscrollerAd) obj;
            this.a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return new un3(this.a);
    }
}
