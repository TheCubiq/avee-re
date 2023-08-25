package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
/* loaded from: classes.dex */
public final class zn3 implements MediationAdLoadCallback {
    public final /* synthetic */ gn3 a;
    public final /* synthetic */ do3 b;

    public zn3(do3 do3Var, gn3 gn3Var) {
        this.b = do3Var;
        this.a = gn3Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.b.p;
            String canonicalName = obj.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            k04.zze(canonicalName + "failed to loaded mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
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
            this.b.u = (MediationInterstitialAd) obj;
            this.a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return new un3(this.a);
    }
}
