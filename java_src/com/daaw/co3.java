package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
/* loaded from: classes.dex */
public final class co3 implements MediationAdLoadCallback {

    /* renamed from: a */
    public final /* synthetic */ gn3 f6008a;

    /* renamed from: b */
    public final /* synthetic */ do3 f6009b;

    public co3(do3 do3Var, gn3 gn3Var) {
        this.f6009b = do3Var;
        this.f6008a = gn3Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.f6009b.f7575p;
            String canonicalName = obj.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            k04.zze(canonicalName + "failed to load mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            this.f6008a.mo3325q0(adError.zza());
            this.f6008a.mo3330j0(adError.getCode(), adError.getMessage());
            this.f6008a.mo3333c(adError.getCode());
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        Object obj;
        try {
            obj = this.f6009b.f7575p;
            String canonicalName = obj.getClass().getCanonicalName();
            k04.zze(canonicalName + "failed to loaded mediation ad: " + str);
            this.f6008a.mo3330j0(0, str);
            this.f6008a.mo3333c(0);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.f6009b.f7584y = (MediationAppOpenAd) obj;
            this.f6008a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return new un3(this.f6008a);
    }
}
