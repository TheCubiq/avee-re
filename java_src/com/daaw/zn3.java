package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
/* loaded from: classes.dex */
public final class zn3 implements MediationAdLoadCallback {

    /* renamed from: a */
    public final /* synthetic */ gn3 f35256a;

    /* renamed from: b */
    public final /* synthetic */ do3 f35257b;

    public zn3(do3 do3Var, gn3 gn3Var) {
        this.f35257b = do3Var;
        this.f35256a = gn3Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.f35257b.f7575p;
            String canonicalName = obj.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            k04.zze(canonicalName + "failed to loaded mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            this.f35256a.mo3325q0(adError.zza());
            this.f35256a.mo3330j0(adError.getCode(), adError.getMessage());
            this.f35256a.mo3333c(adError.getCode());
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
            this.f35257b.f7580u = (MediationInterstitialAd) obj;
            this.f35256a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return new un3(this.f35256a);
    }
}
