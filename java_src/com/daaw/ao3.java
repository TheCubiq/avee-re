package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
/* loaded from: classes.dex */
public final class ao3 implements MediationAdLoadCallback {

    /* renamed from: a */
    public final /* synthetic */ gn3 f3345a;

    /* renamed from: b */
    public final /* synthetic */ do3 f3346b;

    public ao3(do3 do3Var, gn3 gn3Var) {
        this.f3346b = do3Var;
        this.f3345a = gn3Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.f3346b.f7575p;
            String canonicalName = obj.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            k04.zze(canonicalName + "failed to load mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            this.f3345a.mo3325q0(adError.zza());
            this.f3345a.mo3330j0(adError.getCode(), adError.getMessage());
            this.f3345a.mo3333c(adError.getCode());
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
            this.f3346b.f7581v = (UnifiedNativeAdMapper) obj;
            this.f3345a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return new un3(this.f3345a);
    }
}
