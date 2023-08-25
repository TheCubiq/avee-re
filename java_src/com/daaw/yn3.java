package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
/* loaded from: classes.dex */
public final class yn3 implements MediationAdLoadCallback {

    /* renamed from: a */
    public final /* synthetic */ gn3 f33888a;

    /* renamed from: b */
    public final /* synthetic */ do3 f33889b;

    public yn3(do3 do3Var, gn3 gn3Var) {
        this.f33889b = do3Var;
        this.f33888a = gn3Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.f33889b.f7575p;
            String canonicalName = obj.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            k04.zze(canonicalName + "failed to loaded mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            this.f33888a.mo3325q0(adError.zza());
            this.f33888a.mo3330j0(adError.getCode(), adError.getMessage());
            this.f33888a.mo3333c(adError.getCode());
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
        MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
        try {
            this.f33889b.f7579t = mediationBannerAd.getView();
            this.f33888a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return new un3(this.f33888a);
    }
}
